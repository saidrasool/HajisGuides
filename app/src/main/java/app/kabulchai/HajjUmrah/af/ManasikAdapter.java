package app.kabulchai.HajjUmrah.af;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ManasikAdapter extends RecyclerView.Adapter<ManasikAdapter.MansikViewHolder> {
    @NonNull
    @Override
    public MansikViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MansikViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MansikViewHolder extends RecyclerView.ViewHolder{

        TextView tvSteps , tvDetails;
        ImageView ivManasikPic;
        public MansikViewHolder(@NonNull View itemView) {
            super(itemView);
            // textViews
            tvSteps = itemView.findViewById(R.id.tvStep);
            tvDetails = itemView.findViewById(R.id.tvDetail);
            // Images
            ivManasikPic = itemView.findViewById(R.id.ivManasikPicture);

        }
    }
}
