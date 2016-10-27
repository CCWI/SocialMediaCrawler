package edu.hm.linkedin.models.company.update;

public class Source {
	private Application application;
	private ServiceProvider serviceProvider;
	private String serviceProviderShareId;
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getServiceProviderShareId() {
		return serviceProviderShareId;
	}
	public void setServiceProviderShareId(String serviceProviderShareId) {
		this.serviceProviderShareId = serviceProviderShareId;
	}
}
