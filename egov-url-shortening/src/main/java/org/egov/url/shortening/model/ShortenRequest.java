package org.egov.url.shortening.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShortenRequest {
	
	private String id;
	@NotNull
	private String url;
	private Long validFrom;
	private Long validTill;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Long validFrom) {
		this.validFrom = validFrom;
	}
	public Long getValidTill() {
		return validTill;
	}
	public void setValidTill(Long validTill) {
		this.validTill = validTill;
	}
	
 
	
}
