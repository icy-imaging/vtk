// java wrapper for vtkPLYWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPLYWriter extends vtkWriter
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

  private native void SetDataByteOrder_4(int id0);
  public void SetDataByteOrder(int id0)
  {
    SetDataByteOrder_4(id0);
  }

  private native int GetDataByteOrderMinValue_5();
  public int GetDataByteOrderMinValue()
  {
    return GetDataByteOrderMinValue_5();
  }

  private native int GetDataByteOrderMaxValue_6();
  public int GetDataByteOrderMaxValue()
  {
    return GetDataByteOrderMaxValue_6();
  }

  private native int GetDataByteOrder_7();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_7();
  }

  private native void SetDataByteOrderToBigEndian_8();
  public void SetDataByteOrderToBigEndian()
  {
    SetDataByteOrderToBigEndian_8();
  }

  private native void SetDataByteOrderToLittleEndian_9();
  public void SetDataByteOrderToLittleEndian()
  {
    SetDataByteOrderToLittleEndian_9();
  }

  private native void SetWriteToOutputString_10(boolean id0);
  public void SetWriteToOutputString(boolean id0)
  {
    SetWriteToOutputString_10(id0);
  }

  private native boolean GetWriteToOutputString_11();
  public boolean GetWriteToOutputString()
  {
    return GetWriteToOutputString_11();
  }

  private native void WriteToOutputStringOn_12();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_12();
  }

  private native void WriteToOutputStringOff_13();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_13();
  }

  private native byte[] GetOutputString_14();
  public String GetOutputString()
  {
    return new String(GetOutputString_14(), StandardCharsets.UTF_8);
  }

  private native void SetWriteObjectInformation_15(boolean id0);
  public void SetWriteObjectInformation(boolean id0)
  {
    SetWriteObjectInformation_15(id0);
  }

  private native boolean GetWriteObjectInformation_16();
  public boolean GetWriteObjectInformation()
  {
    return GetWriteObjectInformation_16();
  }

  private native void WriteObjectInformationOn_17();
  public void WriteObjectInformationOn()
  {
    WriteObjectInformationOn_17();
  }

  private native void WriteObjectInformationOff_18();
  public void WriteObjectInformationOff()
  {
    WriteObjectInformationOff_18();
  }

  private native void SetColorMode_19(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_19(id0);
  }

  private native int GetColorMode_20();
  public int GetColorMode()
  {
    return GetColorMode_20();
  }

  private native void SetColorModeToDefault_21();
  public void SetColorModeToDefault()
  {
    SetColorModeToDefault_21();
  }

  private native void SetColorModeToUniformCellColor_22();
  public void SetColorModeToUniformCellColor()
  {
    SetColorModeToUniformCellColor_22();
  }

  private native void SetColorModeToUniformPointColor_23();
  public void SetColorModeToUniformPointColor()
  {
    SetColorModeToUniformPointColor_23();
  }

  private native void SetColorModeToUniformColor_24();
  public void SetColorModeToUniformColor()
  {
    SetColorModeToUniformColor_24();
  }

  private native void SetColorModeToOff_25();
  public void SetColorModeToOff()
  {
    SetColorModeToOff_25();
  }

  private native void SetEnableAlpha_26(boolean id0);
  public void SetEnableAlpha(boolean id0)
  {
    SetEnableAlpha_26(id0);
  }

  private native boolean GetEnableAlpha_27();
  public boolean GetEnableAlpha()
  {
    return GetEnableAlpha_27();
  }

  private native void EnableAlphaOn_28();
  public void EnableAlphaOn()
  {
    EnableAlphaOn_28();
  }

  private native void EnableAlphaOff_29();
  public void EnableAlphaOff()
  {
    EnableAlphaOff_29();
  }

  private native void SetArrayName_30(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_30(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_31();
  public String GetArrayName()
  {
    return new String(GetArrayName_31(), StandardCharsets.UTF_8);
  }

  private native void SetComponent_32(int id0);
  public void SetComponent(int id0)
  {
    SetComponent_32(id0);
  }

  private native int GetComponentMinValue_33();
  public int GetComponentMinValue()
  {
    return GetComponentMinValue_33();
  }

  private native int GetComponentMaxValue_34();
  public int GetComponentMaxValue()
  {
    return GetComponentMaxValue_34();
  }

  private native int GetComponent_35();
  public int GetComponent()
  {
    return GetComponent_35();
  }

  private native void SetLookupTable_36(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_36(id0);
  }

  private native long GetLookupTable_37();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_37();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColor_38(byte id0,byte id1,byte id2);
  public void SetColor(byte id0,byte id1,byte id2)
  {
    SetColor_38(id0,id1,id2);
  }

  private native byte[]  GetColor_39();
  public byte[]  GetColor()
  {
    return GetColor_39();
  }

  private native void SetAlpha_40(byte id0);
  public void SetAlpha(byte id0)
  {
    SetAlpha_40(id0);
  }

  private native byte GetAlpha_41();
  public byte GetAlpha()
  {
    return GetAlpha_41();
  }

  private native long GetInput_42();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_42();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_43(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_43(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_44(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_44(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_45();
  public String GetFileName()
  {
    return new String(GetFileName_45(), StandardCharsets.UTF_8);
  }

  private native void SetFileType_46(int id0);
  public void SetFileType(int id0)
  {
    SetFileType_46(id0);
  }

  private native int GetFileTypeMinValue_47();
  public int GetFileTypeMinValue()
  {
    return GetFileTypeMinValue_47();
  }

  private native int GetFileTypeMaxValue_48();
  public int GetFileTypeMaxValue()
  {
    return GetFileTypeMaxValue_48();
  }

  private native int GetFileType_49();
  public int GetFileType()
  {
    return GetFileType_49();
  }

  private native void SetFileTypeToASCII_50();
  public void SetFileTypeToASCII()
  {
    SetFileTypeToASCII_50();
  }

  private native void SetFileTypeToBinary_51();
  public void SetFileTypeToBinary()
  {
    SetFileTypeToBinary_51();
  }

  private native void SetTextureCoordinatesName_52(int id0);
  public void SetTextureCoordinatesName(int id0)
  {
    SetTextureCoordinatesName_52(id0);
  }

  private native int GetTextureCoordinatesNameMinValue_53();
  public int GetTextureCoordinatesNameMinValue()
  {
    return GetTextureCoordinatesNameMinValue_53();
  }

  private native int GetTextureCoordinatesNameMaxValue_54();
  public int GetTextureCoordinatesNameMaxValue()
  {
    return GetTextureCoordinatesNameMaxValue_54();
  }

  private native int GetTextureCoordinatesName_55();
  public int GetTextureCoordinatesName()
  {
    return GetTextureCoordinatesName_55();
  }

  private native void SetTextureCoordinatesNameToUV_56();
  public void SetTextureCoordinatesNameToUV()
  {
    SetTextureCoordinatesNameToUV_56();
  }

  private native void SetTextureCoordinatesNameToTextureUV_57();
  public void SetTextureCoordinatesNameToTextureUV()
  {
    SetTextureCoordinatesNameToTextureUV_57();
  }

  private native void AddComment_58(byte[] id0, int len0);
  public void AddComment(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddComment_58(bytes0, bytes0.length);
  }

  public vtkPLYWriter() { super(); }

  public vtkPLYWriter(long id) { super(id); }
  public native long   VTKInit();

}
