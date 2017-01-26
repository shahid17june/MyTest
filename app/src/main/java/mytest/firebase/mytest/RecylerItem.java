package mytest.firebase.mytest;

/**
 * Created by shahid Akhtar on 24-01-2017.
 */

public class RecylerItem {

    private int imageView;
    private String name;
    private String endTxt;

    public RecylerItem(int imageView, String name, String endTxt) {
        this.imageView = imageView;
        this.name = name;
        this.endTxt = endTxt;

    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndTxt() {
        return endTxt;
    }

    public void setEndTxt(String endTxt) {
        this.endTxt = endTxt;
    }
}


