package com.wero.finalProject.service.implement;

import com.wero.finalProject.service.DiaryFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @작성자:최기원
 * @작성날짜:2024/05/16
 * @파일명:DiaryFileServiceImplement.class
 * @기능:일기 이미지 업로드, 얻어오기 로직
 **/

@Service
public class DiaryFileServiceImplement implements DiaryFileService {

    @Value("${spring.file.upload.path}")
    private String filePath;
    @Value("${spring.file.upload.url}")
    private String fileUrl;

    @Override
    public String upload(MultipartFile file) {

        if(file.isEmpty()) return null;

        String originalFileName = file.getOriginalFilename();
        String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
        String uuid= UUID.randomUUID().toString();
        String saveFileName = uuid+extension;
        String savePath = filePath+saveFileName;

        try {

            file.transferTo(new File(savePath));

        }catch (Exception exception){
            exception.printStackTrace();
            return null;
        }

        String url=fileUrl+saveFileName;
        return url;
    }

    @Override
    public Resource getImage(String fileName) {

        Resource resource =null;

        try {

            resource = new UrlResource("file:"+filePath+fileName);

        }catch (Exception exception){
            exception.printStackTrace();
            return null;
        }
        return resource;
    }
}
