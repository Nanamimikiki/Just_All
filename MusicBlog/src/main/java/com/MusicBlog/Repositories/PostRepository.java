package com.MusicBlog.Repositories;

import com.MusicBlog.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
