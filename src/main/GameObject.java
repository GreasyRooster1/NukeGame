package main;

import static main.Main.app;

public class GameObject {
    public float x,y;

    public GameObject(float x,float y){
        this.x = x;
        this.y = y;
    }

    public void update(){
        onUpdate();
        render();
    }

    public void onUpdate(){

    }
    public void render(){
        app.ellipse(x,y,10,10);
    }
}
