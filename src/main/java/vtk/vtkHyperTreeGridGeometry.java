// java wrapper for vtkHyperTreeGridGeometry object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridGeometry extends vtkHyperTreeGridAlgorithm
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

  private native void SetMerging_4(boolean id0);
  public void SetMerging(boolean id0)
  {
    SetMerging_4(id0);
  }

  private native boolean GetMerging_5();
  public boolean GetMerging()
  {
    return GetMerging_5();
  }

  private native void SetPassThroughCellIds_6(boolean id0);
  public void SetPassThroughCellIds(boolean id0)
  {
    SetPassThroughCellIds_6(id0);
  }

  private native boolean GetPassThroughCellIds_7();
  public boolean GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_7();
  }

  private native void PassThroughCellIdsOn_8();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_8();
  }

  private native void PassThroughCellIdsOff_9();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_9();
  }

  private native void SetOriginalCellIdArrayName_10(byte[] id0, int len0);
  public void SetOriginalCellIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalCellIdArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalCellIdArrayName_11();
  public String GetOriginalCellIdArrayName()
  {
    return new String(GetOriginalCellIdArrayName_11(), StandardCharsets.UTF_8);
  }

  public vtkHyperTreeGridGeometry() { super(); }

  public vtkHyperTreeGridGeometry(long id) { super(id); }
  public native long   VTKInit();

}
