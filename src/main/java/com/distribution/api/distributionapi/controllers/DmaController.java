package com.distribution.api.distributionapi.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.distribution.api.distributionapi.entities.Dma;
import com.distribution.api.distributionapi.helpers.CoreFormulas;

@RestController
public class DmaController {

    private final CoreFormulas coreFormula;

    public DmaController(CoreFormulas coreFormula) {
        this.coreFormula = coreFormula;
    }
    
    @GetMapping("/")
    public ResponseEntity<Object> welcomePage() {
        Map<String, Object> response = new HashMap<>();
        
        // [usecase]
        // I will send id_dma into helper and the helper will calculate all necessary field
        // Catch the response afterward with Dma entity
        String dmaID = "123-123-123";
        Dma data = this.coreFormula.show(dmaID);

        // send it as a response
        response.put("id_dma", dmaID);
        response.put("data", data);
        return ResponseEntity.ok().body(response);
    }
    
}
