/**
 * Created by iyubinest on 5/14/16.
 */
public abstract class MasterMind {

    public static final int TRIES = 6;
    public int current = 0;

    public abstract String magicNumber();

    public Result attempt(String attempt) {
        int spades = 0;
        int fixed = 0;
        current++;
        for (int i = 0; i < magicNumber().length(); i++) {
            for (int j = i; j < attempt.length(); j++) {
                if (magicNumber().charAt(i) == attempt.charAt(j)) {
                    if (i == j) fixed++;
                    else spades++;
                }
            }
        }
        return new Result(spades, fixed, current);
    }
}
