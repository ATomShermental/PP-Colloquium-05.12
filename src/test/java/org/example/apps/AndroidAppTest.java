package org.example.apps;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import nl.altindag.console.ConsoleCaptor;


class AndroidAppTest {

    @Test
    void createAndroidApp() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        AndroidApp androidApp = new AndroidApp();
        androidApp.createAndroidApp();
        assertThat(consoleCaptor.getStandardOutput()).contains("Kotlin developer writes Kotlin code",
                "Android Tester tests Android app",
                "Android PM manages Android app");
        consoleCaptor.close();
    }
}