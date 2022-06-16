package com.design_patterns;

public class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
