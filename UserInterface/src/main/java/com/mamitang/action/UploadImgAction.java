package com.mamitang.action;

import com.mamitang.CommonProperties;
import com.mamitang.ReturnStatus;
import com.mamitang.response.RetResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/**
 * 图片上传Action
 * Created by lyy on 10/15/15.
 */
@RestController
@RequestMapping("/fileInfo")
public class UploadImgAction {

    private final static String picPath = CommonProperties.PICPATH;
    //构建图片文件夹路径
    public UploadImgAction(){
        File file = new File(picPath);
        if(!file.exists() && !file.isDirectory()){
            file.mkdir();
        }
    }

    @RequestMapping(value = "uploadImg", method = RequestMethod.POST)
    @ResponseBody
    public RetResponse uploadImgFile(HttpServletRequest request) {
        RetResponse result = new RetResponse();
        try {
            CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            if (multipartResolver.isMultipart(request)) {
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
                multiRequest.getFileMap();
                //获取multiRequest 中所有的文件名
                Iterator iterator = multiRequest.getFileNames();
                request.getContextPath();
                while (iterator.hasNext()) {
                    //一次遍历所有文件
                    MultipartFile file = multiRequest.getFile(iterator.next().toString());
                    if (file.getSize() > 2097152) {
                        throw new Exception("图片大小不能超过2M");
                    }
                    if (file != null) {
                        String orgName = file.getOriginalFilename();
                        String lastfix = orgName.substring(orgName.lastIndexOf(".") + 1, orgName.length());
                        //随机生成文件名
                        String fileName = UUID.randomUUID().toString();
                        String path = picPath + fileName + "." + lastfix;
                        file.transferTo(new File(path));
                        request.getLocalPort();
                        URL url = new URL(request.getRequestURL().toString());
                        //返回生成的图片链接
                        String retImg = url.getProtocol() + "://" + url.getAuthority() + "/image/" + fileName + "." + lastfix;
                        Map<String, String> imgInfo = new HashMap<String, String>();
                        imgInfo.put("imgInfo", retImg);
                        result.setData(imgInfo);
                        result.setStatus(ReturnStatus.SUCCESS);
                        result.setRetMsg("上传文件成功");
                    }
                }
            }
        }catch (Exception e){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("上传图片失败， 原因：" + e.getMessage());
        }
        return result;
    }

}
