package quizApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Quiz {
    public List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getRandomQuestions(int numQuestions) {
        if (numQuestions > questions.size()) {
            throw new IllegalArgumentException("Number of questions requested exceeds the total available questions.");
        }

        List<Question> randomQuestions = new ArrayList<>(questions);
        Collections.shuffle(randomQuestions);

        return randomQuestions.subList(0, numQuestions);
    }
}
