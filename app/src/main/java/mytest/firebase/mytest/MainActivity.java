package mytest.firebase.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.HorizontalScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<RecylerItem> list;
    private RecylerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list=new ArrayList<>();


        RecyclerView rc = (RecyclerView)findViewById(R.id.Recycle);
        //vertical
       // rc.setLayoutManager(new LinearLayoutManager(this));

        //horizontal
       // rc.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        // Grid View
       rc.setLayoutManager(new GridLayoutManager(this,2));


        adapter= new RecylerAdapter(list);
        rc.setAdapter(adapter);

        addData();

    }

    private void addData(){

        for (int i=0;i<5;i++){
            RecylerItem model =new RecylerItem(R.mipmap.ic_launcher,"name="+i,"end="+i);
            list.add(model);
            adapter.notifyItemInserted(i);
        }

    }
    private void  changes(){}
    
}
