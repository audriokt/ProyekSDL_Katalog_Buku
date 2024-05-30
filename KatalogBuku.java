
package sdlproyek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class KatalogBuku {
    private List<Buku> daftarBuku;

    public KatalogBuku() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, String penulis, String penerbit, int tahunTerbit) {
        Buku bukuBaru = new Buku(judul, penulis, penerbit, tahunTerbit);
        daftarBuku.add(bukuBaru);
    }

    public void hapusBuku(String judul) {
        Iterator<Buku> iterator = daftarBuku.iterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            if (buku.getJudul().equals(judul)) {
                iterator.remove();
                break;
            }
        }
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                return buku;
            }
        }
        return null;
    }

    public void cetakKatalog() {
        List<String> daftarJudul = new ArrayList<>();
        List<Buku> daftarBuku2 = new ArrayList<>();
        
        for (Buku buku : daftarBuku) {
            String judul = buku.getJudul();
            daftarJudul.add(judul);
        }
        Collections.sort(daftarJudul);
        Iterator<String> iterator = daftarJudul.iterator();
        while (iterator.hasNext()) {
            String judul = iterator.next();
            for(Buku buku : daftarBuku){
                if(buku.getJudul().equals(judul)){
                    daftarBuku2.add(buku);
                }
            }

        }
        for(Buku buku : daftarBuku2){
            System.out.println(buku);
        }
    }
    
}
