package com.MusicBlog.Repository;

import com.MusicBlog.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
