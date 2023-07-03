//I worked on the assignment alone, using only course-provided materials
/**
 * This class represents a Bender object.
 * @author Khalid A. Bargoti
 * @version 1.0
 */
public abstract class Bender {

    private String name;
    private int strength;
    private int health;
/**
 * Constructor for a Bender object
 * @param name name of object
 * @param strength strength of object
 * @param health health of object
 */
    public Bender(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }
/**
 * checks to see if a Bender object has more then 0 health
 * @return boolean that sayes whether or not a Bender object is alive
 */
    public boolean isAlive() {
        return (health > 0);
    }
/**
 * abstract class
 * @param b takes in a Bender object
 */
    public abstract void attack(Bender b);
/**
 * checks to see if a Bender object equals another Bender object
 * @param o Bender object
 * @return boolean thats states whether or not the two object are equal
 */
    public boolean equals(Object o) {
        if (!(o instanceof Bender)) {
            return false;
        }
        Bender b = (Bender) o;
        return (b.name.equals(name) && b.strength == strength && b.health == health);
    }
/**
 * prints a description of the Bender object
 * @return String, returns a string describing the object
 */
    public String toString() {
        return ("My name is " + name + ". I am a bender. My strength is "
                + strength + " and my current health is " + health + ".");
    }
/**
 * returns the name of the Bender object
 * @return String, name of the object
 */
    public String getName() {
        return name;
    }
/**
 * returns the health of the object
 * @return int, health of the object
 */
    public int getHealth() {
        return health;
    }
/**
 * returns the strength of the object
 * @return int, strength of the object
 */
    public int getStrength() {
        return strength;
    }
/**
 * sets the name of the object to the inputed String
 * @param name String of the new name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * sets the health of the object to the inputted int
 * @param health int of the health
 */
    public void setHealth(int health) {
        if (health <= 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }
/**
 * sets the strength of the object to the inputted int
 * @param strength int strength of the object
 */
    public void setStrength(int strength) {
        this.strength = strength;
    }
}