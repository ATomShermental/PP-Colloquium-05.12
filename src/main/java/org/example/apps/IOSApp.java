package org.example.apps;

import org.example.factories.MobileAppFactory;
import org.example.employees.Developer;
import org.example.employees.ProjectManager;
import org.example.employees.Tester;
import org.example.ios.IOSAppFactory;

public class IOSApp {
    void createIOSApp(){
        MobileAppFactory mobileAppFactory = new IOSAppFactory();
        Developer developer = mobileAppFactory.getDeveloper();
        Tester tester = mobileAppFactory.getTester();
        ProjectManager projectManager = mobileAppFactory.getPM();
        developer.developApp();
        tester.testApp();
        projectManager.manageProject();
    }
}
