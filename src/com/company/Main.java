package com.company;

import java.util.Scanner;

public class Main {
    public static People me;
    public static Plot plot;
    public static int C = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Тьма. Грохот. Лес. Вы проснулись и поняли, что лежите в телеге, едующеней по лесу. \n " + "Извощик спрашивает ваше имя:(впишите ваше имя)");
        me = new People(sc.next(), 100);
        plot = new Plot();
        while(true){
            System.out.println(" == " + plot.plotNow.scenes[C].scene + " == ");
            System.out.println(plot.plotNow.scenes[C].sceneText);
            plot.next(sc.nextInt()-1);
            if (plot.isEnd()) {
                System.out.println("====================the end!===================");
                return;
            }
        }

}}

