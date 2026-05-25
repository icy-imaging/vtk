// java wrapper for vtkAbstractInterpolatedVelocityField object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractInterpolatedVelocityField extends vtkFunctionSet
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

  private native void Initialize_4(vtkCompositeDataSet id0,int id1);
  public void Initialize(vtkCompositeDataSet id0,int id1)
  {
    Initialize_4(id0,id1);
  }

  private native int GetInitializationState_5();
  public int GetInitializationState()
  {
    return GetInitializationState_5();
  }

  private native void SetCaching_6(boolean id0);
  public void SetCaching(boolean id0)
  {
    SetCaching_6(id0);
  }

  private native boolean GetCaching_7();
  public boolean GetCaching()
  {
    return GetCaching_7();
  }

  private native int GetCacheHit_8();
  public int GetCacheHit()
  {
    return GetCacheHit_8();
  }

  private native int GetCacheMiss_9();
  public int GetCacheMiss()
  {
    return GetCacheMiss_9();
  }

  private native long GetLastDataSet_10();
  public vtkDataSet GetLastDataSet()
  {
    long temp = GetLastDataSet_10();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastCellId_11();
  public long GetLastCellId()
  {
    return GetLastCellId_11();
  }

  private native void SetLastCellId_12(long id0);
  public void SetLastCellId(long id0)
  {
    SetLastCellId_12(id0);
  }

  private native void SetLastCellId_13(long id0,int id1);
  public void SetLastCellId(long id0,int id1)
  {
    SetLastCellId_13(id0,id1);
  }

  private native byte[] GetVectorsSelection_14();
  public String GetVectorsSelection()
  {
    return new String(GetVectorsSelection_14(), StandardCharsets.UTF_8);
  }

  private native int GetVectorsType_15();
  public int GetVectorsType()
  {
    return GetVectorsType_15();
  }

  private native void SelectVectors_16(int id0,byte[] id1, int len1);
  public void SelectVectors(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SelectVectors_16(id0,bytes1, bytes1.length);
  }

  private native void SetNormalizeVector_17(boolean id0);
  public void SetNormalizeVector(boolean id0)
  {
    SetNormalizeVector_17(id0);
  }

  private native boolean GetNormalizeVector_18();
  public boolean GetNormalizeVector()
  {
    return GetNormalizeVector_18();
  }

  private native void SetForceSurfaceTangentVector_19(boolean id0);
  public void SetForceSurfaceTangentVector(boolean id0)
  {
    SetForceSurfaceTangentVector_19(id0);
  }

  private native boolean GetForceSurfaceTangentVector_20();
  public boolean GetForceSurfaceTangentVector()
  {
    return GetForceSurfaceTangentVector_20();
  }

  private native void SetSurfaceDataset_21(boolean id0);
  public void SetSurfaceDataset(boolean id0)
  {
    SetSurfaceDataset_21(id0);
  }

  private native boolean GetSurfaceDataset_22();
  public boolean GetSurfaceDataset()
  {
    return GetSurfaceDataset_22();
  }

  private native void CopyParameters_23(vtkAbstractInterpolatedVelocityField id0);
  public void CopyParameters(vtkAbstractInterpolatedVelocityField id0)
  {
    CopyParameters_23(id0);
  }

  private native void ClearLastCellId_24();
  public void ClearLastCellId()
  {
    ClearLastCellId_24();
  }

  private native int GetLastLocalCoordinates_25(double id0[]);
  public int GetLastLocalCoordinates(double id0[])
  {
    return GetLastLocalCoordinates_25(id0);
  }

  private native void SetFindCellStrategy_26(vtkFindCellStrategy id0);
  public void SetFindCellStrategy(vtkFindCellStrategy id0)
  {
    SetFindCellStrategy_26(id0);
  }

  private native long GetFindCellStrategy_27();
  public vtkFindCellStrategy GetFindCellStrategy()
  {
    long temp = GetFindCellStrategy_27();

    if (temp == 0) return null;
    return (vtkFindCellStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAbstractInterpolatedVelocityField() { super(); }

  public vtkAbstractInterpolatedVelocityField(long id) { super(id); }

}
