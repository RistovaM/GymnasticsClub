package com.example.databaseproject.service;

import com.example.databaseproject.model.Member;

import java.util.Optional;

public interface Members {
    Optional<Member> findById(Integer id);
}
