package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Repository {
    private List<Unternehmen> kunden;

    public Repository() {
        this.kunden = new ArrayList<>();
        this.readFromFile();
    }

    public void readFromFile(){

        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Bianca\\IdeaProjects\\MAP_PraktischePrufung\\src\\com\\company\\kundendaten.txt"))) {

            // file delimiter
            String DELIMITER = ",";

            // read the file line by line
            String line;

            while ((line = br.readLine()) != null) {

                // convert line into columns
                String[] columns = line.split(DELIMITER);
                Unternehmen newKunde = new Unternehmen(Long.valueOf(columns[0]),columns[1],Enum.valueOf(columns[2]),Integer.parseInt(columns[3]),Integer.parseInt(columns[4]), columns[5]);
                this.kunden.add(newKunde);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeToFile1(String fileName,List<Unternehmen> kundenList){
        try{

            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Unternehmen kunde : kundenList){
                StringJoiner sj = new StringJoiner(",");
                sj.add(String.valueOf(kunde.getId()));
                sj.add(kunde.getName());
                sj.add(kunde.getUnternehmensgrosse().toString());
                sj.add(String.valueOf(kunde.getAnzahlMitarbeiter()));
                sj.add(String.valueOf(kunde.getEinkommenKunde()));
                sj.add(kunde.getOrt());
                printWriter.println(sj);
            }
            printWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void writeToFile2(String fileName, LinkedHashMap<String, Integer> sortedMap){
        try{

            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Set<String> keys = sortedMap.keySet();
            for (String key : keys){
                StringJoiner sj = new StringJoiner(": ");
                sj.add(key);
                sj.add(String.valueOf(sortedMap.get(key)));
                printWriter.println(sj);
            }
            printWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<Unternehmen> getKunden() {
        return kunden;
    }
}