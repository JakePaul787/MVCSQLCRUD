package data;

public class Song {
	int id, albumId;
	String title;
	
	public Song(int id, int albumId, String title) {
		super();
		this.id = id;
		this.albumId = albumId;
		this.title = title;
	}
	public Song() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
