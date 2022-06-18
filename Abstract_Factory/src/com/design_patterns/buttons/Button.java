package com.design_patterns.buttons;

/**
 * Abstract Factory assume que você tem várias famílias de produtos,
 * estruturado em hierarquias de classes separadas (Botão/Checkbox). Todos os produtos de
 * a mesma família tem a interface comum.
 *
 * Esta é a interface comum para a família de botões.
 */
public interface Button {
    void paint();
}