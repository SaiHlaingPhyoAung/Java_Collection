package L6_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BotController {
    private Robot bot;
    private Scanner sc ;
    BotController(){
        bot = new Robot();
        sc = new Scanner(System.in);
    }

    public void doBusiness(){
        System.out.println("======================");
        System.out.println("=====Mr Bot===========");
        System.out.println("======================");

        while (true){
            System.out.print("You > ");
            String message = sc.nextLine();

            if ("Exit".equalsIgnoreCase(message)){
                break;
            }

            String result = bot.talk(message);
            System.out.printf("Bot > %s%n%n" , result);
        }
        System.out.println("Thank You");
    }
}


class Robot{
    private Map<String , String> dictionary;
    private String question;

    Robot(){
        dictionary = new HashMap<>();
        dictionary.put("name" , "Mr. Bot");
        question = null;
    }

    public String talk(String message){
        if (null != question){
            dictionary.put(question , message);
            question = null;
            return "Thank you for teaching me!";
        }
        String value = dictionary.get(message.toLowerCase());

        if (null != value){
            return value;
        }
        this.question = message.toLowerCase();

        return "I Have No Idea! Please Teach Me";
    }
}
