package cau.se.chw.importers;

public interface IDynamicsImporter {

	/**
	 * Clears all dynamic data and then loads the new dynamic data from the
	 * given file.
	 * 
	 * @param absolutePath
	 * @throws ImportExeption 
	 */
	void loadFromFile(String absolutePath) throws ImportExeption;

}
