package com.atteh.sistemaventas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String lastname;
  private String rut;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(
          name = "customer_purchase",
          joinColumns = @JoinColumn(name = "customer_id"),
          inverseJoinColumns = @JoinColumn(name = "purchase_id")
  )
  private Set<Purchase> purchases = new HashSet<>();
}