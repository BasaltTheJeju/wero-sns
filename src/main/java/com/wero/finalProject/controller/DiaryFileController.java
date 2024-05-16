package com.wero.finalProject.controller;

import com.wero.finalProject.service.DiaryFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @작성자:최기원
 * @작성날짜:2024/05/16
 * @파일명:DiaryFileController.class
 * @기능:일기 이미지 업로드 컨트롤러
 **/

@RestController
@RequestMapping("/diary-file")
@RequiredArgsConstructor
public class DiaryFileController {

    private final DiaryFileService diaryFileService;

    @PostMapping("/upload")//이미지 업로드하고 url 뱉어준다
    public String upload(
            @RequestParam("file") MultipartFile file)
    {
        String url=diaryFileService.upload(file);
        return url;
    }

    @GetMapping(value = "{fileName}",produces = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_PNG_VALUE})//이미지 반환
    public Resource getImage(
            @PathVariable("fileName") String fileName)
    {
        Resource resource= diaryFileService.getImage(fileName);
        return resource;
    }
}
