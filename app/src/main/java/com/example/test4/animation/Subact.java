package com.example.test4.animation;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;

/**
 * Created by bridgelabz4 on 13/1/16.
 */
public class Subact extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Transition Trans = new Slide();
         getWindow().setReenterTransition(Trans);
        Trans.setDuration(2000);
        ((Slide)Trans).setSlideEdge(Gravity.LEFT);
        getWindow().setReturnTransition(Trans);

        //Transition exitTrans = new Fade();
        //getWindow().setEnterTransition(exitTrans);





    }

   // private void setupwindow(){
   //     Slide s1= (Slide) TransitionInflater.from(this).inflateTransition(R.transition.slide);
   //     getWindow().setExitTransition(s1);
   // }
}
