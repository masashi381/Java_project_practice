package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Forum;
import com.example.demo.repository.ForumRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ForumService {
  @Autowired
  ForumRepository repository;

  // データベースよりフォーラムの一覧を取得
  public List<Forum> getAll = new ArrayList<Forum>();
  // public List<Forum> findAll(){
  //   return repository.findAll();
  // }

  // データベースに値を登録
  public void insert(Forum forum) {
    repository.save(forum);
  }
}
