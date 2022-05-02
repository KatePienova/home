package com.company;


public class Home {

public static void name () {
System.out.println("Информация про дома населенного пункта.");
    }

    public String color;
    public Integer tenants;

    public Home(String color, int tenants) {
        this.color = color;
        this.tenants = tenants;
    }

    public Home() {
    }


    String toString(String color) {
        return "Home{" +
                "color='" + color + '\'' +
                ", tenants=" + tenants +
                '}';
    }

    @Override
    public String toString() {
        return "Home{" +
                "color='" + color + '\'' +
                ", tenants=" + tenants +
                '}';
    }

    String toString(String color, Integer tenants) {
        return "Home{" +
                "color='" + color + '\'' +
                ", tenants=" + tenants +
                '}';
    }


    void srtq(){
        System.out.println(1);
    }
    public static void main(String[] args) {
        //вызывание public static void name ().
        name();
        //вызывание метода с помощью создания объекта.
        Home c1 = new Home();
        c1.name();
        //вызывание метода без создания объекта.
        Home.name();
        Home home1 = new Home(new String("grey"),247);
        Home home2 = new Home("black",360);
        Home home3 = new Home();
        Home home4 = new Home("red", 200);

        System.out.println(home1.toString());
        System.out.println(home2.toString("",10));
        System.out.println(home3.toString());
        System.out.print(home4.toString());
        home4.srtq();
    }

    }

