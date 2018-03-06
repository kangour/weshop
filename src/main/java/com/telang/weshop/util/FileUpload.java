package com.telang.weshop.util;

import java.util.*;
import java.awt.List;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
public class FileUpload {
	
	@Value("${filePath}") // 路径在配置文件中配置
	String filePath; // 文件上传路径
	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public @ResponseBody String uploadImg(HttpServletRequest request) {  
		
		// String string =request.getParameter("");
		MultipartFile file=((MultipartHttpServletRequest) request).getFile("file");	//获取文件参数	 
		String contentType = file.getContentType();
		String fileName = file.getOriginalFilename();		
		//String fileName1 = UUID.randomUUID().toString()+fileName.substring(fileName.lastIndexOf("."));
		System.out.println("文件名：" + fileName);
		System.out.println("文件类型：" + contentType);
		System.out.println("文件存放路径：" +filePath);
		try {
			uploadFile(file.getBytes(), filePath, fileName); //调用文件上传方法
			System.out.println("上传成功");
			  String img=" <img src=\""+fileName+"\"/>"; // 图片
			return img+"</br>上传成功</br>" + "文件类型：" + contentType + "</br>文件名称：" + fileName + "</br>文件存放路径：" + filePath;
		} catch (Exception e) {
			System.out.println("上传失败：" + e.getMessage());
			return "上传失败：" + e.getMessage();

		}
	}

	  //文件上传方法
	public void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
		File targetFile = new File(filePath);
		if (!targetFile.exists()) {  //如果文件目录不存在，则创建文件目录
			targetFile.mkdirs();  
		}
		FileOutputStream out = new FileOutputStream(filePath + fileName);
		out.write(file);
		out.flush();
		out.close();
	}

}
