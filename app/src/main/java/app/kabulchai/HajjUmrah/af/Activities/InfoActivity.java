package app.kabulchai.HajjUmrah.af.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


import app.kabulchai.HajjUmrah.af.R;

public class InfoActivity extends AppCompatActivity {
    TextView step , description;
    ImageView stepPicture;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        step = findViewById(R.id.title);
        description = findViewById(R.id.description);
        stepPicture = findViewById(R.id.stepPic);


        Intent intent = getIntent();
        String title = intent.getStringExtra("TITLE");
        String stepsImage = intent.getStringExtra("PICTURE" );
        String stepDescription = intent.getStringExtra("DESCRIPTION");

        Log.d("data", "onCreate: "+title);

        //      Toast.makeText(this, ""+textdescription, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, ""+description, Toast.LENGTH_SHORT).show();
//        Log.d("MYTITLE" ,description );
        step.setText(title);
        description.setText(stepDescription);


        Glide
                .with(this
                )
                .load(stepsImage)
                .centerCrop()
                .placeholder(R.drawable.ic_share_24)
                .into(stepPicture);

    }

}