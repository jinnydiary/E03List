package net.skhu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Exam3Adapter extends RecyclerView.Adapter<RecyclerView1Adapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);
        }
    }

    LayoutInflater layoutInflater;
    ArrayList<String> arrayList;

    public Exam3Adapter(Context context, ArrayList<String> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerView1Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView1Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
