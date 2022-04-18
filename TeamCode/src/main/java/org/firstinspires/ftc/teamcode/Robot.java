package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Util;

@Disabled
@TeleOp(name = "Sean X Drive", group = "TeleOp")
public class SeanXDrive extends LinearOpMode {

public class Sean_X_Drive 
 DcMotor frontRight;
 DcMotor frontLeft;
 DcMotor backRight;
 DcMotor backLeft;
 
 @Override 
 public void runOpMode() throws InterruptedExeception {
  
  frontRight = hardwareMap.dcMotor.get("FR");
  frontLeft = hardwareMap.dcMotor.get("FL");
  backRight = hardwareMap.dcMotor.get("BR");
  backLeft = hardwareMap.dcMotor.get("BL");

  frontRight.setDirection(DcMotor.Direction.REVERSE);
  frontLeft.setDirection(DcMotor.Direction.REVERSE);
  
  waitForStart();
  
  while (opModeIsActive()) {
  double y = gamepad1.left_stick_y;
  double x = gamepad1.right_stick_x * 1.1;
  double rx = gamepad1.left_stick_x;
}    
