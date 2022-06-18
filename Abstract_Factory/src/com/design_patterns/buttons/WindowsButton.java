package com.design_patterns.buttons;


/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 *
 * Esta é uma variante do Windows de um botão.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}