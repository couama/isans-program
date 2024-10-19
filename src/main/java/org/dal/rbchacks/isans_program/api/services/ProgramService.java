package org.dal.rbchacks.isans_program.api.services;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.model.Program;
import org.dal.rbchacks.isans_program.api.repository.FunderRepository;
import org.dal.rbchacks.isans_program.api.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {
    @Autowired
    private ProgramRepository programRepository;

    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }
    public Program saveProgram(Program program) {
        return programRepository.save(program);
    }
    public List<Program> getActivePrograms(){
        return programRepository.findAll();
    }
}