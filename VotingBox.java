import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				removeChad();
			}
			move();
		}
		
				
	}
	
		

/**
 * Next method removes any chad from a ballot, which consists of beepers  
 * in the square to right and left of Karel's current position
 */
private void removeChad() {
	turnRight();
	checkPunchCorner();
	checkPunchCorner();
	turnLeft();
	
}


private void checkPunchCorner() {
	move();
	while (beepersPresent()) {
		pickBeeper();
	}
	turnAround();
	move();
}

}
