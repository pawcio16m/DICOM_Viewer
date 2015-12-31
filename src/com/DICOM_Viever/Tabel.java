package com.DICOM_Viever;

import javax.swing.*;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Pawel on 2015-12-29.
 */
public class Tabel extends JPanel {

    int rows;
    int columns;
    public Tabel(){
        super();
        this.columns = 2;
        this.rows = 4;

        Object[] kolumny={"Kol 1","Kol2"};
        Object[][] wiersz = {{"a","b"},{"c","d"}};

        JTable tabela = new JTable(wiersz,kolumny);
        tabela.setEnabled(false);
        //tabela.setColumnModel(kolumny);
        this.add(tabela);


    }

}
