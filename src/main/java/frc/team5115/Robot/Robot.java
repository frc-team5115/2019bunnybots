package frc.team5115.Robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.OI;
import frc.team5115.Subsystems.*;


public class Robot extends TimedRobot {
  public static Intake intake;
  public static Shooter shooter;
  public PowerDistributionPanel PDP;
  public static NavX navx;
  public static MecanumDrive driveTrain;
  public static OI OI;

  @Override
  public void robotInit() {
    intake = new Intake();
    shooter = new Shooter();
    navx = new NavX();
    driveTrain = new MecanumDrive();
    OI = new OI();

    PDP = new PowerDistributionPanel(0);
  }

  @Override
  public void robotPeriodic() {
    navx.runTick();
  }

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
    PDP.getTotalCurrent();
  }
}
