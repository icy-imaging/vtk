// java wrapper for vtkHandleWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHandleWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkHandleRepresentation id0);
  public void SetRepresentation(vtkHandleRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long GetHandleRepresentation_5();
  public vtkHandleRepresentation GetHandleRepresentation()
  {
    long temp = GetHandleRepresentation_5();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_6();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_6();
  }

  private native void SetEnableAxisConstraint_7(int id0);
  public void SetEnableAxisConstraint(int id0)
  {
    SetEnableAxisConstraint_7(id0);
  }

  private native int GetEnableAxisConstraint_8();
  public int GetEnableAxisConstraint()
  {
    return GetEnableAxisConstraint_8();
  }

  private native void EnableAxisConstraintOn_9();
  public void EnableAxisConstraintOn()
  {
    EnableAxisConstraintOn_9();
  }

  private native void EnableAxisConstraintOff_10();
  public void EnableAxisConstraintOff()
  {
    EnableAxisConstraintOff_10();
  }

  private native void SetEnableTranslation_11(int id0);
  public void SetEnableTranslation(int id0)
  {
    SetEnableTranslation_11(id0);
  }

  private native int GetEnableTranslation_12();
  public int GetEnableTranslation()
  {
    return GetEnableTranslation_12();
  }

  private native void EnableTranslationOn_13();
  public void EnableTranslationOn()
  {
    EnableTranslationOn_13();
  }

  private native void EnableTranslationOff_14();
  public void EnableTranslationOff()
  {
    EnableTranslationOff_14();
  }

  private native void SetAllowHandleResize_15(int id0);
  public void SetAllowHandleResize(int id0)
  {
    SetAllowHandleResize_15(id0);
  }

  private native int GetAllowHandleResize_16();
  public int GetAllowHandleResize()
  {
    return GetAllowHandleResize_16();
  }

  private native void AllowHandleResizeOn_17();
  public void AllowHandleResizeOn()
  {
    AllowHandleResizeOn_17();
  }

  private native void AllowHandleResizeOff_18();
  public void AllowHandleResizeOff()
  {
    AllowHandleResizeOff_18();
  }

  private native int GetWidgetState_19();
  public int GetWidgetState()
  {
    return GetWidgetState_19();
  }

  private native void SetShowInactive_20(int id0);
  public void SetShowInactive(int id0)
  {
    SetShowInactive_20(id0);
  }

  private native int GetShowInactive_21();
  public int GetShowInactive()
  {
    return GetShowInactive_21();
  }

  private native void ShowInactiveOn_22();
  public void ShowInactiveOn()
  {
    ShowInactiveOn_22();
  }

  private native void ShowInactiveOff_23();
  public void ShowInactiveOff()
  {
    ShowInactiveOff_23();
  }

  private native void SetEnabled_24(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_24(id0);
  }

  public vtkHandleWidget() { super(); }

  public vtkHandleWidget(long id) { super(id); }
  public native long   VTKInit();

}
