package com.example.demo.model;

import jakarta.persistence.Column;
// import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
// getter(), setter()を自動生成するアノテーション
@Data
// JPAのエンティティであることを示すアノテーション
@Entity
// エンティティに対応するテーブル名を指定。　
@Table(name = "forums")
public class Forum {
  // エンティティの主キーを指定。
  @Id
  // オートインクリメント。
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // カラムに名前を付与
  @Column(name = "id")
  private Integer id;
  @Column(name = "title")
  private String title;
  @Column(name = "body")
  private String body;
}
