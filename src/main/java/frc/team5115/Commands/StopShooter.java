package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.Robot.Robot;

public class StopShooter extends Command{

        public StopShooter() {
            requires(Robot.shooter);
            setTimeout(.9);
        }

        protected void initialize() {
            Robot.shooter.stop();
        }

        protected boolean isFinished() {
            return true;
        }
    }

