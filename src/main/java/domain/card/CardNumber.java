package domain.card;

public enum CardNumber {

    ACE(1, "A"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K");

    private final int value;

    private final String sign;

    CardNumber(int value, String sign) {
        this.value = value;
        this.sign = sign;
    }

    public static CardNumber find(int cardNumber) {
        CardNumber[] values = values();
        return values[cardNumber - 1];
    }

    public int getValue() {
        return value;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public String toString() {
        return "CardNumber{" +
                "value=" + value +
                ", sign='" + sign + '\'' +
                '}';
    }
}
