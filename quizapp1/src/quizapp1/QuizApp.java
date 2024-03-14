package quizapp1;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Quiz[] quizzes = {
            new Quiz("byte型の表現できる値の範囲は？", new String[]{"1. -128～127", "2. -526～525", "3. 0～65535", "4. -1028～1027"}, "1"),
            new Quiz("識別子について間違っているものは？", new String[]{"1. 1文字目はa-z A-Z $ _ のみ", "2. varは使用可", "3. 大文字・小文字は厳密に区別されない", 
            			"4. 予約後 null true false使用不可"}, "3"),
            new Quiz("", new String[]{"1. ", "2. ", "3. ", "4. "}, ""),
            new Quiz("", new String[]{"1. ", "2. ", "3. ", "4. "}, ""),
            new Quiz("", new String[]{"1. ", "2. ", "3. ", "4. "}, "")
        };

        System.out.println("Javaのクイズ開始");
        
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for(Quiz quiz : quizzes) {
            System.out.println(quiz.getQuestion());
            for(String choice : quiz.getChoices()) {
                System.out.println(choice);
            }
            System.out.print("あなたの回答は？");
            String userAnswer = scanner.nextLine();

            if(userAnswer.equals(quiz.getAnswer())) {
                System.out.println("正解");
                score++;
            } else {
                System.out.println("不正解 この答えは " + quiz.getAnswer());
            }
        }

        System.out.println("Your score is: " + score + "/" + quizzes.length);
        scanner.close(); //リソースの解放
    }
}