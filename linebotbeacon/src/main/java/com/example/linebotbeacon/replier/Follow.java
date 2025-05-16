package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.event.FollowEvent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

// フォローされた時用の返信クラス
public class Follow implements Replier {

    private FollowEvent event;

    public Follow(FollowEvent event) {
        this.event = event;
    }


    @Override
    public Message reply() {
        //String userId = this.event.getSource().getUserId();
        //String text = String.format("あなたのユーザーID:%s", userId);
        //String text = "友だち追加ありがとうございます！\n詳しい説明はこちらから↓\nhttps://laser-coach-5c6.notion.site/LINE-f400eab7f7974c80a7d66451d67a378c";
        //return new TextMessage(text);
        return null;
    }

}