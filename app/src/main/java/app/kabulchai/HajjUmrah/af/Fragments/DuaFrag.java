package app.kabulchai.HajjUmrah.af.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import app.kabulchai.HajjUmrah.af.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DuaFrag extends Fragment {


    public DuaFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dua, container, false);
        return view;
    }

}

class DuaFragAdapter extends RecyclerView.Adapter<DuaFragAdapter.DuaFragViewHolder>
{
    Context context;
    String dua;


    @NonNull
    @Override
    public DuaFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DuaFragViewHolder holder, int position) {

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




