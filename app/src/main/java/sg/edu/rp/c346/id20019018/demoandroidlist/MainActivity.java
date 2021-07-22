package sg.edu.rp.c346.id20019018.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lv;
    ArrayList<AndroidVersion> al;

    //ArrayAdapter<AndroidVersion> aa;

    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al =  new ArrayList<>();

        al.add(new AndroidVersion("Pie","9.0"));
        al.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        al.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        al.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        al.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        al.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        al.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

        /*
        al.add("Oreo - 8.0 - 8.1");
        al.add("Nougat - 7.0 - 7.1.2");
        al.add("Marshmallow - 6.0 - 6.0.1");
        al.add("Lollipop - 5.0 - 5.1.1");
        al.add("KitKat - 4.4 - 4.4.4");
        al.add("Jelly Bean - 4.1 - 4.3.1");
         */

        //aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);

        adapter = new CustomAdapter(this, R.layout.row, al);

        lv.setAdapter(adapter);
    }
}