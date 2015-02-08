package me.jamesfrost.BCSnatch;

/**
 * BCSnatch v1.0.0
 * http://jamesfrost.me
 * <p/>
 * Created by James Frost on 04/02/2015.
 */
public class CliBoundary {

    public static void main(String[] args) {

        Controller controller = new Controller(args);
        controller.beginSnipe();

    }

}
