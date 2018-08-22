package com.hsbc.jira2cr;

import com.hsbc.jira2cr.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CRFactory {

    @Value("${jira_url}")
    private String jiraURL;

    @Value("${cr_url}")
    private String crURL;

    @Autowired
    RestTemplate restTemplate;


    public String fromJira(String jiraId) {
        String crId = null;

        // TODO fetch jira instead of this noddy placeholder
        Test jira = restTemplate.getForObject(jiraURL + jiraId, Test.class);

        // TODO if JIRA not found

        // TODO reformat

        // TODO create CR
        // TODO if creation fails

        return crId;
    }
}
