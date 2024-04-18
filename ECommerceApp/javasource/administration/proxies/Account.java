// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies;

public class Account extends system.proxies.User
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administration.Account";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FullName("FullName"),
		Email("Email"),
		IsLocalUser("IsLocalUser"),
		BirthDate("BirthDate"),
		Gender("Gender"),
		Surname("Surname"),
		FirstName("FirstName"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		Account_ProfileImage("Administration.Account_ProfileImage"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public Account(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Administration.Account"));
	}

	protected Account(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountMendixObject)
	{
		super(context, accountMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Administration.Account", accountMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Administration.Account");
	}

	/**
	 * @deprecated Use 'Account.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administration.proxies.Account.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static administration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administration.proxies.Account(context, mendixObject);
	}

	public static administration.proxies.Account load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administration.proxies.Account.initialize(context, mendixObject);
	}

	public static java.util.List<administration.proxies.Account> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<administration.proxies.Account> result = new java.util.ArrayList<administration.proxies.Account>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Administration.Account" + xpathConstraint))
			result.add(administration.proxies.Account.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser()
	{
		return getIsLocalUser(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLocalUser
	 */
	public final java.lang.Boolean getIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLocalUser.toString());
	}

	/**
	 * Set value of IsLocalUser
	 * @param islocaluser
	 */
	public final void setIsLocalUser(java.lang.Boolean islocaluser)
	{
		setIsLocalUser(getContext(), islocaluser);
	}

	/**
	 * Set value of IsLocalUser
	 * @param context
	 * @param islocaluser
	 */
	public final void setIsLocalUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islocaluser)
	{
		getMendixObject().setValue(context, MemberNames.IsLocalUser.toString(), islocaluser);
	}

	/**
	 * @return value of BirthDate
	 */
	public final java.util.Date getBirthDate()
	{
		return getBirthDate(getContext());
	}

	/**
	 * @param context
	 * @return value of BirthDate
	 */
	public final java.util.Date getBirthDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.BirthDate.toString());
	}

	/**
	 * Set value of BirthDate
	 * @param birthdate
	 */
	public final void setBirthDate(java.util.Date birthdate)
	{
		setBirthDate(getContext(), birthdate);
	}

	/**
	 * Set value of BirthDate
	 * @param context
	 * @param birthdate
	 */
	public final void setBirthDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date birthdate)
	{
		getMendixObject().setValue(context, MemberNames.BirthDate.toString(), birthdate);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final anonymous.proxies.ENUM_GENDER getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final anonymous.proxies.ENUM_GENDER getGender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Gender.toString());
		if (obj == null)
			return null;

		return anonymous.proxies.ENUM_GENDER.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(anonymous.proxies.ENUM_GENDER gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(com.mendix.systemwideinterfaces.core.IContext context, anonymous.proxies.ENUM_GENDER gender)
	{
		if (gender != null)
			getMendixObject().setValue(context, MemberNames.Gender.toString(), gender.toString());
		else
			getMendixObject().setValue(context, MemberNames.Gender.toString(), null);
	}

	/**
	 * @return value of Surname
	 */
	public final java.lang.String getSurname()
	{
		return getSurname(getContext());
	}

	/**
	 * @param context
	 * @return value of Surname
	 */
	public final java.lang.String getSurname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Surname.toString());
	}

	/**
	 * Set value of Surname
	 * @param surname
	 */
	public final void setSurname(java.lang.String surname)
	{
		setSurname(getContext(), surname);
	}

	/**
	 * Set value of Surname
	 * @param context
	 * @param surname
	 */
	public final void setSurname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String surname)
	{
		getMendixObject().setValue(context, MemberNames.Surname.toString(), surname);
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of Account_ProfileImage
	 */
	public final administration.proxies.ProfileImage getAccount_ProfileImage() throws com.mendix.core.CoreException
	{
		return getAccount_ProfileImage(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_ProfileImage
	 */
	public final administration.proxies.ProfileImage getAccount_ProfileImage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.ProfileImage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_ProfileImage.toString());
		if (identifier != null)
			result = administration.proxies.ProfileImage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_ProfileImage
	 * @param account_profileimage
	 */
	public final void setAccount_ProfileImage(administration.proxies.ProfileImage account_profileimage)
	{
		setAccount_ProfileImage(getContext(), account_profileimage);
	}

	/**
	 * Set value of Account_ProfileImage
	 * @param context
	 * @param account_profileimage
	 */
	public final void setAccount_ProfileImage(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.ProfileImage account_profileimage)
	{
		if (account_profileimage == null)
			getMendixObject().setValue(context, MemberNames.Account_ProfileImage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_ProfileImage.toString(), account_profileimage.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final administration.proxies.Account that = (administration.proxies.Account) obj;
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
		return "Administration.Account";
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