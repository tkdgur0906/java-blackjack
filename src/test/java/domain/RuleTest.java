package domain;

import domain.card.Card;
import domain.card.DealerCards;
import domain.card.PlayerCards;
import domain.card.Shape;
import domain.game.Rule;
import domain.score.Status;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RuleTest {

    @Test
    @DisplayName("타겟 카드의 승무패를 결정한다.")
    void decideStatus() {
        DealerCards dealerCards = new DealerCards(List.of(new Card(10, Shape.CLUB), new Card(6, Shape.CLUB)));

        PlayerCards playerCards = new PlayerCards(new Name("capy"), List.of(new Card(10, Shape.CLUB), new Card(11, Shape.CLUB)));

        Rule rule = new Rule();
        Status dealerStatus = rule.decideStatus(dealerCards, playerCards);
        Status playerStatus = rule.decideStatus(playerCards, dealerCards);

        assertAll(
                () -> assertThat(dealerStatus).isEqualTo(Status.LOSE),
                () -> assertThat(playerStatus).isEqualTo(Status.WIN)
        );
    }
}