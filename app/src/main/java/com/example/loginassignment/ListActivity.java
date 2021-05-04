package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
   private ListView listView;
    private  listAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
       listView = findViewById(R.id.list_view);

        List<Model> arrayList = new Constants().getArrayList();
        //Log.d("checker", "onCreate: "+ arrayList.get(2).getDetails());

       adapter = new listAdapter(ListActivity.this,R.layout.list_item, arrayList);
       listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
             Model model = arrayList.get(position);
             Intent intent   = new Intent(ListActivity.this,DetailActvivity.class);
                intent.putExtra("sampleObject", model);
                startActivity(intent);


                // Toast.makeText(getApplicationContext(), model.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}