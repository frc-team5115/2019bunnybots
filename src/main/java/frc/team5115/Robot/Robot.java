package frc.team5115.Robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Subsystems.*;

public class Robot extends TimedRobot {
  public static Intake intake;
  public static Cart costco;
  public static Shooter shooter;
  public PowerDistributionPanel PDP;
  public static NavX navx;
  public static MechDrive mechDrive;

  @Override
  public void robotInit() {
    intake = new Intake();
    costco = new Cart();
    shooter = new Shooter();
    navx = new NavX();
    mechDrive = new MechDrive();

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
