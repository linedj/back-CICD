package org.example.back.domain.post.post.repository

import org.example.back.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>