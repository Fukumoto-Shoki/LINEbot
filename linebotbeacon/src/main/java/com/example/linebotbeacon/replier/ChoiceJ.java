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

public class ChoiceJ implements Replier{
    private final String hwid;

    public ChoiceJ(String hwid) {
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


        // 8/3, 8/4

        var info0 = Text.builder()
                .text("\n[キャンパスツアー]\n15:05~16:25")
                .wrap(true)
                .build();

        var test0 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("体育館(アリーナ)",hwid+"から体育館(アリーナ)へ"))
                .build();

        var info1 = Text.builder()
                .text("\n[プログラミング体験]\n15:15~16:15")
                .wrap(true)
                .build();

        var test1 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("H102",hwid+"からH102へ"))
                .build();

        var info2 = Text.builder()
                .text("\n[研究室紹介]　情報システム工学科\n小林研究室　15:15~15:40/16:05~16:30")
                .wrap(true)
                .build();

        var test2 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("H305",hwid+"からH305へ"))
                .build();

        var info3 = Text.builder()
                .text("\n[研究室紹介]　情報システム工学科\n三澤研究室　15:15~15:40/16:05~16:30")
                .wrap(true)
                .build();

        var test3 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("H103",hwid+"からH103へ"))
                .build();

        var info4 = Text.builder()
                .text("\n研究棟へ")
                .wrap(true)
                .build();

        var test4 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("研究棟(D***,E***,F***)",hwid+"から研究棟へ"))
                .build();

        var info5 = Text.builder()
                .text("\n本部棟玄関へ")
                .wrap(true)
                .build();

        var test5 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("本部棟玄関",hwid+"から本部棟玄関へ"))
                .build();


        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                // 8/3, 8/4
                .contents(Arrays.asList(hello,sepa,info0,test0,info1,test1,info2,test2,info3,test3,info4,test4,info5,test5))
                .build();

        var bubble = Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("目的地を選択してください",bubble);
    }

}