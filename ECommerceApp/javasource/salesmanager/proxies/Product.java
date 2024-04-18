// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesmanager.proxies;

public class Product
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SalesManager.Product";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProductName("ProductName"),
		Cost("Cost"),
		SalePrice("SalePrice"),
		Tax("Tax"),
		_Id("_Id"),
		Product_ProductCategory("SalesManager.Product_ProductCategory");

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

	public Product(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SalesManager.Product"));
	}

	protected Product(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject)
	{
		if (productMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SalesManager.Product", productMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SalesManager.Product");

		this.productMendixObject = productMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Product.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesmanager.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesmanager.proxies.Product.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesmanager.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesmanager.proxies.Product(context, mendixObject);
	}

	public static salesmanager.proxies.Product load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesmanager.proxies.Product.initialize(context, mendixObject);
	}

	public static java.util.List<salesmanager.proxies.Product> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<salesmanager.proxies.Product> result = new java.util.ArrayList<salesmanager.proxies.Product>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SalesManager.Product" + xpathConstraint))
			result.add(salesmanager.proxies.Product.initialize(context, obj));
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
	 * @return value of ProductName
	 */
	public final java.lang.String getProductName()
	{
		return getProductName(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductName
	 */
	public final java.lang.String getProductName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProductName.toString());
	}

	/**
	 * Set value of ProductName
	 * @param productname
	 */
	public final void setProductName(java.lang.String productname)
	{
		setProductName(getContext(), productname);
	}

	/**
	 * Set value of ProductName
	 * @param context
	 * @param productname
	 */
	public final void setProductName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String productname)
	{
		getMendixObject().setValue(context, MemberNames.ProductName.toString(), productname);
	}

	/**
	 * @return value of Cost
	 */
	public final java.math.BigDecimal getCost()
	{
		return getCost(getContext());
	}

	/**
	 * @param context
	 * @return value of Cost
	 */
	public final java.math.BigDecimal getCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Cost.toString());
	}

	/**
	 * Set value of Cost
	 * @param cost
	 */
	public final void setCost(java.math.BigDecimal cost)
	{
		setCost(getContext(), cost);
	}

	/**
	 * Set value of Cost
	 * @param context
	 * @param cost
	 */
	public final void setCost(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal cost)
	{
		getMendixObject().setValue(context, MemberNames.Cost.toString(), cost);
	}

	/**
	 * @return value of SalePrice
	 */
	public final java.math.BigDecimal getSalePrice()
	{
		return getSalePrice(getContext());
	}

	/**
	 * @param context
	 * @return value of SalePrice
	 */
	public final java.math.BigDecimal getSalePrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.SalePrice.toString());
	}

	/**
	 * Set value of SalePrice
	 * @param saleprice
	 */
	public final void setSalePrice(java.math.BigDecimal saleprice)
	{
		setSalePrice(getContext(), saleprice);
	}

	/**
	 * Set value of SalePrice
	 * @param context
	 * @param saleprice
	 */
	public final void setSalePrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal saleprice)
	{
		getMendixObject().setValue(context, MemberNames.SalePrice.toString(), saleprice);
	}

	/**
	 * @return value of Tax
	 */
	public final java.math.BigDecimal getTax()
	{
		return getTax(getContext());
	}

	/**
	 * @param context
	 * @return value of Tax
	 */
	public final java.math.BigDecimal getTax(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Tax.toString());
	}

	/**
	 * Set value of Tax
	 * @param tax
	 */
	public final void setTax(java.math.BigDecimal tax)
	{
		setTax(getContext(), tax);
	}

	/**
	 * Set value of Tax
	 * @param context
	 * @param tax
	 */
	public final void setTax(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal tax)
	{
		getMendixObject().setValue(context, MemberNames.Tax.toString(), tax);
	}

	/**
	 * @return value of _Id
	 */
	public final java.lang.Long get_Id()
	{
		return get_Id(getContext());
	}

	/**
	 * @param context
	 * @return value of _Id
	 */
	public final java.lang.Long get_Id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames._Id.toString());
	}

	/**
	 * Set value of _Id
	 * @param _id
	 */
	public final void set_Id(java.lang.Long _id)
	{
		set_Id(getContext(), _id);
	}

	/**
	 * Set value of _Id
	 * @param context
	 * @param _id
	 */
	public final void set_Id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long _id)
	{
		getMendixObject().setValue(context, MemberNames._Id.toString(), _id);
	}

	/**
	 * @return value of Product_ProductCategory
	 */
	public final salesmanager.proxies.ProductCategory getProduct_ProductCategory() throws com.mendix.core.CoreException
	{
		return getProduct_ProductCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_ProductCategory
	 */
	public final salesmanager.proxies.ProductCategory getProduct_ProductCategory(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesmanager.proxies.ProductCategory result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Product_ProductCategory.toString());
		if (identifier != null)
			result = salesmanager.proxies.ProductCategory.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Product_ProductCategory
	 * @param product_productcategory
	 */
	public final void setProduct_ProductCategory(salesmanager.proxies.ProductCategory product_productcategory)
	{
		setProduct_ProductCategory(getContext(), product_productcategory);
	}

	/**
	 * Set value of Product_ProductCategory
	 * @param context
	 * @param product_productcategory
	 */
	public final void setProduct_ProductCategory(com.mendix.systemwideinterfaces.core.IContext context, salesmanager.proxies.ProductCategory product_productcategory)
	{
		if (product_productcategory == null)
			getMendixObject().setValue(context, MemberNames.Product_ProductCategory.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Product_ProductCategory.toString(), product_productcategory.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productMendixObject;
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
			final salesmanager.proxies.Product that = (salesmanager.proxies.Product) obj;
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
		return "SalesManager.Product";
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
