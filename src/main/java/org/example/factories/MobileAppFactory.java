package org.example.factories;

import org.example.employees.Developer;
import org.example.employees.ProjectManager;
import org.example.employees.Tester;

public interface MobileAppFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getPM();
}
