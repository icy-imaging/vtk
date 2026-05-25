// java wrapper for vtkTemporalInterpolatedVelocityField object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalInterpolatedVelocityField extends vtkFunctionSet
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

  private native void SetMeshOverTime_4(int id0);
  public void SetMeshOverTime(int id0)
  {
    SetMeshOverTime_4(id0);
  }

  private native int GetMeshOverTimeMinValue_5();
  public int GetMeshOverTimeMinValue()
  {
    return GetMeshOverTimeMinValue_5();
  }

  private native int GetMeshOverTimeMaxValue_6();
  public int GetMeshOverTimeMaxValue()
  {
    return GetMeshOverTimeMaxValue_6();
  }

  private native void SetMeshOverTimeToDifferent_7();
  public void SetMeshOverTimeToDifferent()
  {
    SetMeshOverTimeToDifferent_7();
  }

  private native void SetMeshOverTimeToStatic_8();
  public void SetMeshOverTimeToStatic()
  {
    SetMeshOverTimeToStatic_8();
  }

  private native void SetMeshOverTimeToLinearTransformation_9();
  public void SetMeshOverTimeToLinearTransformation()
  {
    SetMeshOverTimeToLinearTransformation_9();
  }

  private native void SetMeshOverTimeToSameTopology_10();
  public void SetMeshOverTimeToSameTopology()
  {
    SetMeshOverTimeToSameTopology_10();
  }

  private native int GetMeshOverTime_11();
  public int GetMeshOverTime()
  {
    return GetMeshOverTime_11();
  }

  private native void Initialize_12(vtkCompositeDataSet id0,vtkCompositeDataSet id1);
  public void Initialize(vtkCompositeDataSet id0,vtkCompositeDataSet id1)
  {
    Initialize_12(id0,id1);
  }

  private native void CopyParameters_13(vtkTemporalInterpolatedVelocityField id0);
  public void CopyParameters(vtkTemporalInterpolatedVelocityField id0)
  {
    CopyParameters_13(id0);
  }

  private native void SelectVectors_14(byte[] id0, int len0);
  public void SelectVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectVectors_14(bytes0, bytes0.length);
  }

  private native void AddDataSetAtTime_15(int id0,double id1,vtkDataSet id2);
  public void AddDataSetAtTime(int id0,double id1,vtkDataSet id2)
  {
    AddDataSetAtTime_15(id0,id1,id2);
  }

  private native boolean GetCachedCellIds_16(long id0[],int id1[]);
  public boolean GetCachedCellIds(long id0[],int id1[])
  {
    return GetCachedCellIds_16(id0,id1);
  }

  private native void SetCachedCellIds_17(long id0[],int id1[]);
  public void SetCachedCellIds(long id0[],int id1[])
  {
    SetCachedCellIds_17(id0,id1);
  }

  private native void ClearCache_18();
  public void ClearCache()
  {
    ClearCache_18();
  }

  private native double[] GetLastGoodVelocity_19();
  public double[] GetLastGoodVelocity()
  {
    return GetLastGoodVelocity_19();
  }

  private native double GetCurrentWeight_20();
  public double GetCurrentWeight()
  {
    return GetCurrentWeight_20();
  }

  private native boolean InterpolatePoint_21(vtkPointData id0,vtkPointData id1,long id2);
  public boolean InterpolatePoint(vtkPointData id0,vtkPointData id1,long id2)
  {
    return InterpolatePoint_21(id0,id1,id2);
  }

  private native boolean InterpolatePoint_22(int id0,vtkPointData id1,long id2);
  public boolean InterpolatePoint(int id0,vtkPointData id1,long id2)
  {
    return InterpolatePoint_22(id0,id1,id2);
  }

  private native void ShowCacheResults_23();
  public void ShowCacheResults()
  {
    ShowCacheResults_23();
  }

  private native void AdvanceOneTimeStep_24();
  public void AdvanceOneTimeStep()
  {
    AdvanceOneTimeStep_24();
  }

  private native void SetFindCellStrategy_25(vtkFindCellStrategy id0);
  public void SetFindCellStrategy(vtkFindCellStrategy id0)
  {
    SetFindCellStrategy_25(id0);
  }

  private native long GetFindCellStrategy_26();
  public vtkFindCellStrategy GetFindCellStrategy()
  {
    long temp = GetFindCellStrategy_26();

    if (temp == 0) return null;
    return (vtkFindCellStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTemporalInterpolatedVelocityField() { super(); }

  public vtkTemporalInterpolatedVelocityField(long id) { super(id); }
  public native long   VTKInit();

}
