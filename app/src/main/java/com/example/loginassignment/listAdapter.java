package com.example.loginassignment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.loginassignment.R.layout.list_item;

public class listAdapter extends ArrayAdapter<Model> {
    private List<Model>  arrayList ;
    private Context context;

    public listAdapter(@NonNull Context context, int resource, List<Model> arrayList) {
        super(context, resource);
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       Model  model  = new Model();
       model = arrayList.get(position);
       LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item,null);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView langText = view.findViewById(R.id.languageText);

         // using glide to load image faster and to ensure the image fit to size of the image box
        Glide.with(context).load(model.getImage()).fitCenter().into(imageView);
        langText.setText(model.getText());

        return view;

    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
}
