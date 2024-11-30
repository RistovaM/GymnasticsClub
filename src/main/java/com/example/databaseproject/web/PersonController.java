
package com.example.databaseproject.web;
import com.example.databaseproject.model.Member;
import com.example.databaseproject.model.Person;
import com.example.databaseproject.service.GrupaService;
import com.example.databaseproject.service.Members;
import com.example.databaseproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class PersonController {

    private final JdbcTemplate jdbcTemplate;

    public PersonController(JdbcTemplate jdbcTemplate, PersonService personService, Members members, GrupaService grupaService) {
        this.jdbcTemplate = jdbcTemplate;
        this.personService = personService;
        this.members = members;
        this.grupaService = grupaService;
    }

    private final PersonService personService;
    private final Members members;
    private final GrupaService grupaService;


    @GetMapping("/personGet")
    public String personGet() {
        return "savePerson";
    }

    @PostMapping("/personSave")
    public String savePerson(@RequestParam Integer personid,
                             @RequestParam LocalDate dateofbirth,
                             @RequestParam String lastname,
                             @RequestParam String fisrtname,
                             @RequestParam String tellno) {

        String sql = "INSERT INTO \"gymnasticsClub\".person (personid, dateofbirth, lastname, fisrtname, tellno) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, personid, dateofbirth, lastname, fisrtname, tellno);

        // Alternatively, you can also use the PersonService to save the person
        // this.personService.save(personID, date, lastName, fisrtName, tellNo);
        // Redirect to a success page or any other appropriate page
        return "redirect:/"; // Assuming you have a success page mapped to "/success"
    }

    @GetMapping("/edit/{id}")
    public String editMember(Model model, @PathVariable Integer id) {
        model.addAttribute("id", id);

//        Optional<Person> nova = personService.findById(id);
        String sql = "SELECT * FROM \"gymnasticsClub\".person WHERE personid = ?";

        List<Map<String, Object>> edenperson = jdbcTemplate.queryForList(sql,id);
        model.addAttribute("edenperson", edenperson);

        sql = "SELECT groupnumberid FROM \"gymnasticsClub\".member WHERE personid = ?";
        List<Map<String, Object>> member = jdbcTemplate.queryForList(sql,id);
        if(member.stream().findFirst().isPresent()){
            model.addAttribute("member", member);
        }
        else {
            model.addAttribute("member", "nema");
        }


//        if(nova.isPresent()){
//            Person p = nova.get();
//            model.addAttribute("ime", p.getFisrtname());
//            model.addAttribute("prezime", p.getLastname());
//            model.addAttribute("data", p.getDateofbirth());
//        }
//        else {
//            System.out.println("Nema najdeno");
//        }
//
//        Optional<Member> m = members.findById(id);
//
//        if (m.get() != null) {
//                model.addAttribute("grupa", grupaService.findById(m.get().getGroupnumberid()).get());
//        }
        return "edited";

    }
    @PostMapping("/change")
    public String changeGroup(@RequestParam Integer id, @RequestParam Integer member){

        String sql = "SELECT groupnumberid FROM \"gymnasticsClub\".member WHERE personid = ?";
        List<Map<String, Object>> mem = jdbcTemplate.queryForList(sql,id);
        if(mem.stream().findFirst().isPresent()){
            sql = "UPDATE \"gymnasticsClub\".member SET groupnumberid = ? WHERE personid = ?";
//            List<Map<String, Object>> update = jdbcTemplate.queryForList(sql,member,id);
            int rowsAffected = jdbcTemplate.update(sql, member, id);

        }
        else {
            sql = "INSERT INTO \"gymnasticsClub\".member  (personid,groupnumberid) VALUES (?,?)";
//            List<Map<String, Object>> add = jdbcTemplate.queryForList(sql,id,member);
            int inserted = jdbcTemplate.update(sql,id,member);

        }
        return "redirect:/";
    }
}
