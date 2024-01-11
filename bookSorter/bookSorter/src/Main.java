 import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        // TreeSet interface is used to sort according to certain criteria.
        Set<Book> titleSortedSet = new TreeSet<Book>();
        titleSortedSet.add(new Book("Oğuz Atay", "Tutunamayanlar", 724));
        titleSortedSet.add(new Book("Adam Fawer", "Olasılıksız", 496));
        titleSortedSet.add(new Book("Fyodor Mihayloviç Dostoyevski", "Suç ve Ceza", 700));
        titleSortedSet.add(new Book("Jack London", "Martin Eden", 496));
        titleSortedSet.add(new Book("İvan Gonçarov", "Oblomov", 632));
        // Print sorted by name
        for (Book b : titleSortedSet) {
            System.out.println(b.title);
        }
        System.out.println("################################");
        for (Book b : titleSortedSet) {
            System.out.println(b.pageNum);
        }

    }
}