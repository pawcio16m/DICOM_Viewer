package com.DICOM_Viever;

/**
 * Created by Pawel on 2015-12-29.
 */

import javax.swing.*;
import java.io.File;

public class DrawGraph extends JComponent {
    private String fileName;
    public DrawGraph(String fileName){
        this.fileName = fileName;
        File SampleFile = new File(fileName);
    }
}
