/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

/**
 *
 * @author LuisIván
 */
public class Edge {
    private int dest;
    private int source;
    private double wight;

    public Edge(int dest, int source) {
        this.dest = dest;
        this.source = source;
    }

    public Edge(int dest, int source, double wight) {
        this.dest = dest;
        this.source = source;
        this.wight = wight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.dest;
        hash = 97 * hash + this.source;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.wight) ^ (Double.doubleToLongBits(this.wight) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Edge other = (Edge) obj;
        if (this.dest != other.dest) {
            return false;
        }
        if (this.source != other.source) {
            return false;
        }
        if (Double.doubleToLongBits(this.wight) != Double.doubleToLongBits(other.wight)) {
            return false;
        }
        return true;
    }
    
    public int getDest() {
        return dest;
    }

    public int getSource() {
        return source;
    }

    public double getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return "Edge{" + "dest=" + dest + ", source=" + source + ", wight=" + wight + '}';
    }
    
    
    
    
}
