package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Drive;
import frc.team5115.Constants;
import frc.team5115.OI;

public class MecanumDrive extends Subsystem{

    edu.wpi.first.wpilibj.drive.MecanumDrive driveMath;

    WPI_TalonSRX frontLeft;
    WPI_TalonSRX frontRight;
    WPI_TalonSRX backLeft;
    WPI_TalonSRX backRight;

    AHRS gyro;

    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    public MecanumDrive(){
        frontLeft = new WPI_TalonSRX(Constants.FRONT_LEFT_MOTOR_ID);
        frontRight = new WPI_TalonSRX(Constants.FRONT_RIGHT_MOTOR_ID);
        backLeft = new WPI_TalonSRX(Constants.BACK_LEFT_MOTOR_ID);
        backRight = new WPI_TalonSRX(Constants.BACK_RIGHT_MOTOR_ID);

        gyro = new AHRS(SPI.Port.kMXP);
        gyro.reset();

        driveMath = new edu.wpi.first.wpilibj.drive.MecanumDrive(frontLeft, backLeft, frontRight, backRight);
    }

    public void drive(double x, double y, double z){
        driveMath.driveCartesian(y, x, z, gyro.getAngle());
    }

}