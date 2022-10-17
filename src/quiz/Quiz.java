package quiz;

import shopping.Product;

import java.util.Scanner;

/**
 * To create a quiz and give the final score
 *
 * Quiz should be minimum of 5 questions
 * For each right answer = 1 point
 * For each negative answer = 0 points
 * Finally you have to display the correct answer and the total score.
 * Display the Result: PASS OR FAIL?
 *
 * Quiz example:
 * Display question to user like this:
 * a. What is the capital city of Estonia?
 * 1. Tallinn
 * 2. Tartu
 * 3. Pärnu
 * 4. Viljandi
 * Enter your answer: 2
 * b. What...
 * invalid answer, please enter the given option only
 * Total score: 4
 * The correct answers:
 *
 * 1. Display the correct answers for each question
 * 2. Calculate total score
 */
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE QUIZ");
        System.out.println("---------------------");

        int totalScore = 0;
        int rightAnswer = 1;
        boolean hasPassed;

        Question[] questions = getRandomQuestion();
        Answer[] userAnswers = new Answer[questions.length];

        // Display questions and options
        for (int j = 0; j < questions.length; j++) {
            Question question = questions[j];
            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ". " + question.getOptions()[i]);
            }

            System.out.println("Choose an option from above:");

            //Creating a user answer object and assign it to the userAnswer array
            Answer answer = new Answer();
            answer.setQuestionId(question.getId());
            answer.setCorrectOptionIndex(getAnswerOptions(question.getOptions().length));
            userAnswers[j] = answer;
        }

        Answer[] correctAnswers = getAnswers();


        // Total Score Calculation: Compare answerOptios of CorrectAnswer and the userAnswer
        for (Answer userAnswer : userAnswers) {
            for (Answer correctAnswer : correctAnswers) {
                if (correctAnswer.getQuestionId() == userAnswer.getQuestionId() && correctAnswer.getCorrectOptionIndex() == userAnswer.getCorrectOptionIndex()) {
                    totalScore += rightAnswer;
                }
            }
        }

        System.out.println("Total score: " + totalScore);

        //Pass score is 50%
        hasPassed = totalScore >= (double) questions.length / 2;

        System.out.println(hasPassed ? "PASSED!" : "FAILED!!");
    }



    private static Question[] getRandomQuestion() {

        Question question1 = new Question();
        question1.setId(10000L);
        question1.setDescription("What is the capital of Estonia?");
        question1.setOptions(new String[]{"Tallinn", "Tartu", "Narva"});

        Question question2 = new Question();
        question2.setId(10001L);
        question2.setDescription("What is the bigger lake in Estonia?");
        question2.setOptions(new String[]{"Peipsi", "Uljaste", "Võrtsjärv"});

        Question question3 = new Question();
        question3.setId(10002L);
        question3.setDescription("What is the national flower in Estonia?");
        question3.setOptions(new String[]{"Сornflower", "Сhamomile", "Dandelion"});

        Question question4 = new Question();
        question4.setId(10003L);
        question4.setDescription("How many wonders in the world?");
        question4.setOptions(new String[]{"3", "8", "7"});

        Question question5 = new Question();
        question5.setId(10004L);
        question5.setDescription("What is the favourite car of Estonia?");
        question5.setOptions(new String[]{"Skoda", "BMW", "Audi"});

        return new Question[]{question1, question2, question3, question4, question5};
    }

    private static Answer[] getAnswers() {
            Answer answer1 = new Answer();
            answer1.setId(20000L);
            answer1.setQuestionId(10000L);
            answer1.setCorrectOptionIndex(0);

            Answer answer2 = new Answer();
            answer2.setId(20001L);
            answer2.setQuestionId(10001L);
            answer2.setCorrectOptionIndex(0);

            Answer answer3 = new Answer();
            answer3.setId(20002L);
            answer3.setQuestionId(10003L);
            answer3.setCorrectOptionIndex(0);

            Answer answer4 = new Answer();
            answer4.setId(20003L);
            answer4.setQuestionId(10004L);
            answer4.setCorrectOptionIndex(2);

            Answer answer5 = new Answer();
            answer5.setId(20004L);
            answer5.setQuestionId(10005L);
            answer5.setCorrectOptionIndex(0);


            return new Answer[] {answer1, answer2, answer3, answer4, answer5};

        }
            private static int getAnswerOptions(int limit) {
                Scanner scanner = new Scanner(System.in);
                String errorMessage = "Incorrect answer! Please try again:";
                int option = limit + 1;
                do {
                    if (!scanner.hasNextInt()) {
                        System.out.println(errorMessage);
                        scanner.next();
                    } else {
                        option = scanner.nextInt(); // correct input
                        if (option > limit) {
                            System.out.println(errorMessage);
                        }
                    }
                } while (option > limit);
                return option;
            }

}













