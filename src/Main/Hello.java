package Main;

import simple.Beet;
import simple.Carrots;
import simple.Cucumber;
import simple.Pumpkin;

import javax.swing.*;
import java.lang.System;

/**
 * Created by Viktoriya_Oreshkina on 19-Oct-14.
 */
public class Hello
{

    public static void main(String[] args) {
        Cucumber cu = new Cucumber("sort1", 30);
        Carrots car = new Carrots("sort2", 150);
        Pumpkin pum = new Pumpkin("sort3", 500);
        Beet beet = new Beet("sort4", 140);

        //salad
        System.out.println("Salad composition: " + cu.getName() + " " + car.getName() + " " + pum.getName() + " " + beet.getName());

        //caliric in salad
        int sumCaloric;
        sumCaloric = cu.getCaloric() + car.getCaloric() + pum.getCaloric() + beet.getCaloric();
        System.out.println("Salad caloric: " + sumCaloric + " ККал");



        System.out.println("Name vagetable: " + cu.getName());
        System.out.println("Sort:" + cu.getSortName());
        System.out.println("Amount caloric at 100 gram: " + cu.getCaloric() + " Kkal");


    }

  /*  public static void main(String[] args)
    {
        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        System.out.println(say);
    }

    public static void main(String[] args) {
        Dog ourdog = new Dog();
        ourdog.eat();
        ourdog.play();
        String saydog = ourdog.speak("I'm a dog");
        System.out.println(saydog);
    }*/


}
