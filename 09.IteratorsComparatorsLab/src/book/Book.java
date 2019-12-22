package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private Integer year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        if(authors.length==0){
            this.authors = new ArrayList<>();
        }else{
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public int compareTo(Book o) {
        if (this.title.equals(o.title)) {
            return this.year.compareTo(o.year);
        }
        return  this.title.compareTo(o.title);
    }
}
