// java wrapper for vtkImplicitPlaneWidget2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitPlaneWidget2 extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkImplicitPlaneRepresentation id0);
  public void SetRepresentation(vtkImplicitPlaneRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void SetEnabled_5(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_5(id0);
  }

  private native void SetLockNormalToCamera_6(int id0);
  public void SetLockNormalToCamera(int id0)
  {
    SetLockNormalToCamera_6(id0);
  }

  private native long GetImplicitPlaneRepresentation_7();
  public vtkImplicitPlaneRepresentation GetImplicitPlaneRepresentation()
  {
    long temp = GetImplicitPlaneRepresentation_7();

    if (temp == 0) return null;
    return (vtkImplicitPlaneRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_8();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_8();
  }

  public vtkImplicitPlaneWidget2() { super(); }

  public vtkImplicitPlaneWidget2(long id) { super(id); }
  public native long   VTKInit();

}
