package com.insta.pankaj.musicplayer;

import android.content.Context;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v7.widget.AppCompatSeekBar;

public class MediaSeekBar  extends AppCompatSeekBar {

    private static final String TAG = "MediaSeekBar";

    private MediaControllerCompat mMediaController;
    private boolean mIsTracking = false;

    public MediaSeekBar(Context context) {
        super(context);
    }
}
