package com.soft1841.week2;

public class Plane extends FlyObject {
    public  Plane(String name,double speed){
        //通过super调用父类构造方法
        super(name,speed);
    }
    @Override
    public String fly() {
        //重写fly抽象方法，返回飞机的飞行信息
        return "飞机型号：" + this.name + ",飞行时速：" + this.speed +"km/h";
    }
}
