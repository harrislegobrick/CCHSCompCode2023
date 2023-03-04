package frc.robot.commands.autons;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Drivetrain;

public class ChargeStation2 extends SequentialCommandGroup{
    private WPI_TalonFX frontLeft, backLeft, frontRight, backRight;
    private MotorControllerGroup left, right;
    public ChargeStation2(){
        frontLeft = new WPI_TalonFX(2);
        frontLeft.setInverted(true);
        backLeft = new WPI_TalonFX(1);
        backLeft.setInverted(true);
        //left = new MotorControllerGroup(frontLeft, backLeft);
        frontRight = new WPI_TalonFX(4);
        frontRight.setInverted(false);
        backRight = new WPI_TalonFX(3);
        //right = new MotorControllerGroup(frontRight, backRight);
        //left.set(0.5);
        //right.set(0.5);
        frontLeft.set(0.5);
        backLeft.set(0.5);
        frontRight.set(0.5);
        backRight.set(0.5);
        new WaitCommand(3);
        //left.set(0);
        //right.set(0);
    }
}
