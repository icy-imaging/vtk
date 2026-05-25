// java wrapper for vtkSEPReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSEPReader extends vtkImageAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native int GetOutputGridDimension_6();
  public int GetOutputGridDimension()
  {
    return GetOutputGridDimension_6();
  }

  private native void SetOutputGridDimension_7(int id0);
  public void SetOutputGridDimension(int id0)
  {
    SetOutputGridDimension_7(id0);
  }

  private native void SetExtentSplitMode_8(int id0);
  public void SetExtentSplitMode(int id0)
  {
    SetExtentSplitMode_8(id0);
  }

  private native int GetExtentSplitMode_9();
  public int GetExtentSplitMode()
  {
    return GetExtentSplitMode_9();
  }

  private native long GetAllDimensions_10();
  public vtkStringArray GetAllDimensions()
  {
    long temp = GetAllDimensions_10();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAllRanges_11();
  public vtkStringArray GetAllRanges()
  {
    long temp = GetAllRanges_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXDimension_12(byte[] id0, int len0);
  public void SetXDimension(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXDimension_12(bytes0, bytes0.length);
  }

  private native void SetYDimension_13(byte[] id0, int len0);
  public void SetYDimension(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYDimension_13(bytes0, bytes0.length);
  }

  private native void SetZDimension_14(byte[] id0, int len0);
  public void SetZDimension(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZDimension_14(bytes0, bytes0.length);
  }

  private native void SetFixedDimension1_15(byte[] id0, int len0);
  public void SetFixedDimension1(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFixedDimension1_15(bytes0, bytes0.length);
  }

  private native void SetFixedDimension2_16(byte[] id0, int len0);
  public void SetFixedDimension2(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFixedDimension2_16(bytes0, bytes0.length);
  }

  private native void SetFixedDimensionValue1_17(int id0);
  public void SetFixedDimensionValue1(int id0)
  {
    SetFixedDimensionValue1_17(id0);
  }

  private native void SetFixedDimensionValue2_18(int id0);
  public void SetFixedDimensionValue2(int id0)
  {
    SetFixedDimensionValue2_18(id0);
  }

  private native int[] GetFixedDimRange_19();
  public int[] GetFixedDimRange()
  {
    return GetFixedDimRange_19();
  }

  private native boolean CanReadFile_20(byte[] id0, int len0);
  public boolean CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_20(bytes0, bytes0.length);
  }

  public vtkSEPReader() { super(); }

  public vtkSEPReader(long id) { super(id); }
  public native long   VTKInit();

}
