package app.kabulchai.HajjUmrah.af.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import app.kabulchai.HajjUmrah.af.R;

public class SettingActivity extends AppCompatActivity {



    String [] settingNames ={"Languages" , "theme" ,"Support us" , "Contact" , "About"};
    int [] settingPictures =
            {R.drawable.ic_language_24,
            R.drawable.ic_theme,
            R.drawable.ic_support,
            R.drawable.ic_contact,
            R.drawable.ic_about};


    RecyclerView rvSetting;
    SettingAdapter adapter ;
    RecyclerView.LayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        rvSetting = findViewById(R.id.rvSetting);



        adapter = new SettingAdapter(settingNames,settingPictures);
        manager = new LinearLayoutManager(SettingActivity.this,LinearLayoutManager.VERTICAL,false);

        rvSetting.setAdapter(adapter);
        rvSetting.setLayoutManager(manager);

    }
}




class SettingAdapter extends RecyclerView.Adapter<SettingAdapter.SettingViewHolder>
{
    public SettingAdapter(String[] settingText, int[] settingPic) {
        this.settingText = settingText;
        this.settingPic = settingPic;

    }

    String [] settingText;
    int [] settingPic;



    @NonNull
    @Override
    public SettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_layout,parent,false);
        return new SettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingViewHolder holder, int position) {
        holder.tvSetting.setText(settingText[position]);
        holder.ivSetting.setImageResource(settingPic[position]);
    }

    @Override
    public int getItemCount() {
        return settingText.length;
    }

    public class SettingViewHolder extends RecyclerView.ViewHolder{
        TextView tvSetting;
        ImageView ivSetting;

        public SettingViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSetting = itemView.findViewById(R.id.tvSetting);
            ivSetting = itemView.findViewById(R.id.ivSettingPic);
        }



    }


}


