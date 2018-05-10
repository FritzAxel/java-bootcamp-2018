package RecentFileList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;


public class FileListTest {
	
	
	
	@Test
	public final void whenFirstRunThenListIsEmpty() {
		assertEquals(0, RecentFiles.getFileList().size());
	}
	
	@Test
	public final void whenAFileIsOpenedIsAddedToTheList() {
		String file = "example";
		RecentFiles.openFile("example");
		assertEquals(RecentFiles.getTop(), file);
	}
	
	@Test
	public final void whenAFileAlreadyExistsIsBumpedToTheTop() {
		String file1 = "example1";
		String file2 = "example2";

		RecentFiles.openFile(file1);
		RecentFiles.openFile(file2);
		RecentFiles.openFile(file1);
		
		assertEquals(RecentFiles.getTop(), file1);
	}

	@Test
	public final void whenTheFileListIsFullTheOldestFilesIsRemovedWhenANewItemIsAdded() {
		String oldest = RecentFiles.getOldestFile();
		String file1 = "example1";
		
		RecentFiles.openFile(file1);
		
		assertNotEquals(oldest, RecentFiles.getOldestFile());
	}
	
}
