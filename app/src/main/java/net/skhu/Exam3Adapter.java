package net.skhu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.nio.DoubleBuffer;
import java.util.ArrayList;

public class Exam3Adapter extends RecyclerView.Adapter<Exam3Adapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);
        }

        public void setData() {
            String title = arrayList.get(getAdapterPosition());
            textView.setText(title);
        }

    }

    LayoutInflater layoutInflater;
    ArrayList<String> arrayList;

    public Exam3Adapter(Context context, ArrayList<String> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.item1, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int index) {
        viewHolder.setData();
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
