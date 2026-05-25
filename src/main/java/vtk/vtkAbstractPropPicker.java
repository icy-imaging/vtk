// java wrapper for vtkAbstractPropPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractPropPicker extends vtkAbstractPicker
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

  private native void SetPath_4(vtkAssemblyPath id0);
  public void SetPath(vtkAssemblyPath id0)
  {
    SetPath_4(id0);
  }

  private native long GetPath_5();
  public vtkAssemblyPath GetPath()
  {
    long temp = GetPath_5();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetViewProp_6();
  public vtkProp GetViewProp()
  {
    long temp = GetViewProp_6();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProp3D_7();
  public vtkProp3D GetProp3D()
  {
    long temp = GetProp3D_7();

    if (temp == 0) return null;
    return (vtkProp3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActor_8();
  public vtkActor GetActor()
  {
    long temp = GetActor_8();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActor2D_9();
  public vtkActor2D GetActor2D()
  {
    long temp = GetActor2D_9();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVolume_10();
  public vtkVolume GetVolume()
  {
    long temp = GetVolume_10();

    if (temp == 0) return null;
    return (vtkVolume)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAssembly_11();
  public vtkAssembly GetAssembly()
  {
    long temp = GetAssembly_11();

    if (temp == 0) return null;
    return (vtkAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropAssembly_12();
  public vtkPropAssembly GetPropAssembly()
  {
    long temp = GetPropAssembly_12();

    if (temp == 0) return null;
    return (vtkPropAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAbstractPropPicker() { super(); }

  public vtkAbstractPropPicker(long id) { super(id); }

}
