package Compiler2015.IR.Instruction.Arithmetic;

import Compiler2015.IR.IRRegister.IRRegister;

/**
 * rd = rs / rt
 */
public class DivideReg extends Arithmetic {
	public IRRegister rd, rs, rt;

	public DivideReg(IRRegister rd, IRRegister rs, IRRegister rt) {
		this.rd = rd;
		this.rs = rs;
		this.rt = rt;
	}

	@Override
	public String toString() {
		return String.format("%s = %s / %s", rd, rs, rt);
	}

}