// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesmanager.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the SalesManager module
	public static void aCT_ApplyFilter(IContext context, salesmanager.proxies.ProductFilterHelper _productFilterHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProductFilterHelper", _productFilterHelper == null ? null : _productFilterHelper.getMendixObject());
		Core.microflowCall("SalesManager.ACT_ApplyFilter").withParams(params).execute(context);
	}
	public static java.util.List<salesmanager.proxies.Product> dS_FilteredProducts(IContext context, salesmanager.proxies.ProductFilterHelper _productFilterHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProductFilterHelper", _productFilterHelper == null ? null : _productFilterHelper.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("SalesManager.DS_FilteredProducts").withParams(params).execute(context);
		java.util.List<salesmanager.proxies.Product> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(salesmanager.proxies.Product.initialize(context, obj));
		}
		return result;
	}
	public static salesmanager.proxies.ProductFilterHelper dS_ProductFilterHelper(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("SalesManager.DS_ProductFilterHelper").withParams(params).execute(context);
		return result == null ? null : salesmanager.proxies.ProductFilterHelper.initialize(context, result);
	}
}