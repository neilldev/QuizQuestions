package com.neilldev.quizMachine.model;

import java.util.Date;
import java.util.HashSet;

/**
 * author neillDev
 *
 * Builder class for the {@link QuizQuestion} class
 */
public class QuizQuestionBuilder {
    private long id;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correctAnswer;
    private String hint;
    private Date lastUpdated;

    /**
     *
     * Empty constructor
     */
    public QuizQuestionBuilder() {
        //Empty
    }

    /**
     * Builder for {@link QuizQuestion}
     * @return a {@link QuizQuestion} instance
     */
    public QuizQuestion build() {
        if ((id < 0)
                || ("".equals(this.question) || this.question.trim().isEmpty())
                || ("".equals(this.answerA) || this.answerA.trim().isEmpty())
                || ("".equals(this.answerB) || this.answerB.trim().isEmpty())
                || ("".equals(this.answerC) || this.answerC.trim().isEmpty())
                || ("".equals(this.answerD) || this.answerD.trim().isEmpty())
                || ("".equals(this.correctAnswer) || this.correctAnswer.trim().isEmpty())
                || ("".equals(this.hint) || this.hint.trim().isEmpty())
                || (this.lastUpdated == null)
                ) {
            throw new IllegalStateException("Trivia builder not in buildable state");
        }

        return new QuizQuestion(
                this.id,
                this.question,
                this.answerA,
                this.answerB,
                this.answerC,
                this.answerD,
                this.correctAnswer,
                this.hint,
                this.lastUpdated
        );
    }

    /**
     * Setter for {@link QuizQuestionBuilder#id}
     * @param id the unique id for the {@link QuizQuestion}
     * @return
     */
    public QuizQuestionBuilder id(long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id can't be less than 0");
        }
        this.id = id;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#question}
     * @param question the trivia question for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder question(String question) {
        if (question == null || question.trim().isEmpty()) {
            throw new IllegalArgumentException("Question cannot be null or empty.");
        }
        this.question = question;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#answerA}
     * @param answerA the first possible answer for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder answerA(String answerA) {
        if (answerA == null || answerA.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer A cannot be null or empty.");
        }
        this.answerA = answerA;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#answerB}
     * @param answerB the second possible answer for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder answerB(String answerB) {
        if (answerB == null  || answerB.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer B cannot be null or empty.");
        }
        this.answerB = answerB;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#answerC}
     * @param answerC the unique id for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder answerC(String answerC) {
        if (answerC == null  || answerC.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer C cannot be null or empty.");
        }
        this.answerC = answerC;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#answerD}
     * @param answerD the unique id for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder answerD(String answerD) {
        if (answerD == null  || answerD.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer D cannot be null or empty.");
        }
        this.answerD = answerD;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#correctAnswer}
     * @param correctAnswer the correct answer for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder correctAnswer(String correctAnswer) {
        if (correctAnswer == null  || correctAnswer.trim().isEmpty()) {
            throw new IllegalArgumentException("Correct answer cannot be null or empty.");
        }
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        if (!set.contains(correctAnswer)) {
            throw new IllegalArgumentException("Correct answer must be 'A', 'B', 'C' or 'D'.");
        }
        this.correctAnswer = correctAnswer;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#hint}
     * @param hint the hint for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder hint(String hint) {
        if (hint == null  || hint.trim().isEmpty()) {
            throw new IllegalArgumentException("Hint cannot be null or empty.");
        }
        this.hint = hint;
        return this;
    }

    /**
     * Setter for {@link QuizQuestionBuilder#lastUpdated}
     * @param lastUpdated the date the question was last updated for the {@link QuizQuestion}
     * @return a {@link QuizQuestionBuilder} instance
     */
    public QuizQuestionBuilder lastUpdated(Date lastUpdated) {
        if (lastUpdated == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }
        this.lastUpdated = lastUpdated;
        return this;
    }
}
