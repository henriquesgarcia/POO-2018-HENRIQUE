package model;

import java.util.ArrayList;

public class App {

    private String nomeApp;
    private ArrayList<Activity> activities;

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
}
