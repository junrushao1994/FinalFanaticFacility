package Compiler2015.AST.Statement.ExpressionStatement;

import Compiler2015.AST.Type.StructOrUnionType;
import Compiler2015.AST.Type.Type;
import Compiler2015.Exception.CompilationError;
import Compiler2015.Utility.Utility;

/**
 * a.b
 */
public class MemberAccess extends Expression {
	public Expression su;
	public String memberName;

	public MemberAccess(Expression su, String memberName, Type type) {
		this.su = su;
		this.memberName = memberName;
		this.type = type;
		this.isLValue = true;
	}

	public static Expression getExpression(Expression a1, String a2) {
		if (!(a1.type instanceof StructOrUnionType))
			throw new CompilationError("Basic type cannot have members.");
		StructOrUnionType leftType = (StructOrUnionType) a1.type;
		Type memberType = leftType.directlyAccessableMembers.get(a2);
		if (memberType == null)
			throw new CompilationError("No such member.");
		return new MemberAccess(a1, a2, memberType);
	}

	@Override
	public String toString(int depth) {
		return Utility.getIndent(depth).append(".").append(memberName).append(Utility.NEW_LINE).append(su.toString(depth + 1)).toString();
	}
}
