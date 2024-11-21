package com.example.demo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Forum;
import com.example.demo.repository.ForumRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import com.example.demo.service.ForumService;

@RestController
@RequestMapping("/api")

public class ForumController {
  private final ForumRepository forumRepository;

  public ForumController(ForumRepository forumRepository) {
    this.forumRepository = forumRepository;
  }

  @GetMapping("/")
  public List<Forum> getAllForum() {
    return forumRepository.findAll();
  }

  @PostMapping("/create")
  public Forum createForum(@RequestBody Forum forum) {
    return forumRepository.save(forum);
  }
}
// public class ForumController {
//   // 特定のアノテーションを付与したクラスのインスタンスを使用可能にする（依存性注入・DI）
//   @Autowired
//   ForumService service;
  
//   // トップページ（フォームがある画面）
//   // HTTPリクエストの”GET”を受け付けるメソッドに付与するアノテーション
//   @GetMapping("/")
//   public ResponseEntity <List<Forum>> getAllForum() {
//     return 
//   }
//   // public String top(Model model){
//   //   model.addAttribute("forum", new Forum());
//   //   return "top";
//   // }

//   // データベースへの登録
//   // HTTPリクエストの”POST”を受け付けるメソッドに付与するアノテーション
//   // @PostMapping("/create")
//   // public String saveForum(@ModelAttribute Forum forum, Model model){
//   //   // serviceクラスのinsertメソッドを呼び出し、DBに入力値を登録
//   //   service.insert(forum);
//   //   return "result";
//   // }

//   @GetMapping("/hello")
//     public Message getMessage(){
//       return new Message("Hello, World!");
//     }
//   public static class Message{
//     private String message;
//     public Message(String message) {
//       this.message = message;
//     }
//     public String getMessage() {
//       return message;
//     }
//     public void setMessage(String message) {
//       this.message = message;
//     }
//   }
// }

