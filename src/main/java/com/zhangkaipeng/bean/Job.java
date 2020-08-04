package com.zhangkaipeng.bean;

public class Job {
	private Integer jid;//	主键	int		否	唯一主键，自增长
	private String jname;//	职位名称	varchar(80)		否	
	private Integer requireEdu;//	最低学历要求	int		否	例如最低学历为本科，那么录入专科面试者的成绩时报错。
	private Integer requireDegree;//	最低学位要求	int		否	例如最低学历要“博士”时，那么“学士”和“硕士”应聘者成绩录入时报错
	private String intro;//	职位说明	longtext		否	
	
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(Integer jid, String jname, Integer requireEdu, Integer requireDegree, String intro) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.requireEdu = requireEdu;
		this.requireDegree = requireDegree;
		this.intro = intro;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public Integer getRequireEdu() {
		return requireEdu;
	}
	public void setRequireEdu(Integer requireEdu) {
		this.requireEdu = requireEdu;
	}
	public Integer getRequireDegree() {
		return requireDegree;
	}
	public void setRequireDegree(Integer requireDegree) {
		this.requireDegree = requireDegree;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jname=" + jname + ", requireEdu=" + requireEdu + ", requireDegree="
				+ requireDegree + ", intro=" + intro + "]";
	}
	
}
