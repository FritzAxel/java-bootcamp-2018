package Blog;

import java.awt.Image;
/**
 * 
 * @author Axel Fritz
 *
 */
public class Entry {

	private String idEntry;
	private String title;
	private String subtitle;
	private String body;
	private Image image;
	
	public Entry(String id, String title, String subtitle, String body, Image img) {
		this.idEntry = id;
		this.title = title;
		this.subtitle = subtitle;
		this.body = body;
		this.image = img;
	}

	
	
	@Override
	public String toString() {
		return "Entry [idEntry=" + idEntry + ", title=" + title + ", subtitle=" + subtitle + ", body=" + body
				+ ", image=" + image + "]";
	}



	public String getIdEntry() {
		return idEntry;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
	
	
}
