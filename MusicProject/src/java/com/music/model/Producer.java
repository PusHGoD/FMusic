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
 * Producer generated by hbm2java
 */
@Entity
@Table(name="Producer"
    ,schema="dbo"
    ,catalog="MusicProject"
)
public class Producer  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;
     private String description;
     private Set<Singer> singers = new HashSet<Singer>(0);

    public Producer() {
    }

	
    public Producer(int id) {
        this.id = id;
    }
    public Producer(int id, String name, String address, String description, Set<Singer> singers) {
       this.id = id;
       this.name = name;
       this.address = address;
       this.description = description;
       this.singers = singers;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
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

    
    @Column(name="Address")
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="Description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="producer")
    public Set<Singer> getSingers() {
        return this.singers;
    }
    
    public void setSingers(Set<Singer> singers) {
        this.singers = singers;
    }




}


