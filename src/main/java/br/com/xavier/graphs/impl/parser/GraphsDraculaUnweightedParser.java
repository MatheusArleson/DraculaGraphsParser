package br.com.xavier.graphs.impl.parser;

import br.com.xavier.graphs.abstractions.edges.AbstractEdge;
import br.com.xavier.graphs.abstractions.nodes.AbstractNode;
import br.com.xavier.graphs.abstractions.parser.AbstractGraphsDraculaParser;

public class GraphsDraculaUnweightedParser<N extends AbstractNode, E extends AbstractEdge<N>> extends AbstractGraphsDraculaParser<N, E>{
	
	//XXX CONSTRUCTOR
	public GraphsDraculaUnweightedParser() {}
	
	//XXX OVERRIDE METHODS
	@Override
	protected String generateAddEdgeStr(E edge, String graphWidgetVar, boolean isGraphDirected, boolean isGraphWeighted) {
		//abstraction take care of un\direction
		
		String sourceNode = edge.getSource().getLabel();
		String targetNode = edge.getTarget().getLabel();
		
		String addEdgeStr = graphWidgetVar + ".addEdge('" + sourceNode + "','" + targetNode + "');\n";
		return addEdgeStr;
	}

}
