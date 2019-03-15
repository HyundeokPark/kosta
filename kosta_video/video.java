package kosta_video;

public class video {
	//번호 제목 배우
	private int vNum;
	private String title;
	private String actor;
	
	public video() {
		
	}

	public int getVnum() {
		return this.vNum;
	}

	public String getTitle() {
		return this.title;
	}

	public String getActor() {
		return actor;
	}

	public video(int vnum, String title, String actor) {
		super();
		this.vNum = vnum;
		this.title = title;
		this.actor = actor;
	}
	
}
