package kh.edu.istad.postgreshomework.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String duration;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String slug;
    private String thumbnail;
    private String title;
    private String youtube;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments;
}