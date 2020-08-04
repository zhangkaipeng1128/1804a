package com.zhangkaipeng.bean;

public class Score {
	private Integer aid;//	面试者ID	int	否	联合主键1
	private Integer jid;//	职位ID	int	否	联合主键2
	private Integer score;//	面试职位成绩	int	否	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(Integer aid, Integer jid, Integer score) {
		super();
		this.aid = aid;
		this.jid = jid;
		this.score = score;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [aid=" + aid + ", jid=" + jid + ", score=" + score + "]";
	}
}
