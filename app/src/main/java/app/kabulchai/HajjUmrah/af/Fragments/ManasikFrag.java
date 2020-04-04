package app.kabulchai.HajjUmrah.af.Fragments;


import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;

import app.kabulchai.HajjUmrah.af.Fragments.ManasikSubFragment.ManasikAdapter;
import app.kabulchai.HajjUmrah.af.Fragments.ManasikSubFragment.ManasikHajFragment;
import app.kabulchai.HajjUmrah.af.Fragments.ManasikSubFragment.ManasikUmrah;
import app.kabulchai.HajjUmrah.af.MakkaInfo;
import app.kabulchai.HajjUmrah.af.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManasikFrag extends Fragment  {
            TabLayout manasikTabLayout;
            ViewPager manasikViewPager;
            ActionBar bar;
            FloatingActionButton makkaInfo;

            ManasikHajFragment manasikHajFragment;
            ManasikUmrah umrah;
    public ManasikFrag() {
        // Required empty public constructor
    }
private FragmentActivity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_manasik, container, false);
        makkaInfo = v.findViewById(R.id.floatAction);
        manasikViewPager = v.findViewById(R.id.manasikViewPager);
        manasikTabLayout = v.findViewById(R.id.tablayout);
        // TabLayot
        manasikTabLayout.addTab(manasikTabLayout.newTab().setText("حج"));
        manasikTabLayout.addTab(manasikTabLayout.newTab().setText("عمره"));
        manasikTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            // Adapter for TabLayout
            ManasikAdapter adapter = new ManasikAdapter(getFragmentManager(),getActivity(),manasikTabLayout.getTabCount());
            adapter.addFragment(new ManasikHajFragment());
            adapter.addFragment(new ManasikUmrah());
            // TabLayout
            manasikViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(manasikTabLayout));
            manasikTabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                manasikViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        makkaInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent makkaIntent = new Intent(getActivity(),MakkaInfo.class);
                startActivity(makkaIntent);
                ((Activity) getActivity()).overridePendingTransition(0,0);
            }
        });


        return  v;
    }
}
