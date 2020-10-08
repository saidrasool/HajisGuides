package app.kabulchai.HajjUmrah.af.Model;

public class HajManasik {

    String name, def;
    String imgUrl;
    public HajManasik(String name, String def, String imgUrl) {
        this.name = name;
        this.def = def;
        this.imgUrl = imgUrl;
    }
    public HajManasik() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
