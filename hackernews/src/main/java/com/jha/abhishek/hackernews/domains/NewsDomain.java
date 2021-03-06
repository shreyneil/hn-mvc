package com.jha.abhishek.hackernews.domains;

import java.text.SimpleDateFormat;
import java.util.Date;;

public class NewsDomain {

	Long id;
	String title;
	String url;
	String time;
	Long score;

	public NewsDomain() {
		super();
	}

	public NewsDomain(Long id, String title, String url, String time, Long score) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.time = time;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	// Overloaded setter
	public void setTime(Long time) {
		Date d = new Date(time);
		SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		this.time = FORMAT.format(d);
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "HackernewsDomain [id=" + id + ", title=" + title + ", url=" + url + ", time=" + time + ", score="
				+ score + "]";
	}

}
