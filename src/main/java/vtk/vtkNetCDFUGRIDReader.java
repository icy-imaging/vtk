// java wrapper for vtkNetCDFUGRIDReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNetCDFUGRIDReader extends vtkUnstructuredGridAlgorithm
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

  private native long GetPointDataArraySelection_6();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_6();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_7();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_7();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_8();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_8();
  }

  private native int GetNumberOfCellArrays_9();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_9();
  }

  private native byte[] GetPointArrayName_10(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_10(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_11(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_11(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_12(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_12(bytes0, bytes0.length);
  }

  private native int GetCellArrayStatus_13(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_13(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_14(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_14(bytes0, bytes0.length,id1);
  }

  private native void SetCellArrayStatus_15(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_15(bytes0, bytes0.length,id1);
  }

  private native boolean GetReplaceFillValueWithNan_16();
  public boolean GetReplaceFillValueWithNan()
  {
    return GetReplaceFillValueWithNan_16();
  }

  private native void SetReplaceFillValueWithNan_17(boolean id0);
  public void SetReplaceFillValueWithNan(boolean id0)
  {
    SetReplaceFillValueWithNan_17(id0);
  }

  private native void ReplaceFillValueWithNanOn_18();
  public void ReplaceFillValueWithNanOn()
  {
    ReplaceFillValueWithNanOn_18();
  }

  private native void ReplaceFillValueWithNanOff_19();
  public void ReplaceFillValueWithNanOff()
  {
    ReplaceFillValueWithNanOff_19();
  }

  public vtkNetCDFUGRIDReader() { super(); }

  public vtkNetCDFUGRIDReader(long id) { super(id); }
  public native long   VTKInit();

}
