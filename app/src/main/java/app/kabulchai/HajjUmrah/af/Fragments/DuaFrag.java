package app.kabulchai.HajjUmrah.af.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import app.kabulchai.HajjUmrah.af.Adapter.DuaFragAdapter;
import app.kabulchai.HajjUmrah.af.Adapter.ManasikAdapter;
import app.kabulchai.HajjUmrah.af.Model.Dua;
import app.kabulchai.HajjUmrah.af.Model.HajManasik;
import app.kabulchai.HajjUmrah.af.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DuaFrag extends Fragment {


    private List<Dua>listData;
    private DuaFragAdapter adapter;
    private RecyclerView.LayoutManager manager;
    private RecyclerView rvDua;
    final String TAG = DuaFrag.class.getSimpleName();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dua, container, false);
        rvDua =view.findViewById(R.id.rvDua);

        listData=new ArrayList<>();

        final DatabaseReference nm= FirebaseDatabase.getInstance().getReference("dua");
        nm.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()){
                        Dua list=npsnapshot.getValue(Dua.class);
                        listData.add(list);
                        Log.d(TAG, "onDataChange: "+listData.size());
                    }
                    adapter=new DuaFragAdapter(listData,getContext());
                    rvDua.setAdapter(adapter);
                    manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL , true);
                    rvDua.setLayoutManager(manager);
                    nm.keepSynced(true);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e(TAG, "onCancelled: "+databaseError.getMessage());

            }
        });


        return view;
    }

}