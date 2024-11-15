package com.example.demo.model;

import jakarta.persistence.*;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "forums")
public class Forum {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "title")
  private String title;
  @Column(name = "body")
  private String body;
}
