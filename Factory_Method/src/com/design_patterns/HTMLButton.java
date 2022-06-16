package com.design_patterns;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Html");
    }

    @Override
    public void onClick() {
        System.out.println("OnClick HTML");
    }

}
