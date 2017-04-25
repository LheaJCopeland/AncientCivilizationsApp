/**
 * Created by LheaJLove on 4/24/2017.
 */
public class Civilization {
    private String name;
    private String year;
    private String wonder;

    public Civilization(String name, String year, String wonder) {
        this.name = name;
        this.year = year;
        this.wonder = wonder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getWonder() {
        return wonder;
    }

    public void setWonder(String wonder) {
        this.wonder = wonder;
    }

    @Override
    public String toString(){
        return name + ", " + year + ", " + wonder;
    }
}
