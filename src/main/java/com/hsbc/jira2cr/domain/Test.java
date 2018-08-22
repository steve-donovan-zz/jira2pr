package com.hsbc.jira2cr.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Test {

    private int userId;
    private int id;
    private String title;
    private boolean complete;
}
