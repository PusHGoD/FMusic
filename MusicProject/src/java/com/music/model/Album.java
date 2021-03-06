package com.music.model;
// Generated Mar 5, 2017 9:57:18 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Album generated by hbm2java
 */
@Entity
@Table(name="Album"
    ,schema="dbo"
    ,catalog="MusicProject"
)
public class Album  implements java.io.Serializable {


     private int id;
     private String name;
     private String image;
     private Integer singer;
     private Set<Music> musics = new HashSet<Music>(0);

    public Album() {
    }

	
    public Album(int id) {
        this.id = id;
    }
    public Album(int id, String name, String image, Integer singer, Set<Music> musics) {
       this.id = id;
       this.name = name;
       this.image = image;
       this.singer = singer;
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

    
    @Column(name="Name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Image")
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    
    @Column(name="Singer")
    public Integer getSinger() {
        return this.singer;
    }
    
    public void setSinger(Integer singer) {
        this.singer = singer;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="album")
    public Set<Music> getMusics() {
        return this.musics;
    }
    
    public void setMusics(Set<Music> musics) {
        this.musics = musics;
    }




}


