public class Album {
    private String albumName;
    private String artist;
    private int total;
    private int available;
    private int rented;

    // Constructor
    public Album(String albumName, String artist, int total, int available, int rented) {
        this.albumName = albumName;
        this.artist = artist;
        this.total = total;
        this.available = available;
        this.rented = rented;
    }

    // Getter dan Setter untuk albumName
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    // Getter dan Setter untuk artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Getter dan Setter untuk total
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    // Getter dan Setter untuk available
    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    // Getter dan Setter untuk rented
    public int getRented() {
        return rented;
    }

    public void setRented(int rented) {
        this.rented = rented;
    }
}
