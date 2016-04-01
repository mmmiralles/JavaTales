package es.meryville.labrynthDoors;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestDoor {	
	
	Door blueDoor;
	Door redDoor;
	
	@Before
	public void CreateDoors(){	
		blueDoor = new Door();			
		redDoor = blueDoor.opposite();	
	}


	
	@Test
	public void testBlueDoorAskRedDoor(){			
		boolean youLive ;	
		if (blueDoor.askToCertainDeath(redDoor)){
			 youLive = redDoor.enter();
			assertTrue(!redDoor.askToCertainDeath(blueDoor));
		}else{
			 youLive = blueDoor.enter();
			 assertTrue(redDoor.askToCertainDeath(blueDoor));
		}
		assertTrue(youLive);			
	}
	

	
	
}
