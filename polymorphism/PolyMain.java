package com.polymorphism;

class Animal{
    String name;
    String sound;
    Animal(String name,String sound){
        this.name=name;
        this.sound=sound;

    }
    void getInfo(){
        System.out.println("Name ="+name);
        System.out.println("Sound ="+sound);
    }
    void getInfo(String name,String sound,String Legs){
        System.out.println("Name ="+name);
        System.out.println("Sound ="+sound);
        System.out.println("Legs ="+Legs);
    }
}

