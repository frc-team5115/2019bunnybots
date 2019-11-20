package frc.team5115.Commands;


import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.Robot.Robot;

public class InhaleBalls extends Command {
    public InhaleBalls() {
        requires(Robot.intake);
        setTimeout(.9);
    }

    protected void initialize() {
        Robot.intake.Inhale();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }
}
