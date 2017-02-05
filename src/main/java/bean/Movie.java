package bean;

import java.util.Date;

/**
 * describes instance of movie
 * Created by Maryia_Chuhunova on 1/31/2017.
 */
public class Movie extends Release {

    private String description;

    /**
     * creates instance of movie
     * @param author is a creator of movie
     * @param title is a title of movie
     * @param date is a date of release
     * @param description is a description of movie
     */
    public Movie(String author, String title, String date, String description) {
        super.author = author;
        super.title = title;
        super.releaseDate = date;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
}
