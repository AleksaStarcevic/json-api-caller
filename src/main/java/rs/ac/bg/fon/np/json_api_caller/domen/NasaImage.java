package rs.ac.bg.fon.np.json_api_caller.domen;



public class NasaImage {
	private String date;
	private String media_type;
	private String explanation;
	private String title;
	private String url;
	
	public NasaImage() {
		// TODO Auto-generated constructor stub
	}
	
	

	

	public NasaImage(String date, String media_type, String explanation, String title, String url) {
		this.date = date;
		this.media_type = media_type;
		this.explanation = explanation;
		this.title = title;
		this.url = url;
	}





	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "NasaImage [date=" + date + ", media_type=" + media_type + ", explanation=" + explanation + ", title="
				+ title + ", url=" + url + "]";
	}
	
	

}
