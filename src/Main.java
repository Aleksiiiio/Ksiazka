import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj ile ksiazek chcesz wpisac");
        int numberofbooks = scaner.nextInt();

        String title;
        int tomes;
        int pages;
        String category;
        List<Ksiazka> bookList = new ArrayList<>();

        for (int i = 1; i <= numberofbooks; i++){
            System.out.println("Podaj tytul ksiazki ");
            title = scaner.next();
            System.out.println("Podaj liczbe tomow");
            tomes = scaner.nextInt();
            System.out.println("Podaj liczbe stron");
            pages = scaner.nextInt();
            System.out.println("Podaj kategorie ksiazki");
            category = scaner.next();
            System.out.println();
            Ksiazka ksiazka = new Ksiazka(title,tomes,pages,category);
            bookList.add(ksiazka);
        }

//        for (Ksiazka ksiazka : bookList){
//            System.out.println(ksiazka);
//        }

        Ksiazka ksiaz;
//        for (int i = 0; i < bookList.size();i++) {
//            ksiaz = bookList.get(i);
//            System.out.println();
//            System.out.println("Liczba stron wszystkich tomow wynosi: "+ksiaz.calcPages());
//            ksiaz.returnMessage();
//        }
        System.out.println("Podaj obiekt do obliczenia");
        int nr = scaner.nextInt();
        if (nr < bookList.size()) {
            ksiaz = bookList.get(nr);
            System.out.println("Liczba stron wszystkich tomow wynosi: "+ksiaz.calcPages());
            ksiaz.returnMessage();
        }
        else System.out.println("Nie ma takiego indeksu");
    }
}