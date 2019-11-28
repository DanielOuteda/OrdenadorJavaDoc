package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class CPU {

    private int speed;
    private int memory;

    public CPU() {

    }

    /**
     *
     * @param speed
     * @param memory
     */
    public CPU(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     * constructor speed sin parametros
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * constructror speed con parametros
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Creamos un get paraque nos devuelva la memoria
     *
     * @return
     */
    public int getMemory() {
        return memory;
    }

    /**
     * le damos valores a memora
     * @param mem
     */
    public void setMemory(int mem) {
        this.memory = mem;
    }
}
