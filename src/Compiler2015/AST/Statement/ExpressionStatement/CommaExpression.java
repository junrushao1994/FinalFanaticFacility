package Compiler2015.AST.Statement.ExpressionStatement;

import Compiler2015.IR.CFG.ExpressionCFGBuilder;

/**
 * a, b, c
 */
public class CommaExpression extends Expression {
	public Expression e1, e2;

	public CommaExpression(Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.type = e2.type;
		this.isLValue = false;
	}

	public static Expression getExpression(Expression e1, Expression e2) {
		Integer v1 = toInt(e1), v2 = toInt(e2);
		if (v1 != null && v2 != null)
			return new IntConstant(v2);
		else
			return new CommaExpression(e1, e2);
	}

	@Override
	public String toString() {
		return String.format("(, %s %s)", e1, e2);
	}

	@Override
	public void emitCFG(ExpressionCFGBuilder builder) {
		e1.emitCFG(builder);
		e2.emitCFG(builder);
		e2.readInArrayRegister(builder);
		tempRegister = e2.tempRegister.clone();
	}

	@Override
	public CommaExpression clone() {
		CommaExpression ret = (CommaExpression) super.clone();
		ret.e1 = ret.e1.clone();
		ret.e2 = ret.e2.clone();
		return ret;
	}

	@Override
	public Expression rebuild() {
		return new CommaExpression(e1.rebuild(), e2.rebuild());
	}
}
