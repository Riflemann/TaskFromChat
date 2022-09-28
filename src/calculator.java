import java.util.Scanner;

public class calculator {
    int inputIncome;
    int sumIncome;
    int inputConsumtion;
    int sumConsumtion;
    int taks6;
    int taks15;


    Scanner scanCal = new Scanner(System.in);
    void calcIncome() {
        while (!scanCal.hasNext("exit")) {
            inputIncome = scanCal.nextInt();
            sumIncome = sumIncome + inputIncome;
            System.out.println("Введите сумму доходов или exit для завершения ввода доходов");
            scanCal.next();
        }
    }
    void calcConsum() {
        while (!scanCal.hasNext("exit")) {
            inputConsumtion = scanCal.nextInt();
            sumConsumtion = sumConsumtion + inputConsumtion;
            System.out.println("Введите сумму расходов или exit для завершения ввода расходов");
            scanCal.next();
        }
    }

    void calcTaks6() {
        taks6 = sumIncome / 100 * 6;
    }

    void calcTaks15() {
        taks15 = (sumIncome - sumConsumtion) / 100 * 6;
    }


}




