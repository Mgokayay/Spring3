package com.workintech.spring3.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class ZooException extends RuntimeException{

  private HttpStatus httpStatus;

  public ZooException(String message,HttpStatus httpStatus){
      super(message);
      this.httpStatus=httpStatus;
  }
}
