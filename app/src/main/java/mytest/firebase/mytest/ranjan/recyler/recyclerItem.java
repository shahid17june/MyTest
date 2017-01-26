package mytest.firebase.mytest.ranjan.recyler;

import android.widget.TextView;

/**
 * Created by shahid Akhtar on 25-01-2017.
 */

public class recyclerItem {

    private TextView t1;
    private String name;
    private String lastname;


    public recyclerItem(TextView t1, String name, String lastname) {
        this.t1 = t1;
        this.name = name;
        this.lastname = lastname;
    }

    public TextView getT1() {
        return t1;
    }

    public void setT1(TextView t1) {
        this.t1 = t1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
