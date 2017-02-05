package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * realization of addition on dao layer
 * Created by Maria on 04.02.2017.
 */
public class ReleaseAdditionDAO {

    String response = null;

    /**
     * writes info about release into file
     * @param release info about release
     * @return message about successful/unsuccessful addition
     */
    public String addRelease(String release) {
        try {
            File data = new File("data.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(data));
            bw.newLine();
            bw.write(release);
            bw.flush();
            response = "Release was added successfully";
        } catch (IOException e) {
            response = "Error during adding release";
        }
        return response;
    }
}
