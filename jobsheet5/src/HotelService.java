public class HotelService {
    Hotel[] cabang = new Hotel[5];
    int idx;
    
    void tambah(Hotel h){
        if (idx < cabang.length) {
            cabang[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll(){
        for (Hotel h : cabang) {
            h.tampilAll();
            System.out.println("----------------------------");
        }
    }   

    void bubbleSort(){
        for (int i = 0; i < cabang.length; i++) {
            for (int j = 1; j < cabang.length; j++) {
                if (cabang[j].harga < cabang[j-1].harga) {
                    Hotel tmp = cabang[j];
                    cabang[j] = cabang[j-1];
                    cabang[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < cabang.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < cabang.length; j++) {
                if (cabang[j].bintang > cabang[idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel tmp = cabang[idxMax];
            cabang[idxMax] = cabang[i];
            cabang[i] = tmp;
        }
    }
}
