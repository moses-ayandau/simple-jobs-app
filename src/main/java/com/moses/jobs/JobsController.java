package com.moses.jobs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class JobsController {

    @GetMapping
    public Job getDummyJob() {
        return new Job("Software Engineer",
                "Develop and maintain software applications",
                List.of("Java", "Spring Boot", "MongoDB"));
    }
}
