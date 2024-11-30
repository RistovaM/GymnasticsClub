package com.example.databaseproject.repository;

import com.example.databaseproject.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Member,Integer> {

}
