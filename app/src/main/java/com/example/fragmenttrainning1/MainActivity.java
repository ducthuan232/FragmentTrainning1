package com.example.fragmenttrainning1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.fragmenttrainning1.databinding.ActivityMainBinding;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements TransferStudent {
    ActivityMainBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(viewBinding.getRoot());

    }

    @Override
    public void dataStudent(Student student) {
        FragmentInfor fragmentInfor = (FragmentInfor) getFragmentManager().findFragmentById(R.id.fragmentH2);
        if (fragmentInfor != null && fragmentInfor.isInLayout()) {
            fragmentInfor.setInfor(student);
        }
        else{
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("dataStudent", student);
            startActivity(intent);
        }
    }
}