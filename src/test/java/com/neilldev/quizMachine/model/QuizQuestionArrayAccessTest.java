package com.neilldev.quizMachine.model;

import org.junit.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 *
 * @author neillDev
 */
public class QuizQuestionArrayAccessTest {

    /**
     * Test of getQuestion method, of class QuizQuestionArrayAccess.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        long index = 1;
        QuizQuestionArrayAccess instance = new QuizQuestionArrayAccess();
        QuizQuestion expResult = (new QuizQuestionBuilder())
                .id(1)
                .question("What was the first toy advertised on television?")
                .answerA("The Rubix Cube")
                .answerB("Mr. Potato Head")
                .answerC("Barbie")
                .answerD("A hula hoop")
                .correctAnswer("B")
                .hint("Use your head on this one")
                .lastUpdated(new Date())
                .build();
        QuizQuestion result = instance.getQuestionById(index);
        assertEquals("Quiz questions 1 do not match in ::getQuestion().", expResult.getId(), result.getId());
    }

    /**
     * Test of getRandomQuestion method, of class QuizQuestionArrayAccess.
     */
    @Test
    public void testGetRandomQuestion() {
        System.out.println("getRandomQuestion");
        QuizQuestionArrayAccess instance = new QuizQuestionArrayAccess();
        QuizQuestion result = instance.getRandomQuestion();
        assertNotNull("A random question was not returned in ::getRandomQuestion().", result);
    }

    /**
     * Test of getQuestionList method, of class QuizQuestionArrayAccess.
     */
    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        long offset = 0L;
        QuizQuestionArrayAccess instance = new QuizQuestionArrayAccess();
        List<QuizQuestion> result = instance.getQuestionList(offset);

        assertNotNull("Quiz question list not returned in ::getQuestionList.", result);
        assertEquals(10, result.size());
    }

    /**
     * Test of getQuestionListSize method, of class QuizQuestionArrayAccess.
     */
    @Test
    public void testGetQuestionListSize() {
        System.out.println("getQuestionListSize");
        QuizQuestionArrayAccess instance = new QuizQuestionArrayAccess();
        long expResult = 11;
        long result = instance.getQuestionListSize();
        assertEquals("There should only be 11 quiz questions in ::getQuestionListSize.", expResult, result);
    }

    @Test
    public void getQuestionsBySpecifiedList(){

        QuizQuestionArrayAccess instance = new QuizQuestionArrayAccess();

        List<QuizQuestion> questionList = instance.getSpecifiedQuestionList(0L, 1L, 2L);

        List<Long> actual = questionList.stream()
                .map(QuizQuestion::getId)
                .collect(Collectors.toList());

        List<Long> expected = Arrays.asList(0L, 1L, 2L);
        assertTrue(actual.containsAll(expected));

    }

}
