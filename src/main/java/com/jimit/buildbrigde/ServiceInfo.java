package com.jimit.buildbrigde;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class ServiceInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String owner;
    private String repoUrl;

    public ServiceInfo(){}

    public ServiceInfo(String name,String owner,String repoUrl)
    {
        this.name=name;
        this.owner=owner;
        this.repoUrl=repoUrl;
    }

    public Long getId() {return id;}
    public String getName() {return name;}
    public String getOwner() {return owner;}
    public String getRepoUrl() {return repoUrl;}

}

