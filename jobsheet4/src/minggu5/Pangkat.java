package minggu5;

public class Pangkat {
    public int nilai,pangkat;

    public Pangkat(){
        
    }
    public Pangkat(int nil, int png){
        nilai = nil;
        pangkat = png;
    }
    int pangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n == 0) {
            return 1;
        } else {
            if (n%2 == 1) {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            } else {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}