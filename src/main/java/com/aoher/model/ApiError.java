package com.aoher.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static com.aoher.util.Constants.LOCAL_DATE_FULL_FORMAT;

/**
 * Generalized Error class to represent API error
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ApiError implements Serializable {

    private static final long serialVersionUID = 1L;

    private HttpStatus status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LOCAL_DATE_FULL_FORMAT)
    private Date timestamp;

    private String message;

    private List<String> debugMessage;

    public ApiError(HttpStatus status, String message, List<String> ex) {
        this.status = status;
        this.message = message;
        this.debugMessage = ex;
    }

}
