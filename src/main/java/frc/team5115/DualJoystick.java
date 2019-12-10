package frc.team5115;

import edu.wpi.first.wpilibj.Joystick;

public class DualJoystick {

    private static final int MAX_JOYSTICKS = 6;

    //-1? you wouldn't have a negative number if you kept on that grind :exhale emoji:
    //#ripgrandma #grinddontstop #robotics4ever #lmaocringe
    private int driverPort = -1;
    private int operatorPort = -1;

    //thats why i gotta define the joysticks that i defineedddddd
    private Joystick driverJoystick;
    private Joystick operatorJoystick;

    public DualJoystick(){
        //go through all them joysticks
        //we bouta nyoom this bitch
        for(int i = 0; i < MAX_JOYSTICKS; i++){
            //if this bitch exists
            if(new Joystick(i).getButtonCount() > 0){
                //and we don't have a driver joystick
                if(this.driverPort == -1)
                    //make it the driver joystick
                    driverPort = i;
                else
                    //otherwise it should be the operator joysticks
                    operatorPort = i;
            }
        }
        initializeSticks(driverPort, operatorPort);
    }

    public DualJoystick(int driverPort, int operatorPort){
        //yeehaw we don't have to find them automatically
        //which is slow as shit
        this.driverPort = driverPort;
        this.operatorPort = operatorPort;
        initializeSticks(this.driverPort, this.operatorPort);
    }

    public void initializeSticks(int driverPort, int operatorPort){
        //commit existence
        driverJoystick = new Joystick(driverPort);
        operatorJoystick = new Joystick(operatorPort);
    }

    public void operatorToDriverOverride(){
        //mom said it was my turn to play on the xbox
        if(operatorJoystick.getPort() == driverPort){
            initializeSticks(driverPort, operatorPort);
        } else {
            initializeSticks(driverPort, driverPort);
        }
    }

    public void driverToOperatorOverride(){
        //no u
        if(driverJoystick.getPort() == operatorPort){
            initializeSticks(driverPort, operatorPort);
        } else {
            initializeSticks(operatorPort, operatorPort);
        }
    }

    public void swapInstances(){
        //"what im about to do here is called a pro gamer move (castling)"
        // -Adam Cooke, Founder of the Wheaton High School Chess Club for Chess at Wheaton High School
        if(driverJoystick.getPort() == driverPort){
            initializeSticks(operatorPort, driverPort);
        } else {
            initializeSticks(driverPort, operatorPort);
        }
    }

    public Joystick getDriverJoystick(){
        //I'm you, but more important
        return driverJoystick;
    }

    public Joystick getOperatorJoystick(){
        //Who are you?
        return operatorJoystick;
    }

    public int getDriverPort(){
        //"Wow, this is worthless"
        //-Dipper Pines, Gravity Falls
        return driverPort;
    }

    public int getOperatorPort(){
        //"Just like you James... just like you."
        //-Richard Scott... probably
        return operatorPort;
    }

    //we out this bitch
    //*drops mic*
}