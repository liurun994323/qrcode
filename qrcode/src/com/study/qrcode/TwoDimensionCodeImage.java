package com.study.qrcode;

import java.awt.image.BufferedImage;  

import jp.sourceforge.qrcode.data.QRCodeImage;  
 
/**
 * 
 * @name: 二维码信息实体类
 *
 * @author: com.fhy.yyd
 *
 * @createDate 2014-12-31 上午10:47:19
 * @updateDate 2014-12-31 上午10:47:19
 *
 */
public class TwoDimensionCodeImage implements QRCodeImage {  
  
    BufferedImage bufImg;  
      
    public TwoDimensionCodeImage(BufferedImage bufImg) {  
        this.bufImg = bufImg;  
    }  
      
    @Override  
    public int getHeight() {  
        return bufImg.getHeight();  
    }  
  
    @Override  
    public int getPixel(int x, int y) {  
        return bufImg.getRGB(x, y);  
    }  
  
    @Override  
    public int getWidth() {  
        return bufImg.getWidth();  
    }  
  
}  