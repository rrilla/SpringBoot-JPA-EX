package com.cos.post.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.post.domain.comment.Comment;
import com.cos.post.domain.comment.CommentRepository;
import com.cos.post.domain.post.PostRepository;
import com.cos.post.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CommentController {

	private final CommentRepository commentRepository;
	private final PostRepository postRepository;
	private final UserRepository userRepository;
	
	@PostMapping("/comm")
	public String join(@RequestBody Comment comment) {
		comment.setPost(postRepository.findById(2).get());
		comment.setUser(userRepository.findById(3).get());
		commentRepository.save(comment);
		return "ok";
	}
	
}
