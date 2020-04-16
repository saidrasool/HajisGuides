package app.kabulchai.HajjUmrah.af.Fragments.QuranFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.kabulchai.HajjUmrah.af.R;

public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.QuranAdapterViewHolder> {
    public QuranAdapter(String[] tvSurat, String[] tvSuratNum, int[] tvSuratFirstAyat) {
        this.tvSurat = tvSurat;
        this.tvSuratNum = tvSuratNum;
        this.tvSuratFirstAyat = tvSuratFirstAyat;
    }

    String [] tvSurat;
    String [] tvSuratNum;
    int [] tvSuratFirstAyat;


    @NonNull
    @Override
    public QuranAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_quran,parent,false);
        return new QuranAdapterViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull QuranAdapterViewHolder holder, int position) {
        tvSuratFirstAyat.toString();
        holder.tvSurah.setText(tvSurat[position]);
        holder.tvSurahFirstAyah.setText(tvSuratFirstAyat[position]);
        holder.tvSurahNum.setText(tvSuratNum[position]);

    }

    @Override
    public int getItemCount() {
        return tvSurat.length;
    }

    public class QuranAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView tvSurah , tvSurahNum , tvSurahFirstAyah;

        public QuranAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSurah = itemView.findViewById(R.id.tvSurahJuz);
            tvSurahNum = itemView.findViewById(R.id.tvAyahNum);
            tvSurahFirstAyah = itemView.findViewById(R.id.tvStartingAyah);
        }
    }
}
