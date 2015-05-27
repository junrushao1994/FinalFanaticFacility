package Compiler2015.IR.Instruction;

import Compiler2015.IR.IRRegister.IRRegister;
import Compiler2015.IR.IRRegister.VirtualRegister;

public class NopForBranch extends IRInstruction {

	public IRRegister rs;

	public NopForBranch(IRRegister rs) {
		this.rd = null;
		this.rs = rs;
	}

	@Override
	public int[] getAllDef() {
		return new int[0];
	}

	@Override
	public int[] getAllUse() {
		return new int[]{rs instanceof VirtualRegister ? rs.getUId() : -1};
	}

	@Override
	public void setAllDefVersion(int[] version) {
	}

	@Override
	public void setAllUseVersion(int[] version) {
		if (rs instanceof VirtualRegister)
			((VirtualRegister) rs).setVersion(version[0]);
	}

	@Override
	public VirtualRegister[] getAllSSADef() {
		return new VirtualRegister[0];
	}

	@Override
	public VirtualRegister[] getAllSSAUse() {
		return new VirtualRegister[]{detectVirtualRegister(rs)};
	}

	@Override
	public String toString() {
		return "NopForBranch " + rs;
	}
}
