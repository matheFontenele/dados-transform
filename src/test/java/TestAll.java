
import com.intuitive.dadostransform.*;

import java.io.IOException;
import java.util.List;

public class TestAll {
    public static void main(String[] args) {
        String url = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf";
        String path = "assets";
        String pdfPath = "assets/Anexo.pdf";
        String csvPath = "assets/Anexo.csv";

        try {
            FileDownloader.downloadFile(url, path);

            String extractedText = PdfTextExtractor.extractText(pdfPath);

            List<String[]> tableData = TableProcessor.extractTableData(extractedText);

            List<String[]> tableReplaced = ReplaceData.replaceAbbreviations(tableData);

            CsvConverter.saveToCsv(tableReplaced, csvPath);

        } catch (IOException e) {
            System.err.println("Erro ao processar o PDF: " + e.getMessage());
        }
    }
}
