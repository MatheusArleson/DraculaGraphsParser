package br.com.xavier.graphs.impl.parser;

import java.math.BigDecimal;

import br.com.xavier.graphs.abstractions.edges.AbstractWeightedEdge;
import br.com.xavier.graphs.abstractions.nodes.AbstractNode;
import br.com.xavier.graphs.abstractions.parser.AbstractGraphsDraculaParser;

public class GraphsDraculaWeightedParser<N extends AbstractNode, E extends AbstractWeightedEdge<N>> extends AbstractGraphsDraculaParser<N, E>{
	
	//XXX CONSTRUCTOR
	public GraphsDraculaWeightedParser() {}
	
	//XXX OVERRIDE METHODS
	
	@Override
	protected String generateAddEdgeStr(E edge, String htmlElementContainer, String graphWidgetVar, boolean isGraphDirected, boolean isGraphWeighted) {
		//abstraction take care of un\direction
		
		String sourceNode = edge.getSource().getLabel();
		String targetNode = edge.getTarget().getLabel();
		BigDecimal edgeWeight = edge.getWeight();
		
		String addEdgeStr = graphWidgetVar + ".addEdge('" + sourceNode + "','" + targetNode + "'," + "{label : '" + edgeWeight + "'});\n";
		return addEdgeStr;
	}
	
}
