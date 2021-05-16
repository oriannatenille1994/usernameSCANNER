package com.erdi.apps.usernamescanner.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {

    private String message;
    private Timestamp timestamp;
}
