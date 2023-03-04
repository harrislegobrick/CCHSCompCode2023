package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
    private final DoubleSolenoid pistons;

    public Arm(){
        pistons = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 1);
        retract();
    }

    public void extend(){
        pistons.set(Value.kForward);
    }

    public void retract(){
        pistons.set(Value.kReverse);
    }

    public void cancel(){
        pistons.set(Value.kOff);
    }
}
