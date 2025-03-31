package com.intuitive.dadostransform;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf";
        String path = "assets";
        String pdfPath = "assets/Anexo.pdf";
        String csvPath = "assets/Anexo.csv";

        try {
            // 1 - Faz o download do arquivo
            FileDownloader.downloadFile(url, path);

            // 2 - Extrai o texto do pdf baixado
            String extractedText = PdfTextExtractor.extractText(pdfPath);

            // 3 - Filtra as tabelas do texto
            List<String[]> tableData = TableProcessor.extractTableData(extractedText);

            // 4 - Renomeia as tabelas Seg. Ambulatorial e Seg. Odontológica
            List<String[]> tableReplaced = ReplaceData.replaceAbbreviations(tableData);

            // 5 - Converte o arquivo para .csv e salva na pasta
            CsvConverter.saveToCsv(tableReplaced, csvPath);

        } catch (IOException e) {
            System.err.println("Erro ao processar o PDF: " + e.getMessage());
        }
    }
}