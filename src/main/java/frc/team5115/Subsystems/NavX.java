package frc.team5115.Subsystems;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

public class NavX {
    private AHRS navx; //turn baby.
    private double angle; //angle is total accumulated.
    private double yaw; //relative to start, from -180 to 180.
    private double yVelocity;

    public NavX() {
        navx = new AHRS(SPI.Port.kMXP);
        navx.reset(); //reset to the start orientation
    }

    /**
     * resets the navx yaw value to 0. Relative to the current position of the robot.
     */
    public void navxAngleReset() {
        navx.reset(); //reset to the field orientation
        System.out.println("Angle has been reset.");
        System.out.println(navx.getYaw() + " = 0");
    }

    /**
     * @return totalAccumulated Angle -gajillion to a gajillion
     */
    double getAngle() {
        return angle;
    }

    /**
     * @return angle -180 to 180
     */
    double getYaw() {
        return yaw;
    }

    double getYVelocity() {
        return yVelocity;
    }

    /**
     * Run a update the values.
     */
    public void runTick() {
        angle = navx.getAngle();
        yaw = navx.getYaw();
        yVelocity = navx.getVelocityY();
    }
    //todome use this a bit to get a jist.
    public void printVelocities() { //it is for seeing if the x and y velocities are any good. Possible use for kightly drive.
        System.out.println("Y Velocity" + navx.getVelocityY());
    }
}