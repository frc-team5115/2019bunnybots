package frc.team5115.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5115.Subsystems.*;


public class Robot extends TimedRobot {
  public static Intake intake;
  public static Shooter shooter;
  public static NavX navx;
  public static MecanumDrive driveTrain;
  public static Joystick joy;

  @Override
  public void robotInit() {
    intake = new Intake();
    shooter = new Shooter();
    navx = new NavX();
    driveTrain = new MecanumDrive();
    joy = new Joystick(0);

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
      driveTrain.drive(joy.getRawAxis(0), joy.getRawAxis(1), joy.getRawAxis(4));
      intake.Inhale();
      shooter.eject();
  }

  @Override
  public void testPeriodic() {

  }
}
