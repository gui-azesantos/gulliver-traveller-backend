package br.com.gulliverTraveller;

import java.util.ArrayList;
import java.util.List;

public class FavoriteList {
	private int id;
	private String[] list_post;

	public FavoriteList(int id, String[] articles) {
		this.id = id;
		this.list_post = articles;
	}

	public List<Post> getPosts() {
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1, "2023-02-17", "Título do post", "Conteúdo do post", 1));
		return post;
	}

	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getListPost() {
		return list_post;
	}

	public void setListPost(String[] list_post) {
		this.list_post = list_post;
	}
}
