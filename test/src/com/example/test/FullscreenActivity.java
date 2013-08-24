package com.example.test;

import org.apache.cordova.DroidGap;

import android.os.Bundle;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	super.loadUrl("file:///android_asset/www/index.html");

    }
}
