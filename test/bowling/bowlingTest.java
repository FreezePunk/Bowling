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
			game.roll(1);
		assertEquals(20,game.score());
	}
	
}
