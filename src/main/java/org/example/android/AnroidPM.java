package org.example.android;

import org.example.employees.ProjectManager;

public class AnroidPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Android PM manages Android app");
    }
}
