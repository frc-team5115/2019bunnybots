package frc.team5115.Commands;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.DualJoystick;
import frc.team5115.Robot.Robot;

import static frc.team5115.OI.joy;

public class Drive extends Command {
    private Joystick joystick;
    public Drive(DualJoystick dj) {
        this.joystick = dj.getOperatorJoystick();
    }

    protected void initialize() {
        System.out.println("Starting the drivetrain");
        Robot.mechDrive.mechDrive(joystick.getRawAxis(0),joystick.getRawAxis(1),joystick.getRawAxis(2),joystick.getRawAxis(3));
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }
}
