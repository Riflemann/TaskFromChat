import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        calculator calc1 = new calculator();

        System.out.println("Для начала работы программы необходимо внести расходы и доходы. Если хотите начать с расходов введите 1, если с доходов введите 2");
        int a = scan.nextInt();

        if (a == 1) {
            calc1.calcConsum();
        } else if (a == 2) {
            calc1.calcIncome();
        }

        System.out.println("Расходы и доходы подсчитаны, далее необходмо выбрать систему налогоблажения.");
        System.out.println("Вариант 1: 6% от доходов");
        System.out.println("Вариант 2: 15 % от доходы минус расходы");
        System.out.println("Введите 1 если выбрали 1ый вариант или 2 если выбрали второй вариант");
        a = scan.nextInt();

        if (a == 1) {
            System.out.println("Ваши налоги составят: " + calc1.taks6);
        } else {
            System.out.println("Ваши налоги сотавят: " + calc1.taks15);
        }

    }

}

