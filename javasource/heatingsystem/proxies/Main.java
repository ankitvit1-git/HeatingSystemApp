// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package heatingsystem.proxies;

public class Main
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mainMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HeatingSystem.Main";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Temp("Temp"),
		Feels_like("Feels_like"),
		Temp_min("Temp_min"),
		Temp_max("Temp_max"),
		Pressure("Pressure"),
		Humidity("Humidity"),
		Main_Summary("HeatingSystem.Main_Summary");

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

	public Main(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Main(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mainMendixObject)
	{
		if (mainMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, mainMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.mainMendixObject = mainMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Main.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static heatingsystem.proxies.Main initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return heatingsystem.proxies.Main.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static heatingsystem.proxies.Main initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new heatingsystem.proxies.Main(context, mendixObject);
	}

	public static heatingsystem.proxies.Main load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return heatingsystem.proxies.Main.initialize(context, mendixObject);
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
	 * @return value of Temp
	 */
	public final java.math.BigDecimal getTemp()
	{
		return getTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of Temp
	 */
	public final java.math.BigDecimal getTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Temp.toString());
	}

	/**
	 * Set value of Temp
	 * @param temp
	 */
	public final void setTemp(java.math.BigDecimal temp)
	{
		setTemp(getContext(), temp);
	}

	/**
	 * Set value of Temp
	 * @param context
	 * @param temp
	 */
	public final void setTemp(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal temp)
	{
		getMendixObject().setValue(context, MemberNames.Temp.toString(), temp);
	}

	/**
	 * @return value of Feels_like
	 */
	public final java.math.BigDecimal getFeels_like()
	{
		return getFeels_like(getContext());
	}

	/**
	 * @param context
	 * @return value of Feels_like
	 */
	public final java.math.BigDecimal getFeels_like(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Feels_like.toString());
	}

	/**
	 * Set value of Feels_like
	 * @param feels_like
	 */
	public final void setFeels_like(java.math.BigDecimal feels_like)
	{
		setFeels_like(getContext(), feels_like);
	}

	/**
	 * Set value of Feels_like
	 * @param context
	 * @param feels_like
	 */
	public final void setFeels_like(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal feels_like)
	{
		getMendixObject().setValue(context, MemberNames.Feels_like.toString(), feels_like);
	}

	/**
	 * @return value of Temp_min
	 */
	public final java.math.BigDecimal getTemp_min()
	{
		return getTemp_min(getContext());
	}

	/**
	 * @param context
	 * @return value of Temp_min
	 */
	public final java.math.BigDecimal getTemp_min(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Temp_min.toString());
	}

	/**
	 * Set value of Temp_min
	 * @param temp_min
	 */
	public final void setTemp_min(java.math.BigDecimal temp_min)
	{
		setTemp_min(getContext(), temp_min);
	}

	/**
	 * Set value of Temp_min
	 * @param context
	 * @param temp_min
	 */
	public final void setTemp_min(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal temp_min)
	{
		getMendixObject().setValue(context, MemberNames.Temp_min.toString(), temp_min);
	}

	/**
	 * @return value of Temp_max
	 */
	public final java.math.BigDecimal getTemp_max()
	{
		return getTemp_max(getContext());
	}

	/**
	 * @param context
	 * @return value of Temp_max
	 */
	public final java.math.BigDecimal getTemp_max(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Temp_max.toString());
	}

	/**
	 * Set value of Temp_max
	 * @param temp_max
	 */
	public final void setTemp_max(java.math.BigDecimal temp_max)
	{
		setTemp_max(getContext(), temp_max);
	}

	/**
	 * Set value of Temp_max
	 * @param context
	 * @param temp_max
	 */
	public final void setTemp_max(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal temp_max)
	{
		getMendixObject().setValue(context, MemberNames.Temp_max.toString(), temp_max);
	}

	/**
	 * @return value of Pressure
	 */
	public final java.lang.Integer getPressure()
	{
		return getPressure(getContext());
	}

	/**
	 * @param context
	 * @return value of Pressure
	 */
	public final java.lang.Integer getPressure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Pressure.toString());
	}

	/**
	 * Set value of Pressure
	 * @param pressure
	 */
	public final void setPressure(java.lang.Integer pressure)
	{
		setPressure(getContext(), pressure);
	}

	/**
	 * Set value of Pressure
	 * @param context
	 * @param pressure
	 */
	public final void setPressure(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pressure)
	{
		getMendixObject().setValue(context, MemberNames.Pressure.toString(), pressure);
	}

	/**
	 * @return value of Humidity
	 */
	public final java.lang.Integer getHumidity()
	{
		return getHumidity(getContext());
	}

	/**
	 * @param context
	 * @return value of Humidity
	 */
	public final java.lang.Integer getHumidity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Humidity.toString());
	}

	/**
	 * Set value of Humidity
	 * @param humidity
	 */
	public final void setHumidity(java.lang.Integer humidity)
	{
		setHumidity(getContext(), humidity);
	}

	/**
	 * Set value of Humidity
	 * @param context
	 * @param humidity
	 */
	public final void setHumidity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer humidity)
	{
		getMendixObject().setValue(context, MemberNames.Humidity.toString(), humidity);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Main_Summary
	 */
	public final heatingsystem.proxies.Summary getMain_Summary() throws com.mendix.core.CoreException
	{
		return getMain_Summary(getContext());
	}

	/**
	 * @param context
	 * @return value of Main_Summary
	 * @throws com.mendix.core.CoreException
	 */
	public final heatingsystem.proxies.Summary getMain_Summary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		heatingsystem.proxies.Summary result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Main_Summary.toString());
		if (identifier != null) {
			result = heatingsystem.proxies.Summary.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Main_Summary
	 * @param main_summary
	 */
	public final void setMain_Summary(heatingsystem.proxies.Summary main_summary)
	{
		setMain_Summary(getContext(), main_summary);
	}

	/**
	 * Set value of Main_Summary
	 * @param context
	 * @param main_summary
	 */
	public final void setMain_Summary(com.mendix.systemwideinterfaces.core.IContext context, heatingsystem.proxies.Summary main_summary)
	{
		if (main_summary == null) {
			getMendixObject().setValue(context, MemberNames.Main_Summary.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Main_Summary.toString(), main_summary.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mainMendixObject;
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
			final heatingsystem.proxies.Main that = (heatingsystem.proxies.Main) obj;
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
