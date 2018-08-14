package com.example.sampleapplication.exception;
import com.example.sampleapplication.envelope.productEnvelope;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class productExceptionHandler {


  @ExceptionHandler(value = {productNotFoundException.class})
  public ResponseEntity<String> handleRecordNotFoundException(productNotFoundException ex, WebRequest webRequest){



                         return new ResponseEntity<>(ex.getErrorMessage(),HttpStatus.NOT_FOUND);
                }



}
