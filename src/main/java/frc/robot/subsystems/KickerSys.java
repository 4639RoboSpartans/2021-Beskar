/*----------------------------------------------------------------------------*/
/* Copyright (c) 2020 FRC Team 4639. All Rights Reserved.                     */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.subsystems;

import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import command.SubsystemBase;

public class KickerSys extends SubsystemBase {
	private final WPI_VictorSPX kicker;

	public KickerSys() {
		this.kicker = new WPI_VictorSPX(Constants.KICKER_CAN);
		kicker.configFactoryDefault();
		kicker.setNeutralMode(NeutralMode.Coast);
	}

	public void setKicker(double num) {
		kicker.set(num);
	}

	@Override
	public void periodic() {
	}
}
