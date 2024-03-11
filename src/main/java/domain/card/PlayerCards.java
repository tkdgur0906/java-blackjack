package domain.card;

import domain.BetAmount;
import domain.Name;
import domain.score.Status;

import java.util.List;

public class PlayerCards extends Cards implements Drawable {

    private final Name name;
    private final BetAmount betAmount;

    public PlayerCards(Name name, List<Card> cards) {
        super(cards);
        this.name = name;
        this.betAmount = new BetAmount(0);
    }

    public PlayerCards(Name name, BetAmount betAmount, List<Card> cards) {
        super(cards);
        this.name = name;
        this.betAmount = betAmount;
    }

    public int determineIncome(Status status) {
        return betAmount.determineIncome(status);
    }

    @Override
    public boolean canDraw() {
        return bestSum() <= MAX_SCORE;
    }

    public Name getPlayerName() {
        return name;
    }
}
