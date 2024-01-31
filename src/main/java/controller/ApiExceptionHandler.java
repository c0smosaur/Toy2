package controller;

import lombok.extern.slf4j.Slf4j;
import model.Result;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@Slf4j
@RestControllerAdvice(basePackages = {"controller"})
public class ApiExceptionHandler {

    // 예외처리
    @ExceptionHandler(value = {SQLException.class})
    public ResponseEntity sqlExceptionHandler(SQLException e){
//        log.error("SQL Exception Handler : ");
        e.printStackTrace();
        Result<Object> response = Result.builder()
                .resultCode(""+ HttpStatus.BAD_REQUEST.value())
                .resultMessage("SQL Exception occurred")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    // 날짜 데이터 잘못 입력시
    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public ResponseEntity dataParsingExceptionHandler(HttpMessageNotReadableException e){
//        log.error("Data Parsing Exception Handler : ");
        e.printStackTrace();
        Result<Object> response = Result.builder()
                .resultCode(""+ HttpStatus.BAD_REQUEST.value())
                .resultMessage("Error occurred while parsing data")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    // 없는 데이터 참조 시
    // 필수 데이터가 공백으로 들어올 시
    @ExceptionHandler(value = {DataIntegrityViolationException.class})
    public ResponseEntity dataIntegrityViolationExceptionHandler(DataIntegrityViolationException e){
//        log.error("Data Integrity Violation Exception Handler : ");
        e.printStackTrace();
        Result<Object> response = Result.builder()
                .resultCode(""+ HttpStatus.BAD_REQUEST.value())
                .resultMessage("Data integrity is violated")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity exception(Exception e){
//        log.error("Exception Handler : ");
        e.printStackTrace();
        Result<Object> response = Result.builder()
                .resultCode(""+ HttpStatus.INTERNAL_SERVER_ERROR.value())
                .resultMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
