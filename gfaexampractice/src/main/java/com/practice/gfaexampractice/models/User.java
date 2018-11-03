package com.practice.gfaexampractice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NaturalId
  @Size(min = 5, max = 20)
  private String name;
  @Size(min = 8, max = 18)
  private String password;
}
