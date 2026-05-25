// java wrapper for vtkStaticCellLinks object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStaticCellLinks extends vtkAbstractCellLinks
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

  private native long GetNumberOfCells_5(long id0);
  public long GetNumberOfCells(long id0)
  {
    return GetNumberOfCells_5(id0);
  }

  private native long GetNcells_6(long id0);
  public long GetNcells(long id0)
  {
    return GetNcells_6(id0);
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native void Squeeze_8();
  public void Squeeze()
  {
    Squeeze_8();
  }

  private native void Reset_9();
  public void Reset()
  {
    Reset_9();
  }

  private native long GetActualMemorySize_10();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_10();
  }

  private native void DeepCopy_11(vtkAbstractCellLinks id0);
  public void DeepCopy(vtkAbstractCellLinks id0)
  {
    DeepCopy_11(id0);
  }

  private native void ShallowCopy_12(vtkAbstractCellLinks id0);
  public void ShallowCopy(vtkAbstractCellLinks id0)
  {
    ShallowCopy_12(id0);
  }

  public vtkStaticCellLinks() { super(); }

  public vtkStaticCellLinks(long id) { super(id); }
  public native long   VTKInit();

}
