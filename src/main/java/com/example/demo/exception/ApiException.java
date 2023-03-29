package com.example.demo.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;

/*public record ApiException(String message,
                           Throwable throwable,
                           HttpStatus httpStatus,
                           ZonedDateTime zonedDateTime) {

}*/

@Data
public class ApiException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;

}
