package Assignment2;

import java.text.DecimalFormat;

public interface Shapes {
    // Print double to string 1 decimal places (="%.1f")
    DecimalFormat df=new DecimalFormat("0.0");
    double getDistance(Poin2D A, Poin2D B);
    double getArea();
}