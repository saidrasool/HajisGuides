package app.kabulchai.HajjUmrah.af.Model;

public class HajManasik {



    public HajManasik() {
    }

    String stepsNames;
    int stepsPictures;

    public HajManasik(String stepsNames, int stepsPictures) {
        this.stepsNames = stepsNames;
        this.stepsPictures = stepsPictures;
    }

    public String getStepsNames() {
        return stepsNames;
    }

    public void setStepsNames(String stepsNames) {
        this.stepsNames = stepsNames;
    }

    public int getStepsPictures() {
        return stepsPictures;
    }

    public void setStepsPictures(int stepsPictures) {
        this.stepsPictures = stepsPictures;
    }
}
