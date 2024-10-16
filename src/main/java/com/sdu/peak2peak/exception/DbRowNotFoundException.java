package com.sdu.peak2peak.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DbRowNotFoundException extends RuntimeException {
    private String error;
    private String message;

}
