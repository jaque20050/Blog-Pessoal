package com.spring.codeblog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.codeblogService;

@Service
public class CodeblogServiceImpl implements codeblogService {

	@Autowired
	CodeblogRepository codeblogRepository;

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}
