import com.intuitive.dadostransform.FileDownloader;

public class FileDownloaderTest {
    public static void main(String[] args) {
        String url = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf";
        String directory = "assets";

        FileDownloader.downloadFile(url, directory);
    }
}
