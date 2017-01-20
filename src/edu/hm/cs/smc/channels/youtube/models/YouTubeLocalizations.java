package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeLocalizations extends BaseEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization en;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization es;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization de;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization fr;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization it;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization ru;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization pt;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization ar;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization hi;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization zh;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization ja;

	public YouTubeLocalization getEn() {
		return en;
	}

	public void setEn(YouTubeLocalization en) {
		this.en = en;
	}

	public YouTubeLocalization getEs() {
		return es;
	}

	public void setEs(YouTubeLocalization es) {
		this.es = es;
	}

	public YouTubeLocalization getDe() {
		return de;
	}

	public void setDe(YouTubeLocalization de) {
		this.de = de;
	}

	public YouTubeLocalization getFr() {
		return fr;
	}

	public void setFr(YouTubeLocalization fr) {
		this.fr = fr;
	}

	public YouTubeLocalization getIt() {
		return it;
	}

	public void setIt(YouTubeLocalization it) {
		this.it = it;
	}

	public YouTubeLocalization getRu() {
		return ru;
	}

	public void setRu(YouTubeLocalization ru) {
		this.ru = ru;
	}

	public YouTubeLocalization getPt() {
		return pt;
	}

	public void setPt(YouTubeLocalization pt) {
		this.pt = pt;
	}

	public YouTubeLocalization getAr() {
		return ar;
	}

	public void setAr(YouTubeLocalization ar) {
		this.ar = ar;
	}

	public YouTubeLocalization getHi() {
		return hi;
	}

	public void setHi(YouTubeLocalization hi) {
		this.hi = hi;
	}

	public YouTubeLocalization getZh() {
		return zh;
	}

	public void setZh(YouTubeLocalization zh) {
		this.zh = zh;
	}

	public YouTubeLocalization getJa() {
		return ja;
	}

	public void setJa(YouTubeLocalization ja) {
		this.ja = ja;
	}

	@Override
	public String toString() {
		return "YouTubeLocalizations [en=" + en + ", es=" + es + ", de=" + de + ", fr=" + fr + ", it=" + it + ", ru="
				+ ru + ", pt=" + pt + ", ar=" + ar + ", hi=" + hi + ", zh=" + zh + ", ja=" + ja + "]";
	}

}
