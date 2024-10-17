package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

    Car myCar = new Car("Citroen", "Xsara", "Diesel");


    // Verificar si el tacómetro es cero
     myCar.isTachometerEqualToZero();
     if (myCar.isTachometerEqualToZero()){
         System.out.println("El tacómetro es 0");
     }else {
        System.out.println("El tacómetro no es 0");
    }
     //2. Encender el coche
     myCar.start();

    // 3. Encender coche y comprobar como no se puede
     myCar.start();

        //4 apagar comprobando el tacometro
        myCar.stop();


        myCar.isTachometerEqualToZero();
        if (myCar.isTachometerEqualToZero()){
            System.out.println("El tacómetro es 0");
        }else {
            System.out.println("El tacómetro no es 0");
        }




    }




}