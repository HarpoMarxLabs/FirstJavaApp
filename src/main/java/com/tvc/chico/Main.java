package com.tvc.chico;
import com.tvc.runner.Runner;
import com.tvc.appwindow.AppWindow;

/* FrameDemo.java requires no other files. */
public class Main {

    public static void main(String[] args) {
        AppWindow main_window = new AppWindow();
        Runner process_runner = new Runner();
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater( () -> main_window.createAndShowGUI());
    }
}