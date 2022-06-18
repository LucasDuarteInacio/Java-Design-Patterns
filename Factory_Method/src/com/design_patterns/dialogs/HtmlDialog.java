package com.design_patterns.dialogs;

import com.design_patterns.buttons.Button;
import com.design_patterns.buttons.HtmlButton;
import com.design_patterns.dialogs.Dialog;

/**
 * A caixa de diálogo HTML produzirá botões HTML.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}