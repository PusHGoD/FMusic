package com.music.model;
// Generated Mar 5, 2017 9:57:18 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="User"
    ,schema="dbo"
    ,catalog="MusicProject"
)
public class User  implements java.io.Serializable {


     private int id;
     private String firstName;
     private String lastName;
     private String phone;
     private Boolean gender;
     private String email;
     private Login login;
     private Set<Comment> comments = new HashSet<Comment>(0);
     private Set<Music> musics = new HashSet<Music>(0);

    public User() {
    }

	
    public User(int id) {
        this.id = id;
    }
    public User(int id, String firstName, String lastName, String phone, Boolean gender, String email, Login login, Set<Comment> comments, Set<Music> musics) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.phone = phone;
       this.gender = gender;
       this.email = email;
       this.login = login;
       this.comments = comments;
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

    
    @Column(name="FirstName")
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="LastName")
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="Phone")
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="Gender")
    public Boolean getGender() {
        return this.gender;
    }
    
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    
    @Column(name="Email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="user")
    public Login getLogin() {
        return this.login;
    }
    
    public void setLogin(Login login) {
        this.login = login;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Comment> getComments() {
        return this.comments;
    }
    
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Music> getMusics() {
        return this.musics;
    }
    
    public void setMusics(Set<Music> musics) {
        this.musics = musics;
    }




}


