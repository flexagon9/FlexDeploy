package xxt.oracle.apps.ak.xxperson.server;
import oracle.apps.fnd.framework.server.OAViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.RowID;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
// Change 2
public class xxPersonDetailsVORowImpl extends OAViewRowImpl 
{


  protected static final int PERSONID = 0;
  protected static final int FIRSTNAME = 1;
  protected static final int LASTNAME = 2;
  protected static final int EMAIL = 3;
  protected static final int STUDENTFLAG = 4;
  protected static final int NAMEOFUNIVERSITY = 5;
  protected static final int LASTUPDATEDATE = 6;
  protected static final int LASTUPDATELOGIN = 7;
  protected static final int LASTUPDATEDBY = 8;
  protected static final int CREATIONDATE = 9;
  protected static final int CREATEDBY = 10;
  protected static final int ROWID = 11;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public xxPersonDetailsVORowImpl()
  {
  }

  /**
   * 
   * Gets xxPersonDetailsEO entity object.
   */
  public xxt.oracle.apps.ak.xxperson.schema.server.xxPersonDetailsEOImpl getxxPersonDetailsEO()
  {
    return (xxt.oracle.apps.ak.xxperson.schema.server.xxPersonDetailsEOImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for PERSON_ID using the alias name PersonId
   */
  public Number getPersonId()
  {
    return (Number)getAttributeInternal(PERSONID);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId
   */
  public void setPersonId(Number value)
  {
    setAttributeInternal(PERSONID, value);
  }

  /**
   * 
   * Gets the attribute value for FIRST_NAME using the alias name FirstName
   */
  public String getFirstName()
  {
    return (String)getAttributeInternal(FIRSTNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName
   */
  public void setFirstName(String value)
  {
    setAttributeInternal(FIRSTNAME, value);
  }

  /**
   * 
   * Gets the attribute value for LAST_NAME using the alias name LastName
   */
  public String getLastName()
  {
    return (String)getAttributeInternal(LASTNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName
   */
  public void setLastName(String value)
  {
    setAttributeInternal(LASTNAME, value);
  }

  /**
   * 
   * Gets the attribute value for EMAIL using the alias name Email
   */
  public String getEmail()
  {
    return (String)getAttributeInternal(EMAIL);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for EMAIL using the alias name Email
   */
  public void setEmail(String value)
  {
    setAttributeInternal(EMAIL, value);
  }

  /**
   * 
   * Gets the attribute value for STUDENT_FLAG using the alias name StudentFlag
   */
  public String getStudentFlag()
  {
    return (String)getAttributeInternal(STUDENTFLAG);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for STUDENT_FLAG using the alias name StudentFlag
   */
  public void setStudentFlag(String value)
  {
    setAttributeInternal(STUDENTFLAG, value);
  }

  /**
   * 
   * Gets the attribute value for NAME_OF_UNIVERSITY using the alias name NameOfUniversity
   */
  public String getNameOfUniversity()
  {
    return (String)getAttributeInternal(NAMEOFUNIVERSITY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for NAME_OF_UNIVERSITY using the alias name NameOfUniversity
   */
  public void setNameOfUniversity(String value)
  {
    setAttributeInternal(NAMEOFUNIVERSITY, value);
  }

  /**
   * 
   * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate
   */
  public Date getLastUpdateDate()
  {
    return (Date)getAttributeInternal(LASTUPDATEDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate
   */
  public void setLastUpdateDate(Date value)
  {
    setAttributeInternal(LASTUPDATEDATE, value);
  }

  /**
   * 
   * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin
   */
  public Number getLastUpdateLogin()
  {
    return (Number)getAttributeInternal(LASTUPDATELOGIN);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin
   */
  public void setLastUpdateLogin(Number value)
  {
    setAttributeInternal(LASTUPDATELOGIN, value);
  }

  /**
   * 
   * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
   */
  public Number getLastUpdatedBy()
  {
    return (Number)getAttributeInternal(LASTUPDATEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
   */
  public void setLastUpdatedBy(Number value)
  {
    setAttributeInternal(LASTUPDATEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for CREATION_DATE using the alias name CreationDate
   */
  public Date getCreationDate()
  {
    return (Date)getAttributeInternal(CREATIONDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate
   */
  public void setCreationDate(Date value)
  {
    setAttributeInternal(CREATIONDATE, value);
  }

  /**
   * 
   * Gets the attribute value for CREATED_BY using the alias name CreatedBy
   */
  public Number getCreatedBy()
  {
    return (Number)getAttributeInternal(CREATEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy
   */
  public void setCreatedBy(Number value)
  {
    setAttributeInternal(CREATEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for ROWID using the alias name RowID
   */
  public RowID getRowID()
  {
    return (RowID)getAttributeInternal(ROWID);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case PERSONID:
        return getPersonId();
      case FIRSTNAME:
        return getFirstName();
      case LASTNAME:
        return getLastName();
      case EMAIL:
        return getEmail();
      case STUDENTFLAG:
        return getStudentFlag();
      case NAMEOFUNIVERSITY:
        return getNameOfUniversity();
      case LASTUPDATEDATE:
        return getLastUpdateDate();
      case LASTUPDATELOGIN:
        return getLastUpdateLogin();
      case LASTUPDATEDBY:
        return getLastUpdatedBy();
      case CREATIONDATE:
        return getCreationDate();
      case CREATEDBY:
        return getCreatedBy();
      case ROWID:
        return getRowID();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case PERSONID:
        setPersonId((Number)value);
        return;
      case FIRSTNAME:
        setFirstName((String)value);
        return;
      case LASTNAME:
        setLastName((String)value);
        return;
      case EMAIL:
        setEmail((String)value);
        return;
      case STUDENTFLAG:
        setStudentFlag((String)value);
        return;
      case NAMEOFUNIVERSITY:
        setNameOfUniversity((String)value);
        return;
      case LASTUPDATEDATE:
        setLastUpdateDate((Date)value);
        return;
      case LASTUPDATELOGIN:
        setLastUpdateLogin((Number)value);
        return;
      case LASTUPDATEDBY:
        setLastUpdatedBy((Number)value);
        return;
      case CREATIONDATE:
        setCreationDate((Date)value);
        return;
      case CREATEDBY:
        setCreatedBy((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }
}