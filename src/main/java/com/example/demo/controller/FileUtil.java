package com.example.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {

    //文件上传工具
    public static void uploadFile(byte[] bytes, String filepath, String fileName ) throws IOException {
        File file = new File(filepath);
        if(!file.exists()){
            //创建文件夹
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(filepath + fileName);
        fos.write(bytes);
        fos.flush();
        fos.close();
    }
}
