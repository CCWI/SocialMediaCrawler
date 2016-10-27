package edu.hm.linkedin.models.company.update.comments;

public class CompanyUpdateComments {
	private int _total;
	private CompanyUpdateComment values;
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public CompanyUpdateComment getValues() {
		return values;
	}
	public void setValues(CompanyUpdateComment values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "CompanyUpdateComments [_total=" + _total + ", values=" + values + "]";
	}
}
