package com.example.a201635011;

public class Question {
    private int  questionId;
    private int trueAnswerId;
    private int falseAnswers [];
    private int image;

    public int getQuestionId() {
        return questionId;
    }

    public int getTrueAnswerId() {
        return trueAnswerId;
    }

    public int[] getFalseAnswers() {
        return falseAnswers;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setTrueAnswerId(int trueAnswerId) {
        this.trueAnswerId = trueAnswerId;
    }

    public void setFalseAnswers(int[] falseAnswers) {
        this.falseAnswers = falseAnswers;
    }

    public Question(int image, int questionId, int trueAnswerId, int falseAnswers []){
            this.setImage(image);
            this.setQuestionId(questionId);
            this.setTrueAnswerId(trueAnswerId);
            this.setFalseAnswers(falseAnswers);
    }
}

