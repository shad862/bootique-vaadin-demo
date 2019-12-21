package io.bootique.vaadin;

import io.bootique.BQRuntime;
import io.bootique.Bootique;
import io.bootique.jetty.JettyModule;
import io.bootique.vaadin.VaadinModule;

import java.io.IOException;

public class BootiqueVaadinApp {
    public static void main(String[] args) throws IOException {
        BQRuntime runtime = Bootique.app("-server", "-config=classpath:config.yml")
            .modules(
                JettyModule.class,
                VaadinModule.class
            )
            .createRuntime();
        runtime.run();
    }
}
