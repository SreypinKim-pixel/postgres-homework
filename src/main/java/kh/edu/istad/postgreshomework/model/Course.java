package kh.edu.istad.postgreshomework.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer countRating;
    private LocalDateTime createdAt;
    private String description;
    private Float discountPercent;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String keyword;
    private String level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    private String slug;
    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHours;
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;
}
