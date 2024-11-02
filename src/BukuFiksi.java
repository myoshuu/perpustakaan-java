public class BukuFiksi extends Buku{
  private String genre;

  public BukuFiksi(String judul, String pengarang, int tahunTerbit, String genre) {
    super(judul, pengarang, tahunTerbit);
    this.genre = genre;
  }

  @Override
  public void tampilkanInformasi() {
    super.tampilkanInformasi();
    System.out.println("Genre: " + genre);
  }
}
