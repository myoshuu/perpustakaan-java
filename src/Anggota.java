import java.util.ArrayList;
import java.util.List;

public class Anggota {
  private String nama;
  private String nomorAnggota;
  public List<Buku> daftarBuku;

  public Anggota(String nama, String nomorAnggota) {
    this.nama = nama;
    this.nomorAnggota = nomorAnggota;
    daftarBuku = new ArrayList<>();
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNomorAnggota() {
    return nomorAnggota;
  }

  public void setNomorAnggota(String nomorAnggota) {
    this.nomorAnggota = nomorAnggota;
  }

  public void pinjamBuku(Buku buku) {
    daftarBuku.add(buku);
    System.out.println(nama + "Telah meminjam buku " + buku.getJudul());
  }


}
