package quizgame_technohacks.p6;

import java.util.Scanner;

public class quizgame {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "Who invented Java Programming?",
            "What is the extension of java code files?",
            "Which of the following is not an OOPS concept in Java?",
            "Which component is used to compile, debug and execute the java programs?",
            "Which of these cannot be used for a variable name in Java?",
            "Which of these are selection statements in Java?",
            "Which of the following is a superclass of every class in Java?",
            "Which one of the following is not an access modifier?",
            "Which class provides system independent server side implementation?",
            "Which of the following is not a purpose of methods in Java?"
        };

        String[][] choices = {
            {"A) Guido van Rossum", "B) James Gosling", "C) Dennis Ritchie", "D) Bjarne Stroustrup"},
            {"A) .js", "B) .txt", "C) .class", "D) .java"},
            {"A) Polymorphism", "B) Inheritance", "C) Compilation", "D) Encapsulation"},
            {"A) JRE", "B) JIT", "C) JDK", "D) JVM"},
            {"A) identifier & keyword", "B) identifier", "C) keyword", "D) none of the mentioned"},
            {"A) break", "B) continue", "C) for()", "D) if()"},
            {"A) ArrayList", "B) Abstract class", "C) Object class", "D) String"},
            {"A) Protected", "B) Void", "C) Public", "D) Private"},
            {"A) Server", "B) ServerReader", "C) Socket", "D) ServerSocket"},
            {"A) Increase code reusability", "B) Provide a structured and organized approach", "C) Store data", "D) Break a complex problem into simpler ones"},
        };
        
        char[] answers = {'B', 'D', 'C', 'C', 'C', 'D', 'C', 'B', 'D', 'C'};

        char[] userAnswers = new char[questions.length];
        
        System.out.println("************WELCOME TO TECHNOHACKS************");
        System.out.println("************WELCOME TO JAVA PROGRAMMING************");
        System.out.println("************WELCOME TO QUIZ GAME************\n");
        
        System.out.println("Welcome to the Multiple Choice Quiz!\n");

        for(int i = 0; i < questions.length; i++) 
        {
            System.out.println(questions[i]);
            for(String choice : choices[i])
            {
                System.out.println(choice);
            }

            System.out.print("Your answer: ");
            userAnswers[i] = Character.toUpperCase(sc.next().charAt(0));
        }

        int score = 0;
        for(int i = 0; i < answers.length; i++)
        {
            if(userAnswers[i] == answers[i]) 
            {
                score++;
            }
        }

        System.out.println("\nQuiz Results:");
        for(int i = 0; i < questions.length; i++) 
        {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            System.out.println("Your Answer: " + userAnswers[i]);
            System.out.println("Correct Answer: " + answers[i]);
            System.out.println();
        }

        System.out.println("Your score: " + score + " out of " + questions.length);
        System.out.println("************THANKS FOR PARTICIPATING IN QUIZ************");
    }
}
