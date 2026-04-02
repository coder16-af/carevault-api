package com.ehr.api;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @GetMapping("/{id}")
    public Map<String, String> getPatient(@PathVariable int id) {
        Map<String, String> data = new HashMap<>();
        data.put("id", String.valueOf(id));
        data.put("name", "Fatima");
        data.put("disease", "Fever");
        return data;
    }
}