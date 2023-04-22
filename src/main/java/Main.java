import ru.netology.stats.StatsService;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] sale = {
                8, 15, 13, 2, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int averege = 15;
        int summ = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averege) {
                summ++;
            }

        }
        System.out.println(summ);
    }
}