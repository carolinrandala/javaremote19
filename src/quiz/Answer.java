package quiz;

public class Answer {
    private Long id;
    private Long questionId;
    private String correctOptionIndex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public void setCorrectOptionIndex(String correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }
}

