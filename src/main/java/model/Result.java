package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Result<T> {
  private String resultCode;
  private String resultMessage;
  private T data;

  public static Result<Object> successBuilder(Object obj) {
    return Result.builder()
            .resultCode("" + HttpStatus.OK.value())
            .resultMessage(HttpStatus.OK.getReasonPhrase())
            .data(obj)
            .build();
  }


}
