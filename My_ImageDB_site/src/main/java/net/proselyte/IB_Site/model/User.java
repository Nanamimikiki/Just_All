package net.proselyte.IB_Site.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *  Simple JavaBeam object that represents User
 */
@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User {
    @Column(name = "username")
    private String userName;
    @Column(name = "address")
    private String address;
}
