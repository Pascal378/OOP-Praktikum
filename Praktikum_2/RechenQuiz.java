package Praktikum_2;

public class RechenQuiz {
    private static int result;

    public int getResult() {
        return result;
    }

    //Generate 2 random operands and an operator to generate an exercise and print the according result
    public void getExercise() {

        //Result needs to be greater than 0, otherwise it isn't valid
        do {
            int randomOperator = (int) (Math.random() * 3.0); //Random number for the operator
            int randomFirstOperand = (int) (Math.random() * 20.0) + 1; // Random operands between & incl. 1 and 20
            int randomSecondOperand = (int) (Math.random() * 20.0) + 1;

            // 0 = addition, 1 = subtraction, else = multiplication
            if (randomOperator == 0) {
                result = randomFirstOperand + randomSecondOperand;

                if (result >= 0) {
                    System.out.println(randomFirstOperand + " + " + randomSecondOperand + " = ?");
                }
            } else if (randomOperator == 1) {
                result = randomFirstOperand - randomSecondOperand;

                if (result >= 0) {
                    System.out.println(randomFirstOperand + " - " + randomSecondOperand + " = ?");
                }
            } else {
                result = randomFirstOperand * randomSecondOperand;

                if (result >= 0) {
                    System.out.println(randomFirstOperand + " * " + randomSecondOperand + " = ?");
                }
            }
        } while (result < 0);
    }
}
