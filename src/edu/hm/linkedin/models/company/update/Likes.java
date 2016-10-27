package edu.hm.linkedin.models.company.update;

public class Likes {
	private int _total;
	private LinkValues values;
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public LinkValues getValues() {
		return values;
	}
	public void setValues(LinkValues values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "Likes [_total=" + _total + ", values=" + values + "]";
	}
}
