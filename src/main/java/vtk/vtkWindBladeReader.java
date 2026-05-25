// java wrapper for vtkWindBladeReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWindBladeReader extends vtkStructuredGridAlgorithm
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

  private native void SetFilename_4(byte[] id0, int len0);
  public void SetFilename(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilename_4(bytes0, bytes0.length);
  }

  private native byte[] GetFilename_5();
  public String GetFilename()
  {
    return new String(GetFilename_5(), StandardCharsets.UTF_8);
  }

  private native void SetWholeExtent_6(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWholeExtent_7(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_7(id0);
  }

  private native int[] GetWholeExtent_8();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_8();
  }

  private native void SetSubExtent_9(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetSubExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetSubExtent_9(id0,id1,id2,id3,id4,id5);
  }

  private native void SetSubExtent_10(int id0[]);
  public void SetSubExtent(int id0[])
  {
    SetSubExtent_10(id0);
  }

  private native int[] GetSubExtent_11();
  public int[] GetSubExtent()
  {
    return GetSubExtent_11();
  }

  private native long GetFieldOutput_12();
  public vtkStructuredGrid GetFieldOutput()
  {
    long temp = GetFieldOutput_12();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBladeOutput_13();
  public vtkUnstructuredGrid GetBladeOutput()
  {
    long temp = GetBladeOutput_13();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGroundOutput_14();
  public vtkStructuredGrid GetGroundOutput()
  {
    long temp = GetGroundOutput_14();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_15();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_15();
  }

  private native byte[] GetPointArrayName_16(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_16(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_17(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_17(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_18(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_18(bytes0, bytes0.length,id1);
  }

  private native void DisableAllPointArrays_19();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_19();
  }

  private native void EnableAllPointArrays_20();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_20();
  }

  public vtkWindBladeReader() { super(); }

  public vtkWindBladeReader(long id) { super(id); }
  public native long   VTKInit();

}
