package Compiler2015.AST.Statement.ExpressionStatement.UnaryExpression;

import Compiler2015.AST.Statement.ExpressionStatement.Expression;
import Compiler2015.AST.Type.Type;

/**
 * Created by junrushao on 15-4-11.
 *
 * !e
 */
public class LogicalNot extends UnaryExpression {
	public LogicalNot(Expression e, Type type, boolean isLValue) {
		super(e, type, isLValue);
	}
}
