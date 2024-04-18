// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

/**
 * The Column contains the specific mapping for each usefull column. All the mapping and all settings for each column will be configured here.
 */
public class Column
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject columnMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ExcelImporter.Column";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ColNumber("ColNumber"),
		Text("Text"),
		MappingType("MappingType"),
		IsKey("IsKey"),
		IsReferenceKey("IsReferenceKey"),
		Status("Status"),
		Details("Details"),
		CaseSensitive("CaseSensitive"),
		FindAttribute("FindAttribute"),
		FindReference("FindReference"),
		FindObjectType("FindObjectType"),
		FindMicroflow("FindMicroflow"),
		DataSource("DataSource"),
		AttributeTypeEnum("AttributeTypeEnum"),
		InputMask("InputMask"),
		Column_Template("ExcelImporter.Column_Template"),
		Column_MasterColumn("ExcelImporter.Column_MasterColumn"),
		Column_MxObjectType_Reference("ExcelImporter.Column_MxObjectType_Reference"),
		Column_MxObjectType("ExcelImporter.Column_MxObjectType"),
		Column_MxObjectMember("ExcelImporter.Column_MxObjectMember"),
		Column_MxObjectMember_Reference("ExcelImporter.Column_MxObjectMember_Reference"),
		Column_MxObjectReference("ExcelImporter.Column_MxObjectReference"),
		Column_Microflows("ExcelImporter.Column_Microflows"),
		Column_ValueType("ExcelImporter.Column_ValueType");

		private java.lang.String metaName;

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

	public Column(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ExcelImporter.Column"));
	}

	protected Column(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject columnMendixObject)
	{
		if (columnMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ExcelImporter.Column", columnMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ExcelImporter.Column");

		this.columnMendixObject = columnMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Column.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static excelimporter.proxies.Column initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return excelimporter.proxies.Column.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static excelimporter.proxies.Column initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new excelimporter.proxies.Column(context, mendixObject);
	}

	public static excelimporter.proxies.Column load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return excelimporter.proxies.Column.initialize(context, mendixObject);
	}

	public static java.util.List<excelimporter.proxies.Column> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<excelimporter.proxies.Column> result = new java.util.ArrayList<excelimporter.proxies.Column>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ExcelImporter.Column" + xpathConstraint))
			result.add(excelimporter.proxies.Column.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
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
	 * @return value of ColNumber
	 */
	public final java.lang.Integer getColNumber()
	{
		return getColNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of ColNumber
	 */
	public final java.lang.Integer getColNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ColNumber.toString());
	}

	/**
	 * Set value of ColNumber
	 * @param colnumber
	 */
	public final void setColNumber(java.lang.Integer colnumber)
	{
		setColNumber(getContext(), colnumber);
	}

	/**
	 * Set value of ColNumber
	 * @param context
	 * @param colnumber
	 */
	public final void setColNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer colnumber)
	{
		getMendixObject().setValue(context, MemberNames.ColNumber.toString(), colnumber);
	}

	/**
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * Set value of MappingType
	 * @param mappingtype
	 */
	public final excelimporter.proxies.MappingType getMappingType()
	{
		return getMappingType(getContext());
	}

	/**
	 * @param context
	 * @return value of MappingType
	 */
	public final excelimporter.proxies.MappingType getMappingType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MappingType.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.MappingType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MappingType
	 * @param mappingtype
	 */
	public final void setMappingType(excelimporter.proxies.MappingType mappingtype)
	{
		setMappingType(getContext(), mappingtype);
	}

	/**
	 * Set value of MappingType
	 * @param context
	 * @param mappingtype
	 */
	public final void setMappingType(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.MappingType mappingtype)
	{
		if (mappingtype != null)
			getMendixObject().setValue(context, MemberNames.MappingType.toString(), mappingtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MappingType.toString(), null);
	}

	/**
	 * Set value of IsKey
	 * @param iskey
	 */
	public final excelimporter.proxies.YesNo getIsKey()
	{
		return getIsKey(getContext());
	}

	/**
	 * @param context
	 * @return value of IsKey
	 */
	public final excelimporter.proxies.YesNo getIsKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.IsKey.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.YesNo.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of IsKey
	 * @param iskey
	 */
	public final void setIsKey(excelimporter.proxies.YesNo iskey)
	{
		setIsKey(getContext(), iskey);
	}

	/**
	 * Set value of IsKey
	 * @param context
	 * @param iskey
	 */
	public final void setIsKey(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.YesNo iskey)
	{
		if (iskey != null)
			getMendixObject().setValue(context, MemberNames.IsKey.toString(), iskey.toString());
		else
			getMendixObject().setValue(context, MemberNames.IsKey.toString(), null);
	}

	/**
	 * Set value of IsReferenceKey
	 * @param isreferencekey
	 */
	public final excelimporter.proxies.ReferenceKeyType getIsReferenceKey()
	{
		return getIsReferenceKey(getContext());
	}

	/**
	 * @param context
	 * @return value of IsReferenceKey
	 */
	public final excelimporter.proxies.ReferenceKeyType getIsReferenceKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.IsReferenceKey.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.ReferenceKeyType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of IsReferenceKey
	 * @param isreferencekey
	 */
	public final void setIsReferenceKey(excelimporter.proxies.ReferenceKeyType isreferencekey)
	{
		setIsReferenceKey(getContext(), isreferencekey);
	}

	/**
	 * Set value of IsReferenceKey
	 * @param context
	 * @param isreferencekey
	 */
	public final void setIsReferenceKey(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.ReferenceKeyType isreferencekey)
	{
		if (isreferencekey != null)
			getMendixObject().setValue(context, MemberNames.IsReferenceKey.toString(), isreferencekey.toString());
		else
			getMendixObject().setValue(context, MemberNames.IsReferenceKey.toString(), null);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final excelimporter.proxies.Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final excelimporter.proxies.Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(excelimporter.proxies.Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.Status status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Details
	 */
	public final java.lang.String getDetails()
	{
		return getDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Details
	 */
	public final java.lang.String getDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Details.toString());
	}

	/**
	 * Set value of Details
	 * @param details
	 */
	public final void setDetails(java.lang.String details)
	{
		setDetails(getContext(), details);
	}

	/**
	 * Set value of Details
	 * @param context
	 * @param details
	 */
	public final void setDetails(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String details)
	{
		getMendixObject().setValue(context, MemberNames.Details.toString(), details);
	}

	/**
	 * Set value of CaseSensitive
	 * @param casesensitive
	 */
	public final excelimporter.proxies.YesNo getCaseSensitive()
	{
		return getCaseSensitive(getContext());
	}

	/**
	 * @param context
	 * @return value of CaseSensitive
	 */
	public final excelimporter.proxies.YesNo getCaseSensitive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CaseSensitive.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.YesNo.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of CaseSensitive
	 * @param casesensitive
	 */
	public final void setCaseSensitive(excelimporter.proxies.YesNo casesensitive)
	{
		setCaseSensitive(getContext(), casesensitive);
	}

	/**
	 * Set value of CaseSensitive
	 * @param context
	 * @param casesensitive
	 */
	public final void setCaseSensitive(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.YesNo casesensitive)
	{
		if (casesensitive != null)
			getMendixObject().setValue(context, MemberNames.CaseSensitive.toString(), casesensitive.toString());
		else
			getMendixObject().setValue(context, MemberNames.CaseSensitive.toString(), null);
	}

	/**
	 * @return value of FindAttribute
	 */
	public final java.lang.String getFindAttribute()
	{
		return getFindAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of FindAttribute
	 */
	public final java.lang.String getFindAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindAttribute.toString());
	}

	/**
	 * Set value of FindAttribute
	 * @param findattribute
	 */
	public final void setFindAttribute(java.lang.String findattribute)
	{
		setFindAttribute(getContext(), findattribute);
	}

	/**
	 * Set value of FindAttribute
	 * @param context
	 * @param findattribute
	 */
	public final void setFindAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findattribute)
	{
		getMendixObject().setValue(context, MemberNames.FindAttribute.toString(), findattribute);
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
	 * @return value of FindObjectType
	 */
	public final java.lang.String getFindObjectType()
	{
		return getFindObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of FindObjectType
	 */
	public final java.lang.String getFindObjectType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindObjectType.toString());
	}

	/**
	 * Set value of FindObjectType
	 * @param findobjecttype
	 */
	public final void setFindObjectType(java.lang.String findobjecttype)
	{
		setFindObjectType(getContext(), findobjecttype);
	}

	/**
	 * Set value of FindObjectType
	 * @param context
	 * @param findobjecttype
	 */
	public final void setFindObjectType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findobjecttype)
	{
		getMendixObject().setValue(context, MemberNames.FindObjectType.toString(), findobjecttype);
	}

	/**
	 * @return value of FindMicroflow
	 */
	public final java.lang.String getFindMicroflow()
	{
		return getFindMicroflow(getContext());
	}

	/**
	 * @param context
	 * @return value of FindMicroflow
	 */
	public final java.lang.String getFindMicroflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FindMicroflow.toString());
	}

	/**
	 * Set value of FindMicroflow
	 * @param findmicroflow
	 */
	public final void setFindMicroflow(java.lang.String findmicroflow)
	{
		setFindMicroflow(getContext(), findmicroflow);
	}

	/**
	 * Set value of FindMicroflow
	 * @param context
	 * @param findmicroflow
	 */
	public final void setFindMicroflow(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String findmicroflow)
	{
		getMendixObject().setValue(context, MemberNames.FindMicroflow.toString(), findmicroflow);
	}

	/**
	 * Set value of DataSource
	 * @param datasource
	 */
	public final excelimporter.proxies.DataSource getDataSource()
	{
		return getDataSource(getContext());
	}

	/**
	 * @param context
	 * @return value of DataSource
	 */
	public final excelimporter.proxies.DataSource getDataSource(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DataSource.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.DataSource.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DataSource
	 * @param datasource
	 */
	public final void setDataSource(excelimporter.proxies.DataSource datasource)
	{
		setDataSource(getContext(), datasource);
	}

	/**
	 * Set value of DataSource
	 * @param context
	 * @param datasource
	 */
	public final void setDataSource(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.DataSource datasource)
	{
		if (datasource != null)
			getMendixObject().setValue(context, MemberNames.DataSource.toString(), datasource.toString());
		else
			getMendixObject().setValue(context, MemberNames.DataSource.toString(), null);
	}

	/**
	 * Set value of AttributeTypeEnum
	 * @param attributetypeenum
	 */
	public final mxmodelreflection.proxies.PrimitiveTypes getAttributeTypeEnum()
	{
		return getAttributeTypeEnum(getContext());
	}

	/**
	 * @param context
	 * @return value of AttributeTypeEnum
	 */
	public final mxmodelreflection.proxies.PrimitiveTypes getAttributeTypeEnum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AttributeTypeEnum.toString());
		if (obj == null)
			return null;

		return mxmodelreflection.proxies.PrimitiveTypes.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AttributeTypeEnum
	 * @param attributetypeenum
	 */
	public final void setAttributeTypeEnum(mxmodelreflection.proxies.PrimitiveTypes attributetypeenum)
	{
		setAttributeTypeEnum(getContext(), attributetypeenum);
	}

	/**
	 * Set value of AttributeTypeEnum
	 * @param context
	 * @param attributetypeenum
	 */
	public final void setAttributeTypeEnum(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.PrimitiveTypes attributetypeenum)
	{
		if (attributetypeenum != null)
			getMendixObject().setValue(context, MemberNames.AttributeTypeEnum.toString(), attributetypeenum.toString());
		else
			getMendixObject().setValue(context, MemberNames.AttributeTypeEnum.toString(), null);
	}

	/**
	 * @return value of InputMask
	 */
	public final java.lang.String getInputMask()
	{
		return getInputMask(getContext());
	}

	/**
	 * @param context
	 * @return value of InputMask
	 */
	public final java.lang.String getInputMask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InputMask.toString());
	}

	/**
	 * Set value of InputMask
	 * @param inputmask
	 */
	public final void setInputMask(java.lang.String inputmask)
	{
		setInputMask(getContext(), inputmask);
	}

	/**
	 * Set value of InputMask
	 * @param context
	 * @param inputmask
	 */
	public final void setInputMask(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inputmask)
	{
		getMendixObject().setValue(context, MemberNames.InputMask.toString(), inputmask);
	}

	/**
	 * @return value of Column_Template
	 */
	public final excelimporter.proxies.Template getColumn_Template() throws com.mendix.core.CoreException
	{
		return getColumn_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_Template
	 */
	public final excelimporter.proxies.Template getColumn_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		excelimporter.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_Template.toString());
		if (identifier != null)
			result = excelimporter.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_Template
	 * @param column_template
	 */
	public final void setColumn_Template(excelimporter.proxies.Template column_template)
	{
		setColumn_Template(getContext(), column_template);
	}

	/**
	 * Set value of Column_Template
	 * @param context
	 * @param column_template
	 */
	public final void setColumn_Template(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.Template column_template)
	{
		if (column_template == null)
			getMendixObject().setValue(context, MemberNames.Column_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_Template.toString(), column_template.getMendixObject().getId());
	}

	/**
	 * @return value of Column_MasterColumn
	 */
	public final excelimporter.proxies.Column getColumn_MasterColumn() throws com.mendix.core.CoreException
	{
		return getColumn_MasterColumn(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_MasterColumn
	 */
	public final excelimporter.proxies.Column getColumn_MasterColumn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		excelimporter.proxies.Column result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_MasterColumn.toString());
		if (identifier != null)
			result = excelimporter.proxies.Column.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_MasterColumn
	 * @param column_mastercolumn
	 */
	public final void setColumn_MasterColumn(excelimporter.proxies.Column column_mastercolumn)
	{
		setColumn_MasterColumn(getContext(), column_mastercolumn);
	}

	/**
	 * Set value of Column_MasterColumn
	 * @param context
	 * @param column_mastercolumn
	 */
	public final void setColumn_MasterColumn(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.Column column_mastercolumn)
	{
		if (column_mastercolumn == null)
			getMendixObject().setValue(context, MemberNames.Column_MasterColumn.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_MasterColumn.toString(), column_mastercolumn.getMendixObject().getId());
	}

	/**
	 * @return value of Column_MxObjectType_Reference
	 */
	public final mxmodelreflection.proxies.MxObjectType getColumn_MxObjectType_Reference() throws com.mendix.core.CoreException
	{
		return getColumn_MxObjectType_Reference(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_MxObjectType_Reference
	 */
	public final mxmodelreflection.proxies.MxObjectType getColumn_MxObjectType_Reference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_MxObjectType_Reference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_MxObjectType_Reference
	 * @param column_mxobjecttype_reference
	 */
	public final void setColumn_MxObjectType_Reference(mxmodelreflection.proxies.MxObjectType column_mxobjecttype_reference)
	{
		setColumn_MxObjectType_Reference(getContext(), column_mxobjecttype_reference);
	}

	/**
	 * Set value of Column_MxObjectType_Reference
	 * @param context
	 * @param column_mxobjecttype_reference
	 */
	public final void setColumn_MxObjectType_Reference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType column_mxobjecttype_reference)
	{
		if (column_mxobjecttype_reference == null)
			getMendixObject().setValue(context, MemberNames.Column_MxObjectType_Reference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_MxObjectType_Reference.toString(), column_mxobjecttype_reference.getMendixObject().getId());
	}

	/**
	 * @return value of Column_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getColumn_MxObjectType() throws com.mendix.core.CoreException
	{
		return getColumn_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getColumn_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_MxObjectType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_MxObjectType
	 * @param column_mxobjecttype
	 */
	public final void setColumn_MxObjectType(mxmodelreflection.proxies.MxObjectType column_mxobjecttype)
	{
		setColumn_MxObjectType(getContext(), column_mxobjecttype);
	}

	/**
	 * Set value of Column_MxObjectType
	 * @param context
	 * @param column_mxobjecttype
	 */
	public final void setColumn_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType column_mxobjecttype)
	{
		if (column_mxobjecttype == null)
			getMendixObject().setValue(context, MemberNames.Column_MxObjectType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_MxObjectType.toString(), column_mxobjecttype.getMendixObject().getId());
	}

	/**
	 * @return value of Column_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getColumn_MxObjectMember() throws com.mendix.core.CoreException
	{
		return getColumn_MxObjectMember(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getColumn_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_MxObjectMember.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_MxObjectMember
	 * @param column_mxobjectmember
	 */
	public final void setColumn_MxObjectMember(mxmodelreflection.proxies.MxObjectMember column_mxobjectmember)
	{
		setColumn_MxObjectMember(getContext(), column_mxobjectmember);
	}

	/**
	 * Set value of Column_MxObjectMember
	 * @param context
	 * @param column_mxobjectmember
	 */
	public final void setColumn_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember column_mxobjectmember)
	{
		if (column_mxobjectmember == null)
			getMendixObject().setValue(context, MemberNames.Column_MxObjectMember.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_MxObjectMember.toString(), column_mxobjectmember.getMendixObject().getId());
	}

	/**
	 * @return value of Column_MxObjectMember_Reference
	 */
	public final mxmodelreflection.proxies.MxObjectMember getColumn_MxObjectMember_Reference() throws com.mendix.core.CoreException
	{
		return getColumn_MxObjectMember_Reference(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_MxObjectMember_Reference
	 */
	public final mxmodelreflection.proxies.MxObjectMember getColumn_MxObjectMember_Reference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_MxObjectMember_Reference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_MxObjectMember_Reference
	 * @param column_mxobjectmember_reference
	 */
	public final void setColumn_MxObjectMember_Reference(mxmodelreflection.proxies.MxObjectMember column_mxobjectmember_reference)
	{
		setColumn_MxObjectMember_Reference(getContext(), column_mxobjectmember_reference);
	}

	/**
	 * Set value of Column_MxObjectMember_Reference
	 * @param context
	 * @param column_mxobjectmember_reference
	 */
	public final void setColumn_MxObjectMember_Reference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember column_mxobjectmember_reference)
	{
		if (column_mxobjectmember_reference == null)
			getMendixObject().setValue(context, MemberNames.Column_MxObjectMember_Reference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_MxObjectMember_Reference.toString(), column_mxobjectmember_reference.getMendixObject().getId());
	}

	/**
	 * @return value of Column_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getColumn_MxObjectReference() throws com.mendix.core.CoreException
	{
		return getColumn_MxObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getColumn_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_MxObjectReference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectReference.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_MxObjectReference
	 * @param column_mxobjectreference
	 */
	public final void setColumn_MxObjectReference(mxmodelreflection.proxies.MxObjectReference column_mxobjectreference)
	{
		setColumn_MxObjectReference(getContext(), column_mxobjectreference);
	}

	/**
	 * Set value of Column_MxObjectReference
	 * @param context
	 * @param column_mxobjectreference
	 */
	public final void setColumn_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectReference column_mxobjectreference)
	{
		if (column_mxobjectreference == null)
			getMendixObject().setValue(context, MemberNames.Column_MxObjectReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_MxObjectReference.toString(), column_mxobjectreference.getMendixObject().getId());
	}

	/**
	 * @return value of Column_Microflows
	 */
	public final mxmodelreflection.proxies.Microflows getColumn_Microflows() throws com.mendix.core.CoreException
	{
		return getColumn_Microflows(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_Microflows
	 */
	public final mxmodelreflection.proxies.Microflows getColumn_Microflows(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.Microflows result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_Microflows.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.Microflows.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_Microflows
	 * @param column_microflows
	 */
	public final void setColumn_Microflows(mxmodelreflection.proxies.Microflows column_microflows)
	{
		setColumn_Microflows(getContext(), column_microflows);
	}

	/**
	 * Set value of Column_Microflows
	 * @param context
	 * @param column_microflows
	 */
	public final void setColumn_Microflows(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.Microflows column_microflows)
	{
		if (column_microflows == null)
			getMendixObject().setValue(context, MemberNames.Column_Microflows.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_Microflows.toString(), column_microflows.getMendixObject().getId());
	}

	/**
	 * @return value of Column_ValueType
	 */
	public final mxmodelreflection.proxies.ValueType getColumn_ValueType() throws com.mendix.core.CoreException
	{
		return getColumn_ValueType(getContext());
	}

	/**
	 * @param context
	 * @return value of Column_ValueType
	 */
	public final mxmodelreflection.proxies.ValueType getColumn_ValueType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.ValueType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Column_ValueType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.ValueType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Column_ValueType
	 * @param column_valuetype
	 */
	public final void setColumn_ValueType(mxmodelreflection.proxies.ValueType column_valuetype)
	{
		setColumn_ValueType(getContext(), column_valuetype);
	}

	/**
	 * Set value of Column_ValueType
	 * @param context
	 * @param column_valuetype
	 */
	public final void setColumn_ValueType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.ValueType column_valuetype)
	{
		if (column_valuetype == null)
			getMendixObject().setValue(context, MemberNames.Column_ValueType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Column_ValueType.toString(), column_valuetype.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return columnMendixObject;
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
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final excelimporter.proxies.Column that = (excelimporter.proxies.Column) obj;
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
		return "ExcelImporter.Column";
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
