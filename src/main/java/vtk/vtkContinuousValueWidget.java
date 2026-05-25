// java wrapper for vtkContinuousValueWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContinuousValueWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkContinuousValueWidgetRepresentation id0);
  public void SetRepresentation(vtkContinuousValueWidgetRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long GetContinuousValueWidgetRepresentation_5();
  public vtkContinuousValueWidgetRepresentation GetContinuousValueWidgetRepresentation()
  {
    long temp = GetContinuousValueWidgetRepresentation_5();

    if (temp == 0) return null;
    return (vtkContinuousValueWidgetRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetValue_6();
  public double GetValue()
  {
    return GetValue_6();
  }

  private native void SetValue_7(double id0);
  public void SetValue(double id0)
  {
    SetValue_7(id0);
  }

  public vtkContinuousValueWidget() { super(); }

  public vtkContinuousValueWidget(long id) { super(id); }

}
