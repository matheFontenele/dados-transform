package com.intuitive.dadostransform;

import java.util.ArrayList;
import java.util.List;

public class ReplaceData {
    public static List<String[]> replaceAbbreviations(List<String[]> tableData) {
        List<String[]> updatedData = new ArrayList<>();

        for (String[] row : tableData) {
            for (int i = 0; i < row.length; i++) {
                row[i] = row[i].replace("OD", "Seg. Odontológica")
                        .replace("AMB", "Seg. Ambulatorial");
            }
            updatedData.add(row);
        }

        return updatedData;
    }
}

