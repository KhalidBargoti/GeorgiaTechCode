//I worked on the assignment alone, using only course-provided materials
/**
 * This class represents a FireBender object.
 * @author Khalid A. Bargoti
 * @version 1.0
 */
public class FireBender extends Bender {
/**
 * variable that keeps track of the firesource strength
 */
    private static double fireSourceStrength = 1.0;
/**
 * construcor for a FireBender object
 * @param name name of object
 * @param strength strength of object
 * @param health health of object
 */
    public FireBender(String name, int strength, int health) {
        super(name, strength, health);
    }
/**
 *  * construcor for a FireBender object
 * @param name name of object
 */
    public FireBender(String name) {
        this(name, 60, 50);
    }
/**
 * method that allows a FireBender object to attack another Bender object
 * @param b Bender object being attacked
 */
    public void attack(Bender b) {
        if (isAlive()) {
            if (b instanceof WaterBender) {
                WaterBender w = (WaterBender) b;
                w.setHealth(getHealth() - (int) (getStrength() * fireSourceStrength));
            }
            if (b instanceof FireBender) {
                FireBender f = (FireBender) b;
                f.setHealth((int) (f.getHealth() - fireSourceStrength));
            }
            fireSourceStrength -= 0.05;
            if (fireSourceStrength < 0) {
                fireSourceStrength = 0;
            }
        }
    }
/**
 * method used by a FireBender to replenish the firesource variable
 */
    public void replenishFireSources() {
        if (getStrength() < 50) {
            if (fireSourceStrength < 0.8) {
                fireSourceStrength = 0.8;
            }
        } else {
            fireSourceStrength = 1;
        }
    }
/**
 * checks to see if a FireBender object equals another FireBender object
 * @param o FireBender object
 * @return boolean thats states whether or not the two object are equal
 */
    public boolean equals(Object o) {
        if (!(o instanceof FireBender)) {
            return false;
        }
        return (super.equals(o));
    }
/**
 * prints a description of the FireBender object
 * @return String returns a string describing the object
 */
    public String toString() {
        String superString = super.toString();
        return (superString + " I bend fire.");
    }
/**
 * main method
 * @param args string intake
 */
    public static void main(String[] args) {

    }
}