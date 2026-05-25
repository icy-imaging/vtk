// java wrapper for vtkWidgetCallbackMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWidgetCallbackMapper extends vtkObject
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

  private native void SetEventTranslator_4(vtkWidgetEventTranslator id0);
  public void SetEventTranslator(vtkWidgetEventTranslator id0)
  {
    SetEventTranslator_4(id0);
  }

  private native long GetEventTranslator_5();
  public vtkWidgetEventTranslator GetEventTranslator()
  {
    long temp = GetEventTranslator_5();

    if (temp == 0) return null;
    return (vtkWidgetEventTranslator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InvokeCallback_6(long id0);
  public void InvokeCallback(long id0)
  {
    InvokeCallback_6(id0);
  }

  public vtkWidgetCallbackMapper() { super(); }

  public vtkWidgetCallbackMapper(long id) { super(id); }
  public native long   VTKInit();

}
