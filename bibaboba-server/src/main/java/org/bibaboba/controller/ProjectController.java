package org.bibaboba.controller;

import org.bibaboba.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/proj-contr")
public class ProjectController {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private ProjectService projectService;

    @GetMapping("/str")
    public String getString (){
        return "this is a string";
    }

    @GetMapping("/{str}")
    public String getString (@PathVariable String str){
        return projectService.retStr(str);
    }
}
