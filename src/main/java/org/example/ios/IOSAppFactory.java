package org.example.ios;

import org.example.employees.Developer;
import org.example.factories.MobileAppFactory;
import org.example.employees.ProjectManager;
import org.example.employees.Tester;

public class IOSAppFactory implements MobileAppFactory {
    @Override
    public Developer getDeveloper() {
        return new SwiftDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualIOSTester();
    }

    @Override
    public ProjectManager getPM() {
        return new IOSPM();
    }
}
