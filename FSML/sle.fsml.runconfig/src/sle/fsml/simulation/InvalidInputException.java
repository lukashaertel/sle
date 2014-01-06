package sle.fsml.simulation;

import sle.fsml.fSML.FSMState;

public class InvalidInputException extends RuntimeException {

	private static final long serialVersionUID = -4546690554934037994L;

	public final FSMState state;

	public final String token;

	public InvalidInputException(FSMState state, String token) {
		super(token + " invalid in " + state.getName());

		this.state = state;
		this.token = token;
	}

}
