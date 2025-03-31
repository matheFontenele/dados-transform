# 🕵️‍♂️ Extração de Dados de PDF - Rol de Procedimentos e Eventos em Saúde

Este projeto automatiza o **download, extração e processamento de dados** do arquivo PDF contendo a tabela **"Rol de Procedimentos e Eventos em Saúde"**.  
Os dados extraídos são salvos em um **arquivo CSV** estruturado e compactados em um **arquivo ZIP**, garantindo organização e portabilidade.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia      | Descrição |
|---------------|------------|
| **Java 17+** | Linguagem de programação principal |
| **Maven** | Gerenciador de dependências e build |
| **Jsoup** | Web scraping e extração de HTML |
| **Apache PDFBox** | Extração de texto de arquivos PDF |
| **OpenCSV** | Manipulação e geração de arquivos CSV |
| **Java NIO** | Manipulação de arquivos e compactação |

---

## 📂 Estrutura do Projeto

```plaintext
📦 extracao-dados-pdf
 ┣ 📂 assets             # Pasta onde os PDFs são baixados, arquivos CSV e ZIP
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┣ 📂 com.intuitive.dadostransform
 ┃ ┃ ┃ ┃ ┣ 📜 FileDownloader.java       # Baixa o arquivo PDF
 ┃ ┃ ┃ ┃ ┣ 📜 PdfTextExtractor.java     # Extrai o texto do PDF
 ┃ ┃ ┃ ┃ ┣ 📜 TableProcessor.java       # Processa os dados da tabela
 ┃ ┃ ┃ ┃ ┣ 📜 CsvExporter.java          # Salva os dados extraídos em CSV
 ┃ ┃ ┃ ┃ ┣ 📜 FileCompressor.java       # Compacta os arquivos em ZIP
 ┃ ┃ ┃ ┃ ┗ 📜 Main.java                 # Orquestra todo o processo
 ┃ ┣ 📂 test
 ┃ ┃ ┣ 📜 TableProcessorTest.java       # Teste unitário para extração de tabela
 ┃ ┃ ┣ 📜 FileDownloaderTest.java       # Teste para download de PDF
 ┃ ┃ ┣ 📜 FPdfTextExtractorTest.java    # Teste para extração do texto do PDF
 ┃ ┃ ┗ 📜 TestALL.java                  # Teste de todas as classes em conjunto
 ┣ 📜 pom.xml               # Configuração do Maven e dependências
 ┗ 📜 README.md             # Documentação do projeto
```
---

## 🔧 Configuração e Execução
📥 1. Clonar o Repositório
```plaintext
git clone https://github.com/seuusuario/extracao-dados-pdf.git
cd extracao-dados-pdf
```
🛠️ 2. Instalar Dependências
```plaintext
mvn clean install
```
▶️ 3. Executar o Programa
```plaintext
mvn exec:java -Dexec.mainClass="com.intuitive.dadostransform.Main"
```
---
Criado por Matheus Fontenele 👨‍💻
📧 Email: matheusfontenele979700@email.com
🔗 LinkedIn | GitHub
