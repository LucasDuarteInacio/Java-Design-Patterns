package com.design_patterns.factories;

import com.design_patterns.buttons.Button;
import com.design_patterns.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}