// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package email_connector.proxies;

public class SelectedConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject selectedConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Email_Connector.SelectedConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IncomingHost("IncomingHost"),
		IncomingPort("IncomingPort"),
		IncomingSocketType("IncomingSocketType"),
		IncomingProtocol("IncomingProtocol"),
		OutgoingHost("OutgoingHost"),
		OutgoingPort("OutgoingPort"),
		OutgoingProtocol("OutgoingProtocol"),
		OutgoingSSL("OutgoingSSL"),
		OutgoingTLS("OutgoingTLS"),
		SelectedConfiguration_EmailProvider("Email_Connector.SelectedConfiguration_EmailProvider");

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

	public SelectedConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SelectedConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject selectedConfigurationMendixObject)
	{
		if (selectedConfigurationMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, selectedConfigurationMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.selectedConfigurationMendixObject = selectedConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SelectedConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static email_connector.proxies.SelectedConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return email_connector.proxies.SelectedConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static email_connector.proxies.SelectedConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new email_connector.proxies.SelectedConfiguration(context, mendixObject);
	}

	public static email_connector.proxies.SelectedConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return email_connector.proxies.SelectedConfiguration.initialize(context, mendixObject);
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
	 * @return value of IncomingHost
	 */
	public final java.lang.String getIncomingHost()
	{
		return getIncomingHost(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingHost
	 */
	public final java.lang.String getIncomingHost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IncomingHost.toString());
	}

	/**
	 * Set value of IncomingHost
	 * @param incominghost
	 */
	public final void setIncomingHost(java.lang.String incominghost)
	{
		setIncomingHost(getContext(), incominghost);
	}

	/**
	 * Set value of IncomingHost
	 * @param context
	 * @param incominghost
	 */
	public final void setIncomingHost(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String incominghost)
	{
		getMendixObject().setValue(context, MemberNames.IncomingHost.toString(), incominghost);
	}

	/**
	 * @return value of IncomingPort
	 */
	public final java.lang.Integer getIncomingPort()
	{
		return getIncomingPort(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingPort
	 */
	public final java.lang.Integer getIncomingPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.IncomingPort.toString());
	}

	/**
	 * Set value of IncomingPort
	 * @param incomingport
	 */
	public final void setIncomingPort(java.lang.Integer incomingport)
	{
		setIncomingPort(getContext(), incomingport);
	}

	/**
	 * Set value of IncomingPort
	 * @param context
	 * @param incomingport
	 */
	public final void setIncomingPort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer incomingport)
	{
		getMendixObject().setValue(context, MemberNames.IncomingPort.toString(), incomingport);
	}

	/**
	 * @return value of IncomingSocketType
	 */
	public final java.lang.String getIncomingSocketType()
	{
		return getIncomingSocketType(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingSocketType
	 */
	public final java.lang.String getIncomingSocketType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IncomingSocketType.toString());
	}

	/**
	 * Set value of IncomingSocketType
	 * @param incomingsockettype
	 */
	public final void setIncomingSocketType(java.lang.String incomingsockettype)
	{
		setIncomingSocketType(getContext(), incomingsockettype);
	}

	/**
	 * Set value of IncomingSocketType
	 * @param context
	 * @param incomingsockettype
	 */
	public final void setIncomingSocketType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String incomingsockettype)
	{
		getMendixObject().setValue(context, MemberNames.IncomingSocketType.toString(), incomingsockettype);
	}

	/**
	 * Set value of IncomingProtocol
	 * @param incomingprotocol
	 */
	public final email_connector.proxies.ENUM_IncomingProtocol getIncomingProtocol()
	{
		return getIncomingProtocol(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingProtocol
	 */
	public final email_connector.proxies.ENUM_IncomingProtocol getIncomingProtocol(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.IncomingProtocol.toString());
		if (obj == null) {
			return null;
		}
		return email_connector.proxies.ENUM_IncomingProtocol.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of IncomingProtocol
	 * @param incomingprotocol
	 */
	public final void setIncomingProtocol(email_connector.proxies.ENUM_IncomingProtocol incomingprotocol)
	{
		setIncomingProtocol(getContext(), incomingprotocol);
	}

	/**
	 * Set value of IncomingProtocol
	 * @param context
	 * @param incomingprotocol
	 */
	public final void setIncomingProtocol(com.mendix.systemwideinterfaces.core.IContext context, email_connector.proxies.ENUM_IncomingProtocol incomingprotocol)
	{
		if (incomingprotocol != null) {
			getMendixObject().setValue(context, MemberNames.IncomingProtocol.toString(), incomingprotocol.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.IncomingProtocol.toString(), null);
		}
	}

	/**
	 * @return value of OutgoingHost
	 */
	public final java.lang.String getOutgoingHost()
	{
		return getOutgoingHost(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingHost
	 */
	public final java.lang.String getOutgoingHost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OutgoingHost.toString());
	}

	/**
	 * Set value of OutgoingHost
	 * @param outgoinghost
	 */
	public final void setOutgoingHost(java.lang.String outgoinghost)
	{
		setOutgoingHost(getContext(), outgoinghost);
	}

	/**
	 * Set value of OutgoingHost
	 * @param context
	 * @param outgoinghost
	 */
	public final void setOutgoingHost(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outgoinghost)
	{
		getMendixObject().setValue(context, MemberNames.OutgoingHost.toString(), outgoinghost);
	}

	/**
	 * @return value of OutgoingPort
	 */
	public final java.lang.Integer getOutgoingPort()
	{
		return getOutgoingPort(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingPort
	 */
	public final java.lang.Integer getOutgoingPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OutgoingPort.toString());
	}

	/**
	 * Set value of OutgoingPort
	 * @param outgoingport
	 */
	public final void setOutgoingPort(java.lang.Integer outgoingport)
	{
		setOutgoingPort(getContext(), outgoingport);
	}

	/**
	 * Set value of OutgoingPort
	 * @param context
	 * @param outgoingport
	 */
	public final void setOutgoingPort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer outgoingport)
	{
		getMendixObject().setValue(context, MemberNames.OutgoingPort.toString(), outgoingport);
	}

	/**
	 * Set value of OutgoingProtocol
	 * @param outgoingprotocol
	 */
	public final email_connector.proxies.ENUM_OutgoingProtocol getOutgoingProtocol()
	{
		return getOutgoingProtocol(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingProtocol
	 */
	public final email_connector.proxies.ENUM_OutgoingProtocol getOutgoingProtocol(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.OutgoingProtocol.toString());
		if (obj == null) {
			return null;
		}
		return email_connector.proxies.ENUM_OutgoingProtocol.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of OutgoingProtocol
	 * @param outgoingprotocol
	 */
	public final void setOutgoingProtocol(email_connector.proxies.ENUM_OutgoingProtocol outgoingprotocol)
	{
		setOutgoingProtocol(getContext(), outgoingprotocol);
	}

	/**
	 * Set value of OutgoingProtocol
	 * @param context
	 * @param outgoingprotocol
	 */
	public final void setOutgoingProtocol(com.mendix.systemwideinterfaces.core.IContext context, email_connector.proxies.ENUM_OutgoingProtocol outgoingprotocol)
	{
		if (outgoingprotocol != null) {
			getMendixObject().setValue(context, MemberNames.OutgoingProtocol.toString(), outgoingprotocol.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.OutgoingProtocol.toString(), null);
		}
	}

	/**
	 * @return value of OutgoingSSL
	 */
	public final java.lang.Boolean getOutgoingSSL()
	{
		return getOutgoingSSL(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingSSL
	 */
	public final java.lang.Boolean getOutgoingSSL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.OutgoingSSL.toString());
	}

	/**
	 * Set value of OutgoingSSL
	 * @param outgoingssl
	 */
	public final void setOutgoingSSL(java.lang.Boolean outgoingssl)
	{
		setOutgoingSSL(getContext(), outgoingssl);
	}

	/**
	 * Set value of OutgoingSSL
	 * @param context
	 * @param outgoingssl
	 */
	public final void setOutgoingSSL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean outgoingssl)
	{
		getMendixObject().setValue(context, MemberNames.OutgoingSSL.toString(), outgoingssl);
	}

	/**
	 * @return value of OutgoingTLS
	 */
	public final java.lang.Boolean getOutgoingTLS()
	{
		return getOutgoingTLS(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingTLS
	 */
	public final java.lang.Boolean getOutgoingTLS(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.OutgoingTLS.toString());
	}

	/**
	 * Set value of OutgoingTLS
	 * @param outgoingtls
	 */
	public final void setOutgoingTLS(java.lang.Boolean outgoingtls)
	{
		setOutgoingTLS(getContext(), outgoingtls);
	}

	/**
	 * Set value of OutgoingTLS
	 * @param context
	 * @param outgoingtls
	 */
	public final void setOutgoingTLS(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean outgoingtls)
	{
		getMendixObject().setValue(context, MemberNames.OutgoingTLS.toString(), outgoingtls);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SelectedConfiguration_EmailProvider
	 */
	public final email_connector.proxies.EmailProvider getSelectedConfiguration_EmailProvider() throws com.mendix.core.CoreException
	{
		return getSelectedConfiguration_EmailProvider(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedConfiguration_EmailProvider
	 * @throws com.mendix.core.CoreException
	 */
	public final email_connector.proxies.EmailProvider getSelectedConfiguration_EmailProvider(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		email_connector.proxies.EmailProvider result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectedConfiguration_EmailProvider.toString());
		if (identifier != null) {
			result = email_connector.proxies.EmailProvider.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SelectedConfiguration_EmailProvider
	 * @param selectedconfiguration_emailprovider
	 */
	public final void setSelectedConfiguration_EmailProvider(email_connector.proxies.EmailProvider selectedconfiguration_emailprovider)
	{
		setSelectedConfiguration_EmailProvider(getContext(), selectedconfiguration_emailprovider);
	}

	/**
	 * Set value of SelectedConfiguration_EmailProvider
	 * @param context
	 * @param selectedconfiguration_emailprovider
	 */
	public final void setSelectedConfiguration_EmailProvider(com.mendix.systemwideinterfaces.core.IContext context, email_connector.proxies.EmailProvider selectedconfiguration_emailprovider)
	{
		if (selectedconfiguration_emailprovider == null) {
			getMendixObject().setValue(context, MemberNames.SelectedConfiguration_EmailProvider.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SelectedConfiguration_EmailProvider.toString(), selectedconfiguration_emailprovider.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return selectedConfigurationMendixObject;
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
			final email_connector.proxies.SelectedConfiguration that = (email_connector.proxies.SelectedConfiguration) obj;
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
