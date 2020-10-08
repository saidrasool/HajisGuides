package app.kabulchai.HajjUmrah.af.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import app.kabulchai.HajjUmrah.af.Activities.MapsActivity;
import app.kabulchai.HajjUmrah.af.Activities.SettingActivity;

import app.kabulchai.HajjUmrah.af.Adapter.ManasikAdapter;
import app.kabulchai.HajjUmrah.af.Model.HajManasik;
import app.kabulchai.HajjUmrah.af.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ManasikFrag extends Fragment  {
    // btns
    FloatingActionButton mapFB , settingFB;

    private List<HajManasik>listData;
    private ManasikAdapter adapter;
    private RecyclerView.LayoutManager manager;
    private RecyclerView rvManasik;
    final String TAG = ManasikFrag.class.getSimpleName();





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view =  inflater.inflate(R.layout.fragment_manasik, container, false);
            rvManasik = view.findViewById(R.id.rvManasik);



            listData=new ArrayList<>();


        final DatabaseReference nm= FirebaseDatabase.getInstance().getReference("lang_dari");
        nm.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()){
                       HajManasik list=npsnapshot.getValue(HajManasik.class);
                        listData.add(list);
                        Log.d(TAG, "onDataChange: "+listData.size());
                    }
                    adapter=new ManasikAdapter(listData,getContext());
                    rvManasik.setAdapter(adapter);
                    manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL , false);
                    rvManasik.setLayoutManager(manager);
                    nm.keepSynced(true);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e(TAG, "onCancelled: "+databaseError.getMessage());

            }
        });










        mapFB = view.findViewById(R.id.mapFB);
            settingFB = view.findViewById(R.id.settingFB);
            mapFB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mapIntent = new Intent(getActivity() , MapsActivity.class);
                    startActivity(mapIntent);
                }
            });
            settingFB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent settingIntent = new Intent(getActivity(), SettingActivity.class);
                    startActivity(settingIntent);
                }
            });



//            FirebaseRecyclerOptions<HajManasik> options =
//                    new FirebaseRecylcerOptions.Builder<>()
//                    .setQuery(query , chat.class)
//                    .build();
        return  view;
    }
}



