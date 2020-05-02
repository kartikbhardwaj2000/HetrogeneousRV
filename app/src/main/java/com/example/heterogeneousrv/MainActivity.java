package com.example.heterogeneousrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.heterogeneousrv.Adapters.MainRVAdapter;
import com.example.heterogeneousrv.Modals.HorizontalModal;
import com.example.heterogeneousrv.Modals.HorizontalRVModal;
import com.example.heterogeneousrv.Modals.VerticalModal;
import com.example.heterogeneousrv.Modals.VerticalRVModal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Object> list =new ArrayList<>(6);
    ArrayList<HorizontalModal> h_list1 =new ArrayList<>();
    ArrayList<VerticalModal>v_list1 =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        v_list1.add(new VerticalModal("android.resource://com.example.heterogeneousrv/drawable/avengers","Avengers:End Game"));
        v_list1.add(new VerticalModal("android.resource://com.example.heterogeneousrv/drawable/dr_strange","Dr Strange"));
        v_list1.add(new VerticalModal("android.resource://com.example.heterogeneousrv/drawable/ironman","Iron Man3"));
        VerticalRVModal verticalRVModal =new VerticalRVModal(v_list1);
        h_list1.add(new HorizontalModal("android.resource://com.example.heterogeneousrv/drawable/tony","Iron Man"));
        h_list1.add(new HorizontalModal("android.resource://com.example.heterogeneousrv/drawable/thor","Thor"));
        h_list1.add(new HorizontalModal("android.resource://com.example.heterogeneousrv/drawable/vision","Vision"));
        h_list1.add(new HorizontalModal("android.resource://com.example.heterogeneousrv/drawable/hawk","Hawkeye"));
        HorizontalRVModal horizontalRVModal =new HorizontalRVModal(h_list1);
        list.add(verticalRVModal);
        list.add(horizontalRVModal);

        recyclerView=findViewById(R.id.rv);
        MainRVAdapter adapter =new MainRVAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);





    }


}
