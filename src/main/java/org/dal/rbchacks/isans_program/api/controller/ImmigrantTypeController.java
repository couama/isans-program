package org.dal.rbchacks.isans_program.api.controller;

import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.services.ImmigrantTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}


