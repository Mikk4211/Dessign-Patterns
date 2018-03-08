package Singleton;

// @Author Mikk4211
// @www.github.com/mikk4211

public class SingleObjectDemo {

    public static void main(String[] args) {

        /* Prøver jeg at lave endnu et nyt SingleObjekt, får jeg en fejl. */
        /* Da constructeren er private i den SingleObject klassen. */
        /* Dette gør det til en singleton klasse, da det kun tillader at der laves objekter i selve klassen. */
        //SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        // Viser beskeden
        object.showMessage();

    }


}
