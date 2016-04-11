package com.example.andy.plastic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Andy on 4/11/2016.
 */
public  class chatRoomAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    public chatRoomAdapter(Context context) {
        this.mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        // Get the data item associated with the specified position in the data set.(获取数据集中与指定索引对应的数据项)
        return null;
    }

    @Override
    public long getItemId(int position) {
        // Get the row id associated with the specified position in the list.(取在列表中与指定索引对应的行id)
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        chatView message;
        message= new chatView();

        convertView=mInflater.inflate(R.layout.chat_item, null);

        message.text = (TextView) convertView.findViewById(R.id.chatMessage);
        convertView.setTag(message);


        message.text.setText("sdfsdfs");

        return  convertView;

    }

}
