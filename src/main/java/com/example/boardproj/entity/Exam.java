package com.example.boardproj.entity;

import com.example.boardproj.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Exam {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long num;

        private String name;

        private String etc;
}
