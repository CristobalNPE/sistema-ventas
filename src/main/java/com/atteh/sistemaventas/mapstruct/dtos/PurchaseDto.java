package com.atteh.sistemaventas.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class PurchaseDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("products")
  private Set<ProductDto> products;

  @JsonProperty("purchaseDate")
  private Date purchaseDate;
}
