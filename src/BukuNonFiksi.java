public class BukuNonFiksi extends Buku {
  private String topik;

  public BukuNonFiksi(String judul, String pengarang, int tahunTerbit, String topik) {
    super(judul, pengarang, tahunTerbit);
    this.topik = topik;
  }

  @Override
  public void tampilkanInformasi() {
    super.tampilkanInformasi();
    System.out.println("Topik: " + topik);
  }
}
