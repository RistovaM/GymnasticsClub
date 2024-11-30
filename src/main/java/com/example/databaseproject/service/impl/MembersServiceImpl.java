package com.example.databaseproject.service.impl;

import com.example.databaseproject.model.Member;
import com.example.databaseproject.repository.MembersRepository;
import com.example.databaseproject.service.Members;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class MembersServiceImpl implements Members {
private final MembersRepository membersRepository;

    public MembersServiceImpl(MembersRepository membersRepository) {
        this.membersRepository = membersRepository;
    }

    @Override
    public Optional<Member> findById(Integer id) {
        return membersRepository.findById(id);
    }
}
