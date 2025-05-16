package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.message.ImageMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

import java.net.URI;
import java.util.Calendar;

public class Bus implements Replier {
    private final String text;

    public Bus(String text) {
        this.text = text;
    }

    @Override
    public Message reply() {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);

        if (hour == 0) {
            String uriString1 = "https://x.gd/RjgrN";
            URI uri1 = URI.create(uriString1);
            return new ImageMessage(uri1,uri1);
        }
        else if (hour == 1) {
            if (min < 55) {
                String uriString1 = "https://x.gd/RjgrN";
                URI uri1 = URI.create(uriString1);
                return new ImageMessage(uri1,uri1);
            }
            else {
                String uriString2 = "https://x.gd/RjgrN";
                URI uri2 = URI.create(uriString2);
                return new ImageMessage(uri2,uri2);
            }
        }
        else if (hour == 2) {
            if (min < 55) {
                String uriString2 = "https://x.gd/RjgrN";
                URI uri2 = URI.create(uriString2);
                return new ImageMessage(uri2,uri2);
            }
            else if (min < 58) {
                String uriString3 = "https://x.gd/RjgrN";
                URI uri3 = URI.create(uriString3);
                return new ImageMessage(uri3,uri3);
            }
            else {
                String uriString4 = "https://x.gd/RjgrN";
                URI uri4 = URI.create(uriString4);
                return new ImageMessage(uri4,uri4);
            }
        }
        else if (hour == 3) {
            if (min < 5) {
                String uriString4 = "https://x.gd/RjgrN";
                URI uri4 = URI.create(uriString4);
                return new ImageMessage(uri4,uri4);
            }
            else if (min < 25) {
                String uriString5 = "https://x.gd/RjgrN";
                URI uri5 = URI.create(uriString5);
                return new ImageMessage(uri5,uri5);
            }
            else if (min < 45) {
                String uriString6 = "https://x.gd/RjgrN";
                URI uri6 = URI.create(uriString6);
                return new ImageMessage(uri6,uri6);
            }
            else if (min < 52) {
                String uriString7 = "https://x.gd/RjgrN";
                URI uri7 = URI.create(uriString7);
                return new ImageMessage(uri7,uri7);
            }
            else if (min < 58) {
                String uriString8 = "https://x.gd/RjgrN";
                URI uri8 = URI.create(uriString8);
                return new ImageMessage(uri8,uri8);
            }
            else {
                String uriString9 = "https://x.gd/RjgrN";
                URI uri9 = URI.create(uriString9);
                return new ImageMessage(uri9,uri9);
            }
        }
        else if (hour == 4) {
            if (min < 35) {
                String uriString9 = "https://x.gd/RjgrN";
                URI uri9 = URI.create(uriString9);
                return new ImageMessage(uri9,uri9);
            }
            else if (min < 40) {
                String uriString10 = "https://x.gd/RjgrN";
                URI uri10 = URI.create(uriString10);
                return new ImageMessage(uri10,uri10);
            }
            else if (min < 56) {
                String uriString11 = "https://x.gd/RjgrN";
                URI uri11 = URI.create(uriString11);
                return new ImageMessage(uri11,uri11);
            }
            else {
                String uriString12 = "https://x.gd/RjgrN";
                URI uri12 = URI.create(uriString12);
                return new ImageMessage(uri12,uri12);
            }
        }
        else {
            String uriString12 = "https://x.gd/RjgrN";
            URI uri12 = URI.create(uriString12);
            return new ImageMessage(uri12,uri12);
        }
    }
}
