package com.erdi.apps.usernamescanner.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponseModel {

    private String message;
    private Timestamp timestamp;
}
