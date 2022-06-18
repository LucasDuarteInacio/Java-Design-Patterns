package com.design_patterns.buttons;


import com.design_patterns.buttons.Button;

/**
 * Implementação de botão HTML
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
