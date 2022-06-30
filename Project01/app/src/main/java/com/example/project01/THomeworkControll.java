package com.example.project01;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class THomeworkControll extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView nav_view;
    ActionBar actionBar;

    RecyclerView recyclerView;
    ViewAdapter viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thomework_controll);

        // toolbar 적용
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);  // 내가 만든 바를 액션바로 지정
        drawerLayout = findViewById(R.id.drawerLayout);

        actionBar = getSupportActionBar();
        ActionBar actionBar = getSupportActionBar();
        // 원래 있던 제목(Project01) 안보이게 해준
        actionBar.setDisplayShowTitleEnabled(false);


        ActionBarDrawerToggle toggle
                = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close );
        drawerLayout.addDrawerListener(toggle); // drawerLayout 에 toggle 을 붙임

        toggle.syncState();

        //recycler view---------------------------------------------------------------------


        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false)) ; // 상하 스크롤
        //recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)) ; // 좌우 스크롤

        /*dtos =new ArrayList<>();
        //adapter 객체 생성
        adapter =  new ViewAdapter(THomeworkControll.this, dtos);*/

        //adapter 에 있는 ArrayList(dtos) 에 dto 를 추가한다.
        /*adapter.addDto(new HomeworkDTO("고2S", "1강 과제", "23/34", 45, 56));
        adapter.addDto(new HomeworkDTO("고2S", "1강 과제", "23/34", 45, 56));
        adapter.addDto(new HomeworkDTO("고2S", "1강 과제", "23/34", 45, 56));
        adapter.addDto(new HomeworkDTO("고2S", "1강 과제", "23/34", 45, 56));
        adapter.addDto(new HomeworkDTO("고2S", "1강 과제", "23/34", 45, 56));*/



            viewAdapter = new ViewAdapter();
            for (int i = 0; i < 100; i++) {
                String str = i + "번째 아이템";
                viewAdapter.setArrayData(str);
            }

            recyclerView.setAdapter(viewAdapter);
        }

    }


