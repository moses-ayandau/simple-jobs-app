package com.moses.jobs;

import java.util.List;

class Job {
    private String name;
    private String description;
    private List<String> skills;

    public Job(String name, String description, List<String> skills) {
        this.name = name;
        this.description = description;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSkills() {
        return skills;
    }
}