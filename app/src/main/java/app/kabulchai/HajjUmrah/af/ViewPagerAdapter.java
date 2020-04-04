package app.kabulchai.HajjUmrah.af;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> nav_list = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager){
                super(manager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return  nav_list.get(position);
    }


    @Override
    public int getCount() {
        return nav_list.size();
    }


    public void addFragment(Fragment fragment){
        nav_list.add(fragment);
    }
}
