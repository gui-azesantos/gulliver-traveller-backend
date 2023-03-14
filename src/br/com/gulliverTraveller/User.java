package br.com.gulliverTraveller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	private int id;
	private String name;
	private String email;

	public User(int id, String nome, String email) {
		this.id = id;
		this.name = nome;
		this.email = email;
	}

	public List<FavoriteList> getFavorites() {

		ArrayList<FavoriteList> favoritelist = new ArrayList<>();
		String[] articles = { "Artigo 1", "Artigo 2" };
		favoritelist.add(new FavoriteList(1, articles));
		return favoritelist;

	}

	public List<TripScript> getTripScript() {
		ArrayList<TripScript> tripScript = new ArrayList<>();
		tripScript.add(new TripScript(1, "2023-02-17", "Minha viagem dos sonhos",
				"Um roteiro incrível para conhecer lugares incríveis", 1));
		return tripScript;
	}

	public List<Post> createPost(int id, Date created_at, String title, String content, int user_id) {
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

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
