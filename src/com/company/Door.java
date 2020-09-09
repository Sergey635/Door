package com.company;

public class Door extends Rectangle {
    private String material;
    private String appointment;   //призначення
    private int numberOfLeaves;   // кількість дверей(одинарнф/подвійні)
    private String locked;
    private String glass;

    public Door() {
    }

    public Door(String material, String appointment, int numberOfLeaves, String locked, String glass) {
        this.material = material;
        this.appointment = appointment;
        this.numberOfLeaves = numberOfLeaves;
        this.locked = locked;
        this.glass = glass;
    }

    public Door(int length, int width, String material, String appointment, int numberOfLeaves, String locked, String glass) {
        super(length, width);
        this.material = material;
        this.appointment = appointment;
        this.numberOfLeaves = numberOfLeaves;
        this.locked = locked;
        this.glass = glass;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getGlass() {

        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    @Override
    public String toString() {
        return "Door{"
                + "length='" + super.getLength() + '\''
                + ", width='" + super.getWidth() + '\''
                + ", material='" + this.getMaterial() + '\''
                + ", appointment='" + this.getAppointment() + '\''
                + ", numberOfLeaves='" + this.getNumberOfLeaves() + '\''
                + ", locked='" + this.getLocked() + '\''
                + ", glass='" + this.getGlass() + '\''
                + '}';
    }
}
