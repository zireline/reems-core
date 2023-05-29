package com.splitscale.reems.tenantinfo;

import java.sql.Date;

public class TenantInfoResponse {
  private String id;
  private String tenantName;
  private Date created;
  private Date edited;

  public TenantInfoResponse(String id, String tenantName, Date created, Date edited) {
    this.id = id;
    this.tenantName = tenantName;
    this.created = created;
    this.edited = edited;
  }

  public TenantInfoResponse() {
    //default
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getEdited() {
    return edited;
  }

  public void setEdited(Date edited) {
    this.edited = edited;
  }
}
