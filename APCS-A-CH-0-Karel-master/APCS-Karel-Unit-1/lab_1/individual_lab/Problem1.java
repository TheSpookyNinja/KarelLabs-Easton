package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        GoToBeepers();
        PickAllBeepers();
        GoToDropLocation();
        DropAllBeepers();
        Reposition();
    }
    
    public void GoToBeepers() {
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void PickAllBeepers() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    
    public void GoToDropLocation() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void DropAllBeepers() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void Reposition() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
}