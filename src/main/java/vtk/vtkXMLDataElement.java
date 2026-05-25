// java wrapper for vtkXMLDataElement object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLDataElement extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native byte[] GetName_4();
  public String GetName()
  {
    return new String(GetName_4(), StandardCharsets.UTF_8);
  }

  private native void SetName_5(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_5(bytes0, bytes0.length);
  }

  private native byte[] GetId_6();
  public String GetId()
  {
    return new String(GetId_6(), StandardCharsets.UTF_8);
  }

  private native void SetId_7(byte[] id0, int len0);
  public void SetId(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetId_7(bytes0, bytes0.length);
  }

  private native byte[] GetAttribute_8(byte[] id0, int len0);
  public String GetAttribute(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetAttribute_8(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native void SetAttribute_9(byte[] id0, int len0,byte[] id1, int len1);
  public void SetAttribute(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAttribute_9(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetCharacterData_10(byte[] id0, int len0,int id1);
  public void SetCharacterData(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCharacterData_10(bytes0, bytes0.length,id1);
  }

  private native byte[] GetCharacterData_11();
  public String GetCharacterData()
  {
    return new String(GetCharacterData_11(), StandardCharsets.UTF_8);
  }

  private native void SetIntAttribute_12(byte[] id0, int len0,int id1);
  public void SetIntAttribute(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIntAttribute_12(bytes0, bytes0.length,id1);
  }

  private native void SetFloatAttribute_13(byte[] id0, int len0,float id1);
  public void SetFloatAttribute(String id0,float id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFloatAttribute_13(bytes0, bytes0.length,id1);
  }

  private native void SetDoubleAttribute_14(byte[] id0, int len0,double id1);
  public void SetDoubleAttribute(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDoubleAttribute_14(bytes0, bytes0.length,id1);
  }

  private native void SetUnsignedLongAttribute_15(byte[] id0, int len0,long id1);
  public void SetUnsignedLongAttribute(String id0,long id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUnsignedLongAttribute_15(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfAttributes_16();
  public int GetNumberOfAttributes()
  {
    return GetNumberOfAttributes_16();
  }

  private native byte[] GetAttributeName_17(int id0);
  public String GetAttributeName(int id0)
  {
    return new String(GetAttributeName_17(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetAttributeValue_18(int id0);
  public String GetAttributeValue(int id0)
  {
    return new String(GetAttributeValue_18(id0), StandardCharsets.UTF_8);
  }

  private native void RemoveAttribute_19(byte[] id0, int len0);
  public void RemoveAttribute(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveAttribute_19(bytes0, bytes0.length);
  }

  private native void RemoveAllAttributes_20();
  public void RemoveAllAttributes()
  {
    RemoveAllAttributes_20();
  }

  private native long GetParent_21();
  public vtkXMLDataElement GetParent()
  {
    long temp = GetParent_21();

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParent_22(vtkXMLDataElement id0);
  public void SetParent(vtkXMLDataElement id0)
  {
    SetParent_22(id0);
  }

  private native long GetRoot_23();
  public vtkXMLDataElement GetRoot()
  {
    long temp = GetRoot_23();

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfNestedElements_24();
  public int GetNumberOfNestedElements()
  {
    return GetNumberOfNestedElements_24();
  }

  private native long GetNestedElement_25(int id0);
  public vtkXMLDataElement GetNestedElement(int id0)
  {
    long temp = GetNestedElement_25(id0);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddNestedElement_26(vtkXMLDataElement id0);
  public void AddNestedElement(vtkXMLDataElement id0)
  {
    AddNestedElement_26(id0);
  }

  private native void RemoveNestedElement_27(vtkXMLDataElement id0);
  public void RemoveNestedElement(vtkXMLDataElement id0)
  {
    RemoveNestedElement_27(id0);
  }

  private native void RemoveAllNestedElements_28();
  public void RemoveAllNestedElements()
  {
    RemoveAllNestedElements_28();
  }

  private native long FindNestedElement_29(byte[] id0, int len0);
  public vtkXMLDataElement FindNestedElement(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = FindNestedElement_29(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindNestedElementWithName_30(byte[] id0, int len0);
  public vtkXMLDataElement FindNestedElementWithName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = FindNestedElementWithName_30(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindNestedElementWithNameAndId_31(byte[] id0, int len0,byte[] id1, int len1);
  public vtkXMLDataElement FindNestedElementWithNameAndId(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = FindNestedElementWithNameAndId_31(bytes0, bytes0.length,bytes1, bytes1.length);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindNestedElementWithNameAndAttribute_32(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public vtkXMLDataElement FindNestedElementWithNameAndAttribute(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = FindNestedElementWithNameAndAttribute_32(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long LookupElementWithName_33(byte[] id0, int len0);
  public vtkXMLDataElement LookupElementWithName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = LookupElementWithName_33(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long LookupElement_34(byte[] id0, int len0);
  public vtkXMLDataElement LookupElement(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = LookupElement_34(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXMLByteIndex_35();
  public long GetXMLByteIndex()
  {
    return GetXMLByteIndex_35();
  }

  private native void SetXMLByteIndex_36(long id0);
  public void SetXMLByteIndex(long id0)
  {
    SetXMLByteIndex_36(id0);
  }

  private native int IsEqualTo_37(vtkXMLDataElement id0);
  public int IsEqualTo(vtkXMLDataElement id0)
  {
    return IsEqualTo_37(id0);
  }

  private native void DeepCopy_38(vtkXMLDataElement id0);
  public void DeepCopy(vtkXMLDataElement id0)
  {
    DeepCopy_38(id0);
  }

  private native void SetAttributeEncoding_39(int id0);
  public void SetAttributeEncoding(int id0)
  {
    SetAttributeEncoding_39(id0);
  }

  private native int GetAttributeEncodingMinValue_40();
  public int GetAttributeEncodingMinValue()
  {
    return GetAttributeEncodingMinValue_40();
  }

  private native int GetAttributeEncodingMaxValue_41();
  public int GetAttributeEncodingMaxValue()
  {
    return GetAttributeEncodingMaxValue_41();
  }

  private native int GetAttributeEncoding_42();
  public int GetAttributeEncoding()
  {
    return GetAttributeEncoding_42();
  }

  private native void PrintXML_43(byte[] id0, int len0);
  public void PrintXML(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    PrintXML_43(bytes0, bytes0.length);
  }

  private native int GetCharacterDataWidth_44();
  public int GetCharacterDataWidth()
  {
    return GetCharacterDataWidth_44();
  }

  private native void SetCharacterDataWidth_45(int id0);
  public void SetCharacterDataWidth(int id0)
  {
    SetCharacterDataWidth_45(id0);
  }

  public vtkXMLDataElement() { super(); }

  public vtkXMLDataElement(long id) { super(id); }
  public native long   VTKInit();

}
