package Compiler2015.AST.Statement.ExpressionStatement.UnaryExpression;

import Compiler2015.AST.Statement.ExpressionStatement.Expression;
import Compiler2015.IR.CFG.ExpressionCFGBuilder;
import Compiler2015.IR.IRRegister.ImmediateValue;
import Compiler2015.Type.IntType;

public class Sizeof extends UnaryExpression {
	public Sizeof(Expression e) {
		super(e);
		this.type = IntType.instance;
	}

	@Override
	public String getOperator() {
		return "Sizeof";
	}

	@Override
	public void emitCFG(ExpressionCFGBuilder builder) {
		e.emitCFG(builder);
		tempRegister = new ImmediateValue(e.type.sizeof());
	}

	@Override
	public Sizeof clone() {
		return (Sizeof) super.clone();
	}

	@Override
	public Expression rebuild() {
		return new Sizeof(e.rebuild());
	}
}
