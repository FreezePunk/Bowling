package bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class bowlingTest {
	bowling game;
	@BeforeEach
	void setUp() throws Exception {
		game = new bowling();
	}

	@Test
	void quilles20_0() {
		for (int i=0;i<20;i++)
			game.roll(0);
		assertEquals(0,game.score());
	}
	
	@Test
	void quilles20_1() {
		for (int i=0;i<20;i++)
		{
			game.roll(1);
		}	
		assertEquals(20,game.score());
	}
	
	@Test
	void quilles10_1_10_2() {
		for (int i=0;i<10;i++)
			game.roll(1);
		for (int i=0;i<10;i++)
			game.roll(2);
		assertEquals(30,game.score());
	}
	
	@Test
	void Niveau2() {
		int[] rolls= {7,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i=0;i<rolls.length;i++)
			game.roll(rolls[i]);
		assertEquals(18,game.score());
	}
	
	@Test
	void Niveau3() {
		int[] rolls= {10,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i=0;i<rolls.length;i++)
			game.roll(rolls[i]);
		assertEquals(24,game.score());
	}
	
	@Test 
	void Niveau4(){
		int[] rolls= {1,2,10,0,10,4,2,0,10,6,2,0,10,6,4,8,2,2,7};
		for (int i=0;i<rolls.length;i++)
			game.roll(rolls[i]);
		assertEquals(122,game.score());
	}
	
	@Test 
	void Niveau5(){
		int[] rolls= {1,2,10,0,10,4,2,0,10,6,2,0,10,6,4,8,2,2,8,8};
		for (int i=0;i<rolls.length;i++)
			game.roll(rolls[i]);
		assertEquals(131,game.score());
	}
	
}
