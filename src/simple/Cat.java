package simple;

/**
 * Created by Viktoriya_Oreshkina on 19-Oct-14.
 */
public class Cat //объявление класса, описывающего объект "Кот"
{
    //атрибуты класса Cat
    private int weight; //вес
    private String mame; //кличка
    private String color; //окрас

    //методы класса Cat
    public void eat() {
        System.out.print("Eating... \n");
    }
    public void sleep() {
        System.out.print("Sleeping z-z-z-z.... \n");
    }
    public String speak(String words) {
        String phrase = words + "...mauuu...\n";
        return phrase;
    }
}
