public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Task number 1");
        int salary = 29_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
        System.out.println("Task number 2");
        int i = 0;
        while (i <= 9) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");
        }

        System.out.println();
        System.out.println("Task number 3");
        int Y = 12_000_000;
        int life = 17; // переменные life и death ввел только чтобы обозначить откуда берутся цифры для рассчетов
        int death = 8;
        int year = 0;
        int plusLife;
        while (year <= 9) {
            plusLife = (Y / 1000) * (life - death);
            Y = Y + plusLife;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + Y);
        }

        System.out.println();
        System.out.println("Task number 4");
        long bank = 15_000L;
        int secondMonth = 0;
        while (bank <= 12_000_000) {
            bank = bank + bank / 100 * 7; // использовал вместо * 0,7 чтобы не переходить к double
            secondMonth++;
            System.out.println("Месяц " + secondMonth + ", накоплений " + bank);
        }

        System.out.println();
        System.out.println("Task number 5");
        long secondBank = 15_000L;
        int thirdtMonth = 0;
        while (secondBank <= 12_000_000) {
            secondBank = secondBank + secondBank / 100 * 7; // использовал вместо * 0,7 чтобы не переходить к double
            thirdtMonth++;
            if (thirdtMonth % 6 == 0){
                System.out.println("Месяц " + thirdtMonth + ", накоплений " + secondBank);
            }
        }

        System.out.println();
        System.out.println("Task number 6");
        long thirdBank = 15_000L;
        int fourthtMonth = 0;
        while (fourthtMonth <= 108) {
            thirdBank = thirdBank + thirdBank / 100 * 7; // использовал вместо * 0,7 чтобы не переходить к double
            fourthtMonth++;
            if (fourthtMonth % 6 == 0){
                System.out.println("Месяц " + fourthtMonth + ", накоплений " + thirdBank);
            }
        }

        System.out.println();
        System.out.println("Task number 7");
        int workDay = 4;
        while (workDay <= 31) {
            System.out.println("Сегодня пятница, " + workDay + "-е число. Необходимо делать отчет.");
            workDay += 7;
        }

        System.out.println();
        System.out.println("Task number 8");
        int comet = 0;
        while (comet <= 2024) {
            comet += 79;
            if ((comet >= 2024 - 200) && (comet <= 2024 + 100)) {
                System.out.println(comet);
            }
        }
    }
}