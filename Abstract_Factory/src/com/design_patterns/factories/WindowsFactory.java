package com.design_patterns.factories;

import com.design_patterns.buttons.Button;
import com.design_patterns.buttons.WindowsButton;
import com.design_patterns.checkboxes.Checkbox;
import com.design_patterns.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}