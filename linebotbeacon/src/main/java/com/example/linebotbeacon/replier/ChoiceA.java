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

public class ChoiceA implements Replier{
    private final String hwid;

    public ChoiceA(String hwid) {
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
//                .text("\n[模擬講義]　応用化学生物学科\n「量子の世界の磁石のはなし」\n脇坂准教授　14:00~14:50")
//                .wrap(true)
//                .build();
//
//        var test0 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#adffad")
//                .action(new MessageAction("B201",hwid+"からB201へ"))
//                .build();
//
//        var info1 = Text.builder()
//                .text("\n[模擬講義]　電子光工学科\n「エレクトロニクス社会の基礎を支える物理現象」\n長谷川教授　14:00~14:50")
//                .wrap(true)
//                .build();
//
//        var test1 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffffad")
//                .action(new MessageAction("B202",hwid+"からB202へ"))
//                .build();
//
//        var info2 = Text.builder()
//                .text("\n[模擬講義]　情報システム工学科\n「高校と大学の情報教育について」\n石田准教授　14:00~14:50")
//                .wrap(true)
//                .build();
//
//        var test2 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#add6ff")
//                .action(new MessageAction("G201",hwid+"からG201へ"))
//                .build();
//
//        var info3 = Text.builder()
//                .text("\n[講演]千歳シリコンリサーチセンター\n「半導体への誘い」\n山田教授　14:00~14:50")
//                .wrap(true)
//                .build();
//
//        var test3 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("B203",hwid+"からB203へ"))
//                .build();
//
//        var info4 = Text.builder()
//                .text("\n[小論文対策講座]共通教育科\n「根拠ある「意見」を示そう」\n山下准教授　14:00~14:50")
//                .wrap(true)
//                .build();
//
//        var test4 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("B204",hwid+"からB204へ"))
//                .build();
//
//        var info5 = Text.builder()
//                .text("\n[講演]★保護者向け　共通教育科\n「就活体験談からみえる本学のキャリア支援」\n本学キャリアアドバイザー田村氏　14:00~14:50")
//                .wrap(true)
//                .build();
//
//        var test5 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("H101",hwid+"からH101へ"))
//                .build();
//
//        var info6 = Text.builder()
//                .text("\n[プログラミング体験]\n15:15~16:15")
//                .wrap(true)
//                .build();
//
//        var test6 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#add6ff")
//                .action(new MessageAction("H102",hwid+"からH102へ"))
//                .build();
//
//        var info7 = Text.builder()
//                .text("\n[研究室紹介]　情報システム工学科\n小林研究室　15:15~15:40/16:05~16:30")
//                .wrap(true)
//                .build();
//
//        var test7 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#add6ff")
//                .action(new MessageAction("H305",hwid+"からH305へ"))
//                .build();
//
//        var info8 = Text.builder()
//                .text("\n[研究室紹介]　情報システム工学科\n三澤研究室　15:15~15:40/16:05~16:30")
//                .wrap(true)
//                .build();
//
//        var test8 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#add6ff")
//                .action(new MessageAction("H103",hwid+"からH103へ"))
//                .build();
//
//        var info9 = Text.builder()
//                .text("\n研究棟へ")
//                .wrap(true)
//                .build();
//
//        var test9 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("研究棟(D***,E***,F***)",hwid+"から研究棟へ"))
//                .build();
//
//        var info10 = Text.builder()
//                .text("\n本部棟玄関へ")
//                .wrap(true)
//                .build();
//
//        var test10 = Button.builder()
//                .style(Button.ButtonStyle.SECONDARY)
//                .color("#ffadff")
//                .action(new MessageAction("本部棟玄関",hwid+"から本部棟玄関へ"))
//                .build();


        // 8/4

        var info0 = Text.builder()
                .text("\n[模擬講義]　応用化学生物学科\n「診断用酵素の開発」\n松井准教授　14:00~14:50")
                .wrap(true)
                .build();

        var test0 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#adffad")
                .action(new MessageAction("B201",hwid+"からB201へ"))
                .build();

        var info1 = Text.builder()
                .text("\n[模擬講義]　電子光工学科\n「環境再生型農業への取り組み」\n髙島准教授　14:00~14:50")
                .wrap(true)
                .build();

        var test1 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffffad")
                .action(new MessageAction("B202",hwid+"からB202へ"))
                .build();

        var info2 = Text.builder()
                .text("\n[模擬講義]　情報システム工学科\n「高校と大学の情報教育について」\n石田准教授　14:00~14:50")
                .wrap(true)
                .build();

        var test2 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("G201",hwid+"からG201へ"))
                .build();

        var info3 = Text.builder()
                .text("\n[講演]千歳シリコンリサーチセンター\n「半導体への誘い」\n山田教授　14:00~14:50")
                .wrap(true)
                .build();

        var test3 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("B203",hwid+"からB203へ"))
                .build();

        var info4 = Text.builder()
                .text("\n[講演]★保護者向け　共通教育科\n「高等学校教育改革に接続した本学の特色ある教育活動について」\n近藤教授　14:00~14:50")
                .wrap(true)
                .build();

        var test4 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("H101",hwid+"からH101へ"))
                .build();

        var info5 = Text.builder()
                .text("\n[プログラミング体験]\n15:15~16:15")
                .wrap(true)
                .build();

        var test5 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("H102",hwid+"からH102へ"))
                .build();

        var info6 = Text.builder()
                .text("\n[研究室紹介]　情報システム工学科\n小林研究室　15:15~15:40/16:05~16:30")
                .wrap(true)
                .build();

        var test6 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("H305",hwid+"からH305へ"))
                .build();

        var info7 = Text.builder()
                .text("\n[研究室紹介]　情報システム工学科\n三澤研究室　15:15~15:40/16:05~16:30")
                .wrap(true)
                .build();

        var test7 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#add6ff")
                .action(new MessageAction("H103",hwid+"からH103へ"))
                .build();

        var info8 = Text.builder()
                .text("\n研究棟へ")
                .wrap(true)
                .build();

        var test8 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("研究棟(D***,E***,F***)",hwid+"から研究棟へ"))
                .build();

        var info9 = Text.builder()
                .text("\n本部棟玄関へ")
                .wrap(true)
                .build();

        var test9 = Button.builder()
                .style(Button.ButtonStyle.SECONDARY)
                .color("#ffadff")
                .action(new MessageAction("本部棟玄関",hwid+"から本部棟玄関へ"))
                .build();



        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                // 8/3
//                .contents(Arrays.asList(hello,sepa,info0,test0,info1,test1,info2,test2,info3,test3,info4,test4,info5,test5,info6,test6,info7,test7,info8,test8,info9,test9,info10,test10))
                // 8/4
                .contents(Arrays.asList(hello,sepa,info0,test0,info1,test1,info2,test2,info3,test3,info4,test4,info5,test5,info6,test6,info7,test7,info8,test8,info9,test9))
                .build();

        var bubble = Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("目的地を選択してください",bubble);
    }

}