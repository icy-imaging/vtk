// java wrapper for vtkContext3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContext3D extends vtkObject
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

  private native boolean Begin_4(vtkContextDevice3D id0);
  public boolean Begin(vtkContextDevice3D id0)
  {
    return Begin_4(id0);
  }

  private native long GetDevice_5();
  public vtkContextDevice3D GetDevice()
  {
    long temp = GetDevice_5();

    if (temp == 0) return null;
    return (vtkContextDevice3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean End_6();
  public boolean End()
  {
    return End_6();
  }

  private native void ApplyPen_7(vtkPen id0);
  public void ApplyPen(vtkPen id0)
  {
    ApplyPen_7(id0);
  }

  private native void ApplyBrush_8(vtkBrush id0);
  public void ApplyBrush(vtkBrush id0)
  {
    ApplyBrush_8(id0);
  }

  private native void SetTransform_9(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_9(id0);
  }

  private native long GetTransform_10();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_10();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AppendTransform_11(vtkTransform id0);
  public void AppendTransform(vtkTransform id0)
  {
    AppendTransform_11(id0);
  }

  private native void PushMatrix_12();
  public void PushMatrix()
  {
    PushMatrix_12();
  }

  private native void PopMatrix_13();
  public void PopMatrix()
  {
    PopMatrix_13();
  }

  private native void DisableClippingPlane_14(int id0);
  public void DisableClippingPlane(int id0)
  {
    DisableClippingPlane_14(id0);
  }

  public vtkContext3D() { super(); }

  public vtkContext3D(long id) { super(id); }
  public native long   VTKInit();

}
