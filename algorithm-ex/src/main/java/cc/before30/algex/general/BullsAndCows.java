package cc.before30.algex.general;

public class BullsAndCows {
    public String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        int length = secret.length();
        char[] secretArray = secret.toCharArray();
        char[] guessArray = guess.toCharArray();
        for (int i = 0; i < length; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                secretArray[i] = '_';
                guessArray[i] = '_';
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <length; j++) {
                if (guessArray[i] != '_' &&
                        guessArray[i] == secretArray[j]) {
                    secretArray[j] = '_';
                    cows++;
                    break;
                }
            }
        }

        return String.format("%dA%dB",  bulls, cows);
    }
}
