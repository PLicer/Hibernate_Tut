package one_to_one;


import jakarta.persistence.*;

@Entity
public class question {
    @Id
    @Column(name = "Question_id")
    private int questionId;

    @Column(name="Question")
    private String question;

    @OneToOne
    @JoinColumn(name = "Answer_id")
    private Answer answer;


    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }


    public question() {
    }

    public question(int questionId, String question) {
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
