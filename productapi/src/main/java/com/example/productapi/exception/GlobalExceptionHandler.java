package com.example.productapi.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class GlobalExceptionHandler {


@ExceptionHandler(ResourceNotFoundException.class)
public ResponseEntity<?> handleNotFound(ResourceNotFoundException ex) {
Map<String, Object> body = new HashMap<>();
body.put("error", ex.getMessage());
return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
}


@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<?> handleValidation(MethodArgumentNotValidException ex) {
Map<String, String> errors = new HashMap<>();
for (FieldError fe : ex.getBindingResult().getFieldErrors()) {
errors.put(fe.getField(), fe.getDefaultMessage());
}
Map<String, Object> body = new HashMap<>();
body.put("error", "Validation failed");
body.put("details", errors);
return ResponseEntity.badRequest().body(body);
}


@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleOther(Exception ex) {
Map<String, Object> body = new HashMap<>();
body.put("error", "Unexpected error");
body.put("message", ex.getMessage());
return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
}
}