// java wrapper for vtkCellLinks object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellLinks extends vtkAbstractCellLinks
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

  private native void BuildLinks_4();
  public void BuildLinks()
  {
    BuildLinks_4();
  }

  private native void Allocate_5(long id0,long id1);
  public void Allocate(long id0,long id1)
  {
    Allocate_5(id0,id1);
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native long GetNcells_7(long id0);
  public long GetNcells(long id0)
  {
    return GetNcells_7(id0);
  }

  private native long InsertNextPoint_8(int id0);
  public long InsertNextPoint(int id0)
  {
    return InsertNextPoint_8(id0);
  }

  private native void InsertNextCellReference_9(long id0,long id1);
  public void InsertNextCellReference(long id0,long id1)
  {
    InsertNextCellReference_9(id0,id1);
  }

  private native void DeletePoint_10(long id0);
  public void DeletePoint(long id0)
  {
    DeletePoint_10(id0);
  }

  private native void RemoveCellReference_11(long id0,long id1);
  public void RemoveCellReference(long id0,long id1)
  {
    RemoveCellReference_11(id0,id1);
  }

  private native void AddCellReference_12(long id0,long id1);
  public void AddCellReference(long id0,long id1)
  {
    AddCellReference_12(id0,id1);
  }

  private native void ResizeCellList_13(long id0,int id1);
  public void ResizeCellList(long id0,int id1)
  {
    ResizeCellList_13(id0,id1);
  }

  private native void Squeeze_14();
  public void Squeeze()
  {
    Squeeze_14();
  }

  private native void Reset_15();
  public void Reset()
  {
    Reset_15();
  }

  private native long GetActualMemorySize_16();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_16();
  }

  private native void DeepCopy_17(vtkAbstractCellLinks id0);
  public void DeepCopy(vtkAbstractCellLinks id0)
  {
    DeepCopy_17(id0);
  }

  private native void ShallowCopy_18(vtkAbstractCellLinks id0);
  public void ShallowCopy(vtkAbstractCellLinks id0)
  {
    ShallowCopy_18(id0);
  }

  public vtkCellLinks() { super(); }

  public vtkCellLinks(long id) { super(id); }
  public native long   VTKInit();

}
