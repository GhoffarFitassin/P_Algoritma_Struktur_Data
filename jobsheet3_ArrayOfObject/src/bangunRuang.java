public class bangunRuang {
    public double tinggi;
    public double alas;
    public double jariJari;
    public double sisiMiring;

    public int hitungLPKerucut() {
        double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
        double LuasSelimut = Math.PI * jariJari * sisiMiring;
        return (int) (luasLingkaran + LuasSelimut);
    }

    public int hitungVKerucut() {
        tinggi = Math.sqrt(Math.pow(jariJari, 2) + Math.pow(sisiMiring, 2)); // rumus pythagoras mencari tinggi
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi / 3;
        return (int) volume;
    }

    public int hitungLPLimas() {
        double luasAlas = Math.pow(alas, 2);
        double luasSelimut = 4 * alas * tinggi;
        return (int) (luasAlas + luasSelimut);
    }

    public int hitungVLimas() {
        double volume = Math.pow(alas, 2) * tinggi / 3;
        return (int) volume;
    }

    public int hitungLPBola(){
        double luas = 4 * Math.PI * Math.pow(jariJari, 2);
        return (int) luas;
    }

    public int hitungVBola() {
        double volume = 4 / 3 * Math.PI * Math.pow(jariJari, 3);
        return (int) volume;
    }
}
