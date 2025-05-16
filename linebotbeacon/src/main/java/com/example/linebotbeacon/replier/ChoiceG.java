package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.flex.component.*;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.unit.FlexAdjustMode;
import com.linecorp.bot.model.message.flex.unit.FlexAlign;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;

import java.util.Arrays;

public class ChoiceG implements Replier{
    private final String hwid;

    public ChoiceG(String hwid) {
        this.hwid = hwid;
    }

    @Override
    public Message reply() {

        var hello = Text.builder()
                .text("【" + hwid + "】を検知しました！\n目的地を選択して下さい\n↓")
                .wrap(true)
                .build();

        var sepa = Separator.builder()
                .build();


        // 8/3

//        var info0 = Text.builder()
//                .text("\n[研究室紹介]　応用化学生物学科\n大越研究室　15:15~15:40/16:05~16:30")
//                .wrap(true)
//                .build();
//
//        var test0 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#adffad")
//                .action(new MessageAction("E210",hwid+"からE210へ"))
//                .build();
//
//        var info1 = Text.builder()
//                .text("\n[研究室紹介]　応用化学生物学科\n井出研究室　15:15~15:40/16:05~16:30")
//                .wrap(true)
//                .build();
//
//        var test1 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#adffad")
//                .action(new MessageAction("E205",hwid+"からE205へ"))
//                .build();
//
//        var info2 = Text.builder()
//                .text("\n[研究室紹介]　電子光工学科\n春田研究室　15:15~15:40/16:05~16:30")
//                .wrap(true)
//                .build();
//
//        var test2 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffffad")
//                .action(new MessageAction("E306",hwid+"からE306へ"))
//                .build();
//
//        var info3 = Text.builder()
//                .text("\n[講演]千歳シリコンリサーチセンター\n「半導体が拓く未来」\n山田崇史教授　15:15~15:40")
//                .wrap(true)
//                .build();
//
//        var test3 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("F203",hwid+"からF203へ"))
//                .build();
//
//        var info4 = Text.builder()
//                .text("\n[動画投映]　入試説明\n15:50~16:20")
//                .wrap(true)
//                .build();
//
//        var test4 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("F203",hwid+"からF203へ"))
//                .build();
//
//        var info5 = Text.builder()
//                .text("\n本部棟・情報棟へ")
//                .wrap(true)
//                .build();
//
//        var test5 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("本部棟・情報棟(B***,H***)",hwid+"から本部棟・情報棟へ"))
//                .build();
//
//        var info6 = Text.builder()
//                .text("\n研究棟玄関へ")
//                .wrap(true)
//                .build();
//
//        var test6 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("研究棟玄関",hwid+"から研究棟玄関へ"))
//                .build();



        // 8/4

        var info0 = Text.builder()
                .text("\n[研究室紹介]　応用化学生物学科\nカートハウス研究室　15:15~15:40/16:05~16:30")
                .wrap(true)
                .build();

        var test0 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#adffad")
                .action(new MessageAction("E301",hwid+"からE301へ"))
                .build();

        var info1 = Text.builder()
                .text("\n[研究室紹介]　電子光工学科\n小田(尚)研究室　15:15~15:40/16:05~16:30")
                .wrap(true)
                .build();

        var test1 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffffad")
                .action(new MessageAction("E302",hwid+"からE302へ"))
                .build();

        var info2 = Text.builder()
                .text("\n[講演]千歳シリコンリサーチセンター\n「半導体が拓く未来」\n山田教授　15:15~15:40")
                .wrap(true)
                .build();

        var test2 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("F203",hwid+"からF203へ"))
                .build();

        var info3 = Text.builder()
                .text("\n[動画投映]　入試説明\n15:50~16:20")
                .wrap(true)
                .build();

        var test3 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("F203",hwid+"からF203へ"))
                .build();

        var info4 = Text.builder()
                .text("\n[教職課程紹介]\n近藤教授　16:05~16:30")
                .wrap(true)
                .build();

        var test4 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("F204",hwid+"からF204へ"))
                .build();

        var info5 = Text.builder()
                .text("\n本部棟・情報棟へ")
                .wrap(true)
                .build();

        var test5 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("本部棟・情報棟(B***,H***)",hwid+"から本部棟・情報棟へ"))
                .build();

        var info6 = Text.builder()
                .text("\n研究棟玄関へ")
                .wrap(true)
                .build();

        var test6 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("研究棟玄関",hwid+"から研究棟玄関へ"))
                .build();



        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                // 8/3, 8/4
                .contents(Arrays.asList(hello,sepa,info0,test0,info1,test1,info2,test2,info3,test3,info4,test4,info5,test5,info6,test6))
                .build();

        var bubble = Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("目的地を選択してください",bubble);
    }

}