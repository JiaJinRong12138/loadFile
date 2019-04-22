package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileUploadController {

    //处理文件上传
    @PostMapping(value = "/uploadimg")
    public @ResponseBody String upload(@RequestParam("file") MultipartFile file){

        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();

        System.out.println(contentType + fileName);

        String p = "D:\\img\\";
        try {
            FileUtil.uploadFile(file.getBytes(), p, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }

}
