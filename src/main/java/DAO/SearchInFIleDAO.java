package DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * realization of search on dao layer
 * Created by Maria on 04.02.2017.
 */
public class SearchInFIleDAO {

    String release = null;
    String[] releaseInfo = null;

    /**
     * searchs in given category line containing given in request tag
     * @param request contains category and tag for search
     * @return array with info about found release, or null if release is not found
     */
    public String[] searchInFile(String[] request) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./data.txt"));
            while ((release = br.readLine()) != null) {
                releaseInfo = release.split("_");
                if (releaseInfo[0].equals(request[0])) {
                    for (String releaseDetail : releaseInfo) {
                        if (releaseDetail.equals(request[1])) {
                            return releaseInfo;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
