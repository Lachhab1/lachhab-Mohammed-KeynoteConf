package net.ccn36.lachhabmohammed.conferenceservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @Builder @Getter @Setter
public class Review {
    @Id
    private String id;
    private Date date;
    private String text;
    private double note;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Conference conference;
}
