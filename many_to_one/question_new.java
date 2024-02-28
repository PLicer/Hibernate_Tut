package many_to_one;

import jakarta.persistence.*;
import one_to_one.Answer;

import java.util.List;

@Entity
public class question_new {
    @Id
    @Column(name = "Question_id")
    private int questionId;

    @Column(name="Question")
    private String question;
    @OneToMany
    private List<answer_new> answer;

    public List<answer_new> getAnswer() {
        return answer;
    }

    public void setAnswer(List<answer_new> answer) {
        this.answer = answer;
    }




    public question_new() {
    }

    public question_new(int questionId, String question) {
        this.questionId = questionId;
        this.question = question;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return this.getQuestion();
    }
}
