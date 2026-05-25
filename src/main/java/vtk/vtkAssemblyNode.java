// java wrapper for vtkAssemblyNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAssemblyNode extends vtkObject
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

  private native void SetViewProp_4(vtkProp id0);
  public void SetViewProp(vtkProp id0)
  {
    SetViewProp_4(id0);
  }

  private native long GetViewProp_5();
  public vtkProp GetViewProp()
  {
    long temp = GetViewProp_5();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMatrix_6(vtkMatrix4x4 id0);
  public void SetMatrix(vtkMatrix4x4 id0)
  {
    SetMatrix_6(id0);
  }

  private native long GetMatrix_7();
  public vtkMatrix4x4 GetMatrix()
  {
    long temp = GetMatrix_7();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_8();
  public long GetMTime()
  {
    return GetMTime_8();
  }

  public vtkAssemblyNode() { super(); }

  public vtkAssemblyNode(long id) { super(id); }
  public native long   VTKInit();

}
