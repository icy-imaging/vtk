// java wrapper for vtkBorderWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBorderWidget extends vtkAbstractWidget
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

  private native void SetSelectable_4(int id0);
  public void SetSelectable(int id0)
  {
    SetSelectable_4(id0);
  }

  private native int GetSelectable_5();
  public int GetSelectable()
  {
    return GetSelectable_5();
  }

  private native void SelectableOn_6();
  public void SelectableOn()
  {
    SelectableOn_6();
  }

  private native void SelectableOff_7();
  public void SelectableOff()
  {
    SelectableOff_7();
  }

  private native void SetResizable_8(int id0);
  public void SetResizable(int id0)
  {
    SetResizable_8(id0);
  }

  private native int GetResizable_9();
  public int GetResizable()
  {
    return GetResizable_9();
  }

  private native void ResizableOn_10();
  public void ResizableOn()
  {
    ResizableOn_10();
  }

  private native void ResizableOff_11();
  public void ResizableOff()
  {
    ResizableOff_11();
  }

  private native void SetRepresentation_12(vtkBorderRepresentation id0);
  public void SetRepresentation(vtkBorderRepresentation id0)
  {
    SetRepresentation_12(id0);
  }

  private native long GetBorderRepresentation_13();
  public vtkBorderRepresentation GetBorderRepresentation()
  {
    long temp = GetBorderRepresentation_13();

    if (temp == 0) return null;
    return (vtkBorderRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_14();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_14();
  }

  private native int GetProcessEvents_15();
  public int GetProcessEvents()
  {
    return GetProcessEvents_15();
  }

  public vtkBorderWidget() { super(); }

  public vtkBorderWidget(long id) { super(id); }
  public native long   VTKInit();

}
