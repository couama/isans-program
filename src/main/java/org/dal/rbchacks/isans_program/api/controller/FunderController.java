package org.dal.rbchacks.isans_program.api.controller;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.services.FunderService;
import org.dal.rbchacks.isans_program.api.services.ImmigrantTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setup/funder")
public class FunderController {
    @Autowired
    private FunderService funderService;
    @PostMapping
    public ResponseEntity<Funder> createPerson(@RequestBody Funder funder) {
        Funder savedType = funderService.saveFunderInfo(funder);
        return ResponseEntity.ok(savedType);
    }
}
