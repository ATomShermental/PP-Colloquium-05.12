package org.example.android;

import org.example.employees.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void developApp() {
        System.out.println("Kotlin developer writes Kotlin code");
    }
}
