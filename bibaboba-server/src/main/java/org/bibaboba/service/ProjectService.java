package org.bibaboba.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ProjectService {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public String retStr(String input) {
        return input + " is input string";
    }
}
