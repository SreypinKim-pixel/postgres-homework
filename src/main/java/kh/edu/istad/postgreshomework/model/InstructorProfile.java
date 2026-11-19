package kh.edu.istad.postgreshomework.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    private String biography;
    private String facebookLink;
    private String githubLink;
    private String jobTitle;
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
