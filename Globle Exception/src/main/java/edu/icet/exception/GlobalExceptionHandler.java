package edu.icet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(CustomerNotFoundException.class)
  ResponseEntity<ErrorResponse> handleCustomerNotFoundException (CustomerNotFoundException exception) {

    ErrorResponse errorResponse = new ErrorResponse();
    errorResponse.setMessage(exception.getMessage());

    return new ResponseEntity<>(errorResponse, HttpStatus.OK);
  }


}
