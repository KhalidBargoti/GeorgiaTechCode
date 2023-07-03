//I worked on the assignment alone, using only course-provided materials
/**
 * This class represents a WaterBender object.
 * @author Khalid A. Bargoti
 * @version 1.0
 */
public class WaterBender extends Bender {

    private boolean healer;
/**
 * Constructor for a WaterBender object
 * @param name name of object
 * @param strength strength of object
 * @param health health of object
 * @param healer whether or not its a healer
 */
    public WaterBender(String name, int strength, int health, boolean healer) {
        super(name, strength, health);
        this.healer = healer;
    }
/**
 * Constructor for a WaterBender object
 * @param name name of object
 */
    public WaterBender(String name) {
        this(name, 40, 80, false);
    }
/**
 * method that allows a WaterBender object to attack another Bender object
 * @param b Bender object being attacked
 */
    public void attack(Bender b) {
        if (isAlive()) {
            if (b instanceof WaterBender) {
                WaterBender w = (WaterBender) b;
                w.setHealth(w.getHealth() - 1);
            }
            if (b instanceof FireBender) {
                FireBender f = (FireBender) b;
                f.setHealth(f.getHealth() - getStrength());
            }
        }
    }
/**
 * allows a WaterBender to heal another WaterBender
 * @param wb WaterBender being healed
 */
    public void heal(WaterBender wb) {
        if (!this.healer) {
            return;
        } else {
            if (wb.healer) {
                wb.setHealth(wb.getHealth() + 40);
            } else {
                wb.setHealth(wb.getHealth() + 20);
            }
        }
    }
/**
 * checks to see if a WaterBender object equals another WaterBender object
 * @param o WaterBender object
 * @return boolean thats states whether or not the two object are equal
 */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof WaterBender)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        WaterBender b = (WaterBender) o;
        return (b.healer == this.healer);
    }
/**
 * prints a description of the WaterBender object
 * @return String returns a string describing the object
 */
    public String toString() {
        String ot;
        String superString = super.toString();
        if (healer) {
            ot = "can";
        } else {
            ot = "cannot";
        }
        return (superString + " With my waterbending, I " + ot + " heal others.");
    }
/**
 * checks if the WaterBender object is a healer
 * @return boolean ,Wheather or not it is a healer
 */
    public boolean getHealer() {
        return healer;
    }
/**
 * main method
 * @param args string intake
 */
    public static void main(String[] args) {

    }
}