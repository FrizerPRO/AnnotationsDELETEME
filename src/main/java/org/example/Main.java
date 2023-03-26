package org.example;

public class Main {
    public static void main(String[] args) {
        if(NotReadyProduct.class.getAnnotation(ReadyStage.class).stage() != Stages.READY){
            System.out.println("Fix: "+ NotReadyProduct.class.getName());
        }
    }
}