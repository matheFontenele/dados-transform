package com.intuitive.dadostransform;

import java.util.ArrayList;
import java.util.List;

public class TableProcessor {

    public static List<String[]> extractTableData(String text) {
        List<String[]> tableData = new ArrayList<>();
        boolean isTableSection = false;

        // Percorre linha por linha do texto
        for (String line : text.split("\n")) {
            line = line.trim();

            // Identifica o início da tabela
            if (line.contains("Rol de Procedimentos e Eventos em Saúde")) {
                isTableSection = true;
                continue;
            }

            // Para quando a tabela termina
            if (isTableSection && line.isEmpty()) {
                break;
            }

            // Adiciona apenas as linhas da tabela
            if (isTableSection) {
                String[] rowData = line.split("\\s{2,}"); // Divide por múltiplos espaços
                tableData.add(rowData);
            }
        }

        // Aplica a substituição das abreviações antes de retornar
        return tableData;
    }
}
