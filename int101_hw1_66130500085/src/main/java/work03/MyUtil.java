/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;

/**
 *
 * @author Poom Suthipong
 */
public class MyUtil {
    /**
     * This function is to find the BMI value.
     * @param weight
     * @param height
     * @return 
     */
    public static double calculateBMI(double weight,double height){
        return weight / Math.pow(height, 2);
    }
    
    /**
     * This function is to find the average of 3 inputs.
     * @param v1
     * @param v2
     * @param v3
     * @return 
     */
    public static double average(int v1,int v2,int v3){
        return (v1+v2+v3)/3;
    }
}
