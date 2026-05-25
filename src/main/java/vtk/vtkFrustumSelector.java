// java wrapper for vtkFrustumSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFrustumSelector extends vtkSelector
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

  private native void Initialize_4(vtkSelectionNode id0);
  public void Initialize(vtkSelectionNode id0)
  {
    Initialize_4(id0);
  }

  private native long GetMTime_5();
  public long GetMTime()
  {
    return GetMTime_5();
  }

  private native void SetFrustum_6(vtkPlanes id0);
  public void SetFrustum(vtkPlanes id0)
  {
    SetFrustum_6(id0);
  }

  private native long GetFrustum_7();
  public vtkPlanes GetFrustum()
  {
    long temp = GetFrustum_7();

    if (temp == 0) return null;
    return (vtkPlanes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkFrustumSelector() { super(); }

  public vtkFrustumSelector(long id) { super(id); }
  public native long   VTKInit();

}
