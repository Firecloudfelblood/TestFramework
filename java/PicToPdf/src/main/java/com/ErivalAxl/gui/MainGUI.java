package com.ErivalAxl.gui;

import com.ErivalAxl.Engine.Converter;
import com.itextpdf.text.DocumentException;

import java.io.IOException;

public class MainGUI{
    public static void menu() throws DocumentException, IOException {
        Converter c = new Converter();
            c.Engine ("/Users/grimripper/Downloads/ballz.jpeg", "./tarea.pdf","Samantha");
    }
}

