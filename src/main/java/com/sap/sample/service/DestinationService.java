package com.sap.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.BusinessPartnerService;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;

@Service
public class DestinationService {
	
	public String getBusinessPartner() {
		try {
			final HttpDestination destination = DestinationAccessor.getDestination("SI2").asHttp();
			final String destinationPropety = destination.get("Test.Propety").toString();
			final BusinessPartnerService service = new DefaultBusinessPartnerService();
			final List<BusinessPartner> result = service.getAllBusinessPartner().top(5).executeRequest(destination);
			return "destinationPropety:" + destinationPropety + " " + result;	
		} catch (Exception e) {
			return e.toString();
		}

	}

}
