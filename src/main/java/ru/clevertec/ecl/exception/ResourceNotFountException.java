package ru.clevertec.ecl.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import ru.clevertec.ecl.util.Constant;

import static ru.clevertec.ecl.util.Constant.EXCEPTION_MESSAGE;

@Getter
public class ResourceNotFountException extends RuntimeException{

    private String fieldName;

    private Object fieldValue;

    private Integer errorCode;

    public ResourceNotFountException(String fieldName, Object fieldValue, Integer errorCode) {
        super(String.format(EXCEPTION_MESSAGE, fieldName, fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.errorCode = errorCode;
    }

}
