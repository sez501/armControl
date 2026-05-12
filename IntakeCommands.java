package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class Commands extends Command {
    private final Arm m_intake;
    private final double m_speed;

    public Commands(Arm subsystem, double speed){
        m_intake= subsystem;
        m_speed = speed;
        addRequirements(m_intake);

    }

    @Override
    public void initialize(){
        m_intake.setIntakeSpeed(m_speed);
    }

    @Override
    public void end (boolean interrupted){
        m_intake.setIntakeSpeed(0);
    }
}
