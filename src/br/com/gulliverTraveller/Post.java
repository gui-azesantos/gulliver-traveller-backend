package br.com.gulliverTraveller;

public class Post {
	private int id;
	private String created_at;
	private String title;
	private String content;
	private int user_id;

	public Post(int id, String string, String title, String content, int user_id) {
		this.id = id;
		this.created_at = string;
		this.title = title;
		this.content = content;
		this.user_id = user_id;
	}

	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(String created_at) {
		this.created_at = created_at;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
}
