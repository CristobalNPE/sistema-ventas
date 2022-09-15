package com.atteh.sistemaventas.mapstruct.dtos.mappers;

import com.atteh.sistemaventas.entities.Customer;
import com.atteh.sistemaventas.entities.Product;
import com.atteh.sistemaventas.entities.Purchase;
import com.atteh.sistemaventas.entities.User;
import com.atteh.sistemaventas.mapstruct.dtos.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

  CustomerAllDto customerToCustomerAllDto(Customer customer);

  CustomerDto customerToCustomerDto(Customer customer);

  ProductDto productToProductDto(Product product);

  PurchaseDto purchaseToPurchaseDto(Purchase purchase);

  UserGetDto userToUserGetDto(User user);

  User userPostDtoToUser(UserPostDto userPostDto);

}
