package com.DICOM_Viever;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Pawel on 2015-12-30.
 */
public class PanelObrazu extends JPanel {
    BufferedImage image;
    String fileName=null;
    public PanelObrazu(String filename){
        this.fileName = filename;

        try {
            this.image = ImageIO.read(new File(fileName));
            System.out.println(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("B³¹d przy ³adowaniu obrazka");
        }

    }
    public PanelObrazu(){

        super.setVisible(true);
        super.setSize(new Dimension(100, 100));
        setPreferredSize(new Dimension(100,100));

    }

    @Override
    public void paintComponent(Graphics g){
       g.drawImage(this.image,20,20,800,600,null);


    }

}
