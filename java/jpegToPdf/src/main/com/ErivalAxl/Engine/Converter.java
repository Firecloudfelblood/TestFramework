package com.ErivalAxl.Engine;

import java.io.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

public class Converter {
    public void Engine(String picture, String pdfName, String studentName){
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutPutStream(pdfName));
        document.open();
        Image image = Image.getInstance(picture);
        document.add(new Paragraph(studentName));
        document.add(image);
        document.close()


    }
}
