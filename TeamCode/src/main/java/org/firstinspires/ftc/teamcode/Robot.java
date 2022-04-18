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
   
    double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
    double frontLeftPower = (y + x + rx) / denominator;
    double backLeftPower = (y - x + rx) / denominator;
    double frontRightPower = (y - x - rx) / denominator;
    double backRightPower = (y + x - rx) / denominator;

   frontRight = Range.clip(frontRight, -1, 1);
   frontLeft = Range.clip(frontLeft, -1, 1);
   backRight = Range.clip(backRight, -1, 1);
   backLeft = Range.clip(backLeft, -1, 1);
 
   frontLeft.setPower(frontLeftPower);
   backLeft.setPower(backLeftPower);
   frontRight.setPower(frontRightPower);
   backRight.setPower(backRightPower);
  }
  idle();
 }
}
