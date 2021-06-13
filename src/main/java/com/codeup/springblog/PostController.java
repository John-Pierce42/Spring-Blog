package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String posts(@PathVariable ArrayList<Model> model){

//      model.add("post", post);

        return "posts/index";
    };

    @GetMapping("/hello/{id}")
    public String postId(@PathVariable long id, Model model){
        model.addAttribute("id", id);
        return  "posts/show";
    };

    @GetMapping("/posts/create")
    public String getPostCreate(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postCreate(){
        return "posts/create";
    }















}
