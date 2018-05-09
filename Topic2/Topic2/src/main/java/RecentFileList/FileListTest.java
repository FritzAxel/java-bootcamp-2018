package RecentFileList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;


public class FileListTest {
	
	
	@Test
	public final void whenEmptyStringIsUsedThenExceptionIsThrown() {
		RecentFiles.openFile("");
	}
	
	@Test
	public final void whenFirstRunThenListIsEmpty() {
		assertEquals(0, RecentFiles.getFileList().size());
	}
	

	
	
}
