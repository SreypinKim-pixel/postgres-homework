package kh.edu.istad.postgreshomework.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class StudentProfile {
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    private String biography;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
