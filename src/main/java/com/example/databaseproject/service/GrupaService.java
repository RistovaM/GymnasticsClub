package com.example.databaseproject.service;

import com.example.databaseproject.model.Grupa;

import java.util.Optional;

public interface GrupaService {
    Optional<Grupa> findById(Integer id);

}
