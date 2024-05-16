package com.wero.finalProject.Repository;


import com.wero.finalProject.domain.DiaryImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @작성자:최기원
 * @작성날짜:2024/05/16
 * @파일명:DiaryImageRepository.class
 * @기능:일기 이미지 레포지토리
 **/

@Repository
public interface DiaryImageRepository  extends JpaRepository<DiaryImageEntity, Integer> {

   List<DiaryImageEntity> findByDiaryId(Integer diaryId);

   @Transactional
   void deleteByDiaryId(Integer diaryId);

}
