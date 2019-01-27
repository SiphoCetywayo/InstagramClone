package hyperion.com.instagramclone2.videocompressor;/*
* 
* */

import android.app.Application;

import hyperion.com.instagramclone2.videocompressor.file.FileUtils;

public class VideoCompressorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FileUtils.createApplicationFolder();
    }

}