package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Button;
import com.linecorp.bot.model.message.flex.component.Separator;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.unit.FlexAdjustMode;
import com.linecorp.bot.model.message.flex.unit.FlexAlign;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;

import java.util.Arrays;

public class Choices implements Replier{
    private final String hwid;

    public Choices(String hwid) {
        this.hwid = hwid;
    }

    @Override
    public Message reply() {

        var hello = Text.builder()
                .text("目的地を選択して下さい\n↓")
                //.wrap(true)
                //.color("#add6ff")
                .build();

        var test0 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("大学紹介/B101",hwid+"からB101へ"))
                .build();

        var test1 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffb7ff")
                .action(new MessageAction("入試説明/B102",hwid+"からB102へ"))
                .build();

        var test2 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffd6ad")
                .action(new MessageAction("[保護者]大学紹介/H101",hwid+"からH101へ"))
                .build();

        var test3 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#adffad")
                .action(new MessageAction("模擬講義/平井准教授/B201",hwid+"からB201へ"))
                .build();

        var test4 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffffad")
                .action(new MessageAction("模擬講義/山田教授/B202",hwid+"からB202へ"))
                .build();

        var test5 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("模擬講義/高野准教授/H102",hwid+"からH102へ"))
                .build();

        var test6 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("講演/福田浩教授/B203",hwid+"からB203へ"))
                //.wrap(true)
                //.adjustMode(FlexAdjustMode.valueOf("shrink-to-fit"))
                //.height(Button.ButtonHeight.valueOf("sm"))
                .build();

        var test7 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffb7ff")
                .action(new MessageAction("キャンパスライフ紹介/B101",hwid+"からB101へ"))
                .build();

        var test8 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffd6ad")
                .action(new MessageAction("[保護者]講演/石田准教授/H101",hwid+"からH101へ"))
                .build();

        var test9 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("研究室紹介/高野研究室/H302",hwid+"からH302へ"))
                .build();

        var test10 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#b7dbff")
                .action(new MessageAction("研究室紹介/石田研究室/H304",hwid+"からH304へ"))
                .build();

        var test11 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("プログラミング体験/H102",hwid+"からH102へ"))
                .build();

        var test12 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("研究棟(D***,E***,F***)",hwid+"から研究棟へ"))
                .build();

        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(hello,test0,test1,test2,test3,test4,test5,test6,test7,test8,test9,test10,test11,test12))
                .build();

        var bubble = Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("目的地を選択してください",bubble);
    }

}


