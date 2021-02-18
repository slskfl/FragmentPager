package com.example.fragmentpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabs;
    ViewPager viewPager1;
    MyPagerAdapter myPagerAdapter;
    TextView tvTitle;
    int pos;
    String title[]={"인사에 관련된 페이지", "동물 선택 페이지", "코로나 예방 페이지"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs=findViewById(R.id.tabs);
        viewPager1=findViewById(R.id.viewPager1);
        tvTitle=findViewById(R.id.tabTitle);

        tabs.addTab(tabs.newTab().setText("인사하기"));
        tabs.addTab(tabs.newTab().setText("동물선택"));
        tabs.addTab(tabs.newTab().setText("코로나예방"));
        tabs.setTabGravity(tabs.GRAVITY_FILL);
        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),3);
        viewPager1.setAdapter(myPagerAdapter);
        //탭메뉴 클릭하면 해당 프래그먼트로 변경>>싱크화
        tabs.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager1));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pos=tabs.getSelectedTabPosition();
                tvTitle.setText(title[pos]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //뷰페이저를 밀면 해당 탭메뉴로 이동
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
    }
}