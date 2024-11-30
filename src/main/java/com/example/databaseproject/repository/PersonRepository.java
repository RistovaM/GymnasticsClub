package com.example.databaseproject.repository;

import com.example.databaseproject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person,Integer> {
//    @Query(value = "SELECT * FROM prikaz_lista", nativeQuery = true)
//    List<Object[]> getStickersWithCategories();


}
