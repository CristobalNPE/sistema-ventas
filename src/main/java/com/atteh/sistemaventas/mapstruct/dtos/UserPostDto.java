package com.atteh.sistemaventas.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserPostDto {

  @JsonProperty("id")
  private Long id;

  @Email
  @NotNull
  @JsonProperty("email")
  private String email;

  @NotNull
  @JsonProperty("username")
  private String username;

  @NotNull
  @JsonProperty("password")
  private String password;
}
