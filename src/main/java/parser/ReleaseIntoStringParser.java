package parser;

import bean.Book;
import bean.Disk;
import bean.Movie;
import bean.Release;

/**
 * parser of instance of release into string with info about it
 * Created by Maria on 04.02.2017.
 */
public class ReleaseIntoStringParser {

    /**
     * parses instance of disk nto string with info about it
     * @param disk instance of disk
     * @return string with info about disk
     */
    public String parseReleaseIntoString(Disk disk) {
    return ("Disk_" + disk.getAuthor() + "_" + disk.getTitle() + "_" + disk.getReleaseDate() + "_" + disk.getSongs());
    }

    /**
     * parses instance of book nto string with info about it
     * @param book instance of disk
     * @return string with info about book
     */
    public String parseReleaseIntoString(Book book) {
        return ("Book_" + book.getAuthor() + "_" + book.getTitle() + "_" + book.getReleaseDate() + "_" + book.getAnnotation());
    }

    /**
     * parses instance of movie nto string with info about it
     * @param movie instance of disk
     * @return string with info about movie
     */
    public String parseReleaseIntoString(Movie movie) {
        return ("Movie_" + movie.getAuthor() + "_" + movie.getTitle() + "_" + movie.getReleaseDate() + "_" + movie.getDescription());
    }

}
