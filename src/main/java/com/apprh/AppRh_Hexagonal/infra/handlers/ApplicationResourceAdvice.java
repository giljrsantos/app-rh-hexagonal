package com.apprh.AppRh_Hexagonal.infra.handlers;

import com.apprh.AppRh_Hexagonal.core.exception.BusinessNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationResourceAdvice {

    @ExceptionHandler(BusinessNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrorNotFound handleBusinessException(BusinessNotFoundException ex) {
        return new ApiErrorNotFound(ex.getMessage());
    }

}
