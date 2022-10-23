package Praktikum_2;

public class RechenQuiz {
    private static int result;

    public int getResult() {
        return result;
    }

    public void getExercise() {
        int randomOption = (int) (Math.random() * 3.0);
        int randomFirstOperand = (int) (Math.random() * 20.0) + 1;
        int randomSecondOperand = (int) (Math.random() * 20.0) + 1;


        if (randomOption == 0) {
            result = randomFirstOperand + randomSecondOperand;

            System.out.println(randomFirstOperand + " + " + randomSecondOperand + " = ?");
        } else if (randomOption == 1) {
            result = randomFirstOperand - randomSecondOperand;

            System.out.println(randomFirstOperand + " - " + randomSecondOperand + " = ?");
        } else {
            result = randomFirstOperand * randomSecondOperand;

            System.out.println(randomFirstOperand + " * " + randomSecondOperand + " = ?");
        }
    }
}
