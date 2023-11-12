public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int month = 15000;
        int total = 0;
        int cycle = 1;
        while (total < 2_459_000) {
            total = total + month;
            cycle = cycle + 1;
            System.out.println("Месяц " + cycle + ", сумма накоплений равна " + total + " рублей");
        }


        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();

        for (int two = 10; two >= 1; two--) {
            System.out.print(two + " ");
        }

        System.out.println();


        int Y = 12000000;
        int birthRate = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            Y += Y * (birthRate - dead) / 1000;
            System.out.println("Год " + year + " численность населения составляет " + Y);
        }


        double money = 15000;
        int i = 0;
        double bankPercent = 0.07;
        int moneyAll = 12_000_000;
        while (money < moneyAll) {
            i = i + 1;
            money = money + money * bankPercent;
            System.out.println("Сумма " + money + " , количество месяцев " + i);
        }


        double Money = 15000;
        double BankPercent = 0.07;
        int all = 12_000_000;
        int period = 6;
        for (int I = 1; Money < all; I++) {
            Money = Money + Money * BankPercent;
            if (I % period == 0) {
                System.out.println("Сумма " + Money + " , количество месяцев " + I);
            }
        }


        double moneY = 15000;
        int Period = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercenT = 0.07;
        for (int d = 1; d <= allMonth; d++) {
            moneY = moneY + moneY * bankPercenT;
            if (d % Period == 0) {
                System.out.println("Сумма " + moneY + " , количество месяцев " + d);
            }
        }


        for (int F = 1; F < 31; F += 7) {
            System.out.println("Сегодня пятница " + F + " необходимо подготовить отчет");
        }
        int Year = 2023;
        for (int c = 0; c < Year + 100; c += 79) {
            if (c > Year - 200) {
                System.out.println(c);
            }
        }
    }
}