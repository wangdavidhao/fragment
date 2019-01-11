package com.example.wangdavid.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.net.Uri;

public class MainActivity extends AppCompatActivity implements FragmentSend.OnFragmentInteractionListener, Fragment_catch.OnFragmentInteractionListener{


    private FragmentSend fragment1;
    private Fragment_catch fragment2;







    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1=new FragmentSend();
        fragment2=new Fragment_catch();


        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framelayout_main,fragment1).commit();
        fragmentManager.beginTransaction().replace(R.id.frame_layout_catch,fragment2).commit();


    }




    @Override
    public void sendMessage(String message)
    {

        fragment2.setTextViewText(message);


    }

    @Override
    public void catchMessage(String text)
    {

    }




}



