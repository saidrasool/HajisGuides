package app.kabulchai.HajjUmrah.af.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import app.kabulchai.HajjUmrah.af.Activities.InfoActivity;
import app.kabulchai.HajjUmrah.af.Activities.MapsActivity;
import app.kabulchai.HajjUmrah.af.Activities.SettingActivity;
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
    ManasikAdapter adapter;
    RecyclerView.LayoutManager manager;
    RecyclerView rvManasik;


    String [] names   = {   "احرام","طواف قدوم","سعی در میان صفا و مروه","تراشیدن موهای سر","منَی ","عرفات","حرکت بسوی مزدلفه ","حرکت بسوی منَی","قربانی","تراشیدن موی","طواف زیارت","رمی جمرات"  ,"طواف وداع " };
    String [] details = {
            "ما باید پیش از میقات احرام خود را بسته نمایم.احرام عبارت از داخل شدن به افعال حج ویا عمره است که به نیت و فعل هم صورت گرفته میشود.",
            "هنگامیکه به مکه داخل شد ، با وضوء و طهارت از مسجد حرام اغاز مینمایم ، وقتیکه به خانه کعبه نگاه نمودیم ، تکبیر و تهلیل میگویم ،\u200C سپس طواف میکنیم . ",
            "بعد از ختم کردن طواف قدوم سپس به کوه صفا بالا این أیت میخوانیم :\n" +
                    "« إِنَّ الصَّفَا وَالْمَرْوَةَ مِن شَعَائِرِ اللَّـهِ ۖ فَمَنْ حَجَّ الْبَيْتَ أَوِ اعْتَمَرَ فَلَا جُنَاحَ عَلَيْهِ أَن يَطَّوَّفَ بِهِمَا ۚ وَمَن تَطَوَّعَ خَيْرًا فَإِنَّ اللَّـهَ شَاكِرٌ عَلِيمٌ » ",
            "وقتی که سعی پایان یافت موهای سر خود را می تراشیم و بعد از ان احرام خود را می کشیم ",
            "در روز هشتم احرام را بسته میکنیم و از مکه به منَی میرویم و این روز را بنا (یوم ترویه) نیز یاد میشود. ادعای پنج وقت نماز در منَی باقی می مانیم. وقتی کی آفتاب طلوع نمود آن وقت بسوی عرفات حرکت میکنیم ",
            "روز نهم ذالحجه که بنام روز عرفه یاد میشود در عرفات میمانیم. وقتی که به عرفات رسیدم تا غروب افتاب در عرفات  آقامت میمانیم. امام نماز ظهر و عصر را با مردم میخواند ",
            "بعد از غروب افتاب از عرفات به مزدلفه میرویم نماز شام و خفتن را در نمیخوانم وقتی کی به مزدلفه رسیدم نماز شام و خفتن را در مزدلفه  را به یک اذان و اقامت میخوانیم ",
            "وقتی کی به طلوع افتاب وقت کم باقی باشد حرکت میکنیم بسوی منَی . زمانی کی بسوی منی رسیدم از جمرهء عقبه شروع نموده و آن را هفت سنگریزه میزنیم با پرتاب هر هر سنگریزه ",
            "بعد از رمی جمرهء عقبه یا سنگریزه جمره عقبه ذبح مینمایم",
            "بعد از ذبح نمودن حیوان مانند گوسفند وغیره موهای سر خود را می تراشیم یا قصر می نمایم و از احرام خود خارج میشویم و بدون زن همه چیز بر او حل میشود ",
            "، طواف زیارت باقی میماند ، که فرض است ، وقتی طواف زیارت سه روز بوده و از طلوع افتاب روز عید آغاز میشود ،\u200C تا غروب آفتاب روز دوازدهم ادامه دارد ",
            "بعد از طواف زیارت به منَی بر میگردیم و در روز یازدهم و دوازدهم بعد از زوال آفتاب جمرات ر رمی میکنیم.  نخست جمره ء صغرا را که نزدیک مسجد خیف است ، با سنگریزه میزنیم .",
            "بعد از جمرهء ها ،\u200C بدون طواف وداع چیز دیگری از مناسک حج باقی نمی ماند. طواف وداع بنا « طواف صدر» نیز یاد میشود. این طواف بر کسانیکه از خارج میقات می آید واجب است هنگامیکه به مکهء مکرمه بر میگردد برایش جایز است تا طواف وداع نموده وبه وطنش برگردد."
    };
    int [] pic = {R.drawable.ihram,R.drawable.tawafk,R.drawable.safamarwa,R.drawable.shavinghairs,R.drawable.mina,R.drawable.arafat,R.drawable.muzdalipa,R.drawable.mina,R.drawable.qurbani,R.drawable.shavinghairs,R.drawable.tawafk,R.drawable.ramijamrat,R.drawable.tawafk};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_manasik, container, false);
            rvManasik = view.findViewById(R.id.rvManasik);

            adapter = new ManasikAdapter(context,names,details,pic);
            manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL , false);
        rvManasik.setAdapter(adapter);
        rvManasik.setLayoutManager(manager);











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

        return  view;
    }
}



class ManasikAdapter extends RecyclerView.Adapter<ManasikAdapter.ManasikFragViewHolder>
{

    public ManasikAdapter(Context context, String[] names, String[] details, int[] pic) {
        this.context = context;
        this.names = names;
        this.details = details;
        this.pic = pic;
    }

    Context context;
    String [] names;
    String [] details;
    int [] pic;




    @NonNull
    @Override
    public ManasikFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.manasik_layout,parent,false);
        return new ManasikFragViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ManasikFragViewHolder holder, int position) {
        holder.stepName.setText(names[position]);
        holder.ivStepPictures.setImageResource(pic[position]);
        holder.stepDetails.setText(details[position]);
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(context,InfoActivity.class);
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    class ManasikFragViewHolder extends RecyclerView.ViewHolder{
        TextView stepName , stepDetails;
        ImageView ivStepPictures;
        View view;
        public ManasikFragViewHolder(@NonNull View itemView) {
            super(itemView);
            stepName = itemView.findViewById(R.id.tvStepsOfHaj);
            stepDetails = itemView.findViewById(R.id.tvStepsDetails);
            ivStepPictures = itemView.findViewById(R.id.ivManasikPic);
                 view = itemView;

        }
    }


}