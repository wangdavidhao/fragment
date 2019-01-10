package com.example.wangdavid.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.net.Uri;

public class MainActivity extends AppCompatActivity implements FragmentSend.OnFragmentInteractionListener{


    private TextView text1;
    private FragmentSend fragment1;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView)findViewById(R.id.text_view_main);
        fragment1=new FragmentSend();


        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framelayout_main,fragment1).commit();


    }



    @Override
    public void sendMessage(String message)
    {

        text1.setText(message);
    }
}



