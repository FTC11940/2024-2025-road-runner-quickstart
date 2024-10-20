package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.PracticeMotorSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PracticeServoSubsystem;


@TeleOp(group = "drive", name = "TeleOp")

public class RobotContainer extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        // Subsystems
        // Create new instances of classes, including subsystems, and assign to a variable
        // FIXME RC1. Replace these with the names of actual subsystems
        PracticeServoSubsystem servoSub = new PracticeServoSubsystem(hardwareMap);
        PracticeMotorSubsystem motorSub = new PracticeMotorSubsystem(hardwareMap);
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        // Required to initialize the subsystems when starting the OpMode
        waitForStart();

        // ! negation operator, i.e. the running code is not stopped
        // alternative -- opModeIsActive() and `isStarted()`
        // While loop to keep the robot running
        while (!isStopRequested()) {

            // Call methods from the subsystems and assign them to button presses
            // FIXME RC2.Replace these with button presses with current Methods (actions in Subsystems).
            if (gamepad1.a) {
                motorSub.rotateMotor(0.25); // Run the motor with 0.5 power
            } else if (gamepad1.b) {
                motorSub.rotateMotorReverse(0.25); // Run the motor with 0.5 power in reverse
            } else {
                motorSub.stopMotor(); // Stop motor if neither button is pressed
            } // end of if statement for A and B buttons

            // Open gripper with gamepad Y button
            if (gamepad1.y) {
                servoSub.openServo(); // Open gripper
            } else if (gamepad1.x) {
                servoSub.closeServo(); // Close gripper
            } // end of if statement for Y button

        } // end of while loop

    } // end of runOpMode method

} // end of the class