package org.example.android;

import org.example.employees.Developer;
import org.example.factories.MobileAppFactory;
import org.example.employees.ProjectManager;
import org.example.employees.Tester;

public class AndroidAppFactory implements MobileAppFactory {
    @Override
    public Developer getDeveloper() {
        return new KotlinDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualAndroidTester();
    }

    @Override
    public ProjectManager getPM() {
        return new AnroidPM();
    }
}
