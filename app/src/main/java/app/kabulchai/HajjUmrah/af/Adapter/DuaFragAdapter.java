package app.kabulchai.HajjUmrah.af.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.kabulchai.HajjUmrah.af.R;

public class DuaFragAdapter extends RecyclerView.Adapter<DuaFragAdapter.DuaFragViewHolder>
{
    Context context;
    String dua;


    @NonNull
    @Override
    public DuaFragAdapter.DuaFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DuaFragAdapter.DuaFragViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DuaFragViewHolder extends RecyclerView.ViewHolder{

        TextView tvDua;
        ImageButton btnCopy;

        public DuaFragViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDua = itemView.findViewById(R.id.tvDua);
            btnCopy = itemView.findViewById(R.id.btnCopy);
        }
    }
}
