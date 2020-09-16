package app.kabulchai.HajjUmrah.af.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import app.kabulchai.HajjUmrah.af.Activities.MapsActivity;
import app.kabulchai.HajjUmrah.af.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManasikFrag extends Fragment  {



    FloatingActionButton mapFB , settingFB;

    public ManasikFrag() {
        // Required empty public constructor
    }
private FragmentActivity context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_manasik, container, false);
            mapFB = view.findViewById(R.id.mapFB);
            settingFB = view.findViewById(R.id.settingFB);


            mapFB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mapIntent = new Intent(getActivity() , MapsActivity.class);
                    startActivity(mapIntent);
                }
            });



        return  view;
    }
}



class ManasikAdapter extends RecyclerView.Adapter<ManasikAdapter.ManasikFragViewHolder>
{    @NonNull
    @Override
    public ManasikFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ManasikFragViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ManasikFragViewHolder extends RecyclerView.ViewHolder{
        public ManasikFragViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}