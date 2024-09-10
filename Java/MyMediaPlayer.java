package com.example.tunewave;

import android.media.MediaPlayer;

public class MyMediaPlayer {
    //it is a helper class to access mediaplayer from any activity.
    static MediaPlayer instance;

    public static MediaPlayer getInstance(){
        if(instance==null){
            instance=new MediaPlayer();
        }
        return instance;
    }
    public static int currentIndex=-1;//it means song is not clicked.

}
