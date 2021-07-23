package com.example.fragmenttrainning1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Student> listStudent;
    public StudentAdapter(Context context, int layout, List<Student> listStudent) {
        this.context = context;
        this.layout = layout;
        this.listStudent = listStudent;
    }


    @Override
    public int getCount() {
        return listStudent.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        TextView txtName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView== null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtName.setText(listStudent.get(position).getName());
        return convertView;
    }
}