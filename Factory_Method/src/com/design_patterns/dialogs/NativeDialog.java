package com.design_patterns.dialogs;

import com.design_patterns.buttons.Button;
import com.design_patterns.buttons.WindowsButton;
import com.design_patterns.dialogs.Dialog;

/**
 *  A caixa de diálogo produzirá botões do sistema operacional nativo.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}