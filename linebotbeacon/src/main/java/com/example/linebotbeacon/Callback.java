package com.example.linebotbeacon;

import com.example.linebotbeacon.replier.*;
import com.linecorp.bot.model.event.BeaconEvent;
import com.linecorp.bot.model.event.FollowEvent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.event.MessageEvent;

import java.util.List;

@LineMessageHandler
public class Callback {

    private static final Logger log = LoggerFactory.getLogger(Callback.class);

    // フォローイベントに対応する
    @EventMapping
    public Message handleFollow(FollowEvent event) {
        // 実際はこのタイミングでフォロワーのユーザIDをデータベースにに格納しておくなど
        Follow follow = new Follow(event);
        return follow.reply();
    }



    //test24/01/25MessageをList型に変更
    // 文章で話しかけられたとき（テキストメッセージのイベント）に対応する
    @EventMapping
    public List<Message> handleMessage(MessageEvent<TextMessageContent> event) {
        TextMessageContent tmc = event.getMessage();
        String text = tmc.getText();
        switch (text){
            /*case"バブル":
                BubbleSample bubbleSample = new BubbleSample();
                return List.of(bubbleSample.reply());*/

            /*case"チョイス":
                Choices choices = new Choices("ビーコンA");
                return List.of(choices.reply());

            case"ちょいす":
                Choices2 choices2 = new Choices2("ビーコンF");
                return List.of(choices2.reply());*/

            case"B1":
                ChoiceA choiceA = new ChoiceA("ビーコンB1");
                return List.of(choiceA.reply());

            case"B2":
                ChoiceB choiceB = new ChoiceB("ビーコンB2");
                return List.of(choiceB.reply());

            case"G2":
                ChoiceJ choiceJ = new ChoiceJ("ビーコンG2");
                return List.of(choiceJ.reply());

            case"H1":
                ChoiceC choiceC = new ChoiceC("ビーコンH1");
                return List.of(choiceC.reply());

            case"H3":
                ChoiceD choiceD = new ChoiceD("ビーコンH3");
                return List.of(choiceD.reply());

            case"玄関":
                ChoiceE choiceE = new ChoiceE("ビーコン玄関");
                return List.of(choiceE.reply());

            case"E2":
                ChoiceF choiceF1 = new ChoiceF("ビーコンE2");
                return List.of(choiceF1.reply());

            case"D1":
                ChoiceF choiceF2 = new ChoiceF("ビーコンD1");
                return List.of(choiceF2.reply());

            case"E1":
                ChoiceG choiceG = new ChoiceG("ビーコンE1");
                return List.of(choiceG.reply());

            case"F2":
                ChoiceH choiceH = new ChoiceH("ビーコンF2");
                return List.of(choiceH.reply());

            case"E3":
                ChoiceI choiceI = new ChoiceI("ビーコンE3");
                return List.of(choiceI.reply());

            case"ビーコンB1からB201へ", "ビーコンB1からB202へ","ビーコンB1からB203へ","ビーコンB1からG201へ","ビーコンB1からB204へ","ビーコンB1からH101へ","ビーコンB1からH102へ","ビーコンB1からH305へ","ビーコンB1からH103へ","ビーコンB1から研究棟へ","ビーコンB1から本部棟玄関へ"
                    ,"ビーコンB2から体育館(アリーナ)へ","ビーコンB2からH102へ","ビーコンB2からH305へ","ビーコンB2からH103へ","ビーコンB2から研究棟へ","ビーコンB2から本部棟玄関へ"
                    ,"ビーコンG2から体育館(アリーナ)へ","ビーコンG2からH102へ","ビーコンG2からH305へ","ビーコンG2からH103へ","ビーコンG2から研究棟へ","ビーコンG2から本部棟玄関へ"
                    ,"ビーコンH1から体育館(アリーナ)へ","ビーコンH1からH305へ","ビーコンH1から研究棟へ","ビーコンH1から本部棟玄関へ"
                    ,"ビーコンH3からH103へ","ビーコンH3から研究棟へ","ビーコンH3から本部棟玄関へ"
                    ,"ビーコン玄関からE210へ","ビーコン玄関からE205へ","ビーコン玄関からE306へ","ビーコン玄関からE107へ","ビーコン玄関からF203へ","ビーコン玄関からD106へ","ビーコン玄関からD105へ"
                    ,"ビーコン玄関からE301へ","ビーコン玄関からE101へ","ビーコン玄関からE103へ","ビーコン玄関からE302へ","ビーコン玄関からF204へ"
                    ,"ビーコンE2からE306へ","ビーコンE2からE107へ","ビーコンE2からF203へ","ビーコンE2から本部棟・情報棟へ","ビーコンE2から研究棟玄関へ"
                    ,"ビーコンD1からF204へ","ビーコンD1から本部棟・情報棟へ","ビーコンD1から研究棟玄関へ"
                    ,"ビーコンE1からE210へ","ビーコンE1からE205へ","ビーコンE1からE306へ","ビーコンE1からF203へ","ビーコンE1から本部棟・情報棟へ","ビーコンE1から研究棟玄関へ"
                    ,"ビーコンE1からE301へ","ビーコンE1からE302へ","ビーコンE1からF204へ"
                    ,"ビーコンF2からE210へ","ビーコンF2からE205へ","ビーコンF2からE306へ","ビーコンF2からE107へ","ビーコンF2から本部棟・情報棟へ","ビーコンF2から研究棟玄関へ"
                    ,"ビーコンF2からE301へ","ビーコンF2からE101へ","ビーコンF2からE103へ","ビーコンF2からE302へ"
                    ,"ビーコンE3からE210へ","ビーコンE3からE205へ","ビーコンE3からE107へ","ビーコンE3からF203へ","ビーコンE3から本部棟・情報棟へ","ビーコンE3から研究棟玄関へ"
                    ,"ビーコンE3からE101へ","ビーコンE3からE103へ","ビーコンE3からF204へ":
                Infomation infomation = new Infomation(text);
                Maps maps = new Maps(text);
                Video video = new Video(text);
                return List.of(infomation.reply(),maps.reply(),video.reply());

            /*case"ビーコンB1から研究棟へ","ビーコンB1から本部棟玄関へ","ビーコンB2から研究棟へ","ビーコンB2から本部棟玄関へ","ビーコンH1から研究棟へ","ビーコンH1から本部棟玄関へ","ビーコンH3から研究棟へ","ビーコンH3から本部棟玄関へ":
                Infomation infomation1 = new Infomation(text);
                Maps maps1 = new Maps(text);
                Video video1 = new Video(text);
                Bus bus = new Bus(text);
                return List.of(infomation1.reply(),maps1.reply(),video1.reply(),bus.reply());*/

            /*case"ビーコン玄関から本部棟・情報棟へ":
                Infomation infomation1 = new Infomation(text);
                Maps maps1 = new Maps(text);
                return List.of(infomation1.reply(),maps1.reply());*/


            /*case "カルーセル":
                //MapCarousel mapCarousel = new MapCarousel();
                //return mapCarousel.reply();
                CarouselSample carouselSample = new CarouselSample();
                return List.of(carouselSample.reply());*/

            default:
                //Parrot parrot = new Parrot(event);
                //return List.of(parrot.reply());
                return null;
        }
    }

    //BeaconEventに対応する
    @EventMapping
    public Message handleBeacon(BeaconEvent event){
        System.out.println("correct");
        Beacon beacon = new Beacon(event);
        return beacon.reply();
    }

}