// java wrapper for vtkStructuredCellArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredCellArray extends vtkAbstractCellArray
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

  private native void SetData_9(int id0[],boolean id1);
  public void SetData(int id0[],boolean id1)
  {
    SetData_9(id0,id1);
  }

  private native boolean IsStorageShareable_10();
  public boolean IsStorageShareable()
  {
    return IsStorageShareable_10();
  }

  private native long IsHomogeneous_11();
  public long IsHomogeneous()
  {
    return IsHomogeneous_11();
  }

  private native void GetCellAtId_12(long id0,vtkIdList id1);
  public void GetCellAtId(long id0,vtkIdList id1)
  {
    GetCellAtId_12(id0,id1);
  }

  private native void GetCellAtId_13(int id0[],vtkIdList id1);
  public void GetCellAtId(int id0[],vtkIdList id1)
  {
    GetCellAtId_13(id0,id1);
  }

  private native long GetCellSize_14(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_14(id0);
  }

  private native int GetMaxCellSize_15();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_15();
  }

  private native void DeepCopy_16(vtkAbstractCellArray id0);
  public void DeepCopy(vtkAbstractCellArray id0)
  {
    DeepCopy_16(id0);
  }

  private native void ShallowCopy_17(vtkAbstractCellArray id0);
  public void ShallowCopy(vtkAbstractCellArray id0)
  {
    ShallowCopy_17(id0);
  }

  public vtkStructuredCellArray() { super(); }

  public vtkStructuredCellArray(long id) { super(id); }
  public native long   VTKInit();

}
