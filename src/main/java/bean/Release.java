package bean;

import java.util.Date;

/**
 * abstract class, uniting categories of releases
 * Created by Maryia_Chuhunova on 1/31/2017.
 */
public abstract class Release {
    protected String author;
    protected String title;
    protected String releaseDate;

    public Release() {}

    public abstract String getAuthor();
    public abstract String getTitle();
    public abstract String getReleaseDate();

}
