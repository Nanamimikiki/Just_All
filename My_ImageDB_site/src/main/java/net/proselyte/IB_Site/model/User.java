package net.proselyte.IB_Site.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *  Simple JavaBeam object that represents User
 */
@Entity
@Table(name = "users")
public class User {
    @Column(name = "username")
    private String userName;
    @Column(name = "ipAddress")
    private String ipAddress;

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
    public String toString(){
        return "User " + getUserName() + " with ip " + getIpAddress();
    }
}
