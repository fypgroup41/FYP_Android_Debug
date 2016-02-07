/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.test;

/**
 *
 * @author test
 */
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

//    ProgressDialog mProgressDialog;
    /**
     * Duration of wait *
     */
    private final int SPLASH_DISPLAY_LENGTH = 5000;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout);

        /* New Handler to start the Menu-Activity 
         * and close this Splash-Screen after some seconds.*/
        /*    mProgressDialog = ProgressDialog.show(Splash.this, "", "Loading...", true);
         mProgressDialog.setCancelable(false);
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this, Activity1.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
