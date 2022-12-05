package org.example.ios;

import org.example.employees.Developer;

public class SwiftDeveloper implements Developer {
    @Override
    public void developApp() {
        System.out.println("Swift Developer writes Swift code");
    }
}
