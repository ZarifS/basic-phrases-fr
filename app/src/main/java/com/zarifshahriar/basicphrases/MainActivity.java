package com.zarifshahriar.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid);
        gridLayout.setUseDefaultMargins(false);
        gridLayout.setAlignmentMode(GridLayout.ALIGN_BOUNDS);
        gridLayout.setRowOrderPreserved(false);
    }

    public void onTapped(View view){
        String id = view.getResources().getResourceEntryName(view.getId());
        int resId = getResources().getIdentifier(id, "raw", "com.zarifshahriar.basicphrases");
        System.out.println(resId);
            MediaPlayer mplayer = MediaPlayer.create(this, resId);
            mplayer.start();
    }


}
