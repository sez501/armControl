package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;



public class Arm extends SubsystemBase{
    private final TalonFX armmotor = newTalon(5);
        
            public Arm(){
                armMotor.getConfigurator().apply(new TalonFXConfiguration());
            }
    
    
    
        private final TalonFX armMotor = new TalonFX(5);

        public void setIntakeSpeed(double speed) {
            TalonFX intakeMotor;
                        intakeMotor.set(speed);

        }
        public double getIntakeSpeed(){
            TalonFX intakeMotor;
                        return intakeMotor.get();
        }
    }
