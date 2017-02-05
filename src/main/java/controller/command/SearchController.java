package controller.command;

import bean.Book;
import bean.Disk;
import bean.Movie;
import bean.Release;
import parser.ReleaseIntoStringParser;
import service.SearchService;

/**
 * describes instance of search command on controller layer
 * Created by Maria on 05.02.2017.
 */
public class SearchController {

    String[] requestParts = null;

    /**
     * dependently on category given in request sends request to a service layer
     * and gets instance of release
     * @param request contains category and tag for search
     * @return parsed info about release
     */
    public String search(String request) {

        requestParts = request.split("_");
        SearchService ss = new SearchService();
        ReleaseIntoStringParser parser = new ReleaseIntoStringParser();

        if (requestParts[0].equals("Book")) {
            Book book = ss.searchBook(requestParts);
            if (book != null) {
                return parser.parseReleaseIntoString(book);
            } else {
                return "Release not found";
            }
        }

        if (requestParts[0].equals("Movie")) {
            Movie movie = ss.searchMovie(requestParts);
            if(movie != null) {
                return parser.parseReleaseIntoString(movie);
            } else {
                return "Release not found";
            }
        }

        if (requestParts[0].equals("Disk")) {
            Disk disk = ss.searchDisk(requestParts);
            if(disk != null) {
                return parser.parseReleaseIntoString(disk);
            } else {
                return "Release not found";
            }
        }

        return "Release not found";
    }
}
