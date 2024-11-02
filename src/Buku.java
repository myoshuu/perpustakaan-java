public abstract class Buku {
  private String judul;
  private String pengarang;
  private int tahunTerbit;
  private boolean isPinjam;

  public Buku(String judul, String pengarang, int tahunTerbit) {
    this.judul = judul;
    this.pengarang = pengarang;
    this.tahunTerbit = tahunTerbit;
    this.isPinjam = false;
  }

  public String getJudul() {
    return judul;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public String getPengarang() {
    return pengarang;
  }

  public void setPengarang(String pengarang) {
    this.pengarang = pengarang;
  }

  public int getTahunTerbit() {
    return tahunTerbit;
  }

  public void setTahunTerbit(int tahunTerbit) {
    this.tahunTerbit = tahunTerbit;
  }

  public boolean isPinjam() {
    return isPinjam;
  }

  public void setPinjam(boolean pinjam) {
    isPinjam = pinjam;
  }

  public void tampilkanInformasi() {
    System.out.println("Informasi Buku");
    System.out.println("Judul: " + getJudul());
    System.out.println("Pengarang: " + getPengarang());
    System.out.println("Tahun Terbit: " + getTahunTerbit());
  }

}
