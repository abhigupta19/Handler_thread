package com.sar.user.handler_thread;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        final DownloadThread downloadThread=new DownloadThread(MainActivity.this);
        downloadThread.start();
        textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 5; i++) {
                    Message message=Message.obtain();
                    message.obj=i;
                    downloadThread.downloadHandler.sendMessage(message);

                }
            }
        });

    }
}
