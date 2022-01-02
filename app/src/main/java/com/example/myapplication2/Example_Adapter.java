package com.example.myapplication2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class Example_Adapter  extends RecyclerView.Adapter<Example_Adapter.ExampleViweHolder>{
    ArrayList<Example_item> mExamplelist;

    public Example_Adapter(ArrayList<Example_item> mExamplelist) {
        this.mExamplelist = mExamplelist;
    }



    @NonNull
    @Override
    public Example_Adapter.ExampleViweHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viwe = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_itme, (ViewGroup) parent,false);
        ExampleViweHolder evh = new ExampleViweHolder(viwe);
        return evh;

    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViweHolder holder, int position) {
        Example_item current_item=  mExamplelist.get(position);
        holder.mText1.setText(current_item.getText1());
        holder.mText2.setText(current_item.getText2());
    }

    @Override
    public int getItemCount() {
        return mExamplelist.size();
    }

    public class ExampleViweHolder extends RecyclerView.ViewHolder {
        TextView mText1 , mText2 ;
        public ExampleViweHolder(@NonNull View itemView) {
            super(itemView);
            mText1=itemView.findViewById(R.id.text1);
            mText2=itemView.findViewById(R.id.text2);



        }
    }
}


