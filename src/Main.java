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

        Ksiazka book1 = new Ksiazka("Hobbit",5,300,"Fantastyka");
        Ksiazka book2 = new Ksiazka("Wiedźmin",8,300,"Fantastyka");
        Ksiazka book3 = new Ksiazka("Romeo i Julia",1,250,"Dramat");
        Ksiazka book4 = new Ksiazka("Gra o tron",10,550,"Fantastyka");
        Ksiazka book5 = new Ksiazka("Olicja",1,100,"Kryminał");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        int numberOfPages = 0;
        for (Ksiazka ksiazka : bookList){
            if (ksiazka.category.equals("Fantastyka")){
                numberOfPages += ksiazka.calcPages();
            }
        }
        System.out.println("Liczba stron ksiazek o kategorii Fantastyka: "+numberOfPages);


//        for (int i = 1; i <= numberofbooks; i++){
//            System.out.println("Podaj tytul ksiazki ");
//            title = scaner.next();
//            System.out.println("Podaj liczbe tomow");
//            tomes = scaner.nextInt();
//            System.out.println("Podaj liczbe stron");
//            pages = scaner.nextInt();
//            System.out.println("Podaj kategorie ksiazki");
//            category = scaner.next();
//            System.out.println();
//            Ksiazka ksiazka = new Ksiazka(title,tomes,pages,category);
//            bookList.add(ksiazka);
//        }
//
////        for (Ksiazka ksiazka : bookList){
////            System.out.println(ksiazka);
////        }
//
////        Ksiazka ksiaz;
////        for (int i = 0; i < bookList.size();i++) {
////            ksiaz = bookList.get(i);
////            System.out.println();
////            System.out.println("Liczba stron wszystkich tomow wynosi: "+ksiaz.calcPages());
////            ksiaz.returnMessage();
////        }
////        System.out.println("Podaj obiekt do obliczenia");
////        int nr = scaner.nextInt();
////        if (nr < bookList.size()) {
////            ksiaz = bookList.get(nr);
////            System.out.println("Liczba stron wszystkich tomow wynosi: "+ksiaz.calcPages());
////            ksiaz.returnMessage();
////        }
////        else System.out.println("Nie ma takiego indeksu");
//
//        int totalPages = 0;
//
//        for (Ksiazka ksiazka : bookList){
//            totalPages += ksiazka.calcPages();
//        }
//        System.out.println("Liczba wszystkich stron w ksiegarni wynosi: "+totalPages);
    }
}