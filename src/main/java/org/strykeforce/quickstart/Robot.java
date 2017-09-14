package org.strykeforce.quickstart;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends IterativeRobot {

  XboxController controller = new XboxController(0);
  Servo servo = new Servo(1);

  @Override
  public void teleopPeriodic() {
    double position = controller.getY(Hand.kLeft) * 0.5 + 0.5;
    servo.set(position);
  }
}
