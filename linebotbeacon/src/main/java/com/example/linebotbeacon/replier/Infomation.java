package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

public class Infomation implements Replier{

    private final String text;

    public Infomation(String text) {
        this.text = text;
    }

    @Override
    public Message reply() {
        String message = text + "のルートはこちら↓";
        return new TextMessage(message);
    }
}
