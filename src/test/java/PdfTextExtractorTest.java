import com.intuitive.dadostransform.PdfTextExtractor;

import java.io.IOException;

public class PdfTextExtractorTest {
    public static void main(String[] args) {
        String path = "assets/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf";

        try {
            System.out.println(PdfTextExtractor.extractText(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
