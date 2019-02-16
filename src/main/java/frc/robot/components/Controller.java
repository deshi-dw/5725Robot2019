package frc.robot.components;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;

public class Controller {
    public Joystick joystick = new Joystick(RobotMap.CONTROLLER_PORT_1);
    public JoystickButton joystickButton = new JoystickButton(joystick, 0);

    // Need to find out where these are used
    public double x = 0.0;
    public double y = 0.0;

    public double[] snapValues = new double[] { 0.0, 0.3, 1.0 };

    public double GetX() {
        return joystick.getRawAxis(0);
    }

    public double GetY() {
        return joystick.getRawAxis(1);
    }

    // TODO: Test Snapping. I'm fairly sure it somewhat works but I'm also not sure if it's useful.
    // Same wtih 'GetSnappedY'
    public double GetSnappedX() {
        double x = joystick.getRawAxis(0);

        for(int i = 0; i <= snapValues.length-2; i++) {
            if(x > snapValues[i]) x = snapValues[i+1];
        }

        return x;
    }
    public double isTriggurePressed(){
        // TODO: get if a triggure is pressed
        return 0.0f;
    }
    public double GetSnappedY() {
        double y = joystick.getRawAxis(1);

        for(int i = 0; i <= snapValues.length-2; i++) {
            if(y > snapValues[i]) y = snapValues[i+1];
        }

        return y;
    }
}