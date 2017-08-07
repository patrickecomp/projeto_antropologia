/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.BorderLayout;
//import java.util.Base64;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author gabriel
 */
public class Pergunta implements Serializable{
    
     String texto;
     String [] respostas; 
     int correta;
     int atual;
     private String base64img;
     private ImageIcon image;
    
     public Pergunta(String _texto) {
        texto = _texto;
        int atual = 0;
        respostas = new String[4];
    }
    
    
    public void setRespostas(String[] respostas){
        this.respostas = respostas;
    }

    public void setCorreta(int correta) {
        this.correta = correta;
    }
    

    public String[] getRespostas() {
        return respostas;
    }

    public String getTexto() {
        return texto;
    }

    public int getCorreta() {
        return correta;
    }
    
    public void setImagem(ImageIcon i){
        if(i != null){
            image = i;
            }
    }

    public ImageIcon getImagem() {
        if(image != null){
            //return decodeToImage(base64img);
            return  image;
        }
        else return null;
    }
    
    
    public static String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
 
        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();
 
            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }
    
    public static BufferedImage decodeToImage(String imageString) {
 
        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    
}
