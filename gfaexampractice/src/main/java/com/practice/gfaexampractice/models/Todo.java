package com.practice.gfaexampractice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Size(max = 30)
  @NotNull
  private String name;
  private String description;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createdAt;

  public Todo(@Size(max = 30) @NotNull String name, String description, Date createdAt) {
    this.name = name;
    this.description = description;
    this.createdAt = createdAt;
  }
}