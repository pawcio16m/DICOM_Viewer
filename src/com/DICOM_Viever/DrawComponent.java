package com.DICOM_Viever;

/**
 * Created by Pawel on 2015-12-29.
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DrawComponent extends JComponent {
    /*public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    public void paintComponent(Graphics g){
        //g.drawString("To nie jest program Hello World!", MESSAGE_X, MESSAGE_Y);
        Graphics2D g2 = (Graphics2D) g;
        double centerX= 400;
        double centerY = 300;
        double radius = 50;
        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centerY,centerX + radius, centerY + radius);
        g2.setPaint(Color.RED);
        g2.fill(circle);
        g2.draw(circle);

    }*/
    private BufferedImage image;
    public DrawComponent(String filename){
        try{
            image = ImageIO.read(new File(filename));
            System.out.println(filename);

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    @Override
    public void paintComponent(Graphics g) {
        if(image==null) return;

        int imageHeight = image.getHeight(this);
        int imageWidth = image.getWidth(this);

        g.drawImage(image,0,0,imageWidth,imageHeight,null);

    }
}
