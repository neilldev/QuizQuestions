package com.neilldev.quizMachine.model;


import java.util.List;

/**
 * author neillDev
 * 
 * Interface for the data access to a quiz question database
 */
public interface QuizQuestionAccessible {

    /**
     * Returns a {@link QuizQuestion} by index
     *
     * @param index the index of the quiz question
     * @return a quiz question by index
     */
    QuizQuestion getQuestionByIndex(long index);

    /**
     * Returns a {@link QuizQuestion} by id.
     *
     * @param id the identifier of the quiz question
     * @return an quiz question by id
     */
    QuizQuestion getQuestionById(long id);

    /**
     * Returns a random {@link QuizQuestion}
     *
     * @return a random quiz question
     */
    QuizQuestion getRandomQuestion();

    /**
     * Returns a list of at most 10 {@link QuizQuestion} starting at the offset
     *
     * @param offset the starting point
     * @return a list of at most 10 questions starting the offset
     */
    List<QuizQuestion> getQuestionList(long offset);

    /**
     * Returns a list of at most 10 {@link QuizQuestion} using a list of id's
     *
     * @param id
     * @return a list of at most 10 questions using a list od id's
     */
    List<QuizQuestion> getSpecifiedQuestionList(long... id);

    /**
     * Returns the total number of {@link QuizQuestion} in the database
     *
     * @return the number of quiz questions
     */
    long getQuestionListSize();
}
