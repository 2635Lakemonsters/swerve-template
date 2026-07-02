// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleTalonSubsystem extends SubsystemBase {
  /** Creates a new ExampleTalonMotor. */
  TalonFX m_exampleTalon;

  public ExampleTalonSubsystem(int deviceId) {
    m_exampleTalon = new TalonFX(deviceId); //device id
  }

  public void TalonForward() {
    m_exampleTalon.setVoltage(5);
  }

  public void TalonBackward() {
    m_exampleTalon.setVoltage(-5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
