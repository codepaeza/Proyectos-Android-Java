package com.paez.edwin.appodm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by PC on 24/09/2017.
 */

public class VideoActivity extends Activity {
    private VideoView mVideoView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_activity);
        mVideoView=(VideoView)findViewById(R.id.surface_view);
        //de form alternativa si queremos un steaming usar
        //mVideoView.setVideoURI(Uri.parse(URLstring));
        mVideoView.setVideoPath("\\Card\\DCIM\\Camera\\20170924_190734.mp4");
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.start();
        mVideoView.requestFocus();
    }
}
