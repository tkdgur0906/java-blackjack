package view;

import domain.Name;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String POSITIVE = "y";
    private static final String NEGATIVE = "n";

    private static Scanner scanner = new Scanner(System.in);

    public static List<String> readPlayerNames() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String[] input = scanner.nextLine().split(",");
        return Arrays.stream(input).toList();
    }

    public static String readBetAmount(Name name) {
        System.out.println();
        System.out.println(name.asString() + "의 배팅 금액은?");
        return scanner.nextLine();

    }

    public static boolean readHitOpinion(Name name) {
        System.out.println(name.asString() + "는(은) 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        String opinion = scanner.nextLine();
        if (POSITIVE.equals(opinion)) {
            return true;
        }
        if (NEGATIVE.equals(opinion)) {
            return false;
        }
        throw new IllegalArgumentException("예는 y, 아니오는 n로 입력해주세요.");
    }
}
