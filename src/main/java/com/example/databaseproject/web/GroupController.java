package com.example.databaseproject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public GroupController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/all")
    public String viewAllPerson(Model model) {
        String sql = "SELECT * FROM \"gymnasticsClub\".listmembersandgroups1";

        List<Map<String, Object>> PersonList = jdbcTemplate.queryForList(sql);
        model.addAttribute("allofPersons", PersonList);
        return "membersAndGroups";

    }
}