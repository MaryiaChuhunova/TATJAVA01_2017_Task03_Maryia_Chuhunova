package controller.command;

import bean.Book;
import bean.Disk;
import bean.Movie;
import bean.Release;
import service.ReleaseAdderService;

import java.io.IOException;

/**
 * describes instance of execution of adding release command on controller level
 * Created by Maria on 04.02.2017.
 */
public class ReleaseAdditionController {

    /**
     * dependently on category of release creates instance of release and sends it to a service layer
     * @param release contains details of release got from view layer
     * @return message about successful of unsuccessful addition
     */
    public String addRelease(String[] release) {
        ReleaseAdderService ra = new ReleaseAdderService();
        String answer = null;

        if(release[0].equals("Book")) {
            answer = ra.addRelease(new Book(release[1], release[2], release[3], release[4]));
        }
        if(release[0].equals("Movie")) {
            answer = ra.addRelease(new Movie(release[1], release[2], release[3], release[4]));
        }
        if(release[0].equals("Disk")) {
            answer = ra.addRelease(new Disk(release[1], release[2], release[3], release[4]));
        }
        return answer;
    }
}
