package observerpattern1;

public class Main {

	public static void main(String[] args) {
		NewsAgency conservativeNews = new NewsAgency("Conservative News");
		NewsChannel foxNews = new NewsChannel("Fox News");
		NewsChannel rushNews = new NewsChannel("Rush News");
		NewsChannel benNews = new NewsChannel("Ben News");
		NewsChannel rubinNews = new NewsChannel("Rubin News");

		conservativeNews.addObserver(foxNews);
		conservativeNews.addObserver(rushNews);
		conservativeNews.addObserver(benNews);
		conservativeNews.addObserver(rubinNews);

		conservativeNews.setNews("Something bad about Joe Biden");
		System.out.println("Fox News: " + foxNews.getNews()+ "\n\n");

		NewsAgency democratNews = new NewsAgency("Democrat News");
		NewsChannel msnbcNews = new NewsChannel("MSNBC News");
		NewsChannel cnnNews = new NewsChannel("CNN News");
		NewsChannel yahooNews = new NewsChannel("Yahoo News");
		NewsChannel youngTurksNews = new NewsChannel("Young Turks News");

		democratNews.addObserver(msnbcNews);
		democratNews.addObserver(cnnNews);
		democratNews.addObserver(yahooNews);
		democratNews.addObserver(youngTurksNews);

		democratNews.setNews("Something bad about Donald Trump");
		System.out.println("MSNVC News: " + msnbcNews.getNews() + "\n\n");
	}

}
