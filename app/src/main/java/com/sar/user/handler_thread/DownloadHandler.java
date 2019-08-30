package com.sar.user.handler_thread;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class DownloadHandler extends Handler {
MainActivity mainActivity;

    public DownloadHandler(MainActivity mainActivity) {
        mainActivity=mainActivity;
    }



    @Override
    public void handleMessage(Message msg) {
        downloadsong(msg.obj.toString());
    }
    public void downloadsong(final String mes)
    {
        try {

            Log.i("hiiii",mes);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mainActivity.textView.append(mes);
            }
        });
        */
    }
}
