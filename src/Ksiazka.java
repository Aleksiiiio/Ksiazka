public class Ksiazka {
    String title;
    int tomes;
    int pages;
    String category;

    public Ksiazka(String title, int tome_number, int page_number, String category) {
        this.title = title;
        this.tomes = tome_number;
        this.pages = page_number;
        this.category = category;
    }

    public int calcPages(){
        return pages * tomes;
    }

    public void returnMessage(){
        System.out.println("Książka pod tytulem "+title+" jest w kategorii "+category);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "title='" + title + '\'' +
                ", tomes=" + tomes +
                ", pages=" + pages +
                ", category='" + category + '\'' +
                '}';
    }

}

