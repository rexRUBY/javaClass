public class Song {
	private String title;
	private String artist;
	private String year;
	private String country;
	
	public Song (){
		//기본 생성자
	}
	
	public Song(String t, String a, String y, String c){
		this.title=t;
		this.artist=a;
		this.year=y;
		this.country=c;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen","ABBA","1978","스웨덴");
		s.show();
	}
}
