package com.design_patterns;

public class WindowsDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
