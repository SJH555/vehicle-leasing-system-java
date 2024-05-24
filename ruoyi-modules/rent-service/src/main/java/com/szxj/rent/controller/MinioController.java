package com.szxj.rent.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.szxj.rent.util.MinioUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/minio")
public class MinioController extends BaseController {

    @Resource
    private MinioUtil minioUtil;

    @Value("${minio.endpoint}")
    private String address;
    @Value("${minio.bucketName}")
    private String bucketName;

    @PostMapping("/upload")
    public AjaxResult upload(@RequestParam("files") MultipartFile[] file) {
        List<String> fileNameList = minioUtil.upload(file);
        return success(fileNameList.stream().map(name -> address + "/" + bucketName + "/" + name).collect(Collectors.toList())) ;
    }
}
