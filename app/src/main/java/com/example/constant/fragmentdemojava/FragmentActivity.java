package com.example.constant.fragmentdemojava;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity {

    FragmentClassA fragmentA;
    FragmentClassB fragmentB;
    FragmentClassC fragmentC;

    FragmentManager fragManager;
    FragmentTransaction fragTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        fragmentA = new FragmentClassA();
        fragmentB = new FragmentClassB();
        fragmentC = new FragmentClassC();

        fragManager = getFragmentManager();
        fragTransaction = fragManager.beginTransaction();

        fragTransaction.add(R.id.fragmentContainer,fragmentA,"FragmentA");
        fragTransaction.add(R.id.fragmentContainer,fragmentB,"FragmentB");
        fragTransaction.add(R.id.fragmentContainer,fragmentC,"FragmentC");

        fragTransaction.commit();

    }
}
