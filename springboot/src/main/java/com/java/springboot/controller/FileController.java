package com.java.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @Author houlijia
 * @Date 2025-09-23 08:19
 * @Desc
 **/
@RestController
public class FileController {
    private static final String UPLOADED_FOLDER = System.getProperty("user.dir") + "/upload/";

    @PostMapping("/upload")
    public String upload(String name, MultipartFile file, HttpServletRequest request) throws Exception {
        // 服务器路径
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(UPLOADED_FOLDER);
        System.out.println("name: " + name);

        saveFile(file,path);
        return "upload success";
    }

    public void saveFile(MultipartFile file, String path) throws Exception {

        System.out.println("file: " + file.getOriginalFilename());
        System.out.println("contentType: " + file.getContentType());
        System.out.println("path: "+path);

        // 判断路径是否存在，不存在则创建
        File fileDir = new File(path);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }

        File filepath = new File(path + file.getOriginalFilename());
        System.out.println("filepath: "+filepath);
        Runnable runnable = () -> {
            try {
                file.transferTo(filepath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        System.out.println("runnable: "+runnable);
    }
}
