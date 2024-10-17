package com.campusdual.classroom;

import com.sun.source.tree.ReturnTree;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public static final int MIN_SPEED = 0;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){}

    public Car() {

    }


    public void start(){
        if(this.tachometer == 0){
            this.tachometer=1000;
            System.out.println("Vehículo acendido");
        } else if (this.tachometer == 1000) {
            System.out.println("O vehículo xa está acendido");
        }
    }
    public void stop(){
        if(this.speedometer == 0){
            this.tachometer=0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }
    public void accelerate(){
    if(this.speedometer + 10 > MAX_SPEED){
        this.speedometer = MAX_SPEED;
        } else {
        this.speedometer +=10;
    }

    }
    public void brake(){

        if(this.speedometer -10 < MIN_SPEED ){
            this.speedometer = MIN_SPEED;
            System.out.println("Vehiculo detenido");
        } else {
            this.speedometer --;
            System.out.println("El vehículo esta frenando");
        }
    }
    public void turnAngleOfWheels(int angle){
        if (angle < -45 || angle > 45){
            System.out.println("Este ángulo no está permitido");
        if(angle > 0){
            wheelsAngle= 45;
        }else {
            wheelsAngle =-45;
        }
        }else{
        wheelsAngle = angle;
            System.out.println("El nuevo ángulo de las reudas es: "+ angle);
        }
    }
    public String showWheelsAngleDetail(){
        return "El ángulo es" +this.wheelsAngle;
    }
    public boolean isReverse(){
        return this.reverse;
    }
    public void setReverse(boolean reverse){
        //this.reverse = reverse;
        if (this.tachometer >0 && this.speedometer==0 ){
            this.reverse = true;
            this.gear = "R";
        }else{
            this.reverse =false;
            this.gear = "N";
        }

    }
    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;

    }
    public boolean isTachometerEqualToZero(){
        return this.tachometer == 0;

    }

    public void showDetails(){}

    public static void main(String[] args) {

    }



}
