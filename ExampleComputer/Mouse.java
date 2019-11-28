package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class Mouse {

    private String type;

    /**
     * creamos un constructor sin parametros
     */
    public Mouse() {

    }

    /**
     * creamos un constructor con parametros llamado tipo
     *
     * @param type
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     * le damos valores a tipo
     * @param type
     */
    public void setMouse(String type) {
        this.type = type;
    }

    /**
     * recibimos los valores de tipo
     * @return
     */
    public String getMouse() {
        return type;
    }
}
