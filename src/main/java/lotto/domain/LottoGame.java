package lotto.domain;

import jdk.dynalink.beans.StaticClass;

import java.util.List;

public class LottoGame {
    private int tryCount;
    private List<LottoBalls> lottoBallsList;

    public LottoGame(int tryCount, List<LottoBalls> lottoBalls) {
        this.tryCount = tryCount;
        this.lottoBallsList = lottoBalls;
    }

    public LottoGame(List<LottoBalls> lottoBalls) {
        this.lottoBallsList = lottoBalls;
    }

    public int getTryCount() {
        return tryCount;
    }

    public Statistics calculateLottoResult(LottoBalls winLottoBalls) {
        Statistics statistics = new Statistics();
        for (LottoBalls lottoBalls : lottoBallsList) {
            int count = lottoBalls.countContainingWinNumbers(winLottoBalls);
            Ranking ranking = Ranking.find(count);
            statistics.record(ranking);
        }
        return statistics;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (LottoBalls lottoBalls : lottoBallsList) {
            builder.append("[");
            builder.append(lottoBalls.toString());
            builder.append("]");
            builder.append("\n");
        }
        return builder.toString();
    }
}
