package kosta_video;

public class video_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		video v1 = new video(1, "���̾��","�δ���");
		video v2 = new video(2, "��������", "���ϴ�");
		video v3 =new video(3,"�Ϻ��� Ÿ��", "������");
		
	
		generalMember g = new generalMember("aaa", "������1", "����", v2);
		sMember s = new sMember("bbb", "������2", "����",v3);
		generalMember s2 = new sMember("ccc", "������3", "����",v1);
		
		generalMember[] g1 = {g,s,s2};
		
		for(int i=0; i<3; i++) {
			g1[i].show();
		}
	}

}
