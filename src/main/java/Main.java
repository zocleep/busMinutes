import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        final String TOKEN = InfoTaker.getInfoFromFile()[1];
        final String BOT_USERNAME = "zcwqBot";
        Bot bot = new Bot(TOKEN, BOT_USERNAME);
        bot.connect();
        System.out.println("Father ID: " + InfoTaker.getInfoFromFile()[0]);
    }

}


