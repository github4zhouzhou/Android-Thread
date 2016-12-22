package com.v.thread;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityThread extends Activity {

    private ImageView mImageView1, mImageView2, mImageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);

        mImageView1 = (ImageView) findViewById(R.id.iv_1);
    }

    private class DownloadTask extends AsyncTask<Integer, Void, Integer> {
        @Override
        protected Integer doInBackground(Integer... integers) {
            return null;
        }
    }
}
