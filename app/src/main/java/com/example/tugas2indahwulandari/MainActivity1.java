package com.example.tugas2indahwulandari;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity1 extends AppCompatActivity {

    private AutoCompleteTextView autoAreaTv,autoStateTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoAreaTv = findViewById(R.id.autoAreaTv);
        autoStateTv = findViewById(R.id.autoStateTv);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("ABC","DEF","GHI","JKL","MNO"));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity1.this,R.layout.list_item,R.id.tvItem,arrayList);
        autoAreaTv.setAdapter(adapter);
        autoStateTv.setAdapter(adapter);
        
    }
}