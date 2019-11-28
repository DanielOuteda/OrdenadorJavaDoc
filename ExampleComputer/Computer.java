package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class Computer {

    private Mouse mouse = new Mouse();
    private Screen screen = new Screen();
    private CPU processor = new CPU();

    /**
     * constructor sin parametros
     */
    public Computer() {

    }

    /**
     * contructor con parametros
     * @param mouse
     * @param screen
     * @param cpu 
     */
    public Computer(Mouse mouse, Screen screen, CPU cpu) {
        this.mouse = mouse;
        this.screen = screen;
        this.processor = cpu;
    }

    /**
     * le damos valores a mouse
     * @param mouse 
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * recibimos los valores de mouse
     * @return 
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * le damos valores a screen
     * @param screen 
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
 
    /**
     * recibimos valores de screen
     * @return 
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * le damos valores a cpu
     * @param cpu 
     */
    public void setCpu(CPU cpu) {
        this.processor = cpu;
    }

    /**
     * recibimos valores de cpu
     * @return 
     */
    public CPU getCpu() {
        return processor;
    }

    /**
     * enseñamos 
     */
    public void show() {
        System.out.println();

    }
}
