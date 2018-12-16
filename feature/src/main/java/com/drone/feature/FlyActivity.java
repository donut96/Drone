package com.drone.feature;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.VideoView;

public class FlyActivity extends AppCompatActivity {

    VideoView videoPlayer;
    int code = 0;
    Uri myVideoUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fly);
        setTitle("Режим полёта");
        ActionBar actionBar =getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
            code = arguments.getInt("Rout");
        }

        videoPlayer = (VideoView) findViewById(R.id.videoPlayer);

        if (code == 1) {
            myVideoUri= Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback);
        }

        if (code == 2) {
            myVideoUri= Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback1);
        }

        if (code == 3) {
            myVideoUri= Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback2);
        }
        videoPlayer.setVideoURI(myVideoUri);
        videoPlayer.start();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
