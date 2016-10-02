package com.chuckharpke.animations;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MyActivity extends Activity {

    public void fade(View view) {

        ImageView stewie = (ImageView) findViewById(R.id.stewie);


        //Image will slide off to the left and roatate 3 times:
        stewie.animate()
                .translationXBy(1500f)
                .translationYBy(1500f)
                .rotationBy(3600)
                .setDuration(2000);

        //ImageView stewie2= (ImageView) findViewById(R.id.stewie2);

        //stewie2.animate().alpha(1f).setDuration(2000);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);



        ImageView stewie = (ImageView) findViewById(R.id.stewie);

        stewie.setTranslationX(-1500f);
        stewie.setTranslationY(-1500f);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
