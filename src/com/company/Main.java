package com.company;

public class Main {

    public static void main(String[] args) {
        Repository Repo = new Repository();
        Controller ctrl = new Controller(Repo);
        System.out.println(Repo.getKunden());
        System.out.println(ctrl.sortListeKundenBYMitarbeiter());
        System.out.println(ctrl.filterTOPbyProdukt());
        ctrl.sortAndSaveToFile();
        ctrl.topandSaveToFile();
    }
}