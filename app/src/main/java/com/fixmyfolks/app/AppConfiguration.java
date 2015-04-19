package com.fixmyfolks.app;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppConfiguration extends Configuration {
    public static final String DEFAULT_VENMO_ENDPOINT = "https://api.venmo.com";

	@NotEmpty
	private String version;
	
	@NotEmpty
	private String db;
	
	@NotEmpty
	private String venmoClientId;
	
	@NotEmpty
	private String venmoClientSecret;

    private String venmoClientEndpoint = DEFAULT_VENMO_ENDPOINT;
	
	@NotEmpty
	private String sendGridUsername;
	
	@NotEmpty
	private String sendGridPassword;
	
	@JsonProperty
	public String getVersion() {
		return version;
	}
	
	@JsonProperty
	public String getDb() {
		return db;
	}
	
	@JsonProperty
	public String getVenmoClientId() {
		return venmoClientId;
	}
	
	@JsonProperty
	public String getVenmoClientSecret() {
		return venmoClientSecret;
	}

	@JsonProperty
	public String getSendGridUsername() {
		return sendGridUsername;
	}

	@JsonProperty
	public String getSendGridPassword() {
		return sendGridPassword;
	}

    @JsonProperty
    public String getVenmoClientEndpoint() {
        return venmoClientEndpoint;
    }
	
}
