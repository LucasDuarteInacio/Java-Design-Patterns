package com.design_patterns;

import java.util.Scanner;

public class FactoryMethodMain {

    public static void main(String[] args) {

        System.out.println("Insira o tipo de botão:(web ou windows)");
        Scanner leitor = new Scanner(System.in);
        String dialogType = leitor.next();

        switch (dialogType){
            case "windows":{
            WindowsDialog dialog = new WindowsDialog();
                dialog.render();
                break;
        }
            case "web":{
                WebDialog dialog = new WebDialog();
                dialog.render();
                break;
            }
    }
}}
