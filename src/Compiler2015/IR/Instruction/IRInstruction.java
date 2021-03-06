package Compiler2015.IR.Instruction;

import Compiler2015.Exception.CompilationError;
import Compiler2015.IR.IRRegister.IRRegister;
import Compiler2015.IR.IRRegister.VirtualRegister;

public abstract class IRInstruction implements Cloneable {

	public VirtualRegister rd;

	public abstract IRInstruction getExpression();

	public abstract int[] getAllDefUId();

	public abstract int[] getAllUseUId();

	public abstract VirtualRegister[] getAllDefVR();

	public abstract VirtualRegister[] getAllUseVR();

	public abstract IRRegister[] getAllDef();

	public abstract void setAllDef(IRRegister version[]);

	public abstract IRRegister[] getAllUse();

	public abstract void setAllUse(IRRegister version[]);

	public VirtualRegister detectVirtualRegister(IRRegister r) {
		if (r instanceof VirtualRegister)
			return (VirtualRegister) r.clone();
		return null;
	}

	@Override
	public abstract String toString();

	@Override
	public IRInstruction clone() {
		try {
			return (IRInstruction) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new CompilationError("Internal Error.");
		}
	}

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object o);
}
