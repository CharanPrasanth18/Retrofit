package com.charan.myapplication;




import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.charan.myapplication.ProfileRegister;
import com.charan.myapplication.R;


public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);





        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,

                    new ProfileRegister()).commit();

        }







    }

}
