package com.design_patterns.checkboxes;

/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 *
 * Esta é uma variante do MacOS de um CheckBox.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}