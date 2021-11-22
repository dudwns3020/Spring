package com.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	private int id;
	private String regDate;
	private String updateDate;
	private int memberId;
	private String title;
	private String body;
	private String extra_writerName;
	private boolean extra_actorCanModify;
	private boolean extra_actorCanDelete;

	public String getRegDateForPrint() {
		return regDate.substring(2, 16);
	}

	public String getUpdateDateForPrint() {
		return updateDate.substring(2, 16);
	}
}