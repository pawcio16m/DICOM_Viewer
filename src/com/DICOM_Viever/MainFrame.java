package com.DICOM_Viever;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Created by Pawel on 2015-12-29.
 */
public class MainFrame extends JFrame {
    public MainFrame(){
        //tworzenie g³ownej ramki wymiary
        Toolkit screenKit = Toolkit.getDefaultToolkit();
        Dimension screenSize = screenKit.getScreenSize();
        final int screenHeight = screenSize.height;
        final int screenWidth = screenSize.width;
        setSize(3*screenWidth/4,3*screenHeight/4);
        setLocationByPlatform(false);
        setLocation(10,10);
        setResizable(false);
        setTitle("DICOM Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //dodawanie przycisku

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Plik");
        JMenuItem upload = new JMenuItem("Wczytaj...");
        fileMenu.add(upload);
        menuBar.add(fileMenu);


        upload.addActionListener(new FileOpenListener());
        //String filename = "C:\\Users\\Pawel\\Desktop\\build.png";






    }
    public class FileOpenListener implements ActionListener {
        //MainFrame frame = new MainFrame();
        public String fileName=null;
        public void actionPerformed(ActionEvent event) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter datFilter = new FileNameExtensionFilter("Pliki danych","png");
            chooser.setFileFilter(datFilter);
            //chooser.setCurrentDirectory(new File("."));
            int result = chooser.showOpenDialog(MainFrame.this);

            if(result == JFileChooser.APPROVE_OPTION){
                this.fileName = chooser.getSelectedFile().getPath();
                MainFrame.this.add(new DrawComponent(fileName));
                MainFrame.this.setVisible(true);
            }
            else{
                System.out.println("Error");
            }

        }
    }

}
