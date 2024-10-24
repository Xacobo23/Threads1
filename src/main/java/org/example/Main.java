package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        RandomNumber fr = new RandomNumber();
        Thread t1 = new Thread(fr);
        t1.start();
        Thread t2 = new Thread(fr);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Acabouse");
    }
}

/*
*Crear un array con 3650 posicions que almacene as temperaturas en Santiago dos ultimos dez anos
* Pide a temperatura media dos ultimos dez anos
*
* Dividir o array en trozos para que se reparta entre dez threads para facer a media de cada ano e despois dos dez threads
*/