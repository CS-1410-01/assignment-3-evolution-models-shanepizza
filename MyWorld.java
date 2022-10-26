/*
 * Editors: Adam Carling & 
 * 
 * 
 */

/*
 * I figure we split it up based on MyWorld and Creature/Animal. Which one do you want? 
 */

public class MyWorld {
    public static void main(String[] args) {
        
        run();

    }//End Main
//The run function should be kept seperate to allow for possible recursive calls and to keep the main() function looking clean.
    public static void run() {

    }// End of Run function
}//End MyWorld




interface Creature {

}//End Creature
class Animal implements Creature {

}// End Animal




class Cat extends Animal {

}// End Cat
class Bunny extends Animal {

}// End Bunny
public class Fish extends Animal {

}// End Fish