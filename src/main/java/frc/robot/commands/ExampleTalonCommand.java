// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ExampleTalonSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class ExampleTalonCommand extends Command {
  /** Creates a new ExampleTalonCommand. */
  ExampleTalonSubsystem m_exampletalonSubsystem;
  
  private ExampleTalonCommand(ExampleTalonSubsystem exampletalonSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_exampletalonSubsystem = exampletalonSubsystem;
    addRequirements(m_exampletalonSubsystem); 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_exampletalonSubsystem.TalonForward();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_exampletalonSubsystem.TalonBackward();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
