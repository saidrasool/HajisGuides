package app.kabulchai.HajjUmrah.af.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import app.kabulchai.HajjUmrah.af.Activities.InfoActivity;
import app.kabulchai.HajjUmrah.af.Model.HajManasik;
import app.kabulchai.HajjUmrah.af.R;


public class ManasikAdapter extends RecyclerView.Adapter<ManasikAdapter.ManasikFragViewHolder>{
    private List<HajManasik> listData;
    Context context;
    final static String STEPS_TITLE = "TITLE";
    final static String STEPS_DESCRIPTION = "DESCRIPTION";
    final static String STEPS_PIC = "PICTURE";


    public ManasikAdapter(List<HajManasik> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public ManasikFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.manasik_layout,parent,false);
        return new ManasikFragViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ManasikFragViewHolder holder, int position) {
        final HajManasik obj = listData.get(position);
        // for Steps Name
        holder.stepName.setText(obj.getStepsName());
        // for step Def
        holder.stepDetails.setText(obj.getStepDef());
        // for steps Pictures
        Glide.with(context)
                .load(obj.getStePicture())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivStepPictures);
      holder.customcardview.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent pass = new Intent(context , InfoActivity.class);
              pass.putExtra(STEPS_TITLE,obj.getStepsName());
              pass.putExtra(STEPS_DESCRIPTION,obj.getStepDef());
              pass.putExtra(STEPS_PIC,obj.getStePicture());
              context.startActivity(pass);
          }
      });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ManasikFragViewHolder extends RecyclerView.ViewHolder{
        TextView stepName , stepDetails;
        ImageView ivStepPictures;
        View view;
        CardView customcardview;
        public ManasikFragViewHolder(@NonNull View itemView) {
            super(itemView);
            //
            stepName = itemView.findViewById(R.id.tvStepsOfHaj);
            stepDetails = itemView.findViewById(R.id.tvStepsDetails);
            ivStepPictures = itemView.findViewById(R.id.ivManasikPic);
            //
            customcardview =  itemView.findViewById(R.id.customcardview);
            view = itemView;

        }
    }


}
