package app.kabulchai.HajjUmrah.af.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

import app.kabulchai.HajjUmrah.af.Application.HajjUmrah;


public class SessionManger {

    Context context;
    HajjUmrah myApp;
    static SessionManger instance;

    String PREF_NAME = "HajjUmrah";
    int PRIVATE_MODE = 0;

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    // App languages
    private String LANGUAGE = "HajjGuideLanguages";

    public SessionManger(Context c)
    {
    this.context = c;
    // Getting instance of the app
    myApp = HajjUmrah.getInstance();

    // Making it ready for getting data
    pref = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
    editor = pref.edit();
    }
    public static SessionManger getInstance(Context context)
    {
        if (instance == null)
        {
        instance = new SessionManger(context);
        }
        return instance;
    }

    public String getLanguage() {
        return pref.getString(LANGUAGE, "en");
    }

    public void setLanguage(String language) {
        editor.putString(LANGUAGE, language);
        editor.commit();
    }
}
