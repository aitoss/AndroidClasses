package com.example.recycler_demo;

import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewholder>  {



   private List <ModelClass> modelClasses ;
   //private List < Integer > gg ;

    public Adapter(List<ModelClass> modelClasses) {
        this.modelClasses = modelClasses;
    }

    @NonNull
    @Override


    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from (parent.getContext()).inflate(R.layout.layout , parent , false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {


        int image = modelClasses.get(position).getResource();
        String head = modelClasses.get(position).getText();
        String body = modelClasses.get(position).getBody();
        holder.setdata(image , head , body );

    }

    @Override
    public int getItemCount() {


        return modelClasses.size();
    }


    class viewholder extends RecyclerView.ViewHolder
    {
        private ImageView imageView ;
        private TextView text ;
        private TextView body ;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView) ;
            text =itemView.findViewById(R.id.textView2);
            body =itemView.findViewById(R.id.textView3);
        }

        private  void setdata ( int image , String head , String Body )
        {
            imageView.setImageResource(image);
            text.setText(head);
            body.setText(Body);

        }
    }





}
