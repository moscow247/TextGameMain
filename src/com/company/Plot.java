package com.company;

import java.util.Scanner;

import static com.company.Main.me;

public class Plot {
    public Simulation start;
    public Simulation plotNow;

    public Plot(){
        start = new Simulation(4);
            start.scenes[0] = new Situation(
                    "Телега",
                    "Только услышав ваше имя, мужчина выпригивает из телеги. \n" +
                            "Ваши действия: \n" +
                            "1) остаться в телеге и продолжить спать. \n" +
                            "2) выпрыгнуть из телеги вслед за извощиков. \n" +
                            "3) попытаться взять управлени на себя. ",
                    3,
                    100,
                    0,
                    "");
            start.scenes[0].instruction[0] = new Situation(
                    "Овраг",
                    "Пока вы спали, лошади во тме не заметили резкого поворота и упали в овраг вместе с телегой.",
                    0,
                    -100,
                    -1,
                    "");
            start.scenes[0].instruction[1] = new Situation(
                    "Прыжок",
                    "Вы приземлились на землю достаточно благополучно, в отличе от извощика.",
                    0,
                    -25,
                    0,
                    "");
            start.scenes[0].instruction[2] = new Situation(
                    "Потеря управления",
                    "Вы пытались управлять лошадьми, но вы все таки не стрельной. \n" +
                            " Телега перевернулясь, вы стукнулись головой об дерево пока летели.\n" +
                            " Очнувшись вы увидели, что одну лошадь придавило телегой насмерть, а другая стоит рядом.\n" +
                            " Первую пришлось пустить на пропитание, а на второй вы отправились дальше.",
                    0,
                    -50,
                    1,
                    "Fast");
        start.scenes[1] = new Situation(
                "Нападение",
                "Пока вы шли по дороге, за вами увязалось большое животное. \n" +
                        "Оно начало вас догонять и вы увидели что это огромная крыса мутант\n" +
                        "Ваши действия: \n" +
                        "1) Продолжить ехать также. \n" +
                        "2) кинуть в крысу чем-то. \n"+
                        "3) Ускориться и оторваться от крысы. " ,
                3,
                100,
                0,
                "");
            start.scenes[1].instruction[0] = new Situation(
                    "",
                    "Как ни странно она вас догнала, и вам пришлось тяжко.",
                    0,
                    -95,
                    -1,
                    "");
            start.scenes[1].instruction[1] = new Situation(
                    "",
                    "Вы пытались кинать в неё вещи, но во время этого, не смогли удержаться на лощади и чуть не упали.\n" +
                            "Все же вам удалось отбиться от нее и продолжить маршрут, отделавшись только царапинами.",
                    0,
                    -5,
                    1,
                    "");
            start.scenes[1].instruction[2] = new Situation(
                    "",
                    "ВЫ ускорились и крыса совсем скоро скрылась из видаю.",
                    0,
                    0,
                    0,
                    "");
        start.scenes[2] = new Situation(
                "Поселок",
                "Вы в поселке. Тут можно подлечиться и купить оружие. За все надо платить опытом. \n" +
                        "Ваши действия: \n" +
                        "1) Идти к лекарю, а потом в оружейную. Стоимость: 1 \n" +
                        "2) Сразу пойти только в оружейную, нам же не надо лечиться *_* . Стоимость: 0,75\n" +
                        "3) Просто пойти подлечится. С оружием каждый может, а попробуй без него. Стоимость: 0,25\n" +
                        "4) у меня все хорошо, я не хочу ничего. Стоимость: 0 ",
                4,
                100,
                0,
                "");
            start.scenes[2].instruction[0] = new Situation(
                    "",
                    "Вы полностью здоровы, и у вас есть крутой меч.",
                    0,
                    100,
                    -1,
                    "gun");
            start.scenes[2].instruction[1] = new Situation(
                    "",
                    "У вас крутой меч.",
                    0,
                    0,
                    -0.75,
                    "gun");
            start.scenes[2].instruction[2] = new Situation(
                    "",
                    "Вы полностью здоровы.",
                    0,
                    100,
                    -0.25,
                    "");
            start.scenes[2].instruction[3] = new Situation(
                    "",
                    "Ну ничего, вы просто походили по магазинам и побродили по улочкам города.",
                    0,
                    0,
                    0,
                    "");
        start.scenes[3] = new Situation(
                "Бой",
                "Вдруг вы слышите крики. Не долго думая вы идете на звук и выходите на главную площадь. \n" +
                        "Тут вы вижите, что шайка разбойников грабит магазины. Они вас заметили, и пошли напрямик.\n" +
                        "Ваши действия: \n" +
                        "1) Убежать. \n"+
                        "2) Пойти в рукопашный бой. \n" +
                        "3) Пойти в атаку на грабителей. Их немного, а у тебя и меч крутой есть. \n",
                3,
                100,
                0,
                "");
            start.scenes[3].instruction[2] = new Situation(
                    "",
                    "Вы храбро сражались и смогли одержать тяжелую победу. Мэр города наградил вас орденом.",
                    0,
                    -75,
                    1,
                    "");
            start.scenes[3].instruction[0] = new Situation(
                    "",
                    "Вы бежали не оглядываясь, споткнулись об камешек и разбились. \n",
                    0,
                    -100,
                    0,
                    "");
            start.scenes[3].instruction[1] = new Situation(
                    "",
                    "Вы пошли в рукопашный бой, они были вооружены." +
                            "Но вдруг сзади послышались барабаны. Гвардия пришлиа на помощь горожанам! Вам удалось уцелеть в неравном бою.\n",
                    0,
                    -25,
                    0,
                    "");
        plotNow = start;
    }

    public boolean isEnd(){
        if(me.H <= 0){
            System.out.println(" +_+ Извините, но кажется вы мертвы +_+ \n");
        }
        return me.H <= 0 || Main.C == 4;
    }

    public void next(int ans) {
        Scanner in = new Scanner(System.in);
        if(ans > 2 && Main.C != 2){
            while(ans > 2){
                System.out.println("Вы можете выбрать только 3 варианта. Введите число в диапазоне от 1 до 3.");
                ans = in.nextInt()-1;
            }
        }
        if(Main.C == 2 && ans > 3){
            while(ans > 3){
                System.out.println("Вы можете выбрать только 4 варианта. Введите число в диапазоне от 1 до 4.");
                ans = in.nextInt()-1;
            }
        }
        if(Main.C == 1 && ans == 2 && Main.plot.plotNow.scenes[Main.C-1].instruction[ans].Sp != "Fast"){
            while(ans >=2){
                System.out.println("У вас нет лошади, вы не можете передвигаться быстрее. Выберите другой вариант.");
                ans = in.nextInt()-1;
            }
        }
        if(Main.C == 3 && ans == 2 && Main.plot.plotNow.scenes[Main.C].instruction[ans].Sp != "gun"){
            System.out.println("У вас нет мечя Выберите другой вариант.");
            ans = 48753;
            while(ans > 2){
                ans = in.nextInt()-1;
            }
        }
        System.out.println(plotNow.scenes[Main.C].instruction[ans].sceneText);
        me.H = (me.H + Main.plot.plotNow.scenes[Main.C].instruction[ans].cH) > 100 ? 100 :  me.H + Main.plot.plotNow.scenes[Main.C].instruction[ans].cH;
        me.E += Main.plot.plotNow.scenes[Main.C].instruction[ans].cE;
        Main.C++;
        System.out.println(" ====== Здоровье: " + me.H + " ====== Опыт: " + me.E  + " ======= " + Main.C);
    }
}


