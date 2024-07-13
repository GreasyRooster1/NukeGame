package main;

import processing.core.PApplet;

public class Main extends PApplet {
    GameObject[] objects = {};

    public void settings() {
        size(500, 500);
    }

    public void draw(){
        background(0);
    }

    public void updateObjects(){

    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "main.Main" };
        PApplet.main(appletArgs);
    }
}