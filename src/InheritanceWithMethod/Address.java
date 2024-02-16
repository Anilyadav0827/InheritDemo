package InheritanceWithMethod;

public class Address {
    public String cityName;
    public String countryName;

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public Address(){
        this.cityName="hyd";
        this.countryName="India";
    }
}
