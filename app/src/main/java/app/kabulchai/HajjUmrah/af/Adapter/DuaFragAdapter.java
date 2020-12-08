package app.kabulchai.HajjUmrah.af.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import app.kabulchai.HajjUmrah.af.Model.Dua;
import app.kabulchai.HajjUmrah.af.Model.HajManasik;
import app.kabulchai.HajjUmrah.af.R;

public class DuaFragAdapter extends RecyclerView.Adapter<DuaFragAdapter.DuaFragViewHolder>
{
    List<Dua>listData;
    Context context;

    public DuaFragAdapter(List<Dua> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public DuaFragAdapter.DuaFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_dua,parent,false);
        return new DuaFragViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DuaFragAdapter.DuaFragViewHolder holder, int position) {
        final Dua obj = listData.get(position);
        holder.tvDua.setText(obj.getDua());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class DuaFragViewHolder extends RecyclerView.ViewHolder{

        TextView tvDua;
        public DuaFragViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDua = itemView.findViewById(R.id.tvDua);
        }
    }
}
