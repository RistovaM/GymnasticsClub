package com.example.databaseproject.service.impl;

import com.example.databaseproject.model.Grupa;
import com.example.databaseproject.repository.GrupaRepository;
import com.example.databaseproject.service.GrupaService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class GrupaServiceImpl implements GrupaService {
    private final GrupaRepository grupaRepository;

    public GrupaServiceImpl(GrupaRepository grupaRepository) {
        this.grupaRepository = grupaRepository;
    }

    @Override
    public Optional<Grupa> findById(Integer id) {
        return grupaRepository.findById(id);
    }
}
