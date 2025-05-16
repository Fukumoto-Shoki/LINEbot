package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.message.ImageMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.flex.component.Image;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Button;
import com.linecorp.bot.model.message.flex.component.Separator;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.unit.FlexAlign;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;

import java.net.URI;
import java.util.Arrays;

public class Gif implements Replier{
    @Override
    public Message reply() {

        var test = Text.builder()
                .text("テスト")
                .build();

        var gif = Image.builder()
                .url(URI.create("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgmWOTnxmgZcPPMQDsdSRUDWf2US9VU6LQThff15kjXQJvKJNm0NJzeSnQu6AzemGcKUEDT-xPJ1g8GHVm4Zo6dnskOQcUC3Ktfr5HzXdXdEmKJwlUIP1LPNnfOYUeseAkpftvGgU6_Pq7CbJ5Tmo4ly2X2ZJWNWQQePLcuCRKDzxwUGlfh19F2OvsnteM/s1600/sample5.png"))
                .animated(true)
                .build();

        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(test, gif))
                .build();

        var bubble = com.linecorp.bot.model.message.flex.container.Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("Gif", bubble);

        //var gifUrl = URI.create("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhQtCWActQT9gyhclpd2ounvrDsT396FZU53r3MkFyksRnyQlMK7mYQ1mv_lkt4ZW1rzUNraaoR6p0qZM0GSqxssa1iI0XyCfwDGwDCGaa-agfzIYRpDwJAmeUBFf5-2ITNQr5SYzlQOb-ID4PsgCGq7gT7L9RT0Jy7lDc-ftvDo4gbWMcXADjLl9EUttU/s500/qOZQBFCS9v3ILU4taA9A1713017680-1713017833.gif");
        //var previewImageUrl = URI.create("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhQtCWActQT9gyhclpd2ounvrDsT396FZU53r3MkFyksRnyQlMK7mYQ1mv_lkt4ZW1rzUNraaoR6p0qZM0GSqxssa1iI0XyCfwDGwDCGaa-agfzIYRpDwJAmeUBFf5-2ITNQr5SYzlQOb-ID4PsgCGq7gT7L9RT0Jy7lDc-ftvDo4gbWMcXADjLl9EUttU/s500/qOZQBFCS9v3ILU4taA9A1713017680-1713017833.gif");

        //return new ImageMessage(gifUrl, previewImageUrl);

    }
}
