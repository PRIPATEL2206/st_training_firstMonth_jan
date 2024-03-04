package quizApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizSystem {
    public static void main(String[] args) {
        // Create a quiz
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        Question question1 = new Question("What is the capital of France?",
                List.of("Berlin", "Paris", "London", "Rome"), 2);

        Question question2 = new Question("Which planet is known as the Red Planet?",
                List.of("Earth", "Mars", "Venus", "Jupiter"), 2);

        Question question3 = new Question("What is the largest mammal?",
                List.of("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"), 2);

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        // Create students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Students take the quiz
        student1.takeQuiz(quiz);
        student2.takeQuiz(quiz);
    }
}

