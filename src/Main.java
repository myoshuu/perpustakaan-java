public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    BukuFiksi buku = new BukuFiksi("Pemrograman Java", "Yerymia Alfa Susetyo", 2024, "Horror");
    BukuNonFiksi buku2 = new BukuNonFiksi("Peterpan", "Saya", 2022, "Fantasy");
    buku.tampilkanInformasi();
    System.out.println(" ");
    buku2.tampilkanInformasi();
  }
}