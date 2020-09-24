package app.kabulchai.HajjUmrah.af.Model;

import android.content.Context;

public class Dua {

    // Constructor
    Context context;
    String Details;
    public Dua(){}
    public Dua(Context context, String details) {
        this.context = context;
        Details = details;
    }


// getter and Setter Methods
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
