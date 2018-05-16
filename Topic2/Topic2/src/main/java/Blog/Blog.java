package Blog;

import java.util.ArrayList;

/**
 * 
 * @author Axel Fritz
 *
 */
public class Blog {

	private ArrayList<Entry> entriesList;
	
	public Blog() {
		entriesList = new ArrayList<Entry>();
	}
	
	/**
	 * This method add the new entry to the entriesList and show the entire entry.
	 * @param newEntry
	 * @throws Exception 
	 */
	public void postNewEntry(Entry newEntry) throws Exception {
		if(!newEntry.getTitle().equals(null) || !newEntry.getBody().equals(null)) {
			entriesList.add(newEntry);
			newEntry.toString();
		}else
			throw new Exception("The entry is not suitable");
	}
	
	/**
	 * This method delete an existing entry.
	 * @param entry
	 * @throws Exception
	 */
	public void deleteEntry(Entry entry) throws Exception {
		if(entriesList.contains(entry))
			entriesList.remove(entry);
		else
			throw new Exception("This entry does not exist in the blog");
	}
	
	/**
	 * This method show the 10 most recent entries.
	 */
	public void show10RecentEntries() {
		int size = 10;
		if(entriesList.size() < 10) {
			size = entriesList.size();
		}
			for(int i = 0; i <= size; i++) {
				entriesList.get(i).toString();
			}
	}
	
	/**
	 * This method return the entire list of entries.	
	 * @return ArrayList.
	 */
	public ArrayList<Entry> getEntriesList(){
		return entriesList;
	}
}
