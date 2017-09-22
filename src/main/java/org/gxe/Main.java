package org.gxe;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
/** 
 * This is how we run the bot that was created
 */
public class Main {
    public static void main(String[] args) {

        // Initialize Api Context
        ApiContextInitializer.init();

        // Instantiate Telegram Bots API
        TelegramBotsApi botsAPI = new TelegramBotsApi();

        // Register our bot
        try {
            botsAPI.registerBot(new MyAmazingBot());
            
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
}

