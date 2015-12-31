package com.DICOM_Viever;

import fr.apteryx.imageio.dicom.DataElement;
import fr.apteryx.imageio.dicom.DataSet;
import fr.apteryx.imageio.dicom.DicomMetadata;
import fr.apteryx.imageio.dicom.DicomReader;
import sun.security.krb5.internal.ccache.Tag;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                 new MainFrame();


            }
        });
        /*BufferedImage image = null;
        DicomMetadata dmd = null;
        DataSet data = null;
        Iterator readers = ImageIO.getImageReadersByFormatName("dicom");
        DicomReader reader = (DicomReader)readers.next();
        try {
            reader.setInput(new FileImageInputStream(new File("C:\\Users\\Pawel\\Desktop\\dicom_images\\brain_001.dcm")));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wyjatek 1");
        }
        try {
            dmd = reader.getDicomMetadata();
            //data = reader.getFileMetaElements();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wyjatek 2");
        }
        try {
            image = reader.read(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wyjatek 3");
        }
        try {
            image = ImageIO.read(new File("C:\\Users\\Pawel\\Desktop\\dicom_images\\CT-MONO2-16-ankle.dcm"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int patient_id = image.getHeight();
        //assert dmd != null;
        data = dmd.getAttributes();
        //Map map = null;
        //data.putAll(map);
        //Map map1 = null;
        //map1 = (Map) data.values();

        //DataElement elem; //= map1.get(999);
        System.out.println(data.findString(fr.apteryx.imageio.dicom.Tag.AcquisitionDate));
        //System.out.println(map1.size());
       // Tree
        System.out.println(patient_id);

       // System.out.println(data.findString(524286));
     //   String at = dmd.getAttributeString(2);





        //System.out.println(prop[2]);*/

    }
}
