package com.javatechie.entity;



import jakarta.persistence.*;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "ImageData")
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    @Lob
    @Column(name = "imagedata",length = 1000)
    private byte[] imageData;
}
