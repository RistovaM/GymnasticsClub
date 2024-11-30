package com.example.databaseproject.repository;

import com.example.databaseproject.model.dto.AllpersonsDTO;

import java.util.List;

public interface allPersonsRepository  {
    List<AllpersonsDTO>  getPersons();
}
