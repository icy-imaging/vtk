// java wrapper for vtkTDxInteractorStyle object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTDxInteractorStyle extends vtkObject
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

  private native void OnButtonPressedEvent_4(int id0);
  public void OnButtonPressedEvent(int id0)
  {
    OnButtonPressedEvent_4(id0);
  }

  private native void OnButtonReleasedEvent_5(int id0);
  public void OnButtonReleasedEvent(int id0)
  {
    OnButtonReleasedEvent_5(id0);
  }

  private native long GetSettings_6();
  public vtkTDxInteractorStyleSettings GetSettings()
  {
    long temp = GetSettings_6();

    if (temp == 0) return null;
    return (vtkTDxInteractorStyleSettings)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSettings_7(vtkTDxInteractorStyleSettings id0);
  public void SetSettings(vtkTDxInteractorStyleSettings id0)
  {
    SetSettings_7(id0);
  }

  public vtkTDxInteractorStyle() { super(); }

  public vtkTDxInteractorStyle(long id) { super(id); }

}
