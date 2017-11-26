package com.example.hl.wordsbook;

/**
 * Created by HL on 2017/11/14.
 */

import android.app.Application;
import android.content.Context;

public class WordsApplication extends Application {
    private static Context context;
    public static Context getContext(){
        return WordsApplication.context;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        WordsApplication.context=getApplicationContext();
    }
}
