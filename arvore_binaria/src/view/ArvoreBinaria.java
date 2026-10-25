package view;

import controller.ArvoreBinariaController;

public class ArvoreBinaria {
    public static void main (String[] args){
        try {
            ArvoreBinariaController obj = new ArvoreBinariaController();
            System.err.println(obj.teste());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
