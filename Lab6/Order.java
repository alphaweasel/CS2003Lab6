/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 31 "main.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int orderNum;
  private String processingDate;
  private String ordered;
  private String assignedTo;
  private int price;

  //Order Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aOrderNum, String aProcessingDate, String aOrdered, String aAssignedTo, int aPrice, Account aAccount)
  {
    orderNum = aOrderNum;
    processingDate = aProcessingDate;
    ordered = aOrdered;
    assignedTo = aAssignedTo;
    price = aPrice;
    boolean didAddAccount = setAccount(aAccount);
    if (!didAddAccount)
    {
      throw new RuntimeException("Unable to create order due to account");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrderNum(int aOrderNum)
  {
    boolean wasSet = false;
    orderNum = aOrderNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setProcessingDate(String aProcessingDate)
  {
    boolean wasSet = false;
    processingDate = aProcessingDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrdered(String aOrdered)
  {
    boolean wasSet = false;
    ordered = aOrdered;
    wasSet = true;
    return wasSet;
  }

  public boolean setAssignedTo(String aAssignedTo)
  {
    boolean wasSet = false;
    assignedTo = aAssignedTo;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrice(int aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public int getOrderNum()
  {
    return orderNum;
  }

  public String getProcessingDate()
  {
    return processingDate;
  }

  public String getOrdered()
  {
    return ordered;
  }

  public String getAssignedTo()
  {
    return assignedTo;
  }

  public int getPrice()
  {
    return price;
  }

  public Account getAccount()
  {
    return account;
  }

  public boolean setAccount(Account aAccount)
  {
    boolean wasSet = false;
    if (aAccount == null)
    {
      return wasSet;
    }

    Account existingAccount = account;
    account = aAccount;
    if (existingAccount != null && !existingAccount.equals(aAccount))
    {
      existingAccount.removeOrder(this);
    }
    account.addOrder(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Account placeholderAccount = account;
    this.account = null;
    placeholderAccount.removeOrder(this);
  }

  // line 41 "main.ump"
   public void assignToEmployee(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "orderNum" + ":" + getOrderNum()+ "," +
            "processingDate" + ":" + getProcessingDate()+ "," +
            "ordered" + ":" + getOrdered()+ "," +
            "assignedTo" + ":" + getAssignedTo()+ "," +
            "price" + ":" + getPrice()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}