/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

import java.util.List;

/**
 *
 * @author LuisIván
 */
public class ListGraph extends AbstractGraph{
    private List<Edge>[] edges;

    public ListGraph(List<Edge>[] edges, boolean directed, int numV) {
        super(directed, numV);
        this.edges = edges;
    }

    public ListGraph(boolean directed, int numV) {
        super(directed, numV);
    }

    
    
    public List<Edge>[] getEdges() {
        return edges;
    }

    public void setEdges(List<Edge>[] edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "ListGraph{" + "edges=" + edges + '}';
    }

    
    

    
    
    
}
