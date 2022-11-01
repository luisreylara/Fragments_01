package com.example.misfragments02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragmento1 fragmento1 = new Fragmento1();
        fragmentTransaction.add(R.id.frame1,fragmento1);
        fragmentTransaction.commit();

//        getSupportFragmentManager().beginTransaction().add(R.id.frame1,new Fragmento1()).commit();

    }
    public void irFrag1(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragmento1 fragmento1 = new Fragmento1();
        fragmentTransaction.replace(R.id.frame1,fragmento1);
        fragmentTransaction.commit();
 //  getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragmento1()).commit();

    }
    public void irFrag2(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragmento2 fragmento2 = new Fragmento2();
        fragmentTransaction.replace(R.id.frame1,fragmento2);
        fragmentTransaction.commit();
 //  getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragmento2()).commit();

    }
}