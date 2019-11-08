package com.neilldev.quizMachine.model;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author neillDev
 */
public class QuizQuestionBuilderTest {

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        QuizQuestionBuilder instance = new QuizQuestionBuilder();
        Date currentDate = new Date();
        QuizQuestion result = instance
                .id(1)
                .question("What was the first toy advertised on television?")
                .answerA("The Rubix Cube")
                .answerB("Mr. Potato Head")
                .answerC("Barbie")
                .answerD("A hula hoop")
                .correctAnswer("B")
                .hint("Use your head on this one")
                .lastUpdated(currentDate)
                .build();
        assertNotNull("Quiz question build failed.",  result);
        assertEquals("Ids do not match after build.", 1, result.getId());
        assertEquals("Questions do not match after build.",
                "What was the first toy advertised on television?", result.getQuestion());
        assertEquals("Answer A does not match after build.", "The Rubix Cube", result.getAnswerA());
        assertEquals("Answer B does not match after build.", "Mr. Potato Head", result.getAnswerB());
        assertEquals("Answer C does not match after build.","Barbie", result.getAnswerC());
        assertEquals("Answer D does not match after build.", "A hula hoop", result.getAnswerD());
        assertEquals("Correct answer does not match after build.", "B", result.getCorrectAnswer());
        assertEquals("Hint does not match after build.", "Use your head on this one", result.getHint());
        assertEquals("Last updated does not match after build.", currentDate, result.getLastUpdated());
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildIdFail() {
        (new QuizQuestionBuilder())
                .id(-1)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildQuestionFail() {
        (new QuizQuestionBuilder())
                .question(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerAFail() {
        (new QuizQuestionBuilder())
                .answerA(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerBFail() {
        (new QuizQuestionBuilder())
                .answerB(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerCFail() {
        (new QuizQuestionBuilder())
                .answerC(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAnswerDFail() {
        (new QuizQuestionBuilder())
                .answerD(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildHintFail() {
        (new QuizQuestionBuilder())
                .hint(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildCorrectAnswerFail() {
        (new QuizQuestionBuilder())
                .correctAnswer(null)
                .build();
    }

    /**
     * Test of build method, of class QuizQuestionBuilder.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBuildLastUpdatedDateFail() {
        (new QuizQuestionBuilder())
                .lastUpdated(null)
                .build();
    }
}
