package many_to_one;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class answer_new {

        @Id
        @Column(name="Answer_id")
        private int answerId;
        private String answer;

        @ManyToOne
     private question_new q;

    public question_new getQ() {
        return q;
    }

    public void setQ(question_new q) {
        this.q = q;
    }


        public answer_new(int answerId, String answer) {
            this.answerId = answerId;
            this.answer = answer;
        }

    public answer_new() {
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
