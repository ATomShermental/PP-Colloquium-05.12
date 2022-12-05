package org.example.ios;

import org.example.employees.ProjectManager;

public class IOSPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("IOS PM manages IOS app");
    }
}
