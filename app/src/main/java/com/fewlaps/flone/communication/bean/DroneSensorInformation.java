package com.fewlaps.flone.communication.bean;

/**
 * A bean with 3 values: heading, pitch and roll.
 *
 * @author Roc Boronat (roc@fewlaps.com)
 * @date 07/05/2015
 */
public class DroneSensorInformation {
    private double yaw;
    private double pitch;
    private double roll;

    public DroneSensorInformation(double yaw, double pitch, double roll) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
    }

    public double getYaw() {
        return yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public double getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "DroneSensorInformation{" +
                "yaw=" + yaw +
                ", pitch=" + pitch +
                ", roll=" + roll +
                '}';
    }
}