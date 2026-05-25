// java wrapper for vtkExplicitStructuredGridSurfaceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExplicitStructuredGridSurfaceFilter extends vtkPolyDataAlgorithm
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

  private native void SetPassThroughCellIds_4(int id0);
  public void SetPassThroughCellIds(int id0)
  {
    SetPassThroughCellIds_4(id0);
  }

  private native int GetPassThroughCellIds_5();
  public int GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_5();
  }

  private native void PassThroughCellIdsOn_6();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_6();
  }

  private native void PassThroughCellIdsOff_7();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_7();
  }

  private native void SetPassThroughPointIds_8(int id0);
  public void SetPassThroughPointIds(int id0)
  {
    SetPassThroughPointIds_8(id0);
  }

  private native int GetPassThroughPointIds_9();
  public int GetPassThroughPointIds()
  {
    return GetPassThroughPointIds_9();
  }

  private native void PassThroughPointIdsOn_10();
  public void PassThroughPointIdsOn()
  {
    PassThroughPointIdsOn_10();
  }

  private native void PassThroughPointIdsOff_11();
  public void PassThroughPointIdsOff()
  {
    PassThroughPointIdsOff_11();
  }

  private native void SetOriginalCellIdsName_12(byte[] id0, int len0);
  public void SetOriginalCellIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalCellIdsName_12(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalCellIdsName_13();
  public String GetOriginalCellIdsName()
  {
    return new String(GetOriginalCellIdsName_13(), StandardCharsets.UTF_8);
  }

  private native void SetOriginalPointIdsName_14(byte[] id0, int len0);
  public void SetOriginalPointIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalPointIdsName_14(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalPointIdsName_15();
  public String GetOriginalPointIdsName()
  {
    return new String(GetOriginalPointIdsName_15(), StandardCharsets.UTF_8);
  }

  public vtkExplicitStructuredGridSurfaceFilter() { super(); }

  public vtkExplicitStructuredGridSurfaceFilter(long id) { super(id); }
  public native long   VTKInit();

}
