package com.ErivalAxl.Engine;

import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;


public class Converter {
    public void Engine(String picture, String pdfName, String studentName) throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(pdfName));
        document.open();
        Image image = Image.getInstance(picture);
        document.add(new Paragraph(studentName));
        document.add(image);
        document.close();
    }
    public void list(String directoty){
        String[] pathnames;
        File f = new File(directoty);
        pathnames = f.list();
        for (String pathname : pathnames) {
            System.out.println(pathname);
        }
    }
}
