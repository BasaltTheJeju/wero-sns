package com.wero.finalProject.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @작성자:최기원
 * @작성날짜:2024/05/16
 * @파일명:DiaryImageEntity.class
 * @기능:일기 이미지 엔티티
 **/

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="diary_image")
@Table(name="diary_image")
public class DiaryImageEntity {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sequence;
    private int diaryId;
    private String image;

    public DiaryImageEntity(int diaryId, String image) {
        this.diaryId = diaryId;
        this.image = image;
    }
}
