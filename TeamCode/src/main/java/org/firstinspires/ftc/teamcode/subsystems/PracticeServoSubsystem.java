package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class PracticeServoSubsystem {

    /**
     * This line of code declares a private, final field named gripperServo of type Servo.
     * private: This access modifier means the gripperServo field can only be accessed from within the same class where it is declared.
     * It cannot be accessed directly by other classes.
     * This promotes encapsulation and helps to maintain the integrity of the class's internal state.
     * final: This keyword means that the gripperServo field can only be assigned a value once.
     * After it is initialized, its value cannot be changed.
     * This makes the field a constant, ensuring its value remains consistent throughout the object's lifetime.
     * Servo: This is the data type of the field.
     * It indicates that gripperServo will hold a reference to an object of the Servo class.
     * gripperServo: This is the name of the field.
     * It is a descriptive name that suggests the servo motor is used for controlling a gripper mechanism.
     * In essence, this line of code declares a private constant field that represents a servo motor used for controlling a gripper.
     */
    private final Servo servoZero;

    // Constants for servo positions
    // Another suggestion would be te use an enum for these values
    private static final double SERVO_OPEN = 0.0;
    private static final double SERVO_CLOSED = 1.0;

    /**
     * Initializes the PracticeServoSubsystem with the necessary hardware.
     *
     * @param hardwareMap The hardware map from the OpMode.
     */

    /**
     * The line of code you provided is the declaration of a constructor for a class named PracticeServoSubsystem.
     * public: This is an access modifier that indicates this constructor can be accessed from any other class.
     * PracticeServoSubsystem: This is the name of the class that the constructor belongs to. This suggests that the class is intended to simulate or mock the behavior of a real servo subsystem, likely for testing or development purposes.
     * (HardwareMap hardwareMap): This is the constructor's parameter list. It takes a single argument of type HardwareMap. This HardwareMap object likely provides access to the hardware components of a robot or system, allowing the PracticeServoSubsystem to interact with them (or simulate interactions) during its operation.
     * In essence, this constructor initializes a new instance of the PracticeServoSubsystem class, taking a HardwareMap object as input to potentially configure or control its behavior.
     */
    public PracticeServoSubsystem(HardwareMap hardwareMap) {

        servoZero = hardwareMap.get(Servo.class,"servoZero");

        // Set servo direction
        servoZero.setDirection(Servo.Direction.FORWARD);
        servoZero.setPosition(SERVO_OPEN);

    }

    /**
     * The code defines a method named openGripper that is designed to open a gripper, likely a robotic gripper or a similar mechanical device. It achieves this by setting the position of a servo motor, which is presumably controlling the gripper's opening and closing mechanism.
     * Line-by-line explanation:
     * public void openGripper() {: This line declares a public method named openGripper.
     * public: This keyword indicates that the method can be accessed from any other part of the program or even from other programs.
     * void: This keyword specifies that the method does not return any value.
     * openGripper(): This is the name of the method, suggesting its purpose.
     * gripperServo.setPosition(GRIPPER_OPEN);: This line is the core of the method's functionality.
     * gripperServo: This is likely an object representing the servo motor that controls the gripper. It could be an instance of a custom class or a library class designed for interacting with servo motors.
     * setPosition(): This is a method call on the gripperServo object, instructing it to set its position.
     * GRIPPER_OPEN: This is likely a constant or a variable that holds the desired position value for opening the gripper. It could be a numerical value representing an angle or a predefined state.
     * In essence, the code instructs a specific servo motor (gripperServo) to move to a position designated for opening the gripper (GRIPPER_OPEN).
     * */
    /**
     * Opens the gripper.
     */
    public void openServo() {
        servoZero.setPosition(SERVO_OPEN);
    }

    /**
     * Closes the gripper.
     */
    public void closeServo() {
        servoZero.setPosition(SERVO_CLOSED);
    }
}