import java.util.Scanner;

public class calculator {
    int inputIncome;
    int sumIncome;
    int inputConsumtion;
    int sumConsumtion;
    int taks6;
    int taks15;
    int input;
    String stringInput = null;



    Scanner scanCal = new Scanner(System.in);

    void calcIncome() {
        System.out.println("Вы выбрали ввод доходов, введите сумму");
        inputIncome = scanCal.nextInt();
        while (stringInput != "exit") {
            sumIncome = sumIncome + inputIncome;
            System.out.println("Введите сумму доходов или exit для завершения ввода доходов");
            stringInput = scanCal.next();
            if (stringInput == "exit") {

            } else {
                inputIncome = Integer.parseInt(stringInput);
            }
        }
    }
    void calcConsum() {
        stringInput = null;
        System.out.println("Вы выбрали ввод расходов, введите сумму");
        inputConsumtion = scanCal.nextInt();
        while (stringInput != "exit") {
            sumConsumtion = sumConsumtion + inputConsumtion;
            System.out.println("Введите сумму расходов или exit для завершения ввода расходов");
            stringInput = scanCal.next();
            if (stringInput == "exit") {

            } else {
                inputConsumtion = Integer.parseInt(stringInput);
            }

        }
    }

    void calcTaks6() {
        taks6 = sumIncome / 100 * 6;
    }

    void calcTaks15() {
        taks15 = (sumIncome - sumConsumtion) / 100 * 6;
    }


}




