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

import app.kabulchai.HajjUmrah.af.Activities.InfoActivity;
import app.kabulchai.HajjUmrah.af.R;

public class ManasikAdapter extends RecyclerView.Adapter<ManasikAdapter.ManasikFragViewHolder>
{

    Context context;
    String [] names;
    String [] details;
    int [] pic;
    final static String TITLE = "TITLE";
    final static String IMAGE = "IMAGE";
    final static String  DESCRIPTION= "DESCRIPTION";



    public ManasikAdapter(Context context, String[] names, String[] details, int[] pic) {
        this.context = context;
        this.names = names;
        this.details = details;
        this.pic = pic;
    }

    @NonNull
    @Override
    public ManasikAdapter.ManasikFragViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.manasik_layout,parent,false);
        return new ManasikAdapter.ManasikFragViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ManasikAdapter.ManasikFragViewHolder holder, final int position) {
        holder.stepName.setText(names[position]);
        holder.ivStepPictures.setImageResource(pic[position]);
        holder.stepDetails.setText(details[position].toString());

        holder.customcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , InfoActivity.class);
                intent.putExtra(TITLE , holder.stepName.getText().toString());
//                intent.putExtra(IMAGE , holder.ivStepPictures.);
                intent.putExtra(DESCRIPTION, holder.stepDetails.getText().toString());
                intent.putExtra(IMAGE , pic[position]);
//                Log.d("DES" ,  holder.stepDetails.toString());
//                Toast.makeText(context, ""+holder.stepDetails.getText().toString(), Toast.LENGTH_SHORT).show();
                context.startActivity(intent);
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
