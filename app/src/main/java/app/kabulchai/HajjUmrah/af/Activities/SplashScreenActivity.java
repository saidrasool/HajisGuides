package app.kabulchai.HajjUmrah.af.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import app.kabulchai.HajjUmrah.af.R;

public class SplashScreenActivity extends AppCompatActivity {


    TextView tvSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mansaik = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(mansaik);
                finish();
            }
        },3000);


    }


    @Override
    protected void onStart() {
        super.onStart();
        tvSplash = findViewById(R.id.tvSplash);
        tvSplash.animate().alpha(1).setDuration(5000);
    }
}
