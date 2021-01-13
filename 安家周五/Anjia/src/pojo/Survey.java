package pojo;

public class Survey {

    private String add;
    private String height;
    private String year;
    private String area;
    private String price;


    @Override
    public String toString() {
        return "Survey{" +
                "add='" + add + '\'' +
                ", height='" + height + '\'' +
                ", year='" + year + '\'' +
                ", area='" + area + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}