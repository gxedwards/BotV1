package org.gxe;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;


/**
 * Simple Bot to echo a message back to the user
 * The Bot username and token are obtained from the botfather
 * 
 * Following the instructions from https://monsterdeveloper.gitbooks.io/writing-telegram-bots-on-java/content/chapter1.html
 */
public class MyAmazingBot extends TelegramLongPollingBot{

    @Override
    public String getBotUsername() {
        return "gxe_echo_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {
    
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
    
            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
            try {
                sendMessage(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * You have to get the token from the BotFather. You register the 
     */
    @Override
    public String getBotToken() {
        // This is the bot gxe_echo_bot
        return "303690201:AAFKSNratsyxChnpRlr7mQgOMSY6Ui9NhTA";
    }
}
