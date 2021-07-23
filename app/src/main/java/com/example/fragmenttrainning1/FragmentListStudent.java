package com.example.fragmenttrainning1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.fragmenttrainning1.databinding.FragmentListStudentBinding;

import java.util.ArrayList;

public class FragmentListStudent extends Fragment {
    FragmentListStudentBinding viewBinding;
    ArrayList<Student> arrayStudent;
    StudentAdapter adapter;
    TransferStudent transferStudent;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        viewBinding = FragmentListStudentBinding.inflate(inflater,container,false);

        arrayStudent = new ArrayList<>();
        adapter = new StudentAdapter(getActivity(),R.layout.student_line,arrayStudent);
        addStudent();
        viewBinding.lVFragmentListStu.setAdapter(adapter);
        transferStudent = (TransferStudent) getActivity();

        viewBinding.lVFragmentListStu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getActivity(), arrayStudent.get(position).getName(), Toast.LENGTH_SHORT).show();
                transferStudent.dataStudent(arrayStudent.get(position));
            }
        });

        return viewBinding.getRoot();
    }
    private void addStudent(){
        arrayStudent.add(new Student("Do Duc Thuan",2002,"Thanh Xuan, Ha Noi","ducthuan232tn@gmail.com"));
        arrayStudent.add(new Student("Le Minh Duc",2002,"Ta Quang Buu, Ha Noi","LeDucNeuK64@gmail.com"));
        arrayStudent.add(new Student("Do Le Duy",2002,"Xuan Thuy, Ha Noi","LeDuy2002tn@gmail.com"));
        arrayStudent.add(new Student("Do Thanh Luan",2002,"Ha Dong, Ha Noi","ThanhLuan05032002@gmail.com"));
        arrayStudent.add(new Student("Nguyen Thi Thuy Dung",2002,"Kim Giang, Ha Noi","nttd2002@gmail.com"));
        arrayStudent.add(new Student("Nguyen Viet Dung",2002,"Ha Dong, Ha Noi","viedunHau2002@gmail.com"));
    }

}
