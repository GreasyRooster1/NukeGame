package main;

import processing.core.PApplet;

import static main.ObjectManager.*;

public class Main extends PApplet {
    public static Main app;
    public void settings() {
        size(500, 500);
        app = this;
        ObjectManager.addObject(new GameObject(250,250));
    }

    public void draw(){
        background(0);
        updateObjects();
    }

    public void updateObjects(){
        for(GameObject object : objects){
            object.update();
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "main.Main" };
        PApplet.main(appletArgs);
    }
}