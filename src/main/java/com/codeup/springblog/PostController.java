package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {


    private final PostRepository postDao;

    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }




    @GetMapping("/posts")
    public String posts(Model model){

//        ArrayList<Post> posts = new ArrayList<>();
//        Post post = new Post("hello1","hello1");
//        Post post2 = new Post("hello2","hello2");
//        Post post3 = new Post("hello3","hello3");
//        posts.add(post);
//        posts.add(post2);
//        posts.add(post3);
//        model.addAttribute("posts",posts);

        model.addAttribute("posts", postDao.findAll());

    return "posts/index";
    };

    @GetMapping("/post/{id}")
    public String postId(@PathVariable long id, Model model){
        model.addAttribute("id", id);
        model.addAttribute("post", postDao.getById(id));
        model.addAttribute("user", userDao.getById(id));
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


    @PostMapping("/post/{id}/edit")
    public String postEdit(@PathVariable long id, Model model){
        model.addAttribute("");
        return "posts/index";
    }

    @PostMapping("/post/{id}/delete")
    public String delete(@PathVariable long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }

















}
