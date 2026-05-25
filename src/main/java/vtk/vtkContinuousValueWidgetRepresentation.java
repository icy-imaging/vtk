// java wrapper for vtkContinuousValueWidgetRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContinuousValueWidgetRepresentation extends vtkWidgetRepresentation
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

  private native void PlaceWidget_4(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_4(id0);
  }

  private native void BuildRepresentation_5();
  public void BuildRepresentation()
  {
    BuildRepresentation_5();
  }

  private native void StartWidgetInteraction_6(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_6(id0);
  }

  private native void WidgetInteraction_7(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_7(id0);
  }

  private native void SetValue_8(double id0);
  public void SetValue(double id0)
  {
    SetValue_8(id0);
  }

  private native double GetValue_9();
  public double GetValue()
  {
    return GetValue_9();
  }

  public vtkContinuousValueWidgetRepresentation() { super(); }

  public vtkContinuousValueWidgetRepresentation(long id) { super(id); }

}
