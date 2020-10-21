package com.cos.post.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.post.domain.post.Post;
import com.cos.post.domain.post.PostRepository;
import com.cos.post.domain.user.User;
import com.cos.post.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PostController {

	private final PostRepository postRepository;
	private final UserRepository userRepository;
	
	@PostMapping("/post")
	public String write(@RequestBody Post post) {
		
		User userEntity = userRepository.findById(1).get();
		
		post.setReadCount(0);
		post.setUser(userEntity);
		postRepository.save(post);
		return "ok";
	}
	
	@GetMapping({"","/","/post"})
	public String list2(Model model){
		model.addAttribute("posts",postRepository.findAll());
		return "post";
	}
	
	@GetMapping("/detail2/{id}")
	@ResponseBody
	public Post detail2(@PathVariable int id, Model model) {
		return postRepository.findById(id).get();
	}
	
	@GetMapping("/detail/{id}")
	public String detail(@PathVariable int id, Model model) {
		model.addAttribute("post",postRepository.findById(id).get());
		return "detail";
	}
}
