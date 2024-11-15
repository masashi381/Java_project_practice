package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Forum;

@Repository
public interface ForumRepository extends JpaRepository<Forum, Integer>{
  
}

/*
 JpaRepositoryを継承したインターフェースを作成し、
 データベースを操作します。
JpaRepositoryを継承することにより、
データ操作に関するCRUD(作成・取得・更新・削除)のメソッドを
自動で生成してくれます。
 */