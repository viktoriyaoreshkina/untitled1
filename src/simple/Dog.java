package simple;

/**
 * Created by Viktoriya_Oreshkina on 19-Oct-14.
 */
public class Dog {
    //атрибуты класса Dog
    private int poroda;
    private String color;
    private boolean awards;

    //методы класса Dog
    public void eat (){
        System.out.println("Chappy");
    }
    public void play () {
        System.out.println("Run, run, run");
    }
    public String speak (String word){
        String phrase1 = word + " agr-r-r...";
        return phrase1;
    }
}
