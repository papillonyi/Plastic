package com.example.andy.plastic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;

/**
 * Created by Andy on 4/10/2016.
 */
public class activity_chatRoom extends AppCompatActivity {
    Button ButtonChatRoomToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        ButtonChatRoomToMain=(Button) findViewById(R.id.ButtonChatRoomToMain);

        ButtonChatRoomToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_chatRoom.this, MainActivity.class));
            }
        });
    }
}

public  class chatRoomAdapter extends BaseAdapter {

}
