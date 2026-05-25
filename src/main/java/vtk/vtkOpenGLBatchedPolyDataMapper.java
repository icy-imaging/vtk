// java wrapper for vtkOpenGLBatchedPolyDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLBatchedPolyDataMapper extends vtkOpenGLPolyDataMapper
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

  private native void ClearBatchElements_4();
  public void ClearBatchElements()
  {
    ClearBatchElements_4();
  }

  private native void SetParent_5(vtkCompositePolyDataMapper id0);
  public void SetParent(vtkCompositePolyDataMapper id0)
  {
    SetParent_5(id0);
  }

  private native void RenderPiece_6(vtkRenderer id0,vtkActor id1);
  public void RenderPiece(vtkRenderer id0,vtkActor id1)
  {
    RenderPiece_6(id0,id1);
  }

  private native void UnmarkBatchElements_7();
  public void UnmarkBatchElements()
  {
    UnmarkBatchElements_7();
  }

  private native void ClearUnmarkedBatchElements_8();
  public void ClearUnmarkedBatchElements()
  {
    ClearUnmarkedBatchElements_8();
  }

  private native long GetMTime_9();
  public long GetMTime()
  {
    return GetMTime_9();
  }

  public vtkOpenGLBatchedPolyDataMapper() { super(); }

  public vtkOpenGLBatchedPolyDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
