package com.sar.user.handler_thread;

import android.os.Looper;

public class DownloadThread extends Thread {

    DownloadHandler downloadHandler;
    MainActivity mainActivity;
    public DownloadThread(MainActivity mainActivity) {
        mainActivity=mainActivity;
    }

    @Override
    public void run() {
        Looper.prepare();
        downloadHandler=new DownloadHandler(mainActivity);
        Looper.loop();

    }
}
