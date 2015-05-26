package Compiler2015.Translate.Naive.MIPS;

import Compiler2015.IR.CFG.CFGVertex;
import Compiler2015.IR.CFG.ControlFlowGraph;

import java.util.ArrayList;

public final class NaiveSequentializer {
	public static ArrayList<CFGVertex> process() {
		ArrayList<CFGVertex> ret = new ArrayList<>(ControlFlowGraph.vertices);
		ControlFlowGraph.outBody.id = Integer.MAX_VALUE;
		ret.sort((o1, o2) -> o1.id - o2.id);
		return ret;
	}
}