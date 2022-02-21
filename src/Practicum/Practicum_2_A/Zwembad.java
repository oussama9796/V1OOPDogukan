package Practicum.Practicum_2_A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    Zwembad(double br, double le, double di){
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return lengte * breedte * diepte;
    }

    Zwembad(){

    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    @Override
    public String toString() {
        return " Dit zwembad is " + breedte + " meter breed, " + lengte + "meter lang, en " + diepte + " meter diep";
    }
}
