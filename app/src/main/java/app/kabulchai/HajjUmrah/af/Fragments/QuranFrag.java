package app.kabulchai.HajjUmrah.af.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.kabulchai.HajjUmrah.af.Fragments.QuranFragment.QuranAdapter;
import app.kabulchai.HajjUmrah.af.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuranFrag extends Fragment {


    public QuranFrag() {
        // Required empty public constructor
    }

    RecyclerView rvQuran;
    LinearLayoutManager manager;
    RecyclerView.LayoutManager layoutManager;
    // send data to adapter
    String [] surah = {"الم","سَيَقُولُ","تِلْكَ الرُّسُلُ","لَنْ تَنَالُوا","وَالْمُحْصَنَاتُ","لَا يُحِبُّ اللَّهُ","وَإِذَا سَمِعُوا","وَلَوْ أَنَّنَا","قَالَ الْمَلَأُ","وَاعْلَمُوا"};
    String [] surahFirstAyat = {
            "ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ",
            "ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
            ,"ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ",
            "ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
        , "ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
          ,"ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
        ,"ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
    ,"ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
    ,"ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
    ,"ﭫ ﭬ ﭭ ﭮ ﭯ ﭰ ﭱ ﭲ ﭳ"
    };
    int [] juzStartingNum = {1,322,234,234,544,213,345,120,123,120};

        QuranAdapter quranAdapter;

Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_quran, container, false);

        rvQuran = v.findViewById(R.id.rvQuran);
        manager = new GridLayoutManager(context,2);
        rvQuran.setLayoutManager(manager);
            juzStartingNum.toString();

            //TODO
        // sir i don't what is the problem in this code 
        quranAdapter = new QuranAdapter(surah,juzStartingNum,surahFirstAyat);
        rvQuran.setAdapter(quranAdapter);


        return  v;

    }

}
