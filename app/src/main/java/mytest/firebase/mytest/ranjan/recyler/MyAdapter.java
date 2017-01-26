package mytest.firebase.mytest.ranjan.recyler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import mytest.firebase.mytest.R;

/**
 * Created by shahid Akhtar on 25-01-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_item,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

   static class Holder extends RecyclerView.ViewHolder {
       TextView t1;
       TextView t2;
       ImageView im;

       public Holder(View itemView) {
           super(itemView);

            t1=(TextView)itemView.findViewById(R.id.text1);
           t2=(TextView)itemView.findViewById(R.id.text2);
           im=(ImageView) itemView.findViewById(R.id.image);

        }
    }
}
