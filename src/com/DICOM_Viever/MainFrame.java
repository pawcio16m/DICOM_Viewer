package com.DICOM_Viever;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


/**
 * Created by Pawel on 2015-12-29.
 */
public class MainFrame extends JFrame {
    String fileName="C:\\\\Users\\\\Pawel\\\\Desktop\\\\build.png";


    JPanel panelObrazu;
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("Plik");
    JMenu option = new JMenu("Opcje");
    JMenuItem upload = new JMenuItem("Wczytaj...");
    JTabbedPane tabmenu = new JTabbedPane();

    public MainFrame(){
        super();

       //Frame properities
        Toolkit screenKit = Toolkit.getDefaultToolkit();
        Dimension screenSize;
        screenSize = screenKit.getScreenSize();
        final int screenHeight = screenSize.height;
        final int screenWidth = screenSize.width;
        setSize(screenWidth,screenHeight-60);
        setLocationByPlatform(false);
        setLocation(0,0);
        setResizable(false);
        setTitle("DICOM Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //adding component to frame
        panelObrazu = new PanelObrazu();
        fileMenu.add(upload);
        menuBar.add(fileMenu);
        menuBar.add(option);
        setJMenuBar(menuBar);

        add(tabmenu);
        add(panelObrazu);

        upload.addActionListener(new FileOpenListener());

    }



    public class FileOpenListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter datFilter = new FileNameExtensionFilter("Pliki danych","png");
            chooser.setFileFilter(datFilter);
            chooser.setCurrentDirectory(new File("C:\\Users\\Pawel\\Desktop\\"));
            chooser.setMultiSelectionEnabled(true);
            int result = chooser.showOpenDialog(MainFrame.this);

            if(result == JFileChooser.APPROVE_OPTION){
                fileName = chooser.getSelectedFile().getPath();
                MainFrame.super.remove(panelObrazu);
                panelObrazu = new PanelObrazu(fileName);
                //tabmenu.addTab("Obraz",panelObrazu);
                MainFrame.this.add(panelObrazu);
                MainFrame.this.setVisible(true);
                MainFrame.this.repaint();
            }
            else{
                System.err.println("Error");
            }
        }
    }

}
