package ru.clevertec.ecl.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.clevertec.ecl.dto.ErrorDto;
import ru.clevertec.ecl.exception.ResourceNotFountException;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFountException.class)
    public ResponseEntity<ErrorDto> notFoundException(ResourceNotFountException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorDto.builder()
                        .message(exception.getMessage())
                        .errorCode(exception.getErrorCode())
                        .build());
    }

}
