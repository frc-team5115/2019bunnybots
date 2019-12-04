package frc.team5115.Robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Subsystems.Intake;
import frc.team5115.Subsystems.Cart;
import frc.team5115.Subsystems.Shooter;

public class Robot extends TimedRobot {
  public static Intake intake;
  public static Cart costco;
  public static Shooter shooter;

  @Override
  public void robotInit() {
    intake = new Intake();
    costco = new Cart();
    shooter = new Shooter();
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
