package com.company;

public class Situation {
    Situation[] instruction;
    String scene, sceneText, Sp;
    int  cH;
    double cE;
    public Situation(String scene, String sceneText, int variants, int cH, double cE, String Sp){
        this.scene=scene;
        this.sceneText=sceneText;
        this.cH=cH;
        this.cE =cE;
        this.Sp = Sp;
        instruction  = new Situation[variants];
    }

}
