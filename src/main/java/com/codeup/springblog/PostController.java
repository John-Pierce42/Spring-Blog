package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts(){
        return "posts/index.";
    };

    @GetMapping("/hello/{id}")
    @ResponseBody
    public String postId(@PathVariable long id){
        return  "post/view";
    };

    @GetMapping("/posts/create")
    @ResponseBody
    public String getPostCreate(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreate(){
        return "posts/create";
    }















}
