package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {


//    private final PostRepository postDao;
//
//    public PostController(PostRepository postDao){
//        this.postDao = postDao;
//    }


    @GetMapping("/posts")
    public String posts(Model model){
//model.addAttribute("post", "hello how are you");
//      model.add("post", post);
        Post post = new Post("john", "pierce");
model.addAttribute("name", post);
        return "posts/index";
    };
//
//    @GetMapping("/hello/{id}")
//    public String postId(@PathVariable long id, Model model){
//        model.addAttribute("id", id);
//        return  "posts/show";
//    };
//
//    @GetMapping("/posts/create")
//    public String getPostCreate(){
//        return "posts/create";
//    }
//
//    @PostMapping("/posts/create")
//    public String postCreate(){
//        return "posts/create";
//    }
//
//
//    @PostMapping("/index")
//    public String postEdit(@RequestParam(name = "edit") Model model){
//        model.addAttribute("edit");
//        return "/index";
//    }
//
//    @PostMapping("/index")
//    public String postDelete(@RequestParam(name = "delete") Model model){
//        model.addAttribute("delete");
//        return "/index";
//    }
//














}
