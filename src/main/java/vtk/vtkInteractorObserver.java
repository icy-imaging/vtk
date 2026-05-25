// java wrapper for vtkInteractorObserver object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorObserver extends vtkObject
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

  private native void SetInteractor_4(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_4(id0);
  }

  private native long GetInteractor_5();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_5();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnabled_6(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_6(id0);
  }

  private native int GetEnabled_7();
  public int GetEnabled()
  {
    return GetEnabled_7();
  }

  private native void EnabledOn_8();
  public void EnabledOn()
  {
    EnabledOn_8();
  }

  private native void EnabledOff_9();
  public void EnabledOff()
  {
    EnabledOff_9();
  }

  private native void On_10();
  public void On()
  {
    On_10();
  }

  private native void Off_11();
  public void Off()
  {
    Off_11();
  }

  private native void SetPriority_12(float id0);
  public void SetPriority(float id0)
  {
    SetPriority_12(id0);
  }

  private native float GetPriorityMinValue_13();
  public float GetPriorityMinValue()
  {
    return GetPriorityMinValue_13();
  }

  private native float GetPriorityMaxValue_14();
  public float GetPriorityMaxValue()
  {
    return GetPriorityMaxValue_14();
  }

  private native float GetPriority_15();
  public float GetPriority()
  {
    return GetPriority_15();
  }

  private native void PickingManagedOn_16();
  public void PickingManagedOn()
  {
    PickingManagedOn_16();
  }

  private native void PickingManagedOff_17();
  public void PickingManagedOff()
  {
    PickingManagedOff_17();
  }

  private native void SetPickingManaged_18(boolean id0);
  public void SetPickingManaged(boolean id0)
  {
    SetPickingManaged_18(id0);
  }

  private native boolean GetPickingManaged_19();
  public boolean GetPickingManaged()
  {
    return GetPickingManaged_19();
  }

  private native void SetKeyPressActivation_20(int id0);
  public void SetKeyPressActivation(int id0)
  {
    SetKeyPressActivation_20(id0);
  }

  private native int GetKeyPressActivation_21();
  public int GetKeyPressActivation()
  {
    return GetKeyPressActivation_21();
  }

  private native void KeyPressActivationOn_22();
  public void KeyPressActivationOn()
  {
    KeyPressActivationOn_22();
  }

  private native void KeyPressActivationOff_23();
  public void KeyPressActivationOff()
  {
    KeyPressActivationOff_23();
  }

  private native void SetKeyPressActivationValue_24(char id0);
  public void SetKeyPressActivationValue(char id0)
  {
    SetKeyPressActivationValue_24(id0);
  }

  private native char GetKeyPressActivationValue_25();
  public char GetKeyPressActivationValue()
  {
    return GetKeyPressActivationValue_25();
  }

  private native long GetDefaultRenderer_26();
  public vtkRenderer GetDefaultRenderer()
  {
    long temp = GetDefaultRenderer_26();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDefaultRenderer_27(vtkRenderer id0);
  public void SetDefaultRenderer(vtkRenderer id0)
  {
    SetDefaultRenderer_27(id0);
  }

  private native long GetCurrentRenderer_28();
  public vtkRenderer GetCurrentRenderer()
  {
    long temp = GetCurrentRenderer_28();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCurrentRenderer_29(vtkRenderer id0);
  public void SetCurrentRenderer(vtkRenderer id0)
  {
    SetCurrentRenderer_29(id0);
  }

  private native void OnChar_30();
  public void OnChar()
  {
    OnChar_30();
  }

  private native void ComputeDisplayToWorld_31(vtkRenderer id0,double id1,double id2,double id3,double id4[]);
  public void ComputeDisplayToWorld(vtkRenderer id0,double id1,double id2,double id3,double id4[])
  {
    ComputeDisplayToWorld_31(id0,id1,id2,id3,id4);
  }

  private native void ComputeWorldToDisplay_32(vtkRenderer id0,double id1,double id2,double id3,double id4[]);
  public void ComputeWorldToDisplay(vtkRenderer id0,double id1,double id2,double id3,double id4[])
  {
    ComputeWorldToDisplay_32(id0,id1,id2,id3,id4);
  }

  private native void GrabFocus_33(vtkCommand id0,vtkCommand id1);
  public void GrabFocus(vtkCommand id0,vtkCommand id1)
  {
    GrabFocus_33(id0,id1);
  }

  private native void ReleaseFocus_34();
  public void ReleaseFocus()
  {
    ReleaseFocus_34();
  }

  public vtkInteractorObserver() { super(); }

  public vtkInteractorObserver(long id) { super(id); }

}
