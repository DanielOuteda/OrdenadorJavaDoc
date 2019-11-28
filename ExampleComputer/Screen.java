package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class Screen {

    private String brand;
    private float inches;

    /**
     * constructor sin parametros
     */
    public Screen() {

    }

    /**
     * constructor con parametros
     * @param brand
     * @param inches 
     */
    public Screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    /**
     * le damos valores a brand
     * @return 
     */
    public String getBrand() {
        return brand;
    }

    /**
     * recibimos el valor de brand
     * @param brand 
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * le damos valores a inches
     * @return 
     */
    public float getInches() {
        return inches;
    }

    /**
     * recibimos los valores de inches
     * @param inches 
     */
    public void setInches(float inches) {
        this.inches = inches;
    }
}
