package com.github.kayo08.cnes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.*;

/**
 *
 * @author kayom
 */
public class Arquivo {
    
    public static void baixaArquivo (String link, String local){
        
        String fromFile = (link);
        String toFile = (local);

        try {

            URL website = new URL(fromFile);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(toFile);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
   
    public static void unpack(String csvName) throws Exception{
        
        String fileToBeExtracted = csvName;
        String zipPackage = "C:\\Users\\kayom\\Documents\\Coding\\cnes\\src\\main\\java\\com\\github\\kayo08\\cnes\\arquivo.zip";
        
        OutputStream out = new FileOutputStream(fileToBeExtracted);
        FileInputStream fileInputStream = new FileInputStream(zipPackage);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream );
        ZipInputStream zin = new ZipInputStream(bufferedInputStream);
        ZipEntry ze = null;
        while ((ze = zin.getNextEntry()) != null) {
            if (ze.getName().equals(fileToBeExtracted)) {
                byte[] buffer = new byte[9000];
                int len;
                while ((len = zin.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
                out.close();
                break;
            }
        }
        zin.close();

    }
}

    

