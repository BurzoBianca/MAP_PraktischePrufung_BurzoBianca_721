package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Unternehmen> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Unternehmen unternehmen;
        List<Unternehmen> listeTiere = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            unternehmen = new Unternehmen(i.getId(), attributes[0]);
            listeTiere.add(unternehmen);

            line = bufferedReader.readLine();
        }

        return listeTiere;
    }

    public void writeToFile(String fileName, List<Unternehmen> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Unternehmen unternehmen : liste) {
            String line = unternehmen.getId() + character + unternehmen.getUnternehmensname() + character +
                    unternehmen.getUnternehmensgröße() + character + unternehmen.getAnzahlMitarbeiter()
                    + character + unternehmen.getEinkommen_Kunde()  + character + unternehmen.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
