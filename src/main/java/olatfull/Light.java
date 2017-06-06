package olatfull;

/**
 * C
 */
public class Light {
    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    private final String color;
    private final int duration;

    public Light(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
}
