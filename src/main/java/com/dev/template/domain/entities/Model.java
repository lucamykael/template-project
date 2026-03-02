package com.dev.template.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Model {

  @Id
  private Long id;

  private String name;
}
