package com.codeup.springblog;

import com.codeup.springblog.Service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {


    private final PostRepository postDao;

    private final UserRepository userDao;

    private final EmailService emailService;

    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService){
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
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
        model.addAttribute("post", postDao.getById(id));
//        model.addAttribute("post", postDao.getById(id));
//        model.addAttribute("user", userDao.getById(id));
        return  "posts/show";
    };

    @GetMapping("/posts/create")
    public String getPostCreate(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postCreate(@ModelAttribute Post post){
        User user = userDao.getById(1L);
        post.setOwner(user);

        postDao.save(post);
        emailService.prepareAndSend(post, "new post created", "You created a new post!");
        return "redirect:/post/" + post.getId();
    }


    @PostMapping("/post/{id}/edit")
    public String postEdit(@PathVariable long id, Model model){

        return "posts/edit";
    }

    @PostMapping("/post/{id}/delete")
    public String delete(@PathVariable long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }

















}
