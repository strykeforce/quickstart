package org.strykeforce.quickstart;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

  @Override
  public void robotInit() {
    System.out.println("Hello!");
  }

  @Override
  public void robotPeriodic() { }

  @Override
  public void disabledInit() {
    System.out.println("I'm disabled.");
  }

  @Override
  public void disabledPeriodic() {}

  @Override
  public void autonomousInit() {
    System.out.println("I'm enabled in autonomous.");
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    System.out.println("I'm enabled in teleop.");
  }

  @Override
  public void teleopPeriodic() {}
}
