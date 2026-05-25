// java wrapper for vtkHyperTreeGridVisibleLeavesSize object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridVisibleLeavesSize extends vtkHyperTreeGridAlgorithm
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

  private native byte[] GetCellSizeArrayName_4();
  public String GetCellSizeArrayName()
  {
    return new String(GetCellSizeArrayName_4(), StandardCharsets.UTF_8);
  }

  private native void SetCellSizeArrayName_5(byte[] id0, int len0);
  public void SetCellSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellSizeArrayName_5(bytes0, bytes0.length);
  }

  private native byte[] GetValidCellArrayName_6();
  public String GetValidCellArrayName()
  {
    return new String(GetValidCellArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetValidCellArrayName_7(byte[] id0, int len0);
  public void SetValidCellArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidCellArrayName_7(bytes0, bytes0.length);
  }

  public vtkHyperTreeGridVisibleLeavesSize() { super(); }

  public vtkHyperTreeGridVisibleLeavesSize(long id) { super(id); }
  public native long   VTKInit();

}
