package com.design_patterns;


import com.design_patterns.client.Application;
import com.design_patterns.factories.GUIFactory;
import com.design_patterns.factories.MacOSFactory;
import com.design_patterns.factories.WindowsFactory;

public class AbstractFactoryMain {
    /**
     * O aplicativo escolhe o tipo de fábrica e o cria em tempo de execução (geralmente em
     * fase de inicialização), dependendo da configuração ou ambiente
     * variáveis.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}