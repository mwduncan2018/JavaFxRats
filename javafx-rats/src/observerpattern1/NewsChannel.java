package observerpattern1;

public class NewsChannel implements Channel {
	private String name;
	private String news;

	public NewsChannel(String name) {
		this.name = name;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getNews() {
		return this.news;
	}

	@Override
	public void update(Object news) {
		System.out.println("Updating news for " + this.name);
		this.setNews((String) news);
	}
}
