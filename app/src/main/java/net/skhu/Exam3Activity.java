package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Exam3Activity extends AppCompatActivity {

    Exam3Adapter exam3Adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3);

        arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");

        exam3Adapter = new Exam3Adapter(this, arrayList);

    }
}
