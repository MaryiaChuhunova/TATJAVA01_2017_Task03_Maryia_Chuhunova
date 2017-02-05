package view;

import controller.command.ReleaseAdditionController;
import controller.command.SearchController;
import parser.ReleaseIntoStringParser;

import java.text.ParseException;
import java.util.Scanner;

/**
 * realization of menu for getting info for search
 * Created by Maria on 05.02.2017.
 */
public class SearchMenu {

    Scanner sc = new Scanner(System.in);
    String request = "";

    /**
     * gets info for search and sends it to controller layes
     */
    public void menu() {
        System.out.println("Enter category for search (Book/Disk/Movie");
        request += sc.nextLine() + "_";
        System.out.println("Enter tag for search");
        request += sc.nextLine();

        SearchController sc = new SearchController();
        System.out.println(sc.search(request));
    }
}
