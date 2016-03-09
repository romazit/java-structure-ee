package com.compcoding.be.business.posts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author romanm
 */
@Entity
public class Post {
    
    @Id
    private long id;
    
    private String message;

    public Post(String message) {
        this.message = message;
    }

    public Post() {
    }
    
    
}
