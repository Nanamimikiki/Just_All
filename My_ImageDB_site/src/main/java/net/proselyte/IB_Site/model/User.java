package net.proselyte.IB_Site.model;

import jakarta.persistence.*;

import java.util.Set;

/**
 *  Simple JavaBean domain object that represents User
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "ipAddress")
    private String ipAddress;
    @ManyToMany
    @JoinTable(name = "user_roles", joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public String getUserName() {
        return userName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setIpAddress(String ip) {
        this.ipAddress = ipAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String toString(){
        return "User " + getUserName() + " with ip " + getIpAddress();
    }
}
