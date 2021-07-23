package com.example.fragmenttrainning1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fragmenttrainning1.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding viewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMain2Binding.inflate(getLayoutInflater().from(this));
        setContentView(viewBinding.getRoot());
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("dataStudent");
        FragmentInfor fragmentInfor = (FragmentInfor) getFragmentManager().findFragmentById(R.id.fragmentInfor2);
        fragmentInfor.setInfor(student);

    }
}