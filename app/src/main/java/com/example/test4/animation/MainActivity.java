package com.example.test4.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Transition exitTrans = new Fade();
        getWindow().setExitTransition(exitTrans);

        Transition reenterTrans = new Slide();
        reenterTrans.setDuration(1000);
        ((Slide)reenterTrans).setSlideEdge(Gravity.RIGHT);
        getWindow().setReenterTransition(reenterTrans);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }if(id == R.id.wifi)
        {
            //startActivity(new Intent(this, Subact.class));
            //Intent intent_next=new Intent(MainActivity.this,Subact.class);

           // MainActivity.this.overridePendingTransition(R.anim.fadeinanima,R.anim.fadeinanima);
            //startActivity(intent_next);

            Intent intent = new Intent(MainActivity.this, Subact.class);
            Bundle options = ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.slideup,R.anim.slideup).toBundle();
            startActivity(intent, options);
            //TransitionDemo demo = (TransitionDemo) parent.getItemAtPosition(position);
            //intent.putExtra(TransitionActivity.EXTRA_TRANSITION_TYPE, demo.mTranType);



            //finish();
        }
        if(id == R.id.wifi1){
            Intent intent = new Intent(MainActivity.this, Subact.class);
            Bundle options = ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.slideown,R.anim.slideup).toBundle();
           startActivity(intent, options);

       }
        if(id == R.id.cloud){
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
            Intent intent = new Intent(MainActivity.this, Subact.class);
            startActivity(intent, options.toBundle());

        }


        return super.onOptionsItemSelected(item);
    }
}
