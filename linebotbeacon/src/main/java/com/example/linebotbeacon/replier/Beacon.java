package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.event.BeaconEvent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

import com.linecorp.bot.model.message.ImageMessage;
import java.net.URI;
import com.linecorp.bot.model.message.VideoMessage;

import com.example.linebotbeacon.replier.*;
public class Beacon implements Replier{

    private BeaconEvent event;

    public Beacon(BeaconEvent event){
        this.event = event;
    }

    @Override
    public Message reply() {

        String uriString = "";
        String preUriString = "";
        System.out.println("reply");
        //Beaconイベントの内容を文字列に変換する
        String eventStr = this.event.getBeacon().toString();
        String HWID = this.event.getBeacon().getHwid().toString();
        //String hwid = String.format("HWIDは%s", beacon);
        System.out.println("getHWID");
        //eventStrをBotで返信する(現在は未使用)
        //return new TextMessage(eventStr);
        //return new TextMessage(HWID);

        //↓ハードウェアID
        //本部棟
        String bitA = "017d5f4490";
        String bitB = "017d5de4b7";
        String bitC = "017d571d40";
        String bitD = "017d5edbcb";
        String bitJ = "017e14ae6b";
        //研究棟
        String bitE = "017d665d72";
        String bitF = "017d63cea1";
        String bitG = "017d6063b3";
        String bitH = "017d60f295";
        String bitI = "017d66ea3b";

        //if文でどのビーコンか判定
        if(HWID.equals(bitA)){
            ChoiceA choiceA = new ChoiceA("ビーコンB1");
            return choiceA.reply();

        }else if(HWID.equals(bitB)){
            ChoiceB choiceB = new ChoiceB("ビーコンB2");
            return choiceB.reply();

        }else if(HWID.equals(bitC)){
            ChoiceC choiceC = new ChoiceC("ビーコンH1");
            return choiceC.reply();

        }else if(HWID.equals(bitD)){
            ChoiceD choiceD = new ChoiceD("ビーコンH3");
            return choiceD.reply();

        }else if(HWID.equals(bitE)){
            ChoiceE choiceE = new ChoiceE("ビーコン玄関");
            return choiceE.reply();

        }else if(HWID.equals(bitF)){
            // 8/3
//            ChoiceF choiceF = new ChoiceF("ビーコンE2");
            // 8/4
            ChoiceF choiceF = new ChoiceF("ビーコンD1");
            return choiceF.reply();

        }else if(HWID.equals(bitG)){
            ChoiceG choiceG = new ChoiceG("ビーコンE1");
            return choiceG.reply();

        }else if(HWID.equals(bitH)){
            ChoiceH choiceH = new ChoiceH("ビーコンF2");
            return choiceH.reply();

        }else if(HWID.equals(bitI)){
            ChoiceI choiceI = new ChoiceI("ビーコンE3");
            return choiceI.reply();

        }else if(HWID.equals(bitJ)){
            ChoiceJ choiceJ = new ChoiceJ("ビーコンG2");
            return choiceJ.reply();

        } else{
            return new TextMessage(eventStr);
        }

    }
}