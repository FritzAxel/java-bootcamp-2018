package Blog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;


public class BlogTest {

	Entry entry = new Entry("1", "Title", "Subtitle", "Body", null);
	
	@Test
	public final void whenNewPostEntry() throws Exception{
		Blog blog = new Blog();
		blog.postNewEntry(entry);
		assertEquals(blog.getEntriesList().get(0), entry);
	}
	
	@Test
	public final void whenDeleteAnExistingEntry() throws Exception {
		Blog blog = new Blog();
		blog.deleteEntry(entry);
		List<Entry> list = blog.getEntriesList();
		assertFalse(list.contains(entry));
	}
	
}
