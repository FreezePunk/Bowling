package bowling;

public class bowling {
	private int[] rolls = new int[21];
	private int currentRoll=0;
	
	void roll (int nbQuilles)
	{
		rolls[currentRoll++]=nbQuilles;
	}
	
	public int score() {
		int totalScore = 0;
		for (int i = 0;i < rolls.length;i++)
		{
			totalScore+=rolls[i];
		}
		return totalScore;		
	}

	
}
