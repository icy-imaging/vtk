// java wrapper for vtkOpenGLContextDevice3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLContextDevice3D extends vtkContextDevice3D
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

  private native void ApplyPen_4(vtkPen id0);
  public void ApplyPen(vtkPen id0)
  {
    ApplyPen_4(id0);
  }

  private native void ApplyBrush_5(vtkBrush id0);
  public void ApplyBrush(vtkBrush id0)
  {
    ApplyBrush_5(id0);
  }

  private native void SetMatrix_6(vtkMatrix4x4 id0);
  public void SetMatrix(vtkMatrix4x4 id0)
  {
    SetMatrix_6(id0);
  }

  private native void GetMatrix_7(vtkMatrix4x4 id0);
  public void GetMatrix(vtkMatrix4x4 id0)
  {
    GetMatrix_7(id0);
  }

  private native void MultiplyMatrix_8(vtkMatrix4x4 id0);
  public void MultiplyMatrix(vtkMatrix4x4 id0)
  {
    MultiplyMatrix_8(id0);
  }

  private native void PushMatrix_9();
  public void PushMatrix()
  {
    PushMatrix_9();
  }

  private native void PopMatrix_10();
  public void PopMatrix()
  {
    PopMatrix_10();
  }

  private native void EnableClipping_11(boolean id0);
  public void EnableClipping(boolean id0)
  {
    EnableClipping_11(id0);
  }

  private native void DisableClippingPlane_12(int id0);
  public void DisableClippingPlane(int id0)
  {
    DisableClippingPlane_12(id0);
  }

  private native void Initialize_13(vtkRenderer id0,vtkOpenGLContextDevice2D id1);
  public void Initialize(vtkRenderer id0,vtkOpenGLContextDevice2D id1)
  {
    Initialize_13(id0,id1);
  }

  private native void Begin_14(vtkViewport id0);
  public void Begin(vtkViewport id0)
  {
    Begin_14(id0);
  }

  public vtkOpenGLContextDevice3D() { super(); }

  public vtkOpenGLContextDevice3D(long id) { super(id); }
  public native long   VTKInit();

}
