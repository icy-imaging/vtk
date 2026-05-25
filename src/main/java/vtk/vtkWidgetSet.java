// java wrapper for vtkWidgetSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWidgetSet extends vtkObject
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void EnabledOn_5();
  public void EnabledOn()
  {
    EnabledOn_5();
  }

  private native void EnabledOff_6();
  public void EnabledOff()
  {
    EnabledOff_6();
  }

  private native void AddWidget_7(vtkAbstractWidget id0);
  public void AddWidget(vtkAbstractWidget id0)
  {
    AddWidget_7(id0);
  }

  private native void RemoveWidget_8(vtkAbstractWidget id0);
  public void RemoveWidget(vtkAbstractWidget id0)
  {
    RemoveWidget_8(id0);
  }

  private native int GetNumberOfWidgets_9();
  public int GetNumberOfWidgets()
  {
    return GetNumberOfWidgets_9();
  }

  private native long GetNthWidget_10(int id0);
  public vtkAbstractWidget GetNthWidget(int id0)
  {
    long temp = GetNthWidget_10(id0);

    if (temp == 0) return null;
    return (vtkAbstractWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkWidgetSet() { super(); }

  public vtkWidgetSet(long id) { super(id); }
  public native long   VTKInit();

}
