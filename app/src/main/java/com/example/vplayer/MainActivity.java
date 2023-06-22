package com.example.vplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv= findViewById(R.id.VideoView);
      String vpath = "android.resource://"+getPackageName()+"/raw/sam";
      Uri videoUri = Uri.parse(vpath);
    //  vv.setVideoPath(vpath);
        vv.setVideoURI(videoUri);
      vv.start();
        MediaController mc= new MediaController(this);
        vv.setMediaController(mc);
        mc.setAnchorView(vv);
    }
}