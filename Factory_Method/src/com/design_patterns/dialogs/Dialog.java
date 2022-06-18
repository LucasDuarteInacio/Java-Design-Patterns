package com.design_patterns.dialogs;

import com.design_patterns.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... Outros codigos...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * As subclasses substituirão este método para criar um botão específico
     * objetos.
     */
    public abstract Button createButton();
}
