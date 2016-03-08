package br.com.xavier.graphs.abstractions.parser;

import br.com.xavier.graphs.abstractions.AbstractGraph;
import br.com.xavier.graphs.abstractions.edges.AbstractEdge;
import br.com.xavier.graphs.abstractions.nodes.AbstractNode;
import br.com.xavier.graphs.abstractions.parser.AbstractGraphParser;

public abstract class AbstractGraphsDraculaParser<N extends AbstractNode, E extends AbstractEdge<N>> extends AbstractGraphParser<N,E>{

	//XXX CONSTRUCTOR
	public AbstractGraphsDraculaParser() {}

	@Override
	protected String createNewGraph(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		return "";
		//return graphWidgetVar + " = new Graph();\n";
	}
	
	@Override
	protected String onDirectedGraph(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		return graphWidgetVar + ".edgeFactory.template.style.directed = true;\n";
	}
	
	@Override
	protected String onWeightedGraph(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		return "";
	}

	@Override
	protected String onLoopsAllowedGraph(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		return "";
	}

	@Override
	protected String onMultipleEdgesAllowedGraph(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		return "";
	}
	
	@Override
	protected String generateAddNodeStr(N node, String htmlElementContainer, String graphWidgetVar) {
		return graphWidgetVar + ".addNode('" + node.getLabel() + "');\n";
	}
	
	@Override
	protected String generateHeader(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		return "";
		//return "var redraw, g, layouter, renderer;\n";
	}
	
	@Override
	protected String generateFooter(AbstractGraph<N, E> graph, String htmlElementContainer, String graphWidgetVar) {
		StringBuffer sb = new StringBuffer();
		
		//String layouter = "layouter = new Graph.Layout.Spring(" + graphWidgetVar + ");\n"; 
		
		//String containerWidthStr = "$('#" + htmlElementContainer + "').width()";
		//String containerHeightStr = "$('#" + htmlElementContainer + "').height()";
		//String renderer = "renderer = new Graph.Renderer.Raphael('" + htmlElementContainer + "', " + graphWidgetVar + ", " + containerWidthStr + ", " + containerHeightStr + " );\n"; 
		
		//String doLayout = "layouter.layout();\n";
		//String doDraw = "renderer.draw();\n";
		
		//sb.append(layouter);
		//sb.append(renderer);
		//sb.append(doLayout);
		//sb.append(doDraw);
		
		return sb.toString();
	}
}
