package com.intuitive.dadostransform;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileDownloader {

    public static void downloadFile(String fileUrl, String fileDirectory){
        File dirFile = new File(fileDirectory);
        if (!dirFile.exists()){
            dirFile.mkdirs();
        }

        String fileName = "Anexo.pdf";
        String savePath = fileDirectory+File.separator+fileName;

        System.out.println("Baixando: " +fileUrl);

        try (InputStream in = new URL(fileUrl).openStream();
             FileOutputStream out = new FileOutputStream(savePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Arquivo salvo: "+savePath);
    }
}
