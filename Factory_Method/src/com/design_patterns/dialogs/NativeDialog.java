package com.design_patterns.dialogs;

import com.design_patterns.buttons.Button;
import com.design_patterns.buttons.NativeButton;

/**
 *  A caixa de diálogo produzirá botões do sistema operacional nativo.
 */
public class NativeDialog extends Dialog {

    @Override
    public Button createButton() {
        return new NativeButton();
    }
}