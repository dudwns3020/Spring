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
	private int hitCount;
	private String extra_writerName;
	private boolean extra_actorCanModify;
	private boolean extra_actorCanDelete;
	private int extra_goodReactionPoint;
	private int extra_badReactionPoint;
	private int extra_sumReactionPoint;

	public String getForPrintType1RegDate() {
		return regDate.substring(2, 16).replace(" ", "<br>");
	}

	public String getForPrintType1UpdateDate() {
		return updateDate.substring(2, 16).replace(" ", "<br>");
	}

	public String getForPrintType2RegDate() {
		return regDate.substring(2, 16);
	}

	public String getForPrintType2UpdateDate() {
		return updateDate.substring(2, 16);
	}
}