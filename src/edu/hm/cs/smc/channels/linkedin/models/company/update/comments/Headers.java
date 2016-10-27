package edu.hm.cs.smc.channels.linkedin.models.company.update.comments;

public class Headers {
	private int _total;
	private HeaderValues values;
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public HeaderValues getValues() {
		return values;
	}
	public void setValues(HeaderValues values) {
		this.values = values;
	}
}
