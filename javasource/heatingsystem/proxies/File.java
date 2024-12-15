// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package heatingsystem.proxies;

public class File extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HeatingSystem.File";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		File_ServiceRequest("HeatingSystem.File_ServiceRequest");

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

	public File(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected File(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fileMendixObject)
	{
		super(context, fileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, fileMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'File.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static heatingsystem.proxies.File initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return heatingsystem.proxies.File.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static heatingsystem.proxies.File initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new heatingsystem.proxies.File(context, mendixObject);
	}

	public static heatingsystem.proxies.File load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return heatingsystem.proxies.File.initialize(context, mendixObject);
	}

	public static java.util.List<heatingsystem.proxies.File> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> heatingsystem.proxies.File.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of File_ServiceRequest
	 */
	public final heatingsystem.proxies.ServiceRequest getFile_ServiceRequest() throws com.mendix.core.CoreException
	{
		return getFile_ServiceRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of File_ServiceRequest
	 * @throws com.mendix.core.CoreException
	 */
	public final heatingsystem.proxies.ServiceRequest getFile_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		heatingsystem.proxies.ServiceRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.File_ServiceRequest.toString());
		if (identifier != null) {
			result = heatingsystem.proxies.ServiceRequest.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of File_ServiceRequest
	 * @param file_servicerequest
	 */
	public final void setFile_ServiceRequest(heatingsystem.proxies.ServiceRequest file_servicerequest)
	{
		setFile_ServiceRequest(getContext(), file_servicerequest);
	}

	/**
	 * Set value of File_ServiceRequest
	 * @param context
	 * @param file_servicerequest
	 */
	public final void setFile_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.ServiceRequest file_servicerequest)
	{
		if (file_servicerequest == null) {
			getMendixObject().setValue(context, MemberNames.File_ServiceRequest.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.File_ServiceRequest.toString(), file_servicerequest.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final heatingsystem.proxies.File that = (heatingsystem.proxies.File) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}