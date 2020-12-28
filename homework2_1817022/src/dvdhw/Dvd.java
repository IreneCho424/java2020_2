package dvdhw;

import java.io.Serializable;

//1817022 조이린
/*
 * Dvd 클래스
 * DVD의 정보를 받아 객체를 생성하기 위한 DVD 클래스
 */

enum Genre{ //DVD의 장르에 대한 열거 타입 생성
	Action, Comic, Romantic, Drama, ETC
}

public class Dvd implements Serializable{
	private String ISBN;
	private String title;
	private Person producer;
	private String manufactureContry;
	private Genre genre;
	
	public Dvd(String ISBN, String title, Person producer, String manufactureContry, Genre genre) {
		this.ISBN = ISBN;
		this.title = title;
		this.producer = producer;
		this.manufactureContry = manufactureContry;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "ISBN:" + ISBN + " 제목:" + title + " 제작자:" + producer.getName() + " 제조국:"
				+ manufactureContry + " 장르: " + genre;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public Person getProducer() {
		return producer;
	}

	public String getManufactureContry() {
		return manufactureContry;
	}

	public Genre getGenre() {
		return genre;
	}
	
	

}
