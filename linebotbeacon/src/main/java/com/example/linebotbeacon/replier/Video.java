package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

public class Video implements Replier {
    private final String text;

    public Video (String text) {
        this.text = text;
    }

    @Override
    public Message reply() {
        switch (text) {
            case "ビーコンB1からB201へ":
                String url1 = "案内補助動画はこちら↓\nhttps://x.gd/TuOe1";
                return new TextMessage(url1);

            case "ビーコンB1からB202へ":
                String url2 = "案内補助動画はこちら↓\nhttps://x.gd/wjL7k";
                return new TextMessage(url2);

            case "ビーコンB1からG201へ":
                String url50 = "案内補助動画はこちら↓\nhttps://x.gd/RAkV3";
                return new TextMessage(url50);

            case "ビーコンB1からH102へ":
                String url3 = "案内補助動画はこちら↓\nhttps://x.gd/bfigQ";
                return new TextMessage(url3);

            case "ビーコンB1からB203へ":
                String url4 = "案内補助動画はこちら↓\nhttps://x.gd/VLr61";
                return new TextMessage(url4);

            case "ビーコンB1からB204へ":
                String url71 = "案内補助動画はこちら↓\nhttps://x.gd/k4r8o";
                return new TextMessage(url71);

            case "ビーコンB1からH101へ":
                String url5 = "案内補助動画はこちら↓\nhttps://x.gd/B8LcQH";
                return new TextMessage(url5);

            case "ビーコンB1からH305へ":
                String url6 = "案内補助動画はこちら↓\nhttps://x.gd/mpsX4";
                return new TextMessage(url6);

            case "ビーコンB1からH103へ":
                String url7 = "案内補助動画はこちら↓\nhttps://x.gd/rzFD1";
                return new TextMessage(url7);

            case "ビーコンB1から研究棟へ","ビーコンB1から本部棟玄関へ":
                String url8 = "案内補助動画はこちら↓\nhttps://x.gd/hIIJn";
                return new TextMessage(url8);



            case "ビーコンB2から体育館(アリーナ)へ":
                String url9 = "案内補助動画はこちら↓\nhttps://x.gd/Gzy5r";
                return new TextMessage(url9);

            case "ビーコンB2からH102へ":
                String url10 = "案内補助動画はこちら↓\nhttps://x.gd/qYtOu";
                return new TextMessage(url10);

            case "ビーコンB2からH305へ":
                String url11 = "案内補助動画はこちら↓\nhttps://x.gd/oWdq3";
                return new TextMessage(url11);

            case "ビーコンB2からH103へ":
                String url12 = "案内補助動画はこちら↓\nhttps://x.gd/OUh4Y";
                return new TextMessage(url12);

            case "ビーコンB2から研究棟へ","ビーコンB2から本部棟玄関へ":
                String url13 = "案内補助動画はこちら↓\nhttps://x.gd/LyOBQ";
                return new TextMessage(url13);



            case "ビーコンG2から体育館(アリーナ)へ":
                String url51 = "案内補助動画はこちら↓\nhttps://x.gd/iOFzc";
                return new TextMessage(url51);

            case "ビーコンG2からH102へ":
                String url52 = "案内補助動画はこちら↓\nhttps://x.gd/XG4Xv";
                return new TextMessage(url52);

            case "ビーコンG2からH305へ":
                String url53 = "案内補助動画はこちら↓\nhttps://x.gd/gjc1k";
                return new TextMessage(url53);

            case "ビーコンG2からH103へ":
                String url54 = "案内補助動画はこちら↓\nhttps://x.gd/3iegk";
                return new TextMessage(url54);

            case "ビーコンG2から研究棟へ","ビーコンG2から本部棟玄関へ":
                String url55 = "案内補助動画はこちら↓\nhttps://x.gd/xW4OW";
                return new TextMessage(url55);




            case "ビーコンH1から体育館(アリーナ)へ":
                String url14 = "案内補助動画はこちら↓\nhttps://x.gd/rf0ej";
                return new TextMessage(url14);

            case "ビーコンH1からH305へ":
                String url15 = "案内補助動画はこちら↓\nhttps://x.gd/dyq4I";
                return new TextMessage(url15);

            /*case "ビーコンH1からH304へ":
                String url16 = "案内補助動画はこちら↓\nhttps://x.gd/eSxF7";
                return new TextMessage(url16);*/

            case "ビーコンH1から研究棟へ","ビーコンH1から本部棟玄関へ":
                String url17 = "案内補助動画はこちら↓\nhttps://x.gd/roCR0";
                return new TextMessage(url17);



            case "ビーコンH3からH103へ":
                String url56 = "案内補助動画はこちら↓\nhttps://x.gd/Vzzrk";
                return new TextMessage(url56);

            case "ビーコンH3から研究棟へ","ビーコンH3から本部棟玄関へ":
                String url18 = "案内補助動画はこちら↓\nhttps://x.gd/SJ4L2";
                return new TextMessage(url18);



            case "ビーコン玄関からE210へ":
                String url19 = "案内補助動画はこちら↓\nhttps://x.gd/UpLJe";
                return new TextMessage(url19);

            case "ビーコン玄関からE205へ":
                String url20 = "案内補助動画はこちら↓\nhttps://x.gd/2X1rt";
                return new TextMessage(url20);

            case "ビーコン玄関からE306へ":
                String url21 = "案内補助動画はこちら↓\nhttps://x.gd/3U2Ut";
                return new TextMessage(url21);

            case "ビーコン玄関からE107へ":
                String url22 = "案内補助動画はこちら↓\nhttps://x.gd/9RDjb";
                return new TextMessage(url22);

            case "ビーコン玄関からF203へ":
                String url23 = "案内補助動画はこちら↓\nhttps://x.gd/gczNh";
                return new TextMessage(url23);

            case "ビーコン玄関からD106へ":
                String url24 = "案内補助動画はこちら↓\nhttps://x.gd/szkIg";
                return new TextMessage(url24);

            case "ビーコン玄関からD105へ":
                String url25 = "案内補助動画はこちら↓\nhttps://x.gd/yS2xF";
                return new TextMessage(url25);

            case "ビーコン玄関からF204へ":
                String url26 = "案内補助動画はこちら↓\nhttps://x.gd/LCkO8";
                return new TextMessage(url26);

            /*case "ビーコン玄関から本部棟・情報棟へ":
                String url27= "案内補助動画はこちら↓\nhttps://x.gd/9cYbt";
                return new TextMessage(url27);*/

            case "ビーコン玄関からE301へ":
                String url57 = "案内補助動画はこちら↓\nhttps://x.gd/u0GWO";
                return new TextMessage(url57);

            case "ビーコン玄関からE101へ":
                String url58 = "案内補助動画はこちら↓\nhttps://x.gd/diFtR";
                return new TextMessage(url58);

            case "ビーコン玄関からE103へ":
                String url59 = "案内補助動画はこちら↓\nhttps://x.gd/1slgh";
                return new TextMessage(url59);

            case "ビーコン玄関からE302へ":
                String url60 = "案内補助動画はこちら↓\nhttps://x.gd/UTys6";
                return new TextMessage(url60);



            case "ビーコンE2からE306へ":
                String url72 = "案内補助動画はこちら↓\nhttps://x.gd/iQaGj";
                return new TextMessage(url72);

            case "ビーコンE2からE107へ":
                String url73 = "案内補助動画はこちら↓\nhttps://x.gd/YHt5B";
                return new TextMessage(url73);

            case "ビーコンE2からF203へ":
                String url74 = "案内補助動画はこちら↓\nhttps://x.gd/54ZQk";
                return new TextMessage(url74);

            case "ビーコンE2から本部棟・情報棟へ","ビーコンE2から研究棟玄関へ":
                String url75= "案内補助動画はこちら↓\nhttps://x.gd/yd60h";
                return new TextMessage(url75);



            /*case "ビーコンD1からE304へ":
                String url28 = "案内補助動画はこちら↓\nhttps://x.gd/bi6Uc";
                return new TextMessage(url28);

            case "ビーコンD1からE308へ":
                String url29 = "案内補助動画はこちら↓\nhttps://x.gd/8HDra";
                return new TextMessage(url29);

            case "ビーコンD1からE112へ":
                String url30 = "案内補助動画はこちら↓\nhttps://x.gd/ixcGB";
                return new TextMessage(url30);

            case "ビーコンD1からE310へ":
                String url31 = "案内補助動画はこちら↓\nhttps://x.gd/7O5A1";
                return new TextMessage(url31);

            case "ビーコンD1からF203へ":
                String url32 = "案内補助動画はこちら↓\nhttps://x.gd/eSFQ0";
                return new TextMessage(url32); */

            case "ビーコンD1からF204へ":
                String url33 = "案内補助動画はこちら↓\nhttps://x.gd/AUAMd";
                return new TextMessage(url33);

            case "ビーコンD1から本部棟・情報棟へ","ビーコンD1から研究棟玄関へ":
                String url34= "案内補助動画はこちら↓\nhttps://x.gd/DDJVD";
                return new TextMessage(url34);



            case "ビーコンE1からE210へ":
                String url35 = "案内補助動画はこちら↓\nhttps://x.gd/dMreQ";
                return new TextMessage(url35);

            case "ビーコンE1からE205へ":
                String url36 = "案内補助動画はこちら↓\nhttps://x.gd/dW8Bf";
                return new TextMessage(url36);

            case "ビーコンE1からE306へ":
                String url37 = "案内補助動画はこちら↓\nhttps://x.gd/NxcsW";
                return new TextMessage(url37);

            case "ビーコンE1からF203へ":
                String url38 = "案内補助動画はこちら↓\nhttps://x.gd/2pnO5";
                return new TextMessage(url38);

            case "ビーコンE1からF204へ":
                String url39 = "案内補助動画はこちら↓\nhttps://x.gd/QtjlB";
                return new TextMessage(url39);

            case "ビーコンE1から本部棟・情報棟へ","ビーコンE1から研究棟玄関へ":
                String url40= "案内補助動画はこちら↓\nhttps://x.gd/8krCB";
                return new TextMessage(url40);

            case "ビーコンE1からE301へ":
                String url61 = "案内補助動画はこちら↓\nhttps://x.gd/jOASk";
                return new TextMessage(url61);

            case "ビーコンE1からE302へ":
                String url62 = "案内補助動画はこちら↓\nhttps://x.gd/vjw2d";
                return new TextMessage(url62);



            case "ビーコンF2からE210へ":
                String url41 = "案内補助動画はこちら↓\nhttps://x.gd/zuPbR";
                return new TextMessage(url41);

            case "ビーコンF2からE205へ":
                String url42 = "案内補助動画はこちら↓\nhttps://x.gd/JsF8U";
                return new TextMessage(url42);

            case "ビーコンF2からE306へ":
                String url43 = "案内補助動画はこちら↓\nhttps://x.gd/wC9tc";
                return new TextMessage(url43);

            case "ビーコンF2からE107へ":
                String url44 = "案内補助動画はこちら↓\nhttps://x.gd/ExaiM";
                return new TextMessage(url44);

            case "ビーコンF2から本部棟・情報棟へ","ビーコンF2から研究棟玄関へ":
                String url45= "案内補助動画はこちら↓\nhttps://x.gd/S4Zid";
                return new TextMessage(url45);

            case "ビーコンF2からE301へ":
                String url63 = "案内補助動画はこちら↓\nhttps://x.gd/RBO64";
                return new TextMessage(url63);

            case "ビーコンF2からE101へ":
                String url64 = "案内補助動画はこちら↓\nhttps://x.gd/aPhPC";
                return new TextMessage(url64);

            case "ビーコンF2からE103へ":
                String url65 = "案内補助動画はこちら↓\nhttps://x.gd/aqxg8";
                return new TextMessage(url65);

            case "ビーコンF2からE302へ":
                String url66 = "案内補助動画はこちら↓\nhttps://x.gd/RlveE";
                return new TextMessage(url66);



            case "ビーコンE3からE210へ":
                String url46 = "案内補助動画はこちら↓\nhttps://x.gd/sohXa";
                return new TextMessage(url46);

            case "ビーコンE3からE205へ":
                String url47 = "案内補助動画はこちら↓\nhttps://x.gd/R3TJX";
                return new TextMessage(url47);

            case "ビーコンE3からE107へ":
                String url48 = "案内補助動画はこちら↓\nhttps://x.gd/fl4kk";
                return new TextMessage(url48);

            case "ビーコンE3からF203へ":
                String url67 = "案内補助動画はこちら↓\nhttps://x.gd/9xBy4";
                return new TextMessage(url67);

            case "ビーコンE3から本部棟・情報棟へ","ビーコンE3から研究棟玄関へ":
                String url49= "案内補助動画はこちら↓\nhttps://x.gd/Lg8EM";
                return new TextMessage(url49);

            case "ビーコンE3からE101へ":
                String url68 = "案内補助動画はこちら↓\nhttps://x.gd/dUcT6";
                return new TextMessage(url68);

            case "ビーコンE3からE103へ":
                String url69 = "案内補助動画はこちら↓\nhttps://x.gd/MFECO";
                return new TextMessage(url69);

            case "ビーコンE3からF204へ":
                String url70 = "案内補助動画はこちら↓\nhttps://x.gd/vknIi";
                return new TextMessage(url70);

            default:
                return null;
        }
    }
}
