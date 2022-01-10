package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Unternehmen> listeUnternehmen = repo.readFromFile("C:\\Users\\Bianca\\IdeaProjects\\MAP_PraktischePrufung\\src\\com\\company\\kundendaten.txt", "#");

            System.out.println(service.sortListeUnternehmenByGesamtPreis(listeTiere));
            System.out.println(service.filterListeByProdukt(listeUnternehmen));

            repo.writeToFile("C:\\Users\\Bianca\\IdeaProjects\\MAP_PraktischePrufung\\src\\com\\company\\kundensortiert.txt", listeUnternehmen, "%");
            service.getTopOrteByEinkommen(listeUnternehmen);
            System.out.println(service.getTopOrteByEinkommen(listeUnternehmen));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
