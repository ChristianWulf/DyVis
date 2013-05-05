package cau.se.chw.importers;

public interface IStaticsImporter {

	/**
	 * Clears all static data and then loads the new static data from the given
	 * file.
	 * 
	 * @param absolutePath
	 */
	void loadFromFile(final String absolutePath);
}
