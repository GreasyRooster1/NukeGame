package main;

import static processing.core.PApplet.append;

public class ObjectManager {
    public static GameObject[] objects = {};

    public static void addObject(GameObject obj){
        objects = (GameObject[]) append(objects,obj);
    }
}
