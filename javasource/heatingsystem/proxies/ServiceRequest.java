// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package heatingsystem.proxies;

public class ServiceRequest
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject serviceRequestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HeatingSystem.ServiceRequest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SrNo("SrNo"),
		CreationDate("CreationDate"),
		ServiceType("ServiceType"),
		Assigned("Assigned"),
		ServiceRequest_Customer("HeatingSystem.ServiceRequest_Customer"),
		Equipment_ServiceRequest("HeatingSystem.Equipment_ServiceRequest"),
		WorkOrder_ServiceRequest("HeatingSystem.WorkOrder_ServiceRequest"),
		TechnicianTask_ServiceRequest("HeatingSystem.TechnicianTask_ServiceRequest"),
		ServiceRequest_TechnicianAccount("HeatingSystem.ServiceRequest_TechnicianAccount");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject serviceRequestMendixObject)
	{
		if (serviceRequestMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, serviceRequestMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.serviceRequestMendixObject = serviceRequestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ServiceRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static heatingsystem.proxies.ServiceRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return heatingsystem.proxies.ServiceRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static heatingsystem.proxies.ServiceRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new heatingsystem.proxies.ServiceRequest(context, mendixObject);
	}

	public static heatingsystem.proxies.ServiceRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return heatingsystem.proxies.ServiceRequest.initialize(context, mendixObject);
	}

	public static java.util.List<heatingsystem.proxies.ServiceRequest> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> heatingsystem.proxies.ServiceRequest.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of SrNo
	 */
	public final java.lang.Long getSrNo()
	{
		return getSrNo(getContext());
	}

	/**
	 * @param context
	 * @return value of SrNo
	 */
	public final java.lang.Long getSrNo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.SrNo.toString());
	}

	/**
	 * Set value of SrNo
	 * @param srno
	 */
	public final void setSrNo(java.lang.Long srno)
	{
		setSrNo(getContext(), srno);
	}

	/**
	 * Set value of SrNo
	 * @param context
	 * @param srno
	 */
	public final void setSrNo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long srno)
	{
		getMendixObject().setValue(context, MemberNames.SrNo.toString(), srno);
	}

	/**
	 * @return value of CreationDate
	 */
	public final java.util.Date getCreationDate()
	{
		return getCreationDate(getContext());
	}

	/**
	 * @param context
	 * @return value of CreationDate
	 */
	public final java.util.Date getCreationDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CreationDate.toString());
	}

	/**
	 * Set value of CreationDate
	 * @param creationdate
	 */
	public final void setCreationDate(java.util.Date creationdate)
	{
		setCreationDate(getContext(), creationdate);
	}

	/**
	 * Set value of CreationDate
	 * @param context
	 * @param creationdate
	 */
	public final void setCreationDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date creationdate)
	{
		getMendixObject().setValue(context, MemberNames.CreationDate.toString(), creationdate);
	}

	/**
	 * Set value of ServiceType
	 * @param servicetype
	 */
	public final heatingsystem.proxies.Enum_ServiceType getServiceType()
	{
		return getServiceType(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceType
	 */
	public final heatingsystem.proxies.Enum_ServiceType getServiceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ServiceType.toString());
		if (obj == null) {
			return null;
		}
		return heatingsystem.proxies.Enum_ServiceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ServiceType
	 * @param servicetype
	 */
	public final void setServiceType(heatingsystem.proxies.Enum_ServiceType servicetype)
	{
		setServiceType(getContext(), servicetype);
	}

	/**
	 * Set value of ServiceType
	 * @param context
	 * @param servicetype
	 */
	public final void setServiceType(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.Enum_ServiceType servicetype)
	{
		if (servicetype != null) {
			getMendixObject().setValue(context, MemberNames.ServiceType.toString(), servicetype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.ServiceType.toString(), null);
		}
	}

	/**
	 * @return value of Assigned
	 */
	public final java.lang.Boolean getAssigned()
	{
		return getAssigned(getContext());
	}

	/**
	 * @param context
	 * @return value of Assigned
	 */
	public final java.lang.Boolean getAssigned(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Assigned.toString());
	}

	/**
	 * Set value of Assigned
	 * @param assigned
	 */
	public final void setAssigned(java.lang.Boolean assigned)
	{
		setAssigned(getContext(), assigned);
	}

	/**
	 * Set value of Assigned
	 * @param context
	 * @param assigned
	 */
	public final void setAssigned(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean assigned)
	{
		getMendixObject().setValue(context, MemberNames.Assigned.toString(), assigned);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ServiceRequest_Customer
	 */
	public final heatingsystem.proxies.Customer getServiceRequest_Customer() throws com.mendix.core.CoreException
	{
		return getServiceRequest_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceRequest_Customer
	 * @throws com.mendix.core.CoreException
	 */
	public final heatingsystem.proxies.Customer getServiceRequest_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		heatingsystem.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServiceRequest_Customer.toString());
		if (identifier != null) {
			result = heatingsystem.proxies.Customer.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ServiceRequest_Customer
	 * @param servicerequest_customer
	 */
	public final void setServiceRequest_Customer(heatingsystem.proxies.Customer servicerequest_customer)
	{
		setServiceRequest_Customer(getContext(), servicerequest_customer);
	}

	/**
	 * Set value of ServiceRequest_Customer
	 * @param context
	 * @param servicerequest_customer
	 */
	public final void setServiceRequest_Customer(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.Customer servicerequest_customer)
	{
		if (servicerequest_customer == null) {
			getMendixObject().setValue(context, MemberNames.ServiceRequest_Customer.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ServiceRequest_Customer.toString(), servicerequest_customer.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Equipment_ServiceRequest
	 */
	public final heatingsystem.proxies.Equipment getEquipment_ServiceRequest() throws com.mendix.core.CoreException
	{
		return getEquipment_ServiceRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of Equipment_ServiceRequest
	 * @throws com.mendix.core.CoreException
	 */
	public final heatingsystem.proxies.Equipment getEquipment_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		heatingsystem.proxies.Equipment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Equipment_ServiceRequest.toString());
		if (identifier != null) {
			result = heatingsystem.proxies.Equipment.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Equipment_ServiceRequest
	 * @param equipment_servicerequest
	 */
	public final void setEquipment_ServiceRequest(heatingsystem.proxies.Equipment equipment_servicerequest)
	{
		setEquipment_ServiceRequest(getContext(), equipment_servicerequest);
	}

	/**
	 * Set value of Equipment_ServiceRequest
	 * @param context
	 * @param equipment_servicerequest
	 */
	public final void setEquipment_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.Equipment equipment_servicerequest)
	{
		if (equipment_servicerequest == null) {
			getMendixObject().setValue(context, MemberNames.Equipment_ServiceRequest.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Equipment_ServiceRequest.toString(), equipment_servicerequest.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkOrder_ServiceRequest
	 */
	public final heatingsystem.proxies.WorkOrder getWorkOrder_ServiceRequest() throws com.mendix.core.CoreException
	{
		return getWorkOrder_ServiceRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkOrder_ServiceRequest
	 * @throws com.mendix.core.CoreException
	 */
	public final heatingsystem.proxies.WorkOrder getWorkOrder_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		heatingsystem.proxies.WorkOrder result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkOrder_ServiceRequest.toString());
		if (identifier != null) {
			result = heatingsystem.proxies.WorkOrder.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkOrder_ServiceRequest
	 * @param workorder_servicerequest
	 */
	public final void setWorkOrder_ServiceRequest(heatingsystem.proxies.WorkOrder workorder_servicerequest)
	{
		setWorkOrder_ServiceRequest(getContext(), workorder_servicerequest);
	}

	/**
	 * Set value of WorkOrder_ServiceRequest
	 * @param context
	 * @param workorder_servicerequest
	 */
	public final void setWorkOrder_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.WorkOrder workorder_servicerequest)
	{
		if (workorder_servicerequest == null) {
			getMendixObject().setValue(context, MemberNames.WorkOrder_ServiceRequest.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkOrder_ServiceRequest.toString(), workorder_servicerequest.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TechnicianTask_ServiceRequest
	 */
	public final heatingsystem.proxies.TechnicianTask getTechnicianTask_ServiceRequest() throws com.mendix.core.CoreException
	{
		return getTechnicianTask_ServiceRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of TechnicianTask_ServiceRequest
	 * @throws com.mendix.core.CoreException
	 */
	public final heatingsystem.proxies.TechnicianTask getTechnicianTask_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		heatingsystem.proxies.TechnicianTask result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TechnicianTask_ServiceRequest.toString());
		if (identifier != null) {
			result = heatingsystem.proxies.TechnicianTask.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TechnicianTask_ServiceRequest
	 * @param techniciantask_servicerequest
	 */
	public final void setTechnicianTask_ServiceRequest(heatingsystem.proxies.TechnicianTask techniciantask_servicerequest)
	{
		setTechnicianTask_ServiceRequest(getContext(), techniciantask_servicerequest);
	}

	/**
	 * Set value of TechnicianTask_ServiceRequest
	 * @param context
	 * @param techniciantask_servicerequest
	 */
	public final void setTechnicianTask_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.TechnicianTask techniciantask_servicerequest)
	{
		if (techniciantask_servicerequest == null) {
			getMendixObject().setValue(context, MemberNames.TechnicianTask_ServiceRequest.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TechnicianTask_ServiceRequest.toString(), techniciantask_servicerequest.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ServiceRequest_TechnicianAccount
	 */
	public final administration.proxies.Account getServiceRequest_TechnicianAccount() throws com.mendix.core.CoreException
	{
		return getServiceRequest_TechnicianAccount(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceRequest_TechnicianAccount
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getServiceRequest_TechnicianAccount(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServiceRequest_TechnicianAccount.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ServiceRequest_TechnicianAccount
	 * @param servicerequest_technicianaccount
	 */
	public final void setServiceRequest_TechnicianAccount(administration.proxies.Account servicerequest_technicianaccount)
	{
		setServiceRequest_TechnicianAccount(getContext(), servicerequest_technicianaccount);
	}

	/**
	 * Set value of ServiceRequest_TechnicianAccount
	 * @param context
	 * @param servicerequest_technicianaccount
	 */
	public final void setServiceRequest_TechnicianAccount(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account servicerequest_technicianaccount)
	{
		if (servicerequest_technicianaccount == null) {
			getMendixObject().setValue(context, MemberNames.ServiceRequest_TechnicianAccount.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ServiceRequest_TechnicianAccount.toString(), servicerequest_technicianaccount.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return serviceRequestMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final heatingsystem.proxies.ServiceRequest that = (heatingsystem.proxies.ServiceRequest) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
