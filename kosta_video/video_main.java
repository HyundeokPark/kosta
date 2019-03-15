package kosta_video;

public class video_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		video v1 = new video(1, "아이언맨","로다주");
		video v2 = new video(2, "극한직업", "이하늬");
		video v3 =new video(3,"완벽한 타인", "조진웅");
		
	
		generalMember g = new generalMember("aaa", "박현덕1", "서울", v2);
		sMember s = new sMember("bbb", "박현덕2", "서울",v3);
		generalMember s2 = new sMember("ccc", "박현덕3", "서울",v1);
		
		generalMember[] g1 = {g,s,s2};
		
		for(int i=0; i<3; i++) {
			g1[i].show();
		}
	}

}
