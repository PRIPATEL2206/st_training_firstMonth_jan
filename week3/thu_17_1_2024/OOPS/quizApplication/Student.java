package quizApplication;

import java.util.List;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void takeQuiz(Quiz quiz) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("\n" + name + ", you are taking the quiz. Good luck!\n");

        List<Question> randomQuestions = quiz.getRandomQuestions(quiz.questions.size());

        for (Question question : randomQuestions) {
            System.out.println(question.getQuestionText());

            for (int i = 0; i < question.getOptions().size(); i++) {
                System.out.println((i + 1) + ". " + question.getOptions().get(i));
            }

            System.out.print("Your answer (1-" + question.getOptions().size() + "): ");
            int selectedOption = scanner.nextInt();

            if (selectedOption == question.getCorrectOption()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " +
                        question.getOptions().get(question.getCorrectOption() - 1) + "\n");
            }
        }

        System.out.println(name + ", your quiz is complete. Your score: " + score + "/" + quiz.questions.size());
    }
}
