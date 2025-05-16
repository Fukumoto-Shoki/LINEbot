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
public class Choices2 implements Replier{
    private final String hwid;

    public Choices2(String hwid) {
        this.hwid = hwid;
    }

    @Override
    public Message reply() {

        var hello = Text.builder()
                .text("目的地を選択して下さい↓")
                .build();

        var test0 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#adffad")
                .action(new MessageAction("研究室紹介/梅村研究室/E304",hwid+"からE304へ"))
                .build();

        var test1 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#b7ffb7")
                .action(new MessageAction("研究室紹介/高田研究室/E308",hwid+"からE308へ"))
                .build();

        var test2 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffffad")
                .action(new MessageAction("研究室紹介/福田(誠)研/E112",hwid+"からE112へ"))
                .build();

        var test3 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffffc1")
                .action(new MessageAction("研究室紹介/小田(久)研/E310",hwid+"からE310へ"))
                .build();

        var test4 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#adffad")
                .action(new MessageAction("化学系実験/LABOCIST/D106",hwid+"からD106へ"))
                .build();

        var test5 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffffad")
                .action(new MessageAction("物理系実験/理科工房/D105",hwid+"からD105へ"))
                .build();

        var test6 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("講演/福田浩教授/F203",hwid+"からF203へ"))
                .build();

        var test7 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffb7ff")
                .action(new MessageAction("動画投影/入試説明/F203",hwid+"からF203へ"))
                .build();

        var test8 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("教職課程紹介/近藤教授/F204",hwid+"からF204へ"))
                .build();

        var test9 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffb7ff")
                .action(new MessageAction("本部棟・情報棟(B***,H***)",hwid+"から本部棟・情報棟へ"))
                .build();

        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(hello,test0,test1,test2,test3,test4,test5,test6,test7,test8,test9))
                .build();

        var bubble = Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("目的地を選択してください",bubble);
    }

}
