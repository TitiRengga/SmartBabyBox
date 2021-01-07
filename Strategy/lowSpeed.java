public class lowSpeed implements speed {
    private String swing;

    public void power(String on) {
        System.out.println(on);
    }

    public void speedControl(String swing) {
        this.swing = swing;
        System.out.println(swing);
    }

    public String getSpeed() {
        return "low Speed";
    }
}