// java wrapper for vtkAbstractCellLinks object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractCellLinks extends vtkObject
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

  private native void SetDataSet_4(vtkDataSet id0);
  public void SetDataSet(vtkDataSet id0)
  {
    SetDataSet_4(id0);
  }

  private native long GetDataSet_5();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildLinks_6(vtkDataSet id0);
  public void BuildLinks(vtkDataSet id0)
  {
    BuildLinks_6(id0);
  }

  private native void BuildLinks_7();
  public void BuildLinks()
  {
    BuildLinks_7();
  }

  private native void Initialize_8();
  public void Initialize()
  {
    Initialize_8();
  }

  private native void Squeeze_9();
  public void Squeeze()
  {
    Squeeze_9();
  }

  private native void Reset_10();
  public void Reset()
  {
    Reset_10();
  }

  private native long GetActualMemorySize_11();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_11();
  }

  private native void DeepCopy_12(vtkAbstractCellLinks id0);
  public void DeepCopy(vtkAbstractCellLinks id0)
  {
    DeepCopy_12(id0);
  }

  private native void ShallowCopy_13(vtkAbstractCellLinks id0);
  public void ShallowCopy(vtkAbstractCellLinks id0)
  {
    ShallowCopy_13(id0);
  }

  private native int ComputeType_14(long id0,long id1,vtkCellArray id2);
  public int ComputeType(long id0,long id1,vtkCellArray id2)
  {
    return ComputeType_14(id0,id1,id2);
  }

  private native int ComputeType_15(long id0,long id1,long id2);
  public int ComputeType(long id0,long id1,long id2)
  {
    return ComputeType_15(id0,id1,id2);
  }

  private native int GetType_16();
  public int GetType()
  {
    return GetType_16();
  }

  private native void SetSequentialProcessing_17(boolean id0);
  public void SetSequentialProcessing(boolean id0)
  {
    SetSequentialProcessing_17(id0);
  }

  private native boolean GetSequentialProcessing_18();
  public boolean GetSequentialProcessing()
  {
    return GetSequentialProcessing_18();
  }

  private native void SequentialProcessingOn_19();
  public void SequentialProcessingOn()
  {
    SequentialProcessingOn_19();
  }

  private native void SequentialProcessingOff_20();
  public void SequentialProcessingOff()
  {
    SequentialProcessingOff_20();
  }

  private native long GetBuildTime_21();
  public long GetBuildTime()
  {
    return GetBuildTime_21();
  }

  private native boolean UsesGarbageCollector_22();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_22();
  }

  public vtkAbstractCellLinks() { super(); }

  public vtkAbstractCellLinks(long id) { super(id); }

}
