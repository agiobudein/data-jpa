package com.tamjayz.data_jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Integer age;
    private LocalDateTime createdAt;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
