package NewPackage;

public class Auto {
    String model;
    String culoare;
    Integer numberDeUsi;
    Float viteza;
    Integer masa;
    String tipCaroserie;

    public Auto() {
    }

    public Auto(String culoare, Integer numberDeUsi, Float viteza, Integer masa, String tipCaroserie) {
        this.model = culoare;
        this.culoare = culoare;
        this.numberDeUsi = numberDeUsi;
        this.viteza = viteza;
        this.masa = masa;
        this.tipCaroserie = tipCaroserie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getNumberDeUsi() {
        return numberDeUsi;
    }

    public void setNumberDeUsi(Integer numberDeUsi) {
        this.numberDeUsi = numberDeUsi;
    }

    public Float getViteza() {
        return viteza;
    }

    public void setViteza(Float viteza) {
        this.viteza = viteza;
    }

    public Integer getMasa() {
        return masa;
    }

    public void setMasa(Integer masa) {
        this.masa = masa;
    }

    public String getTipCaroserie() {
        return tipCaroserie;
    }

    public void setTipCaroserie(String tipCaroserie) {
        this.tipCaroserie = tipCaroserie;
    }
}
