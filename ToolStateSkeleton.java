package Assignment1.map;

/**
 * <p>
 * this is a singleton class meant as single location to hold all active {@link Tools} information.</br>
 * </p>
 */
public final class ToolStateSkeleton{

	/**
	 * <p>
	 * static final variable of singleton with eager initialization.</br>
	 * </p>
	 */
	private static final ToolStateSkeleton STATE = new ToolStateSkeleton();

	/**
	 * <p>
	 * {@link Tools} variable and its default initialization.</br>
	 * </p>
	 */
	private Tools tool = Tools.ROOM;
	
	/**
	 * <p>
	 * options variable and its default initialization.</br>
	 * </p>
	 */
	private int option = 4;

	/**
	 * <p>
	 * private default constructor to prevent creation of this object.</br>
	 * </p>
	 */
	private ToolStateSkeleton(){
	}

	/**
	 * <p>
	 * return current singleton of this {@link ToolStateSkeleton}. this method does not lazy initialize.</br>
	 * </p>
	 * @return singleton value of {@link ToolStateSkeleton}
	 */
	public static ToolStateSkeleton state(){
		return STATE;
	}

	/**
	 * <p>
	 * set the correct {@link Tools} and reset options to zero.</br>
	 * </p>
	 * @param tool - {@link Tools} object
	 */
	public void setTool( Tools tool){
		this.tool = tool;
		option = 0;
	}

	/**
	 * <p>
	 * current active {@link Tools}.</br>
	 * </p>
	 * @return active {@link Tools}
	 */
	public Tools getTool(){
		return tool;
	}

	/**
	 * <p>
	 * set the option for the current active {@link Tools}.</br>
	 * </p>
	 * @param option - integer value representing the option for current active {@link Tools}
	 */
	public void setOption( int option){
		this.option = option;
	}

	/**
	 * <p>
	 * integer value representing the option for current active {@link Tools}</br>
	 * </p>
	 * @return integer value representing the option for current active {@link Tools}
	 */
	public int getOption(){
		return option;
	}
}
