/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleTasks;

import java.util.Arrays;

/**
 *
 * @author maxkrivich
 */
public abstract class Point
{

    private double coords[];

    public Point(int num)
    {
        this.coords = new double[num];
    }

    public void setCoord(int num, double x)
    {
        coords[num - 1] = x;
    }

    public double getCoord(int num)
    {
        return coords[num - 1];
    }

    public String toString()
    {
        return Arrays.toString(coords);
    }
}
