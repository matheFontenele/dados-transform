package com.intuitive.dadostransform;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfTextExtractor {

    public static String extractText(String pdfPath) throws IOException {
        PDDocument document = PDDocument.load(new File(pdfPath));
        PDFTextStripper stripper = new PDFTextStripper();

        String text = stripper.getText(document);
        document.close();

        return text;
    }
}
