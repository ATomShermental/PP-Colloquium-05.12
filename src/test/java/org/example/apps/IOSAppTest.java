package org.example.apps;

import static org.assertj.core.api.Assertions.assertThat;

import nl.altindag.console.ConsoleCaptor;

class IOSAppTest {

    @org.junit.jupiter.api.Test
    void createIOSApp() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        IOSApp iosApp = new IOSApp();
        iosApp.createIOSApp();
        assertThat(consoleCaptor.getStandardOutput())
                .contains(
                "Swift Developer writes Swift code",
                "IOS Tester tests IOS app",
                "IOS PM manages IOS app"
                );
        consoleCaptor.close();
    }
}