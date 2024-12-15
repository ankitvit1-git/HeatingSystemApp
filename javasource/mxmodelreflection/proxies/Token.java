// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class Token
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tokenMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.Token";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Token("Token"),
		Prefix("Prefix"),
		Suffix("Suffix"),
		CombinedToken("CombinedToken"),
		Description("Description"),
		MetaModelPath("MetaModelPath"),
		TokenType("TokenType"),
		Status("Status"),
		FindObjectStart("FindObjectStart"),
		FindObjectReference("FindObjectReference"),
		FindReference("FindReference"),
		FindMember("FindMember"),
		FindMemberReference("FindMemberReference"),
		IsOptional("IsOptional"),
		DisplayPattern("DisplayPattern"),
		Token_MxObjectMember("MxModelReflection.Token_MxObjectMember"),
		Token_MxObjectType_Start("MxModelReflection.Token_MxObjectType_Start"),
		Token_MxObjectType_Referenced("MxModelReflection.Token_MxObjectType_Referenced"),
		Token_MxObjectReference("MxModelReflection.Token_MxObjectReference");

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

	public Token(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Token(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tokenMendixObject)
	{
		if (tokenMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, tokenMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.tokenMendixObject = tokenMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Token.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxmodelreflection.proxies.Token initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.Token.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static mxmodelreflection.proxies.Token initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.Token(context, mendixObject);
	}

	public static mxmodelreflection.proxies.Token load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.Token.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.Token> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> mxmodelreflection.proxies.Token.initialize(context, obj))
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
	 * @return value of Token
	 */
	public final java.lang.String getToken()
	{
		return getToken(getContext());
	}

	/**
	 * @param context
	 * @return value of Token
	 */
	public final java.lang.String getToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Token.toString());
	}

	/**
	 * Set value of Token
	 * @param token
	 */
	public final void setToken(java.lang.String token)
	{
		setToken(getContext(), token);
	}

	/**
	 * Set value of Token
	 * @param context
	 * @param token
	 */
	public final void setToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String token)
	{
		getMendixObject().setValue(context, MemberNames.Token.toString(), token);
	}

	/**
	 * @return value of Prefix
	 */
	public final java.lang.String getPrefix()
	{
		return getPrefix(getContext());
	}

	/**
	 * @param context
	 * @return value of Prefix
	 */
	public final java.lang.String getPrefix(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Prefix.toString());
	}

	/**
	 * Set value of Prefix
	 * @param prefix
	 */
	public final void setPrefix(java.lang.String prefix)
	{
		setPrefix(getContext(), prefix);
	}

	/**
	 * Set value of Prefix
	 * @param context
	 * @param prefix
	 */
	public final void setPrefix(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String prefix)
	{
		getMendixObject().setValue(context, MemberNames.Prefix.toString(), prefix);
	}

	/**
	 * @return value of Suffix
	 */
	public final java.lang.String getSuffix()
	{
		return getSuffix(getContext());
	}

	/**
	 * @param context
	 * @return value of Suffix
	 */
	public final java.lang.String getSuffix(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Suffix.toString());
	}

	/**
	 * Set value of Suffix
	 * @param suffix
	 */
	public final void setSuffix(java.lang.String suffix)
	{
		setSuffix(getContext(), suffix);
	}

	/**
	 * Set value of Suffix
	 * @param context
	 * @param suffix
	 */
	public final void setSuffix(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String suffix)
	{
		getMendixObject().setValue(context, MemberNames.Suffix.toString(), suffix);
	}

	/**
	 * @return value of CombinedToken
	 */
	public final java.lang.String getCombinedToken()
	{
		return getCombinedToken(getContext());
	}

	/**
	 * @param context
	 * @return value of CombinedToken
	 */
	public final java.lang.String getCombinedToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CombinedToken.toString());
	}

	/**
	 * Set value of CombinedToken
	 * @param combinedtoken
	 */
	public final void setCombinedToken(java.lang.String combinedtoken)
	{
		setCombinedToken(getContext(), combinedtoken);
	}

	/**
	 * Set value of CombinedToken
	 * @param context
	 * @param combinedtoken
	 */
	public final void setCombinedToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String combinedtoken)
	{
		getMendixObject().setValue(context, MemberNames.CombinedToken.toString(), combinedtoken);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of MetaModelPath
	 */
	public final java.lang.String getMetaModelPath()
	{
		return getMetaModelPath(getContext());
	}

	/**
	 * @param context
	 * @return value of MetaModelPath
	 */
	public final java.lang.String getMetaModelPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MetaModelPath.toString());
	}

	/**
	 * Set value of MetaModelPath
	 * @param metamodelpath
	 */
	public final void setMetaModelPath(java.lang.String metamodelpath)
	{
		setMetaModelPath(getContext(), metamodelpath);
	}

	/**
	 * Set value of MetaModelPath
	 * @param context
	 * @param metamodelpath
	 */
	public final void setMetaModelPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String metamodelpath)
	{
		getMendixObject().setValue(context, MemberNames.MetaModelPath.toString(), metamodelpath);
	}

	/**
	 * Set value of TokenType
	 * @param tokentype
	 */
	public final mxmodelreflection.proxies.TokenType getTokenType()
	{
		return getTokenType(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenType
	 */
	public final mxmodelreflection.proxies.TokenType getTokenType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TokenType.toString());
		if (obj == null) {
			return null;
		}
		return mxmodelreflection.proxies.TokenType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TokenType
	 * @param tokentype
	 */
	public final void setTokenType(mxmodelreflection.proxies.TokenType tokentype)
	{
		setTokenType(getContext(), tokentype);
	}

	/**
	 * Set value of TokenType
	 * @param context
	 * @param tokentype
	 */
	public final void setTokenType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.TokenType tokentype)
	{
		if (tokentype != null) {
			getMendixObject().setValue(context, MemberNames.TokenType.toString(), tokentype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.TokenType.toString(), null);
		}
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final mxmodelreflection.proxies.Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final mxmodelreflection.proxies.Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null) {
			return null;
		}
		return mxmodelreflection.proxies.Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(mxmodelreflection.proxies.Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.Status status)
	{
		if (status != null) {
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
		}
	}

	/**
	 * @return value of FindObjectStart
	 */
	public final java.lang.String getFindObjectStart()
	{
		return getFindObjectStart(getContext());
	}

	/**
	 * @param context
	 * @return value of FindObjectStart
	 */
	public final java.lang.String getFindObjectStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindObjectStart.toString());
	}

	/**
	 * Set value of FindObjectStart
	 * @param findobjectstart
	 */
	public final void setFindObjectStart(java.lang.String findobjectstart)
	{
		setFindObjectStart(getContext(), findobjectstart);
	}

	/**
	 * Set value of FindObjectStart
	 * @param context
	 * @param findobjectstart
	 */
	public final void setFindObjectStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findobjectstart)
	{
		getMendixObject().setValue(context, MemberNames.FindObjectStart.toString(), findobjectstart);
	}

	/**
	 * @return value of FindObjectReference
	 */
	public final java.lang.String getFindObjectReference()
	{
		return getFindObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of FindObjectReference
	 */
	public final java.lang.String getFindObjectReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindObjectReference.toString());
	}

	/**
	 * Set value of FindObjectReference
	 * @param findobjectreference
	 */
	public final void setFindObjectReference(java.lang.String findobjectreference)
	{
		setFindObjectReference(getContext(), findobjectreference);
	}

	/**
	 * Set value of FindObjectReference
	 * @param context
	 * @param findobjectreference
	 */
	public final void setFindObjectReference(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findobjectreference)
	{
		getMendixObject().setValue(context, MemberNames.FindObjectReference.toString(), findobjectreference);
	}

	/**
	 * @return value of FindReference
	 */
	public final java.lang.String getFindReference()
	{
		return getFindReference(getContext());
	}

	/**
	 * @param context
	 * @return value of FindReference
	 */
	public final java.lang.String getFindReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindReference.toString());
	}

	/**
	 * Set value of FindReference
	 * @param findreference
	 */
	public final void setFindReference(java.lang.String findreference)
	{
		setFindReference(getContext(), findreference);
	}

	/**
	 * Set value of FindReference
	 * @param context
	 * @param findreference
	 */
	public final void setFindReference(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findreference)
	{
		getMendixObject().setValue(context, MemberNames.FindReference.toString(), findreference);
	}

	/**
	 * @return value of FindMember
	 */
	public final java.lang.String getFindMember()
	{
		return getFindMember(getContext());
	}

	/**
	 * @param context
	 * @return value of FindMember
	 */
	public final java.lang.String getFindMember(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindMember.toString());
	}

	/**
	 * Set value of FindMember
	 * @param findmember
	 */
	public final void setFindMember(java.lang.String findmember)
	{
		setFindMember(getContext(), findmember);
	}

	/**
	 * Set value of FindMember
	 * @param context
	 * @param findmember
	 */
	public final void setFindMember(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findmember)
	{
		getMendixObject().setValue(context, MemberNames.FindMember.toString(), findmember);
	}

	/**
	 * @return value of FindMemberReference
	 */
	public final java.lang.String getFindMemberReference()
	{
		return getFindMemberReference(getContext());
	}

	/**
	 * @param context
	 * @return value of FindMemberReference
	 */
	public final java.lang.String getFindMemberReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindMemberReference.toString());
	}

	/**
	 * Set value of FindMemberReference
	 * @param findmemberreference
	 */
	public final void setFindMemberReference(java.lang.String findmemberreference)
	{
		setFindMemberReference(getContext(), findmemberreference);
	}

	/**
	 * Set value of FindMemberReference
	 * @param context
	 * @param findmemberreference
	 */
	public final void setFindMemberReference(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findmemberreference)
	{
		getMendixObject().setValue(context, MemberNames.FindMemberReference.toString(), findmemberreference);
	}

	/**
	 * @return value of IsOptional
	 */
	public final java.lang.Boolean getIsOptional()
	{
		return getIsOptional(getContext());
	}

	/**
	 * @param context
	 * @return value of IsOptional
	 */
	public final java.lang.Boolean getIsOptional(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsOptional.toString());
	}

	/**
	 * Set value of IsOptional
	 * @param isoptional
	 */
	public final void setIsOptional(java.lang.Boolean isoptional)
	{
		setIsOptional(getContext(), isoptional);
	}

	/**
	 * Set value of IsOptional
	 * @param context
	 * @param isoptional
	 */
	public final void setIsOptional(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isoptional)
	{
		getMendixObject().setValue(context, MemberNames.IsOptional.toString(), isoptional);
	}

	/**
	 * @return value of DisplayPattern
	 */
	public final java.lang.String getDisplayPattern()
	{
		return getDisplayPattern(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayPattern
	 */
	public final java.lang.String getDisplayPattern(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DisplayPattern.toString());
	}

	/**
	 * Set value of DisplayPattern
	 * @param displaypattern
	 */
	public final void setDisplayPattern(java.lang.String displaypattern)
	{
		setDisplayPattern(getContext(), displaypattern);
	}

	/**
	 * Set value of DisplayPattern
	 * @param context
	 * @param displaypattern
	 */
	public final void setDisplayPattern(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String displaypattern)
	{
		getMendixObject().setValue(context, MemberNames.DisplayPattern.toString(), displaypattern);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Token_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getToken_MxObjectMember() throws com.mendix.core.CoreException
	{
		return getToken_MxObjectMember(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_MxObjectMember
	 * @throws com.mendix.core.CoreException
	 */
	public final mxmodelreflection.proxies.MxObjectMember getToken_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Token_MxObjectMember.toString());
		if (identifier != null) {
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Token_MxObjectMember
	 * @param token_mxobjectmember
	 */
	public final void setToken_MxObjectMember(mxmodelreflection.proxies.MxObjectMember token_mxobjectmember)
	{
		setToken_MxObjectMember(getContext(), token_mxobjectmember);
	}

	/**
	 * Set value of Token_MxObjectMember
	 * @param context
	 * @param token_mxobjectmember
	 */
	public final void setToken_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember token_mxobjectmember)
	{
		if (token_mxobjectmember == null) {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectMember.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectMember.toString(), token_mxobjectmember.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Token_MxObjectType_Start
	 */
	public final mxmodelreflection.proxies.MxObjectType getToken_MxObjectType_Start() throws com.mendix.core.CoreException
	{
		return getToken_MxObjectType_Start(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_MxObjectType_Start
	 * @throws com.mendix.core.CoreException
	 */
	public final mxmodelreflection.proxies.MxObjectType getToken_MxObjectType_Start(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Token_MxObjectType_Start.toString());
		if (identifier != null) {
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Token_MxObjectType_Start
	 * @param token_mxobjecttype_start
	 */
	public final void setToken_MxObjectType_Start(mxmodelreflection.proxies.MxObjectType token_mxobjecttype_start)
	{
		setToken_MxObjectType_Start(getContext(), token_mxobjecttype_start);
	}

	/**
	 * Set value of Token_MxObjectType_Start
	 * @param context
	 * @param token_mxobjecttype_start
	 */
	public final void setToken_MxObjectType_Start(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType token_mxobjecttype_start)
	{
		if (token_mxobjecttype_start == null) {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectType_Start.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectType_Start.toString(), token_mxobjecttype_start.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Token_MxObjectType_Referenced
	 */
	public final mxmodelreflection.proxies.MxObjectType getToken_MxObjectType_Referenced() throws com.mendix.core.CoreException
	{
		return getToken_MxObjectType_Referenced(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_MxObjectType_Referenced
	 * @throws com.mendix.core.CoreException
	 */
	public final mxmodelreflection.proxies.MxObjectType getToken_MxObjectType_Referenced(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Token_MxObjectType_Referenced.toString());
		if (identifier != null) {
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Token_MxObjectType_Referenced
	 * @param token_mxobjecttype_referenced
	 */
	public final void setToken_MxObjectType_Referenced(mxmodelreflection.proxies.MxObjectType token_mxobjecttype_referenced)
	{
		setToken_MxObjectType_Referenced(getContext(), token_mxobjecttype_referenced);
	}

	/**
	 * Set value of Token_MxObjectType_Referenced
	 * @param context
	 * @param token_mxobjecttype_referenced
	 */
	public final void setToken_MxObjectType_Referenced(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType token_mxobjecttype_referenced)
	{
		if (token_mxobjecttype_referenced == null) {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectType_Referenced.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectType_Referenced.toString(), token_mxobjecttype_referenced.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Token_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getToken_MxObjectReference() throws com.mendix.core.CoreException
	{
		return getToken_MxObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_MxObjectReference
	 * @throws com.mendix.core.CoreException
	 */
	public final mxmodelreflection.proxies.MxObjectReference getToken_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Token_MxObjectReference.toString());
		if (identifier != null) {
			result = mxmodelreflection.proxies.MxObjectReference.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Token_MxObjectReference
	 * @param token_mxobjectreference
	 */
	public final void setToken_MxObjectReference(mxmodelreflection.proxies.MxObjectReference token_mxobjectreference)
	{
		setToken_MxObjectReference(getContext(), token_mxobjectreference);
	}

	/**
	 * Set value of Token_MxObjectReference
	 * @param context
	 * @param token_mxobjectreference
	 */
	public final void setToken_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectReference token_mxobjectreference)
	{
		if (token_mxobjectreference == null) {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectReference.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Token_MxObjectReference.toString(), token_mxobjectreference.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tokenMendixObject;
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
			final mxmodelreflection.proxies.Token that = (mxmodelreflection.proxies.Token) obj;
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