package app.kabulchai.HajjUmrah.af.Fragments.ManasikSubFragment;

import android.content.Context;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import app.kabulchai.HajjUmrah.af.Fragments.ManasikFrag;
import app.kabulchai.HajjUmrah.af.ViewPagerAdapter;

public class ManasikAdapter extends ViewPagerAdapter {
    Context context;
    int totalTabs;

    public ManasikAdapter(FragmentManager manager, Context context, int totalTabs) {
        super(manager);
        this.context =context ;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ManasikHajFragment hajFragment = new ManasikHajFragment();
                return hajFragment;
            case 1:
                ManasikUmrah umrah = new ManasikUmrah();
                return umrah;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
