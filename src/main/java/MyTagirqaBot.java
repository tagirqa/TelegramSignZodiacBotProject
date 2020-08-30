import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyTagirqaBot extends TelegramLongPollingBot {
    private static final String botToken = "";
    private static final String botName = "";
    private String sign;

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
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Телец":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Близнецы":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Рак":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Лев":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Дева":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Весы":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Скорпион":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Стрелец":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Козерог":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Водолей":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "Рыбы":

                    try {
                        execute(new SendMessage()
                                .setChatId(chatId)
                                .setText("hello!"));
                    } catch (TelegramApiException e) {
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
