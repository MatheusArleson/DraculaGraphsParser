package br.com.xavier.graphs.abstractions.parser;

import br.com.xavier.graphs.abstractions.AbstractGraph;
import br.com.xavier.graphs.abstractions.edges.AbstractEdge;
import br.com.xavier.graphs.abstractions.nodes.AbstractNode;
import br.com.xavier.graphs.abstractions.parser.AbstractGraphParser;

public abstract class AbstractGraphsDraculaParser<N extends AbstractNode, E extends AbstractEdge<N>> extends AbstractGraphParser<N,E>{

	//XXX CONSTRUCTOR
	public AbstractGraphsDraculaParser() {}

	@Override
	protected String createNewGraph(String graphWidgetVar) {
		return graphWidgetVar + " = new Graph();\n";
	}
	
	@Override
	protected String onDirectedGraph(AbstractGraph<N, E> graph, String graphWidgetVar) {
		return graphWidgetVar + "edgeFactory.template.style.directed = true;\n";
	}

	@Override
	protected String onWeightedGraph(AbstractGraph<N, E> graph, String graphWidgetVar) {
		return "";
	}

	@Override
	protected String onLoopsAllowedGraph(AbstractGraph<N, E> graph, String graphWidgetVar) {
		return "";
	}

	@Override
	protected String onMultipleEdgesAllowedGraph(AbstractGraph<N, E> graph, String graphWidgetVar) {
		return "";
	}

	@Override
	protected String generateAddNodeStr(N node, String graphWidgetVar) {
		return graphWidgetVar + ".addNode('" + node.getLabel() + "');\n";
	}
}
