package one_to_one;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {

    @Id
    @Column(name="Answer_id")
    private int answerId;
    private String answer;


    public Answer() {
    }

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString()
    {
        return this.getAnswer();
    }
}
