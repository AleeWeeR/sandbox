package com.exadel.sandbox.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;


    @Column( nullable = false, unique = true)
    private int name;


    @CreatedDate
    private Date CreatedDate;


    @LastModifiedDate
    private Date modifiedDate;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "role_per",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "per_id"),
            }

    )
    List<Permission> permissions = new ArrayList<>();
}
