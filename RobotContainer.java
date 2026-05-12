package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

Joystick Controller = new Joystick(0);
Arm arm= new Arm();

private void button(){
  new JoystickButton (Controller, 1).whileTrue(new IntakeCommand(m_intake, 0.7));
}