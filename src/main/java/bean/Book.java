package bean;

import java.util.Date;

/**
 * describes instance of book
 * Created by Maryia_Chuhunova on 1/31/2017.
 */
public class Book extends Release {

    private String annotation;

    /**
     * creates instance of book
     * @param author is an author of book
     * @param title is a title of book
     * @param date is a date of release
     * @param annotation is an annotation for book
     */
    public Book(String author, String title, String date, String annotation) {
        super.author = author;
        super.title = title;
        super.releaseDate = date;
        this.annotation = annotation;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getReleaseDate() {
        return releaseDate;
    }

    public String getAnnotation() {
        return annotation;
    }
}
