package frc.team5115.Subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Limelight {
    NetworkTable table;
    NetworkTableEntry tx;
    NetworkTableEntry ty;
    NetworkTableEntry ta;

    public Limelight() {

        table = NetworkTableInstance.getDefault().getTable("limelight");
        tx = table.getEntry("tx");
        ty = table.getEntry("ty");
        ta = table.getEntry("ta");

        double x = tx.getDouble(0.1);
        double y = ty.getDouble(-27.27);
        double area = ta.getDouble(-20.20);

        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("Limelight", y);
        SmartDashboard.putNumber("LimelightArea", area);
    }

    public double getx() {
        return tx.getDouble(0.1);
    }
    public double gety(){
        return ty.getDouble(-27.27);
    }
//    public double getarea(){
//        return area.ta.getDouble(-20.20);
//    }

}

