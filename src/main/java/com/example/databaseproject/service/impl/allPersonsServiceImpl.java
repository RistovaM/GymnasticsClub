package com.example.databaseproject.service.impl;

import com.example.databaseproject.model.dto.AllpersonsDTO;
import com.example.databaseproject.repository.allPersonsRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class allPersonsServiceImpl implements allPersonsRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public allPersonsServiceImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AllpersonsDTO> getPersons(){
        String sql="SELECT * FROM allpersons";
        return jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(AllpersonsDTO.class)
        );
    }
}