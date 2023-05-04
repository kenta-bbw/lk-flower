public class Flower {
    private int blaetter;
    private String farbe;
    private String name;
    private int laenge;

    public Flower(int blaetter, String farbe, String name, int laenge) {
        this.blaetter = blaetter;
        this.farbe = farbe;
        this.name = name;
        this.laenge = laenge;
    }
    private Flower (){
        blaetter = 0;
        farbe = "unknown";
        name = "unknown";
        laenge = 0;
    }

    public int getBlaetter() {
        return blaetter;
    }

    public void setBlaetter(int blaetter) {
        this.blaetter = blaetter;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }
}
