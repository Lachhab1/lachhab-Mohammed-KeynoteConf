package net.ccn36.lachhabmohammed.conferenceservice.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity @NoArgsConstructor @AllArgsConstructor @Builder @Data @Getter @Setter
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private TYPECONF type;
    private Date date;
    private long duration;
    private long keynoteId;
    private int nombreInscrits;
    private double score;
    @OneToMany(mappedBy = "conference")
    private List<Review> reviews = new ArrayList<>();
}

