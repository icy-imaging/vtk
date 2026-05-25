// java wrapper for vtkGenericDataSetTessellator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericDataSetTessellator extends vtkUnstructuredGridAlgorithm
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

  private native void SetKeepCellIds_4(int id0);
  public void SetKeepCellIds(int id0)
  {
    SetKeepCellIds_4(id0);
  }

  private native int GetKeepCellIds_5();
  public int GetKeepCellIds()
  {
    return GetKeepCellIds_5();
  }

  private native void KeepCellIdsOn_6();
  public void KeepCellIdsOn()
  {
    KeepCellIdsOn_6();
  }

  private native void KeepCellIdsOff_7();
  public void KeepCellIdsOff()
  {
    KeepCellIdsOff_7();
  }

  private native void SetMerging_8(int id0);
  public void SetMerging(int id0)
  {
    SetMerging_8(id0);
  }

  private native int GetMerging_9();
  public int GetMerging()
  {
    return GetMerging_9();
  }

  private native void MergingOn_10();
  public void MergingOn()
  {
    MergingOn_10();
  }

  private native void MergingOff_11();
  public void MergingOff()
  {
    MergingOff_11();
  }

  private native void SetLocator_12(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_12(id0);
  }

  private native long GetLocator_13();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_13();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_14();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_14();
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  public vtkGenericDataSetTessellator() { super(); }

  public vtkGenericDataSetTessellator(long id) { super(id); }
  public native long   VTKInit();

}
