// java wrapper for vtkOpenGLProjectedTetrahedraMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLProjectedTetrahedraMapper extends vtkProjectedTetrahedraMapper
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native void Render_5(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_5(id0,id1);
  }

  private native void SetUseFloatingPointFrameBuffer_6(boolean id0);
  public void SetUseFloatingPointFrameBuffer(boolean id0)
  {
    SetUseFloatingPointFrameBuffer_6(id0);
  }

  private native boolean GetUseFloatingPointFrameBuffer_7();
  public boolean GetUseFloatingPointFrameBuffer()
  {
    return GetUseFloatingPointFrameBuffer_7();
  }

  private native void UseFloatingPointFrameBufferOn_8();
  public void UseFloatingPointFrameBufferOn()
  {
    UseFloatingPointFrameBufferOn_8();
  }

  private native void UseFloatingPointFrameBufferOff_9();
  public void UseFloatingPointFrameBufferOff()
  {
    UseFloatingPointFrameBufferOff_9();
  }

  private native boolean IsSupported_10(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_10(id0);
  }

  public vtkOpenGLProjectedTetrahedraMapper() { super(); }

  public vtkOpenGLProjectedTetrahedraMapper(long id) { super(id); }
  public native long   VTKInit();

}
