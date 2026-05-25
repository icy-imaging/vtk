// java wrapper for vtkCompositePolyDataMapperDelegator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositePolyDataMapperDelegator extends vtkObject
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

  private native void ShallowCopy_4(vtkCompositePolyDataMapper id0);
  public void ShallowCopy(vtkCompositePolyDataMapper id0)
  {
    ShallowCopy_4(id0);
  }

  private native boolean GetMarked_5();
  public boolean GetMarked()
  {
    return GetMarked_5();
  }

  private native void Mark_6();
  public void Mark()
  {
    Mark_6();
  }

  private native void Unmark_7();
  public void Unmark()
  {
    Unmark_7();
  }

  private native void ClearUnmarkedBatchElements_8();
  public void ClearUnmarkedBatchElements()
  {
    ClearUnmarkedBatchElements_8();
  }

  private native void UnmarkBatchElements_9();
  public void UnmarkBatchElements()
  {
    UnmarkBatchElements_9();
  }

  private native void SetParent_10(vtkCompositePolyDataMapper id0);
  public void SetParent(vtkCompositePolyDataMapper id0)
  {
    SetParent_10(id0);
  }

  private native void Clear_11();
  public void Clear()
  {
    Clear_11();
  }

  public vtkCompositePolyDataMapperDelegator() { super(); }

  public vtkCompositePolyDataMapperDelegator(long id) { super(id); }
  public native long   VTKInit();

}
