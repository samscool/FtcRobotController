package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "SamDrivetrain", group = "LinearOpMode")

public class teleop extends LinearOpMode {
    // declare motors
    DcMotor motorLeft;
    DcMotor motorRight;

    public void runOpMode () {
        // initialize motors 1
        motorLeft = hardwareMap.get(DcMotor.class, "leftMotor");
        motorRight = hardwareMap.get(DcMotor.class, "rightMotor");

        motorLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        // set the motors to controller input
        while (opModeIsActive()) {
            motorLeft.setPower(gamepad1.left_stick_y);
            motorRight.setPower(gamepad1.right_stick_y);
        }
    }
}