package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        firstCircle();
        secondCircle();
        BackToStart();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void firstCircle() {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
    }
    
    public void secondCircle() {
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
    }
    
    public void BackToStart() {
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
    }
}