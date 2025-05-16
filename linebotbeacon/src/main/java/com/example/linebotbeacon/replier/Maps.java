package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.message.ImageMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

import java.net.URI;

public class Maps implements Replier {
    private final String text;
    public Maps(String text) {
        this.text = text;
    }

    @Override
    public Message reply() {
        switch (text) {
            case "ビーコンB1からB201へ":
                String uriString1 = "https://x.gd/fx4Ce";
                URI uri1 = URI.create(uriString1);
                return new ImageMessage(uri1, uri1);

            case "ビーコンB1からB202へ":
                String uriString2 = "https://x.gd/8oxUq";
                URI uri2 = URI.create(uriString2);
                return new ImageMessage(uri2, uri2);

            case "ビーコンB1からG201へ":
                String uriString50 = "https://x.gd/U2xrj";
                URI uri50 = URI.create(uriString50);
                return new ImageMessage(uri50, uri50);

            case "ビーコンB1からH102へ":
                String uriString3 = "https://x.gd/5UMdg";
                URI uri3 = URI.create(uriString3);
                return new ImageMessage(uri3, uri3);

            case "ビーコンB1からB203へ":
                String uriString4 = "https://x.gd/SORh6";
                URI uri4 = URI.create(uriString4);
                return new ImageMessage(uri4, uri4);

            case "ビーコンB1からB204へ":
                String uriString71 = "https://x.gd/mrJwj";
                URI uri71 = URI.create(uriString71);
                return new ImageMessage(uri71, uri71);

            case "ビーコンB1からH101へ":
                String uriString5 = "https://x.gd/65pkA";
                URI uri5 = URI.create(uriString5);
                return new ImageMessage(uri5, uri5);

            case "ビーコンB1からH305へ":
                String uriString6 = "https://x.gd/yozR9";
                URI uri6 = URI.create(uriString6);
                return new ImageMessage(uri6, uri6);

            case "ビーコンB1からH103へ":
                String uriString7 = "https://x.gd/lft0L";
                URI uri7 = URI.create(uriString7);
                return new ImageMessage(uri7, uri7);

            case "ビーコンB1から研究棟へ","ビーコンB1から本部棟玄関へ":
                String uriString8 = "https://x.gd/a9WnF";
                URI uri8 = URI.create(uriString8);
                return new ImageMessage(uri8, uri8);



            case "ビーコンB2から体育館(アリーナ)へ":
                String uriString9 = "https://x.gd/hdP3A";
                URI uri9 = URI.create(uriString9);
                return new ImageMessage(uri9, uri9);

            case "ビーコンB2からH102へ":
                String uriString10 = "https://x.gd/3tbGv";
                URI uri10 = URI.create(uriString10);
                return new ImageMessage(uri10, uri10);

            case "ビーコンB2からH305へ":
                String uriString11 = "https://x.gd/64Z7e";
                URI uri11 = URI.create(uriString11);
                return new ImageMessage(uri11, uri11);

            case "ビーコンB2からH103へ":
                String uriString12 = "https://x.gd/RwbcJ";
                URI uri12 = URI.create(uriString12);
                return new ImageMessage(uri12, uri12);

            case "ビーコンB2から研究棟へ","ビーコンB2から本部棟玄関へ":
                String uriString13 = "https://x.gd/UcCxn";
                URI uri13 = URI.create(uriString13);
                return new ImageMessage(uri13, uri13);



            case "ビーコンG2から体育館(アリーナ)へ":
                String uriString51 = "https://x.gd/fMooDl";
                URI uri51 = URI.create(uriString51);
                return new ImageMessage(uri51, uri51);

            case "ビーコンG2からH102へ":
                String uriString52 = "https://x.gd/umUP6";
                URI uri52 = URI.create(uriString52);
                return new ImageMessage(uri52, uri52);

            case "ビーコンG2からH305へ":
                String uriString53 = "https://x.gd/SoETX";
                URI uri53 = URI.create(uriString53);
                return new ImageMessage(uri53, uri53);

            case "ビーコンG2からH103へ":
                String uriString54= "https://x.gd/gmWrG";
                URI uri54 = URI.create(uriString54);
                return new ImageMessage(uri54, uri54);

            case "ビーコンG2から研究棟へ","ビーコンG2から本部棟玄関へ":
                String uriString55 = "https://x.gd/OfyzS";
                URI uri55 = URI.create(uriString55);
                return new ImageMessage(uri55, uri55);



            case "ビーコンH1から体育館(アリーナ)へ":
                String uriString14 = "https://x.gd/jrar6";
                URI uri14 = URI.create(uriString14);
                return new ImageMessage(uri14, uri14);

            case "ビーコンH1からH305へ":
                String uriString15 = "https://x.gd/uye81";
                URI uri15 = URI.create(uriString15);
                return new ImageMessage(uri15, uri15);

            /*case "ビーコンH1からH304へ":
                String uriString16 = "https://x.gd/vjEZQ";
                URI uri16 = URI.create(uriString16);
                return new ImageMessage(uri16, uri16);*/

            case "ビーコンH1から研究棟へ","ビーコンH1から本部棟玄関へ":
                String uriString17 = "https://x.gd/7FGDZ";
                URI uri17 = URI.create(uriString17);
                return new ImageMessage(uri17, uri17);



            case "ビーコンH3からH103へ":
                String uriString56 = "https://x.gd/pU1On";
                URI uri56 = URI.create(uriString56);
                return new ImageMessage(uri56, uri56);

            case "ビーコンH3から研究棟へ","ビーコンH3から本部棟玄関へ":
                String uriString18 = "https://x.gd/HcEEy";
                URI uri18 = URI.create(uriString18);
                return new ImageMessage(uri18, uri18);



            case "ビーコン玄関からE210へ":
                String uriString19 = "https://x.gd/A9zXr";
                URI uri19 = URI.create(uriString19);
                return new ImageMessage(uri19, uri19);

            case "ビーコン玄関からE205へ":
                String uriString20 = "https://x.gd/Dtlss";
                URI uri20 = URI.create(uriString20);
                return new ImageMessage(uri20, uri20);

            case "ビーコン玄関からE306へ":
                String uriString21 = "https://x.gd/ZNHNP";
                URI uri21 = URI.create(uriString21);
                return new ImageMessage(uri21, uri21);

            case "ビーコン玄関からE107へ":
                String uriString22 = "https://x.gd/lDmIv";
                URI uri22 = URI.create(uriString22);
                return new ImageMessage(uri22, uri22);

            case "ビーコン玄関からF203へ":
                String uriString23 = "https://x.gd/sRGki";
                URI uri23 = URI.create(uriString23);
                return new ImageMessage(uri23, uri23);

            case "ビーコン玄関からD106へ":
                String uriString24 = "https://x.gd/H3n2G";
                URI uri24 = URI.create(uriString24);
                return new ImageMessage(uri24, uri24);

            case "ビーコン玄関からD105へ":
                String uriString25 = "https://x.gd/qfPcI";
                URI uri25 = URI.create(uriString25);
                return new ImageMessage(uri25, uri25);

            case "ビーコン玄関からF204へ":
                String uriString26 = "https://x.gd/ttDgb";
                URI uri26 = URI.create(uriString26);
                return new ImageMessage(uri26, uri26);

            /*case "ビーコン玄関から本部棟・情報棟へ":
                String uriString27 = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj6W_0lnj-UBfH7crS5_gH9G_sdGzY-7Uws_eC5YgWMHCzs8vV13EVFPnf1-ks6hJtpusuZ3139bnhtdQP0fHeGEaQwhOqz89rXYmbq21jyRxFCSlfCGKooHAzj28tNBA5UahyphenhyphenByEqGaNk7QB-kTlbeoXsJ-fqKLllU9ot9c2SGVHccOq7lB8paLghWHpta/s391/kagidaizumen.png";
                URI uri27 = URI.create(uriString27);
                return new ImageMessage(uri27, uri27);*/

            case "ビーコン玄関からE301へ":
                String uriString57 = "https://x.gd/qY6Em";
                URI uri57 = URI.create(uriString57);
                return new ImageMessage(uri57, uri57);

            case "ビーコン玄関からE101へ":
                String uriString58 = "https://x.gd/y5EdN";
                URI uri58 = URI.create(uriString58);
                return new ImageMessage(uri58, uri58);

            case "ビーコン玄関からE103へ":
                String uriString59 = "https://x.gd/uILvB";
                URI uri59 = URI.create(uriString59);
                return new ImageMessage(uri59, uri59);

            case "ビーコン玄関からE302へ":
                String uriString60 = "https://x.gd/kvvn0";
                URI uri60 = URI.create(uriString60);
                return new ImageMessage(uri60, uri60);



            case "ビーコンE2からE306へ":
                String uriString72 = "https://x.gd/LzmgJ";
                URI uri72 = URI.create(uriString72);
                return new ImageMessage(uri72, uri72);

            case "ビーコンE2からE107へ":
                String uriString73 = "https://x.gd/lUCPc";
                URI uri73 = URI.create(uriString73);
                return new ImageMessage(uri73, uri73);

            case "ビーコンE2からF203へ":
                String uriString74 = "https://x.gd/s66Km";
                URI uri74 = URI.create(uriString74);
                return new ImageMessage(uri74, uri74);

            case "ビーコンE2から本部棟・情報棟へ","ビーコンE2から研究棟玄関へ":
                String uriString75 = "https://x.gd/J6aY2";
                URI uri75 = URI.create(uriString75);
                return new ImageMessage(uri75, uri75);



            /*case "ビーコンD1からE304へ":
                String uriString28 = "https://x.gd/KyIak";
                URI uri28 = URI.create(uriString28);
                return new ImageMessage(uri28, uri28);

            case "ビーコンD1からE308へ":
                String uriString29 = "https://x.gd/0c4i0";
                URI uri29 = URI.create(uriString29);
                return new ImageMessage(uri29, uri29);

            case "ビーコンD1からE112へ":
                String uriString30 = "https://x.gd/Z5xKr";
                URI uri30 = URI.create(uriString30);
                return new ImageMessage(uri30, uri30);

            case "ビーコンD1からE310へ":
                String uriString31 = "https://x.gd/J3n8N";
                URI uri31 = URI.create(uriString31);
                return new ImageMessage(uri31, uri31);

            case "ビーコンD1からF203へ":
                String uriString32 = "https://x.gd/ypLTX";
                URI uri32 = URI.create(uriString32);
                return new ImageMessage(uri32, uri32); */

            case "ビーコンD1からF204へ":
                String uriString33 = "https://x.gd/FcEuf";
                URI uri33 = URI.create(uriString33);
                return new ImageMessage(uri33, uri33);

            case "ビーコンD1から本部棟・情報棟へ","ビーコンD1から研究棟玄関へ":
                String uriString34 = "https://x.gd/I5pU5";
                URI uri34 = URI.create(uriString34);
                return new ImageMessage(uri34, uri34);



            case "ビーコンE1からE210へ":
                String uriString35 = "https://x.gd/wH7zB";
                URI uri35 = URI.create(uriString35);
                return new ImageMessage(uri35, uri35);

            case "ビーコンE1からE205へ":
                String uriString36 = "https://x.gd/D6vFa";
                URI uri36 = URI.create(uriString36);
                return new ImageMessage(uri36, uri36);

            case "ビーコンE1からE306へ":
                String uriString37 = "https://x.gd/LqZhQ";
                URI uri37 = URI.create(uriString37);
                return new ImageMessage(uri37, uri37);

            case "ビーコンE1からF203へ":
                String uriString38 = "https://x.gd/6uH2x";
                URI uri38 = URI.create(uriString38);
                return new ImageMessage(uri38, uri38);

            case "ビーコンE1からF204へ":
                String uriString39 = "https://x.gd/1pFfh";
                URI uri39 = URI.create(uriString39);
                return new ImageMessage(uri39, uri39);

            case "ビーコンE1から本部棟・情報棟へ","ビーコンE1から研究棟玄関へ":
                String uriString40 = "https://x.gd/ynG8e";
                URI uri40 = URI.create(uriString40);
                return new ImageMessage(uri40, uri40);

            case "ビーコンE1からE301へ":
                String uriString61 = "https://x.gd/j59sG";
                URI uri61 = URI.create(uriString61);
                return new ImageMessage(uri61, uri61);

            case "ビーコンE1からE302へ":
                String uriString62 = "https://x.gd/siIPp";
                URI uri62 = URI.create(uriString62);
                return new ImageMessage(uri62, uri62);



            case "ビーコンF2からE210へ":
                String uriString41 = "https://x.gd/Q4Ord";
                URI uri41 = URI.create(uriString41);
                return new ImageMessage(uri41, uri41);

            case "ビーコンF2からE205へ":
                String uriString42 = "https://x.gd/QJaz9";
                URI uri42 = URI.create(uriString42);
                return new ImageMessage(uri42, uri42);

            case "ビーコンF2からE306へ":
                String uriString43 = "https://x.gd/NJWtp";
                URI uri43 = URI.create(uriString43);
                return new ImageMessage(uri43, uri43);

            case "ビーコンF2からE107へ":
                String uriString44 = "https://x.gd/Tt9QQ";
                URI uri44 = URI.create(uriString44);
                return new ImageMessage(uri44, uri44);

            case "ビーコンF2から本部棟・情報棟へ","ビーコンF2から研究棟玄関へ":
                String uriString45 = "https://x.gd/ZptSn";
                URI uri45 = URI.create(uriString45);
                return new ImageMessage(uri45, uri45);

            case "ビーコンF2からE301へ":
                String uriString63 = "https://x.gd/v2mBs";
                URI uri63 = URI.create(uriString63);
                return new ImageMessage(uri63, uri63);

            case "ビーコンF2からE101へ":
                String uriString64 = "https://x.gd/sJTPp";
                URI uri64 = URI.create(uriString64);
                return new ImageMessage(uri64, uri64);

            case "ビーコンF2からE103へ":
                String uriString65 = "https://x.gd/JfOhk";
                URI uri65 = URI.create(uriString65);
                return new ImageMessage(uri65, uri65);

            case "ビーコンF2からE302へ":
                String uriString66 = "https://x.gd/ZL6LN";
                URI uri66 = URI.create(uriString66);
                return new ImageMessage(uri66, uri66);



            case "ビーコンE3からE210へ":
                String uriString46 = "https://x.gd/B6ShQ";
                URI uri46 = URI.create(uriString46);
                return new ImageMessage(uri46, uri46);

            case "ビーコンE3からE205へ":
                String uriString47 = "https://x.gd/kb7rA";
                URI uri47 = URI.create(uriString47);
                return new ImageMessage(uri47, uri47);

            case "ビーコンE3からE107へ":
                String uriString48 = "https://x.gd/r57XQ";
                URI uri48 = URI.create(uriString48);
                return new ImageMessage(uri48, uri48);

            case "ビーコンE3からF203へ":
                String uriString67 = "https://x.gd/Zi4zV";
                URI uri67 = URI.create(uriString67);
                return new ImageMessage(uri67, uri67);

            case "ビーコンE3から本部棟・情報棟へ","ビーコンE3から研究棟玄関へ":
                String uriString49 = "https://x.gd/ZVrLi";
                URI uri49 = URI.create(uriString49);
                return new ImageMessage(uri49, uri49);

            case "ビーコンE3からE101へ":
                String uriString68 = "https://x.gd/LOtNp";
                URI uri68 = URI.create(uriString68);
                return new ImageMessage(uri68, uri68);

            case "ビーコンE3からE103へ":
                String uriString69 = "https://x.gd/tOTA9";
                URI uri69 = URI.create(uriString69);
                return new ImageMessage(uri69, uri69);

            case "ビーコンE3からF204へ":
                String uriString70 = "https://x.gd/TXBYr";
                URI uri70 = URI.create(uriString70);
                return new ImageMessage(uri70, uri70);



            default:
                return null;
        }
    }
}