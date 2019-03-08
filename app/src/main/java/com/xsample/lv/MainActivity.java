package com.xsample.lv;

import android.app.ListActivity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ListActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setListAdapter(new MyAdapter(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.countries)));
        }
        private class MyAdapter extends ArrayAdapter<String> {
            MyAdapter(@NonNull Context context, @LayoutRes int resource,  @NonNull String[] strings) {
                super(context, resource,  strings);
            }
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view= layoutInflater.inflate(R.layout.activity_main,parent,false);

                String [] items = getResources().getStringArray(R.array.countries);
                ImageView imageView = view.findViewById(R.id.imageView);
                TextView textView = view.findViewById(R.id.textView);
                textView.setText(items[position]);

                if(items[position].equals("United States")){
                    imageView.setImageResource(R.mipmap.ic_launcher_round);
                }
                if(items[position].equals("Australia")){
                    imageView.setImageResource(R.mipmap.ic_launcher_round);
                }
                return view;
            }
        }
    }
