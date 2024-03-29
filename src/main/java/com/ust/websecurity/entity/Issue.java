package com.ust.websecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Define the many-to-one relationship with the User entity
    @ManyToOne
    @JoinColumn(name = "user_id") // Replace "user_id" with the actual name of the column in the issue table referencing the User entity's primary key
    private User user;

    // Other issue fields/columns
    // ...
}
