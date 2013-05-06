package cau.se.chw.importers;

/**
 * <code>UnhandledSwitchBranch</code> is used in the default case of a switch
 * statement. It is thrown when the switch statement does not cover all cases
 * (anymore).
 * 
 * @author chw
 * 
 */
public class UnhandledSwitchBranch extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new instance of {@link UnhandledSwitchBranch}.
	 * @param string
	 */
	public UnhandledSwitchBranch(String string) {
		super(string);
	}

}
