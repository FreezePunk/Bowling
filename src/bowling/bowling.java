package bowling;

public class bowling {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    void roll(int nbQuilles) {
        rolls[currentRoll++] = nbQuilles;
    }

    public int score() {
        int totalScore = 0;
        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) { // Iterating through 10 frames
            if (isSpare(rollIndex)) {
                totalScore += 10 + rolls[rollIndex + 2]; // Add 10 for the spare plus the next roll
                rollIndex += 2; // Move to the next frame
            } else {
                totalScore += rolls[rollIndex] + rolls[rollIndex + 1]; // Add the total pins knocked down in the frame
                rollIndex += 2; // Move to the next frame
            }
        }
        return totalScore;
    }

    public boolean isSpare(int index) {
        return rolls[index] + rolls[index + 1] == 10;
    }
}
