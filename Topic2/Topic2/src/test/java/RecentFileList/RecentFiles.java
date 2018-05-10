package RecentFileList;

import java.util.ArrayList;

/**
 * 
 * @author Axel Fritz
 *
 */
public class RecentFiles {

	/**
	 * List of the recent files opened.
	 */
	public static ArrayList<String> fileList;
	
	/**
	 * MAXFILES is the maximum number of files that the list can contains.
	 */
	private final static int MAXFILES = 15;
	
	
	/**
	 * Constructor of the class, which created an empty list with the MAXFILES initial capacity.
	 */
	public RecentFiles() {
		this.fileList = new ArrayList<String>(MAXFILES);
	}
	
	
	public static ArrayList getFileList() {
		return fileList;
	}
	
	/**
	 * This method open a file and the file is added to the fileList.
	 * If the file already exists in the fileList, the file will be bumped to the top.
	 * If the fileList is full, the oldest file will be removed to add the new one.
	 * @param fileName
	 */
	public static void openFile(String fileName) {
		if(fileList.contains(fileName)) {
			fileList.remove(fileName);
			fileList.add(0,fileName);
		}else {
			if(fileList.size() == MAXFILES) {
				fileList.remove(MAXFILES);
				fileList.add(fileName);
			}else
				fileList.add(fileName);
		}
	}
	
	public static String getOldestFile() {
		return fileList.get(MAXFILES);
	}
	
	public static String getTop() {
		return fileList.get(0);
	}
	
}
