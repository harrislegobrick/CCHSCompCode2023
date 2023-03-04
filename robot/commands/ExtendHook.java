package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.Hook;

public class ExtendHook extends ParallelCommandGroup{
    public ExtendHook(Hook hook){
        addCommands(
            new InstantCommand(hook::retract)
        );
    }
}
