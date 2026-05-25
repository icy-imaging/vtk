// java wrapper for vtkMINCImageAttributes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMINCImageAttributes extends vtkObject
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

  private native void Reset_4();
  public void Reset()
  {
    Reset_4();
  }

  private native void SetName_5(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_5(bytes0, bytes0.length);
  }

  private native byte[] GetName_6();
  public String GetName()
  {
    return new String(GetName_6(), StandardCharsets.UTF_8);
  }

  private native void SetDataType_7(int id0);
  public void SetDataType(int id0)
  {
    SetDataType_7(id0);
  }

  private native int GetDataType_8();
  public int GetDataType()
  {
    return GetDataType_8();
  }

  private native void AddDimension_9(byte[] id0, int len0);
  public void AddDimension(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddDimension_9(bytes0, bytes0.length);
  }

  private native void AddDimension_10(byte[] id0, int len0,long id1);
  public void AddDimension(String id0,long id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddDimension_10(bytes0, bytes0.length,id1);
  }

  private native long GetDimensionNames_11();
  public vtkStringArray GetDimensionNames()
  {
    long temp = GetDimensionNames_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDimensionLengths_12();
  public vtkIdTypeArray GetDimensionLengths()
  {
    long temp = GetDimensionLengths_12();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVariableNames_13();
  public vtkStringArray GetVariableNames()
  {
    long temp = GetVariableNames_13();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAttributeNames_14(byte[] id0, int len0);
  public vtkStringArray GetAttributeNames(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetAttributeNames_14(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageMin_15(vtkDoubleArray id0);
  public void SetImageMin(vtkDoubleArray id0)
  {
    SetImageMin_15(id0);
  }

  private native void SetImageMax_16(vtkDoubleArray id0);
  public void SetImageMax(vtkDoubleArray id0)
  {
    SetImageMax_16(id0);
  }

  private native long GetImageMin_17();
  public vtkDoubleArray GetImageMin()
  {
    long temp = GetImageMin_17();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageMax_18();
  public vtkDoubleArray GetImageMax()
  {
    long temp = GetImageMax_18();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfImageMinMaxDimensions_19();
  public int GetNumberOfImageMinMaxDimensions()
  {
    return GetNumberOfImageMinMaxDimensions_19();
  }

  private native void SetNumberOfImageMinMaxDimensions_20(int id0);
  public void SetNumberOfImageMinMaxDimensions(int id0)
  {
    SetNumberOfImageMinMaxDimensions_20(id0);
  }

  private native int HasAttribute_21(byte[] id0, int len0,byte[] id1, int len1);
  public int HasAttribute(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return HasAttribute_21(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetAttributeValueAsArray_22(byte[] id0, int len0,byte[] id1, int len1,vtkDataArray id2);
  public void SetAttributeValueAsArray(String id0,String id1,vtkDataArray id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAttributeValueAsArray_22(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native long GetAttributeValueAsArray_23(byte[] id0, int len0,byte[] id1, int len1);
  public vtkDataArray GetAttributeValueAsArray(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = GetAttributeValueAsArray_23(bytes0, bytes0.length,bytes1, bytes1.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAttributeValueAsString_24(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetAttributeValueAsString(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetAttributeValueAsString_24(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native byte[] GetAttributeValueAsString_25(byte[] id0, int len0,byte[] id1, int len1);
  public String GetAttributeValueAsString(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return new String(GetAttributeValueAsString_25(bytes0, bytes0.length,bytes1, bytes1.length), StandardCharsets.UTF_8);
  }

  private native void SetAttributeValueAsInt_26(byte[] id0, int len0,byte[] id1, int len1,int id2);
  public void SetAttributeValueAsInt(String id0,String id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAttributeValueAsInt_26(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native int GetAttributeValueAsInt_27(byte[] id0, int len0,byte[] id1, int len1);
  public int GetAttributeValueAsInt(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetAttributeValueAsInt_27(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetAttributeValueAsDouble_28(byte[] id0, int len0,byte[] id1, int len1,double id2);
  public void SetAttributeValueAsDouble(String id0,String id1,double id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAttributeValueAsDouble_28(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native double GetAttributeValueAsDouble_29(byte[] id0, int len0,byte[] id1, int len1);
  public double GetAttributeValueAsDouble(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetAttributeValueAsDouble_29(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native int ValidateAttribute_30(byte[] id0, int len0,byte[] id1, int len1,vtkDataArray id2);
  public int ValidateAttribute(String id0,String id1,vtkDataArray id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return ValidateAttribute_30(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native void SetValidateAttributes_31(int id0);
  public void SetValidateAttributes(int id0)
  {
    SetValidateAttributes_31(id0);
  }

  private native void ValidateAttributesOn_32();
  public void ValidateAttributesOn()
  {
    ValidateAttributesOn_32();
  }

  private native void ValidateAttributesOff_33();
  public void ValidateAttributesOff()
  {
    ValidateAttributesOff_33();
  }

  private native int GetValidateAttributes_34();
  public int GetValidateAttributes()
  {
    return GetValidateAttributes_34();
  }

  private native void ShallowCopy_35(vtkMINCImageAttributes id0);
  public void ShallowCopy(vtkMINCImageAttributes id0)
  {
    ShallowCopy_35(id0);
  }

  private native void FindValidRange_36(double id0[]);
  public void FindValidRange(double id0[])
  {
    FindValidRange_36(id0);
  }

  private native void FindImageRange_37(double id0[]);
  public void FindImageRange(double id0[])
  {
    FindImageRange_37(id0);
  }

  private native void PrintFileHeader_38();
  public void PrintFileHeader()
  {
    PrintFileHeader_38();
  }

  public vtkMINCImageAttributes() { super(); }

  public vtkMINCImageAttributes(long id) { super(id); }
  public native long   VTKInit();

}
