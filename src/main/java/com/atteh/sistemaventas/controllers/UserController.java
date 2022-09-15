package com.atteh.sistemaventas.controllers;

import com.atteh.sistemaventas.mapstruct.dtos.UserGetDto;
import com.atteh.sistemaventas.mapstruct.dtos.UserPostDto;
import com.atteh.sistemaventas.mapstruct.dtos.mappers.MapStructMapper;
import com.atteh.sistemaventas.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private final MapStructMapper mapper;
  private final UserRepository userRepository;


  @PostMapping
  public ResponseEntity<?> create(@Valid @RequestBody UserPostDto user) {
    userRepository.save(
            mapper.userPostDtoToUser(user)
    );

    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserGetDto> fetchById(@PathVariable(value = "id") Long id) {
    return new ResponseEntity<>(mapper.userToUserGetDto(userRepository.findById(id).get()), HttpStatus.OK);
  }


}
