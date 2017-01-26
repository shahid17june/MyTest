package mytest.firebase.mytest;


import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by shahid Akhtar on 24-01-2017.
 */

public class RecylerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<RecylerItem> arrayList;


    //private Context mContext;


    public RecylerAdapter(ArrayList<RecylerItem> arrayList)

    {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_item,parent,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

       MyHolder viewHolder = (MyHolder) holder;

        RecylerItem model =arrayList.get(position);

        int image =model.getImageView();
        String text1 =model.getName();
        String text2 =model.getEndTxt();

        if(!TextUtils.isEmpty(text1)){
            viewHolder.tv1.setText(text1);
        }

        if(!TextUtils.isEmpty(text2)){
            viewHolder.tv2.setText(text2);
        }

        viewHolder.imageView.setImageResource(image);


    }

    @Override
    public int getItemCount() {
        return arrayList!=null ? arrayList.size() : 0;
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView tv1, tv2;

        public MyHolder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.image);
            tv1=(TextView)itemView.findViewById(R.id.text1);
            tv2=(TextView)itemView.findViewById(R.id.text2);
        }
    }


}
