package com.music.model;
// Generated Mar 5, 2017 9:57:18 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Comment generated by hbm2java
 */
@Entity
@Table(name="Comment"
    ,schema="dbo"
    ,catalog="MusicProject"
)
public class Comment  implements java.io.Serializable {


     private int id;
     private User user;
     private String comment;
     private Set<Music> musics = new HashSet<Music>(0);

    public Comment() {
    }

	
    public Comment(int id) {
        this.id = id;
    }
    public Comment(int id, User user, String comment, Set<Music> musics) {
       this.id = id;
       this.user = user;
       this.comment = comment;
       this.musics = musics;
    }
   
     @Id 

    
    @Column(name="Id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UserId")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="Comment")
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="comment")
    public Set<Music> getMusics() {
        return this.musics;
    }
    
    public void setMusics(Set<Music> musics) {
        this.musics = musics;
    }




}


