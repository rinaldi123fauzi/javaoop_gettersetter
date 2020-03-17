package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    void display(){
        System.out.println("Write Only : "+this.doublePrivate);
    }

    //getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    //constructor
    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    //setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    //getter
    public double getJari2(){
        return this.diameter/2;
    }

    //getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}

public class Main{

    public static void main(String[] args) {
        Data object = new Data();

        //read and write dengan menggunakan public
        object.intPublic = 10;//Write
        System.out.println("public : "+object.intPublic);//Read

        //read only (kita bisa bisa membaca, menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("Getter Only : " + angka);

        //write only (kita hanya bisa menulis, menggunakan SETTER)
        object.setDoublePrivate(80.5);
        object.display();

        //gabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("jari2 : "+object2.getJari2());
        object2.setJari2(14);
        System.out.println("jari2 : "+object2.getJari2());
        System.out.println("luas : "+object2.getLuas());

    }
}