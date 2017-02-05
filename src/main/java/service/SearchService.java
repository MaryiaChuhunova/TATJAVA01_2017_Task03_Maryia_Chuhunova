package service;

import DAO.SearchInFIleDAO;
import bean.Book;
import bean.Disk;
import bean.Movie;
import bean.Release;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * realization of search on service layer
 * Created by Maryia_Chuhunova on 2/1/2017.
 */
public class SearchService {

    String[] result;

    /**
     * creates instance of book with parameters from dao layer if it's found
     * @param request contains category and tag for search
     * @return instance of found book or null if it's not found
     */
    public Book searchBook(String[] request) {
        SearchInFIleDAO searchInFIle = new SearchInFIleDAO();
        result = searchInFIle.searchInFile(request);
        if (result != null) {
            if (result[0].equals("Book")) {
                return (new Book(result[1], result[2], result[3], result[4]));
            }
        }
        return null;
    }

    /**
     * creates instance of disk with parameters from dao layer if it's found
     * @param request contains category and tag for search
     * @return instance of found disk or null if it's not found
     */
    public Disk searchDisk(String[] request) {
        SearchInFIleDAO searchInFIle = new SearchInFIleDAO();
        result = searchInFIle.searchInFile(request);
        if (result != null) {
            if (result[0].equals("Disk")) {
                return (new Disk(result[1], result[2], result[3], result[4]));
            }
        }
        return null;
    }

    /**
     * creates instance of movie with parameters from dao layer if it's found
     * @param request contains category and tag for search
     * @return instance of found movie or null if it's not found
     */
    public Movie searchMovie(String[] request) {
        SearchInFIleDAO searchInFIle = new SearchInFIleDAO();
        result = searchInFIle.searchInFile(request);
        if (result != null) {
            if (result[0].equals("Movie")) {
                return (new Movie(result[1], result[2], result[3], result[4]));
            }
        }
        return null;
    }
}
