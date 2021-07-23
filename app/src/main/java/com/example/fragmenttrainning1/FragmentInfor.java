package com.example.fragmenttrainning1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.fragmenttrainning1.databinding.FragmentStudentInforBinding;

public class FragmentInfor extends Fragment {
    FragmentStudentInforBinding viewBinding;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        viewBinding = FragmentStudentInforBinding.inflate(inflater,container,false);
        return viewBinding.getRoot();
    }
    public void setInfor(Student student){
        viewBinding.txtNameI.setText(student.getName());
        viewBinding.txtBornI.setText(student.getYearBorn()+"");
        viewBinding.txtAddressI.setText(student.getAddress());
        viewBinding.txtEmailI.setText(student.getEmail());

    }
}
