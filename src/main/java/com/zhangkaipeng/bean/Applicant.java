package com.zhangkaipeng.bean;

public class Applicant {
	private Integer aid;//	主键	int	否	唯一主键，自增长
	private String aname;//	应聘人	varchar(30)	否	
	private String gender;//	性别	varchar(6)	否	对应的Java属性为枚举
	private String birthday;//	出生日期	date	否	页面显示时要根据生日计算年龄
	private String college;//	毕业大学	varchar(50)	否	
	private String major;//	所学专业	varchar(30)	否	
	private Integer edu;//	学历	int	否	1-专科，2-本科，3-研究生
	private Integer degree;//	学位	int	否	1-学士，2-硕士，3-博士
	private String created;//	创建日期	datetime	否	保存记录时的时间
	
	private String score;//   面试成绩
	private Double avgScore; //   平均分
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Applicant(Integer aid, String aname, String gender, String birthday, String college, String major,
			Integer edu, Integer degree, String created, String score, Double avgScore) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.gender = gender;
		this.birthday = birthday;
		this.college = college;
		this.major = major;
		this.edu = edu;
		this.degree = degree;
		this.created = created;
		this.score = score;
		this.avgScore = avgScore;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Integer getEdu() {
		return edu;
	}
	public void setEdu(Integer edu) {
		this.edu = edu;
	}
	public Integer getDegree() {
		return degree;
	}
	public void setDegree(Integer degree) {
		this.degree = degree;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public Double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}
	@Override
	public String toString() {
		return "Applicant [aid=" + aid + ", aname=" + aname + ", gender=" + gender + ", birthday=" + birthday
				+ ", college=" + college + ", major=" + major + ", edu=" + edu + ", degree=" + degree + ", created="
				+ created + ", score=" + score + ", avgScore=" + avgScore + "]";
	}
}
