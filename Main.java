package com.jakestumph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1 = "What is the true identity of Sailor Moon?\n"
                + "(A) Usagi Tsukino\n(B) Ami Mizuno\n(C) Rei Hino\n(D) Makoto Kino";

        String q2 = "Which Pokemon is the mascot for the titular anime?\n"
                + "(A) Eevee\n(B) Nidoran\n(C) Pikachu\n(D) Mewtwo";

        String q3 = "Which Nintendo series involves multiple characters brawling on screen against one another?\n"
                + "(A) Mario Kart\n(B) The Legend of Zelda\n(C) Street Fighter\n(D) Super Smash Bros.";

        String q4 = "What is the best-selling game of all time on the original Sony Playstation?\n"
                + "(A) Final Fantasy VII\n(B) Gran Turismo\n(C) Gran Turismo 2\n(D) Final Fantasy VIII";

        String q5 = "Which popular gaming console released first?\n"
                + "(A) Nintendo GameCube\n(B) Sony Playstation 2\n(C) Microsoft XBOX\n(D) Sega DreamCast";


        Question[] questions = {
                new Question(q1, "A"),
                new Question(q2, "C"),
                new Question(q3, "D"),
                new Question(q4, "B"),
                new Question(q5, "D")
        };
        takeTest(questions);
    }

    public static void takeTest(Question[] questions){
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = scanner.nextLine().toUpperCase();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You scored: " + score + " out of " + questions.length);
    }
}
