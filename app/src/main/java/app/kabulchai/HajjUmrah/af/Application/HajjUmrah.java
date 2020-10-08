package app.kabulchai.HajjUmrah.af.Application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;

import com.google.firebase.database.FirebaseDatabase;

import java.util.Locale;

import app.kabulchai.HajjUmrah.af.Utilities.LocaleManager;
import app.kabulchai.HajjUmrah.af.Utilities.SessionManger;

import static android.content.ContentValues.TAG;

public class HajjUmrah extends Application {

    public static String[] languageStrings = {"English", "دری", "پشتو"};
    private static HajjUmrah myApp;
    SessionManger session;

    public static String LOCAL_EN = "en";
    public static String LOCAL_FA = "fa";
    public static String LOCAL_PS = "ps";




    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleManager.setLocale(base));
        Log.d(TAG, "attachBaseContext");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LocaleManager.setLocale(this);
        Log.d(TAG, "onConfigurationChanged: " + newConfig.locale.getLanguage());
        session.setLanguage(newConfig.locale.getLanguage());
    }
    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
        session=SessionManger.getInstance(this);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    public static HajjUmrah getInstance(){
        return myApp;
    }


    public void setLanguage(String language) {

        if (language.equalsIgnoreCase(LOCAL_FA)) {

            Locale.setDefault(new Locale("fa", "af"));
        } else if (language.equalsIgnoreCase(LOCAL_EN)) {
            Locale.setDefault(Locale.ENGLISH);
        } else if (language.equals(LOCAL_PS)) {
            Locale.setDefault(new Locale("ps", "af"));
        }

        Configuration config = getResources().getConfiguration();

        config.locale = Locale.getDefault();
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        getResources().updateConfiguration(config, metrics);
        session.setLanguage(language);
    }


}
