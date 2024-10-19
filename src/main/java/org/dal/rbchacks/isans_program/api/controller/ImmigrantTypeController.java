package org.dal.rbchacks.isans_program.api.controller;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.services.ImmigrantTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/setup/immigrant-type")
public class ImmigrantTypeController {
    @Autowired
    private ImmigrantTypeService immigrantTypeService;
    @PostMapping
    public ResponseEntity<ImmigrantType> createPerson(@RequestBody ImmigrantType immigrantType) {
        ImmigrantType savedType = immigrantTypeService.saveImmigrantType(immigrantType);
        return ResponseEntity.ok(savedType);
    }
    @GetMapping()
    public List<ImmigrantType> getActiveImmigrationTypes(){
        System.out.println("debugging at entry");
        List<ImmigrantType> types = immigrantTypeService.getAllTtypes();
        System.out.println("size is "+types.size());
        return types != null ? types:Collections.emptyList();
    }

}


