package app.kabulchai.HajjUmrah.af.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.kabulchai.HajjUmrah.af.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuranFrag extends Fragment {


    public QuranFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quran, container, false);
    }

}
