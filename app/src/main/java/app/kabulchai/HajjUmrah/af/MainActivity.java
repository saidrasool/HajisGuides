package app.kabulchai.HajjUmrah.af;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import app.kabulchai.HajjUmrah.af.Fragments.DuaFrag;
import app.kabulchai.HajjUmrah.af.Fragments.ManasikFrag;
import app.kabulchai.HajjUmrah.af.Fragments.MapFrag;
import app.kabulchai.HajjUmrah.af.Fragments.QuranFrag;

public class MainActivity extends AppCompatActivity   {

    // ViewPager
    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;
    ActionBar bar;

    // ViewPager
    MenuItem prevMenuItem;
    ManasikFrag manasikFrag;
    DuaFrag duaFrag;
    QuranFrag quranFrag;
    MapFrag mapFrag;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = getSupportActionBar();
        bottomNavigationView = findViewById(R.id.navigation);
        viewPager = findViewById(R.id.viewpager);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId())
                {
                    // This CODE IS fOR Bottom Navigation with Fragment only
//                    case R.id.manasik:
//                        bar.setTitle(R.string.HajjManasik);
//                        fragment = new ManasikFrag();
//                        loadFragment(fragment);
//                        return true;
//                    case R.id.dua:
//                        bar.setTitle(R.string.Dua);
//                        fragment = new DuaFrag();
//                        loadFragment(fragment);
//                        return true;
//                    case R.id.quran:
//                        bar.setTitle(R.string.Quran);
//                        fragment = new QuranFrag();
//                        loadFragment(fragment);
//                        return true;
//                    case R.id.map:
//                        bar.setTitle(R.string.SaudiMap);
//                        fragment = new MapFrag();
//                        loadFragment(fragment);
//                        return true;
                    // This is code is for BottomNavigation using View Pager and Fragment
                    case R.id.manasik:
                        bar.setTitle(R.string.HajjManasik);
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.dua:
                        bar.setTitle(R.string.Dua);
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.quran:
                        bar.setTitle(R.string.Quran);
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.map:
                        bar.setTitle(R.string.SaudiMap);
                        viewPager.setCurrentItem(3);
                        break;

                } return false;
            }
        });

    viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            if (prevMenuItem != null) {
                prevMenuItem.setChecked(false);
            } else{
        bottomNavigationView.getMenu().getItem(0).setChecked(false);
            }
            Log.d("page", "onPageSelected: "+position);
            bottomNavigationView.getMenu().getItem(position).setChecked(true);
            prevMenuItem = bottomNavigationView.getMenu().getItem(position);


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });
        setupViewPager(viewPager);
    }




// this is for simple Bottom

//    public void loadFragment(Fragment fragment)
//    {
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.mainLayout,fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }


        private void setupViewPager(ViewPager viewPager){
            ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
            manasikFrag=new ManasikFrag();
            duaFrag = new DuaFrag();
            quranFrag = new QuranFrag();
            mapFrag = new MapFrag();
            viewPagerAdapter.addFragment(manasikFrag);
            viewPagerAdapter.addFragment(duaFrag);
            viewPagerAdapter.addFragment(quranFrag);
            viewPagerAdapter.addFragment(mapFrag);
            viewPager.setAdapter(viewPagerAdapter);

        }
}
