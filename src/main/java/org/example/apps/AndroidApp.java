package org.example.apps;

import org.example.factories.MobileAppFactory;
import org.example.android.AndroidAppFactory;
import org.example.employees.Developer;
import org.example.employees.ProjectManager;
import org.example.employees.Tester;

public class AndroidApp {
    public void createAndroidApp(){
        MobileAppFactory mobileAppFactory = new AndroidAppFactory();
        Developer developer = mobileAppFactory.getDeveloper();
        Tester tester = mobileAppFactory.getTester();
        ProjectManager projectManager = mobileAppFactory.getPM();
        developer.developApp();
        tester.testApp();
        projectManager.manageProject();
    }
}
