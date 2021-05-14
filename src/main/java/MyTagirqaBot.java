import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class MyTagirqaBot extends TelegramLongPollingBot {
    private String botToken;
    private String botName;

    private String sign;
    private String aries = "https://horo.mail.ru/prediction/aries/today/";
    private String taurus = "https://horo.mail.ru/prediction/taurus/today/";
    private String gemini = "https://horo.mail.ru/prediction/gemini/today/";
    private String cancer = "https://horo.mail.ru/prediction/cancer/today/";
    private String leo = "https://horo.mail.ru/prediction/leo/today/";
    private String virgo = "https://horo.mail.ru/prediction/virgo/today/";
    private String libra = "https://horo.mail.ru/prediction/libra/today/";
    private String scorpio = "https://horo.mail.ru/prediction/scorpio/today/";
    private String sagittarius = "https://horo.mail.ru/prediction/sagittarius/today/";
    private String capricorn = "https://horo.mail.ru/prediction/capricorn/today/";
    private String aquarius = "https://horo.mail.ru/prediction/aquarius/today/";
    private String pisces = "https://horo.mail.ru/prediction/pisces/today/";


    public MyTagirqaBot() {
        FileInputStream fis;
        Properties prop = new Properties();
        try {
            fis = new FileInputStream("config.properties");
            prop.load(fis);

            this.botToken = prop.getProperty("bot_token");
            this.botName = prop.getProperty("bot_name");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {

            // логирование
            String userFirstName = update.getMessage().getChat().getFirstName();
            String userLastName = update.getMessage().getChat().getLastName();
            String userUserName = update.getMessage().getChat().getUserName();
            long userId = update.getMessage().getChat().getId();


            // Set variables
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
//            String answer = messageText;
//
//            SendMessage message = new SendMessage() // Create a message object object
//                    .setChatId(chatId)
//                    .setText(messageText);
//            log(userFirstName, userLastName, Long.toString(userId), messageText, answer);
//            try {
//                execute(message); // Sending our message object to user
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
            if (messageText.equals("/start")) {
                SendMessage message = new SendMessage()
                        .setChatId(chatId)
                        .setText("Here is your keyboard");

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

                List<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

                KeyboardRow row = new KeyboardRow();
                row.add("Овен");
                row.add("Телец");
                row.add("Близнецы");
                keyboard.add(row);

                row = new KeyboardRow();
                row.add("Рак");
                row.add("Лев");
                row.add("Дева");
                keyboard.add(row);

                row = new KeyboardRow();
                row.add("Весы");
                row.add("Скорпион");
                row.add("Стрелец");
                keyboard.add(row);

                row = new KeyboardRow();
                row.add("Козерог");
                row.add("Водолей");
                row.add("Рыбы");
                keyboard.add(row);

                keyboardMarkup.setKeyboard(keyboard);

                message.setReplyMarkup(keyboardMarkup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            switch (messageText) {
                case "Овен":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(aries)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Телец":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(taurus)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Близнецы":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(gemini)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Рак":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(cancer)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Лев":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(leo)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Дева":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(virgo)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Весы":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(libra)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Скорпион":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(scorpio)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Стрелец":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(sagittarius)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Козерог":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(capricorn)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Водолей":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(aquarius)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Рыбы":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText(ParserSite.textToTelegram(pisces)));
                    } catch (TelegramApiException | IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }


    }




    private void log(String firstName, String lastName, String userId, String txt, String botAnswer) {
        System.out.println("\n ----------------------------");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Message from " + firstName + " " + lastName
                + ". (id = " + userId + ") \n Text - " + txt);
        System.out.println("Bot answer: \n Text - " + botAnswer);
    }


    public String getBotUsername() {
        return botName;
    }

    public String getBotToken() {
        return botToken;
    }


}
