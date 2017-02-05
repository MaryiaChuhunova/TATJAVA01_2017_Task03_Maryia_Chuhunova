package bean;

import java.util.ArrayList;
import java.util.Date;

/**
 * describes instance of disk
 * Created by Maryia_Chuhunova on 1/31/2017.
 */
public class Disk extends Release {

    private String songs;

    /**
     * creates instance of disk
     * @param author is an author of disk
     * @param title is a title of disk
     * @param date is a date of release
     * @param songs is a string with titles of songs on disk
     */
    public Disk(String author, String title, String date, String songs) {
        super.author = author;
        super.title = title;
        super.releaseDate = date;
        this.songs = songs;
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

    public String getSongs() {
        return songs;
    }
}
