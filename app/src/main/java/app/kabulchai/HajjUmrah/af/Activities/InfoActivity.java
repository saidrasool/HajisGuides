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
        int stepsImage = intent.getIntExtra("PICTURE" , 0);
        String stepDescription = intent.getStringExtra("DESCRIPTION");
  //      Toast.makeText(this, ""+textdescription, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, ""+description, Toast.LENGTH_SHORT).show();
//        Log.d("MYTITLE" ,description );
        step.setText(title);
        description.setText(stepDescription);
        stepPicture.setImageResource(stepsImage);
//
//        Glide
//                .with(myFragment)
//                .load(url)
//                .centerCrop()
//                .placeholder(R.drawable.loading_spinner)
//                .into(myImageView);

    }

}