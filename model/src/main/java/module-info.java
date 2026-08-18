import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.ui.capability.UiEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.ui {
	
	exports org.nasdanika.models.ui;
	exports org.nasdanika.models.ui.impl;
	exports org.nasdanika.models.ui.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.threat;
	
	
	provides CapabilityFactory with 
		UiEPackageResourceSetCapabilityFactory;
	
}