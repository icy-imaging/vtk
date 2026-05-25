// java wrapper for vtkAbstractCellArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractCellArray extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native long GetNumberOfCells_5();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_5();
  }

  private native long GetNumberOfOffsets_6();
  public long GetNumberOfOffsets()
  {
    return GetNumberOfOffsets_6();
  }

  private native long GetOffset_7(long id0);
  public long GetOffset(long id0)
  {
    return GetOffset_7(id0);
  }

  private native long GetNumberOfConnectivityIds_8();
  public long GetNumberOfConnectivityIds()
  {
    return GetNumberOfConnectivityIds_8();
  }

  private native boolean IsStorageShareable_9();
  public boolean IsStorageShareable()
  {
    return IsStorageShareable_9();
  }

  private native long IsHomogeneous_10();
  public long IsHomogeneous()
  {
    return IsHomogeneous_10();
  }

  private native void GetCellAtId_11(long id0,vtkIdList id1);
  public void GetCellAtId(long id0,vtkIdList id1)
  {
    GetCellAtId_11(id0,id1);
  }

  private native long GetCellSize_12(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_12(id0);
  }

  private native int GetMaxCellSize_13();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_13();
  }

  private native void DeepCopy_14(vtkAbstractCellArray id0);
  public void DeepCopy(vtkAbstractCellArray id0)
  {
    DeepCopy_14(id0);
  }

  private native void ShallowCopy_15(vtkAbstractCellArray id0);
  public void ShallowCopy(vtkAbstractCellArray id0)
  {
    ShallowCopy_15(id0);
  }

  public vtkAbstractCellArray() { super(); }

  public vtkAbstractCellArray(long id) { super(id); }

}
