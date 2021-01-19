package org.springframework.cloud.dataflow.server.repository;

public class InvalidApplicationNameException extends RuntimeException {

  public InvalidApplicationNameException(String message) {
    super(message);
  }

}
