// java wrapper for vtkAbstractWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractWidget extends vtkInteractorObserver
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

  private native void SetProcessEvents_5(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_5(id0);
  }

  private native int GetProcessEventsMinValue_6();
  public int GetProcessEventsMinValue()
  {
    return GetProcessEventsMinValue_6();
  }

  private native int GetProcessEventsMaxValue_7();
  public int GetProcessEventsMaxValue()
  {
    return GetProcessEventsMaxValue_7();
  }

  private native int GetProcessEvents_8();
  public int GetProcessEvents()
  {
    return GetProcessEvents_8();
  }

  private native void ProcessEventsOn_9();
  public void ProcessEventsOn()
  {
    ProcessEventsOn_9();
  }

  private native void ProcessEventsOff_10();
  public void ProcessEventsOff()
  {
    ProcessEventsOff_10();
  }

  private native long GetEventTranslator_11();
  public vtkWidgetEventTranslator GetEventTranslator()
  {
    long temp = GetEventTranslator_11();

    if (temp == 0) return null;
    return (vtkWidgetEventTranslator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_12();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_12();
  }

  private native void Render_13();
  public void Render()
  {
    Render_13();
  }

  private native void SetParent_14(vtkAbstractWidget id0);
  public void SetParent(vtkAbstractWidget id0)
  {
    SetParent_14(id0);
  }

  private native long GetParent_15();
  public vtkAbstractWidget GetParent()
  {
    long temp = GetParent_15();

    if (temp == 0) return null;
    return (vtkAbstractWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRepresentation_16();
  public vtkWidgetRepresentation GetRepresentation()
  {
    long temp = GetRepresentation_16();

    if (temp == 0) return null;
    return (vtkWidgetRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetManagesCursor_17(int id0);
  public void SetManagesCursor(int id0)
  {
    SetManagesCursor_17(id0);
  }

  private native int GetManagesCursor_18();
  public int GetManagesCursor()
  {
    return GetManagesCursor_18();
  }

  private native void ManagesCursorOn_19();
  public void ManagesCursorOn()
  {
    ManagesCursorOn_19();
  }

  private native void ManagesCursorOff_20();
  public void ManagesCursorOff()
  {
    ManagesCursorOff_20();
  }

  private native void SetPriority_21(float id0);
  public void SetPriority(float id0)
  {
    SetPriority_21(id0);
  }

  public vtkAbstractWidget() { super(); }

  public vtkAbstractWidget(long id) { super(id); }

}
