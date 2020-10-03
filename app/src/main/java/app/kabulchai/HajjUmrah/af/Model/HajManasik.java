package app.kabulchai.HajjUmrah.af.Model;

public class HajManasik {

    String stepsName , stepDef ;
    int stePicture;
    public HajManasik(String stepsName, String stepDef, int stePicture) {
        this.stepsName = stepsName;
        this.stepDef = stepDef;
        this.stePicture = stePicture;
    }
    public HajManasik() {}

    public String getStepsName() {
        return stepsName;
    }

    public void setStepsName(String stepsName) {
        this.stepsName = stepsName;
    }

    public String getStepDef() {
        return stepDef;
    }

    public void setStepDef(String stepDef) {
        this.stepDef = stepDef;
    }

    public int getStePicture() {
        return stePicture;
    }

    public void setStePicture(int stePicture) {
        this.stePicture = stePicture;
    }
}
