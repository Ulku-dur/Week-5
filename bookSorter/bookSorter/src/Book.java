import java.util.Comparator;
public class Book implements Comparable<Book>{
    String authorN;
  String title;
  int pageNum;
    private int date;
    public Book(String authorN, String title, int pageNum, int date) {
        this.authorN = authorN;
        this.title = title;
        this.pageNum = pageNum;
        this.date = date;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    @java.lang.Override
    public int compareTo(Book b) {
        // Sort by names from A to Z
        //compares 2 books name
        return this.title.compareTo(b.title);
    }
}
