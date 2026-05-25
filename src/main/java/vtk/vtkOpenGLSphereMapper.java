// java wrapper for vtkOpenGLSphereMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLSphereMapper extends vtkOpenGLPolyDataMapper
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

  private native void SetScaleArray_4(byte[] id0, int len0);
  public void SetScaleArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScaleArray_4(bytes0, bytes0.length);
  }

  private native void SetRadius_5(float id0);
  public void SetRadius(float id0)
  {
    SetRadius_5(id0);
  }

  private native float GetRadius_6();
  public float GetRadius()
  {
    return GetRadius_6();
  }

  private native void Render_7(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_7(id0,id1);
  }

  public vtkOpenGLSphereMapper() { super(); }

  public vtkOpenGLSphereMapper(long id) { super(id); }
  public native long   VTKInit();

}
