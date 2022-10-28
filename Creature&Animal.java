import java.util.Random;

/*
 * Creators: Adam Carling & Haley Bush
 * Githubs: Adam Carling: shanepizza
 *          Haley Bush: SkyeBlack11
 */


public class MyWorld {
    static float spawnChance = 0.5f;
//Blades of grass is unused atm but will be used if we add in a death chance function later.
    int numOfGrassBlades = 200;

    public static void main(String[] args) {
    //run takes an int for the number of iterations that should exist before it terminates. 
        run(8);

    }//End Main
//The run function should be kept seperate to allow for possible recursive calls and to keep the main() function looking clean.
    public static void run(int howlong) {
    //The ticking can be thought of as each year the world exists. 
    //future versions of code could be adjusted to allow the 
    //user to suggest years while months are used in the program.
        int years = howlong;
        if(years < 1){
            return;
        }
        years--;
        
        run(years);
        System.out.println("The year is: " + (years+1) + "AC (After Creation). Such is the history:");
        rollSpawnChance(spawnChance);
    }// End of Run function

    public static void rollSpawnChance(float spawnChance) {
        float f = (float)Math.random();
        if(f < spawnChance+.01){
            Animal.spawnAnimal();
        }else{
            gameText();
        }
    }

//For possible alternatives for later usage.
//Unimportant for now
    public static String gameText(){
        String s =" ";
        return s;
    }//End gameText add on
}//End MyWorld



//Haley's Part
interface Creature {

    public void spawnAnimal (); //interface method, no body
    public void move (); //interface method, no body
    public void swim (); // interface method, no body
    public void eat (); // interface method, no body
    public void hunt (); //interface method, no body
    public void multiply (); //interface method, no body
    public void DEATH (); // interface method, no body

}//End Creature
class Animal implements Creature {
    public void spawnAnimal (spawnRate){
        float spawnRate = (float)Math.random;
    }
    public void move (); 
    public void swim (); 
    public void eat (); 
    public void hunt ();
    public void multiply {
        if (Creature = 2) {
            Creature = Creature + 1;
        }

    }
    public void DEATH (deathRate) {
        float deathRate = (float)Math.random;
    }
}// End Animal
//End of Haley's Part


class Cat extends Animal {

    public static void hunt(){
        System.out.println("The cat is hunting...");
    }
}// End Cat
class Bunny extends Animal {
    public static void multiply(){
        System.out.println("The bunny is multiplying...");
    }
    public static void eat(){
        System.out.println("The bunny is eating...");
    }
}// End Bunny
 class Fish extends Animal {
    public static void swim(){
        System.out.println("The fish is swimming...");
    }
}// End Fish
