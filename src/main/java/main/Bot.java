package main;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import Model.ModelController;

public class Bot extends TelegramLongPollingBot{
	
	private String name = "";
	private String token = "";
	private ModelController model;

	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		
	}

	public String getBotUsername() {
		return name;
	}

	@Override
	public String getBotToken() {
		return token;
	}

}
