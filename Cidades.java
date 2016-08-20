
/**
 *
 * @author Serrano
 */
public class Cidades {

    private String cidade;
    private int longitude, latitude;

    public Cidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cidades(String cidade, int latitude, int longitude) {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Cidade: " + cidade + "\nLatitudade: " + latitude + "\nLongitude: " + longitude;
    }
}
