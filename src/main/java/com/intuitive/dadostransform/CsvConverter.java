package com.intuitive.dadostransform;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvConverter {
    public static void saveToCsv(List<String[]> data, String csvPath){
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvPath))){
            writer.writeAll(data);
            System.out.println("Arquivo salvo com sucesso em: " +csvPath);
        }catch (IOException e){
            e.getMessage();
        }
    }
}
