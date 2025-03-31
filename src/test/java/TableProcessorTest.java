

import com.intuitive.dadostransform.PdfTextExtractor;
import com.intuitive.dadostransform.TableProcessor;

import java.io.IOException;
import java.util.List;

public class TableProcessorTest {

    public static void main(String[] args) {
        // 📌 Caminho do PDF baixado pelo projeto
        String pdfPath = "assets/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf";

        try {
            // 🔹 Extração do texto do PDF
            String extractedText = PdfTextExtractor.extractText(pdfPath);

            // 🔹 Processamento da tabela
            List<String[]> tableData = TableProcessor.extractTableData(extractedText);

            // 📌 Exibindo os dados extraídos no terminal
            System.out.println("\n===== TABELA EXTRAÍDA DO PDF =====\n");
            for (String[] row : tableData) {
                System.out.println(String.join(" | ", row));
            }

        } catch (IOException e) {
            System.err.println("❌ Erro ao processar o PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
