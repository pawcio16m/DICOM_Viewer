package com.DICOM_Viever;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello world");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                MainFrame frame = new MainFrame();


            }
        });
    }
}
