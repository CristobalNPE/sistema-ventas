package com.atteh.sistemaventas.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerAllDto {


  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("rut")
  private String rut;

  @JsonProperty("purchases")
  private Set<PurchaseDto> purchases;
}
