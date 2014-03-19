class Contacts
{
	private String name;
	private int phoneNo;
	private String email;
	private String dateOfBirth;
	private boolean DoBHidden;
	
	public Contacts()
	{
		
	}
	
	public void setName(String aName)
	{
		if (!aName.isEmpty())
		{
			name = aName;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPhoneNo(int aPhoneNo)
	{
		//if (aPhoneNo.length)
		
		phoneNo = aPhoneNo;
	
	}
	
	public int getPhoneNo()
	{
		return phoneNo;
	}
}
