package com.wero.finalProject.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @작성자:최기원
 * @작성날짜:2024/05/16
 * @파일명:DiaryFileService.class
 * @기능:일기 이미지, 업로드 서비스
 **/

public interface DiaryFileService {

    String upload(MultipartFile file);
    Resource getImage(String fileName);

}
