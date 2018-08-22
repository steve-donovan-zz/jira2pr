package com.hsbc.jira2cr.controllers;

import com.hsbc.jira2cr.CRFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class JiraController {

    @Autowired
    CRFactory crFactory;

    @PostMapping("/jira/{jiraId}")
    public String requestCRGeneration(@PathVariable String jiraId) {
        log.info("received CR creation request for JIRA : {}", jiraId);

        return crFactory.fromJira(jiraId);
    }
}
