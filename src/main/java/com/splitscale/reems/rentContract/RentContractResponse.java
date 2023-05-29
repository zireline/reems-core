package com.splitscale.reems.rentContract;

public class RentContractResponse {
    private String id;
    private String tenantInfoId;
    private String propertyId;

    public RentContractResponse(String id, String tenantInfoId, String propertyId) {
        this.id = id;
        this.tenantInfoId = tenantInfoId;
        this.propertyId = propertyId;
    }

    public RentContractResponse() {
        // default
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenantInfoId() {
        return tenantInfoId;
    }

    public void setTenantInfoId(String tenantInfoId) {
        this.tenantInfoId = tenantInfoId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }
}
