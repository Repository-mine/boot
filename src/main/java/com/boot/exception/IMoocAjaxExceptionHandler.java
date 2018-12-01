package com.boot.exception;


import com.boot.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;


//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
    public JSONResult defaultErrorHandler(HttpServletRequest req,
                                          Exception e) throws Exception {

        e.printStackTrace();
        return JSONResult.errorException(e.getMessage());
    }
}
