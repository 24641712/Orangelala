package cn.lnu.util;

import org.apache.commons.io.IOUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * FastDFS工具类［实现文件上传，下载，删除，查询］
 * @Author：ccl
 * @Date：19-3-27 下午2:40
 */
public class FastDFSClient {

    private TrackerClient trackerClient = null;
    private TrackerServer trackerServer = null;
    private StorageServer storageServer = null;
    private StorageClient1 storageClient = null;

     /*
      *构造函数
      * 初始化FastDFS
      * @param null
      * @return
      */
    public FastDFSClient(String conf){
//        if (conf.contains("classpath:")) {
//            String path = URLDecoder.decode(getClass().getProtectionDomain().getCodeSource().getLocation().toString(),"UTF-8");
//            path=path.substring(6);
//            conf = conf.replace("classpath:",URLDecoder.decode(path,"UTF-8"));
//        }
        //初始化配置文件
        try {
            ClientGlobal.init("/home/fdfs_client.conf");
            // 创建跟踪器客户端对象
            trackerClient = new TrackerClient();
            // 获取跟踪器连接
            trackerServer = trackerClient.getConnection();
            storageServer = null;
            // 获取存储器客户端对象
            storageClient = new StorageClient1(trackerServer, storageServer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

     /*
      *实现文件或图片上传
      * @param local 配置文件的路径
      * @return
      */
    public void testUpload(String local) {
        try {
            // 上传文件，返回文件标识
            String index = storageClient.upload_file1(local, null, null);
            // 查看标识
            System.out.println(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     /*
      *实现文件下载
      * @param null
      * @return
      */
    public void testDownload() {
        try {
              // 根据文件标识下载文件
             byte[] by = storageClient.download_file1("group1/M00/00/00/rBD8Q1ybYfOAQFQKAAABn89iab4615.txt");
             // 将数据写入输出流
            IOUtils.write(by, new FileOutputStream("/home/download.txt"));
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

     /*
      *删除文件
      * @param null
      * @return
      */
   public void testDelete(){
       // 根据文件标识删除文件，返回0则删除成功
       int i = 0;
       try {
           i = storageClient.delete_file1("group1/M00/00/00/rBD8Q1ybYfOAQFQKAAABn89iab4615.txt");
           if (i == 0) {
               System.out.println("删除成功");
           } else {
               System.out.println("删除失败");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public void testGetFileInfo(){
       // 根据文件标识获取文件信息
       FileInfo fileInfo = null;
       try {
           fileInfo = storageClient.get_file_info1("group1/M00/00/00/rBD8Q1ybYfOAQFQKAAABn89iab4615.txt");
           // 文件IP地址
           System.out.println(fileInfo.getSourceIpAddr());
           // 文件大小
           System.out.println(fileInfo.getFileSize());
           // 创建时间
           System.out.println(fileInfo.getCreateTimestamp());
           // 错误校验码
           System.out.println(fileInfo.getCrc32());
       } catch (IOException e) {
           e.printStackTrace();
       } catch (MyException e) {
           e.printStackTrace();
       }
   }









}
