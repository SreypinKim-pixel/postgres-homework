package kh.edu.istad.postgreshomework.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String icon;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
