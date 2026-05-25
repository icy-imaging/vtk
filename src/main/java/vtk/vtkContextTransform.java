// java wrapper for vtkContextTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextTransform extends vtkAbstractContextItem
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native void Identity_6();
  public void Identity()
  {
    Identity_6();
  }

  private native void Translate_7(float id0,float id1);
  public void Translate(float id0,float id1)
  {
    Translate_7(id0,id1);
  }

  private native void Scale_8(float id0,float id1);
  public void Scale(float id0,float id1)
  {
    Scale_8(id0,id1);
  }

  private native void Rotate_9(float id0);
  public void Rotate(float id0)
  {
    Rotate_9(id0);
  }

  private native long GetTransform_10();
  public vtkTransform2D GetTransform()
  {
    long temp = GetTransform_10();

    if (temp == 0) return null;
    return (vtkTransform2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPanMouseButton_11(int id0);
  public void SetPanMouseButton(int id0)
  {
    SetPanMouseButton_11(id0);
  }

  private native int GetPanMouseButton_12();
  public int GetPanMouseButton()
  {
    return GetPanMouseButton_12();
  }

  private native void SetPanModifier_13(int id0);
  public void SetPanModifier(int id0)
  {
    SetPanModifier_13(id0);
  }

  private native int GetPanModifier_14();
  public int GetPanModifier()
  {
    return GetPanModifier_14();
  }

  private native void SetSecondaryPanMouseButton_15(int id0);
  public void SetSecondaryPanMouseButton(int id0)
  {
    SetSecondaryPanMouseButton_15(id0);
  }

  private native int GetSecondaryPanMouseButton_16();
  public int GetSecondaryPanMouseButton()
  {
    return GetSecondaryPanMouseButton_16();
  }

  private native void SetSecondaryPanModifier_17(int id0);
  public void SetSecondaryPanModifier(int id0)
  {
    SetSecondaryPanModifier_17(id0);
  }

  private native int GetSecondaryPanModifier_18();
  public int GetSecondaryPanModifier()
  {
    return GetSecondaryPanModifier_18();
  }

  private native void SetZoomMouseButton_19(int id0);
  public void SetZoomMouseButton(int id0)
  {
    SetZoomMouseButton_19(id0);
  }

  private native int GetZoomMouseButton_20();
  public int GetZoomMouseButton()
  {
    return GetZoomMouseButton_20();
  }

  private native void SetZoomModifier_21(int id0);
  public void SetZoomModifier(int id0)
  {
    SetZoomModifier_21(id0);
  }

  private native int GetZoomModifier_22();
  public int GetZoomModifier()
  {
    return GetZoomModifier_22();
  }

  private native void SetSecondaryZoomMouseButton_23(int id0);
  public void SetSecondaryZoomMouseButton(int id0)
  {
    SetSecondaryZoomMouseButton_23(id0);
  }

  private native int GetSecondaryZoomMouseButton_24();
  public int GetSecondaryZoomMouseButton()
  {
    return GetSecondaryZoomMouseButton_24();
  }

  private native void SetSecondaryZoomModifier_25(int id0);
  public void SetSecondaryZoomModifier(int id0)
  {
    SetSecondaryZoomModifier_25(id0);
  }

  private native int GetSecondaryZoomModifier_26();
  public int GetSecondaryZoomModifier()
  {
    return GetSecondaryZoomModifier_26();
  }

  private native void SetZoomOnMouseWheel_27(boolean id0);
  public void SetZoomOnMouseWheel(boolean id0)
  {
    SetZoomOnMouseWheel_27(id0);
  }

  private native boolean GetZoomOnMouseWheel_28();
  public boolean GetZoomOnMouseWheel()
  {
    return GetZoomOnMouseWheel_28();
  }

  private native void ZoomOnMouseWheelOn_29();
  public void ZoomOnMouseWheelOn()
  {
    ZoomOnMouseWheelOn_29();
  }

  private native void ZoomOnMouseWheelOff_30();
  public void ZoomOnMouseWheelOff()
  {
    ZoomOnMouseWheelOff_30();
  }

  private native void SetPanYOnMouseWheel_31(boolean id0);
  public void SetPanYOnMouseWheel(boolean id0)
  {
    SetPanYOnMouseWheel_31(id0);
  }

  private native boolean GetPanYOnMouseWheel_32();
  public boolean GetPanYOnMouseWheel()
  {
    return GetPanYOnMouseWheel_32();
  }

  private native void PanYOnMouseWheelOn_33();
  public void PanYOnMouseWheelOn()
  {
    PanYOnMouseWheelOn_33();
  }

  private native void PanYOnMouseWheelOff_34();
  public void PanYOnMouseWheelOff()
  {
    PanYOnMouseWheelOff_34();
  }

  public vtkContextTransform() { super(); }

  public vtkContextTransform(long id) { super(id); }
  public native long   VTKInit();

}
