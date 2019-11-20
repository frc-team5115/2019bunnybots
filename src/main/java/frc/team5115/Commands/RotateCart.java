package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.Robot.Robot;

public class RotateCart extends Command{
        public RotateCart() {
            requires(Robot.costco);
            setTimeout(.9);
        }

        protected void initialize() {
            Robot.costco.Rotate();
        }

        protected boolean isFinished() {
            return true;
        }
}

