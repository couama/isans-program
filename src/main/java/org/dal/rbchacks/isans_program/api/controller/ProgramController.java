package org.dal.rbchacks.isans_program.api.controller;

import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.model.Program;
import org.dal.rbchacks.isans_program.api.services.ImmigrantTypeService;
import org.dal.rbchacks.isans_program.api.services.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/program")
public class ProgramController {
    @Autowired
    private ProgramService programService;
    @PostMapping
    public ResponseEntity<Program> createProgram(@RequestBody Program program) {
        Program savedType = programService.saveProgram(program);
        return ResponseEntity.ok(savedType);
    }
}

