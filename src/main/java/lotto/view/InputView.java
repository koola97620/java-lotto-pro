package lotto.view;

import lotto.domain.LottoBall;
import lotto.domain.Money;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String INPUT_WIN_NUMBERS = "지난 주 당첨 번호를 입력해 주세요.";
    private final Scanner scanner = new Scanner(System.in);

    public Money inputMoney() {
        System.out.println(INPUT_MONEY_MESSAGE);
        int money = scanner.nextInt();
        return new Money(money);
    }

    public List<LottoBall> inputWinNumbers() {
        System.out.println(INPUT_WIN_NUMBERS);
        String winNumberString = scanner.next();
        return Arrays.stream(winNumberString.split(","))
                .map(number -> new LottoBall(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }
}
