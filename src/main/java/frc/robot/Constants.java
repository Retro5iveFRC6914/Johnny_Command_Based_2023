// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  //Controller ports defined here
  public static class OIConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kDriverLeftJoystickPort = 1;
    public static final int kDriverRightJoystickPort = 1;
  }
  
  //Drivetrain ports and variables defined here
  public static class DrivetrainConstants {
    public static final int kDriveMotorFrontLeft = 3;
    public static final int kDriveMotorFrontRight = 50;
    public static final int kDriveMotorBackLeft = 9;
    public static final int kDriveMotorBackRight = 5;
  }

  //Arm ports listed here
  public static class ArmConstants {
    public static final int kArmMotor = 1;
  }

  //Intake ports listed here
  public static class IntakeConstants {
    public static final int kIntakeMotor = 11;
  }

  //AutoConstants
  public static class AutoConstants {
    public static final int kFrontLeftEncoder = 3;
    public static final int kFrontRightEncoder = 50;
    public static final int kBackLeftEncoder = 9;
    public static final int kBackRightEncoder = 5;

    public static final int[] kLeftEncoder = {3, 9};
    public static final int[] kRightEncoder = {50, 5};
    public static final boolean kLeftEncoderReversed = false;
    public static final boolean kRightEncoderReversed = true;

    public static final int kGyro = 4;

    public static final double kGyroPitch = 0;
    public static final double kGyroYaw = 0;
    public static final double kGyroRoll = 0;

    public static final int ARM_CURRENT_LIMIT_A = 20;
    public static final double ARM_OUTPUT_POWER = 0.25;
    public static final int INTAKE_CURRENT_LIMIT_A = 25;
    public static final int INTAKE_HOLD_CURRENT_LIMIT_A = 5;
    public static final double INTAKE_OUTPUT_POWER = 0.40;
    public static final double INTAKE_HOLD_POWER = 0.0;
    public static final double ARM_EXTEND_TIME_S = 2.0;
    public static final double AUTO_THROW_TIME_S = 0.375;
    public static final double AUTO_DRIVE_TIME = 5.0;
    public static final double AUTO_DRIVE_SPEED = 0.20;
    public static final double AUTO_BALANCE_SPEED = 0.05;

  }
}
