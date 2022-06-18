package com.design_patterns;

import com.design_patterns.dialogs.Dialog;
import com.design_patterns.dialogs.HtmlDialog;
import com.design_patterns.dialogs.NativeDialog;

public class FactoryMethodMain {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * A fábrica concreta geralmente é escolhida dependendo da configuração ou
     * opções de ambiente.
     */
    static void configure() {
        /*
         * Para se testar o botão nativo deve trocar o conteudo do "equals" pelo nome do SO que esta sendo utilizado
         * e para testar o bao html basta trocar o conteudo por um nome invalido
         */
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new NativeDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * O código do cliente deve funcionar com fábricas e produtos através de
     * interfaces abstratas. Desta forma não importa em qual fábrica trabalha
     * com e que tipo de produto devolve.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}