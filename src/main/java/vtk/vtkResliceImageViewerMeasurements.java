// java wrapper for vtkResliceImageViewerMeasurements object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceImageViewerMeasurements extends vtkObject
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

  private native void Render_4();
  public void Render()
  {
    Render_4();
  }

  private native void AddItem_5(vtkAbstractWidget id0);
  public void AddItem(vtkAbstractWidget id0)
  {
    AddItem_5(id0);
  }

  private native void RemoveItem_6(vtkAbstractWidget id0);
  public void RemoveItem(vtkAbstractWidget id0)
  {
    RemoveItem_6(id0);
  }

  private native void RemoveAllItems_7();
  public void RemoveAllItems()
  {
    RemoveAllItems_7();
  }

  private native void SetProcessEvents_8(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_8(id0);
  }

  private native int GetProcessEventsMinValue_9();
  public int GetProcessEventsMinValue()
  {
    return GetProcessEventsMinValue_9();
  }

  private native int GetProcessEventsMaxValue_10();
  public int GetProcessEventsMaxValue()
  {
    return GetProcessEventsMaxValue_10();
  }

  private native int GetProcessEvents_11();
  public int GetProcessEvents()
  {
    return GetProcessEvents_11();
  }

  private native void ProcessEventsOn_12();
  public void ProcessEventsOn()
  {
    ProcessEventsOn_12();
  }

  private native void ProcessEventsOff_13();
  public void ProcessEventsOff()
  {
    ProcessEventsOff_13();
  }

  private native void SetTolerance_14(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_14(id0);
  }

  private native double GetTolerance_15();
  public double GetTolerance()
  {
    return GetTolerance_15();
  }

  private native void SetResliceImageViewer_16(vtkResliceImageViewer id0);
  public void SetResliceImageViewer(vtkResliceImageViewer id0)
  {
    SetResliceImageViewer_16(id0);
  }

  private native long GetResliceImageViewer_17();
  public vtkResliceImageViewer GetResliceImageViewer()
  {
    long temp = GetResliceImageViewer_17();

    if (temp == 0) return null;
    return (vtkResliceImageViewer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_18();
  public void Update()
  {
    Update_18();
  }

  public vtkResliceImageViewerMeasurements() { super(); }

  public vtkResliceImageViewerMeasurements(long id) { super(id); }
  public native long   VTKInit();

}
