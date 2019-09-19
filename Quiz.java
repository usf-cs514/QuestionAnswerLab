import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

        public static void main(String args[]) {

            // create an object of superclass (QA) and use it
            QA qa = new QA("How many states are there?", "50");
            qa.displayQuestion();
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (qa.checkAnswer(answer)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
                qa.displayAnswer();
            }


            // create an object of subclass and use it.
            ArrayList<String> choices = new ArrayList<String>();
            choices.add("a. Sacramento");
            choices.add("b. San Francisco");
            QA cqa = new ChoiceQA("What is the capital of California?", "a", choices);
            cqa.displayQuestion();
            scanner = new Scanner(System.in);
            answer = scanner.next();
            if (cqa.checkAnswer(answer)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
                cqa.displayAnswer();
            }



        }

}
