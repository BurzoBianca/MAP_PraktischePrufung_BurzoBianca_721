package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    private Repository repository;

    public Controller(Repository repository){
        this.repository=repository;
    }

    public List<Unternehmen> sortListeKundenBYMitarbeiter() {
        return repository.getKunden()
                .stream()
                .sorted(Comparator.comparingInt(Unternehmen::getAnzahlMitarbeiter).reversed())
                .collect(Collectors.toList());
    }

    public void sortAndSaveToFile(){
        this.repository.writeToFile1("kundensortiert.txt",this.sortListeKundenBYMitarbeiter());
    }

    public LinkedHashMap<String, Integer> filterTOPbyProdukt(){

        Map<String, Integer> ortenMap = new HashMap<>();

        for (Unternehmen kunde :
                this.repository.getKunden()) {
            if (ortenMap.containsKey(kunde.getOrt())) {
                ortenMap.put(kunde.getOrt(), ortenMap.get(kunde.getOrt()) + kunde.getEinkommenKunde());
            } else {
                ortenMap.put(kunde.getOrt(), kunde.getEinkommenKunde());
            }

        }

        return ortenMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));


    }

    public void topandSaveToFile(){
        this.repository.writeToFile2("statistik.txt",this.filterTOPbyProdukt());
    }


}