/*
 * Distributed under the LGPL License
 * 
 */
package org.jboss.seam.xml.test.fieldset;

import java.math.BigDecimal;

import org.jboss.seam.xml.test.method.QualifierEnum;

public class FieldValueBean
{

   public void init()
   {
      assert ivalue != 20;
   }

   private int ivalue = 20;

   public String stringValue;

   public QualifierEnum enumValue;

   public boolean bvalue;

   public float fvalue = 1;

   public double dvalue = 1;

   public BigDecimal bigDecimalValue;

   public short svalue;

   public long lvalue;

   int noFieldValue;

   public void setIvalue(int value)
   {
      this.ivalue = value + 1;
   }

   public int getIvalue()
   {
      return ivalue;
   }

   public int getNoField()
   {
      return noFieldValue;
   }

   public void setNoField(int value)
   {
      noFieldValue = value;
   }

}
