package sle.fsml.simulation;

import sle.fsml.fSML.FSMState;

public class InfeasibleInputException extends RuntimeException {

	private static final long serialVersionUID = 1267028992023407597L;

	public final FSMState state;

	public final String token;

	public InfeasibleInputException(FSMState state, String token) {
		super(token + " infeasible in " + state.getName());

		this.state = state;
		this.token = token;
	}

}
