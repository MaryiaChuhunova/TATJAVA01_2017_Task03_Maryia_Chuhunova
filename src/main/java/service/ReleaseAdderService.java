package service;

import DAO.ReleaseAdditionDAO;
import bean.Book;
import bean.Disk;
import bean.Movie;
import bean.Release;
import parser.ReleaseIntoStringParser;

import java.io.IOException;

/**
 * realization of adding command on service layer
 * Created by Maria on 04.02.2017.
 */
public class ReleaseAdderService {

    /**
     * overloaded method, sends parsed into string instance of book to dao layer
     * @param book instance of book
     * @return message about successful/unsuccessful addition
     */
    public String addRelease(Book book) {
        ReleaseIntoStringParser parser = new ReleaseIntoStringParser();
        ReleaseAdditionDAO addition = new ReleaseAdditionDAO();
        return addition.addRelease(parser.parseReleaseIntoString(book));
    }

    /**
     * overloaded method, sends parsed into string instance of movie to dao layer
     * @param movie instance of book
     * @return message about successful/unsuccessful addition
     */
    public String addRelease(Movie movie) {
        ReleaseIntoStringParser parser = new ReleaseIntoStringParser();
        ReleaseAdditionDAO addition = new ReleaseAdditionDAO();
        return addition.addRelease(parser.parseReleaseIntoString(movie));
    }

    /**
     * overloaded method, sends parsed into string instance of disk to dao layer
     * @param disk instance of book
     * @return message about successful/unsuccessful addition
     */
    public String addRelease(Disk disk) {
        ReleaseIntoStringParser parser = new ReleaseIntoStringParser();
        ReleaseAdditionDAO addition = new ReleaseAdditionDAO();
        return addition.addRelease(parser.parseReleaseIntoString(disk));
    }
}
