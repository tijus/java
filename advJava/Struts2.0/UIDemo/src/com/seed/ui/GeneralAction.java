package com.seed.ui;
import com.opensymphony.xwork2.ActionSupport;
public class GeneralAction extends ActionSupport {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String platform;
  private String servers;
  private String language;
  private String technology;
  private String file;
 
	public String getFile() {
		  return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getServers() {
		return servers;
	}
	public void setServers(String servers) {
		this.servers = servers;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String execute() throws Exception {
		      return SUCCESS;   
	}
}
