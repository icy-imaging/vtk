// java wrapper for vtkInteractorStyleImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleImage extends vtkInteractorStyleTrackballCamera
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

  private native int[] GetWindowLevelStartPosition_4();
  public int[] GetWindowLevelStartPosition()
  {
    return GetWindowLevelStartPosition_4();
  }

  private native int[] GetWindowLevelCurrentPosition_5();
  public int[] GetWindowLevelCurrentPosition()
  {
    return GetWindowLevelCurrentPosition_5();
  }

  private native void OnMouseMove_6();
  public void OnMouseMove()
  {
    OnMouseMove_6();
  }

  private native void OnLeftButtonDown_7();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_7();
  }

  private native void OnLeftButtonUp_8();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_8();
  }

  private native void OnMiddleButtonDown_9();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_9();
  }

  private native void OnMiddleButtonUp_10();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_10();
  }

  private native void OnRightButtonDown_11();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_11();
  }

  private native void OnRightButtonUp_12();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_12();
  }

  private native void OnChar_13();
  public void OnChar()
  {
    OnChar_13();
  }

  private native void WindowLevel_14();
  public void WindowLevel()
  {
    WindowLevel_14();
  }

  private native void Pick_15();
  public void Pick()
  {
    Pick_15();
  }

  private native void Slice_16();
  public void Slice()
  {
    Slice_16();
  }

  private native void StartWindowLevel_17();
  public void StartWindowLevel()
  {
    StartWindowLevel_17();
  }

  private native void EndWindowLevel_18();
  public void EndWindowLevel()
  {
    EndWindowLevel_18();
  }

  private native void StartPick_19();
  public void StartPick()
  {
    StartPick_19();
  }

  private native void EndPick_20();
  public void EndPick()
  {
    EndPick_20();
  }

  private native void StartSlice_21();
  public void StartSlice()
  {
    StartSlice_21();
  }

  private native void EndSlice_22();
  public void EndSlice()
  {
    EndSlice_22();
  }

  private native void SetInteractionMode_23(int id0);
  public void SetInteractionMode(int id0)
  {
    SetInteractionMode_23(id0);
  }

  private native int GetInteractionModeMinValue_24();
  public int GetInteractionModeMinValue()
  {
    return GetInteractionModeMinValue_24();
  }

  private native int GetInteractionModeMaxValue_25();
  public int GetInteractionModeMaxValue()
  {
    return GetInteractionModeMaxValue_25();
  }

  private native int GetInteractionMode_26();
  public int GetInteractionMode()
  {
    return GetInteractionMode_26();
  }

  private native void SetInteractionModeToImage2D_27();
  public void SetInteractionModeToImage2D()
  {
    SetInteractionModeToImage2D_27();
  }

  private native void SetInteractionModeToImage3D_28();
  public void SetInteractionModeToImage3D()
  {
    SetInteractionModeToImage3D_28();
  }

  private native void SetInteractionModeToImageSlicing_29();
  public void SetInteractionModeToImageSlicing()
  {
    SetInteractionModeToImageSlicing_29();
  }

  private native void SetXViewRightVector_30(double id0,double id1,double id2);
  public void SetXViewRightVector(double id0,double id1,double id2)
  {
    SetXViewRightVector_30(id0,id1,id2);
  }

  private native void SetXViewRightVector_31(double id0[]);
  public void SetXViewRightVector(double id0[])
  {
    SetXViewRightVector_31(id0);
  }

  private native double[] GetXViewRightVector_32();
  public double[] GetXViewRightVector()
  {
    return GetXViewRightVector_32();
  }

  private native void SetXViewUpVector_33(double id0,double id1,double id2);
  public void SetXViewUpVector(double id0,double id1,double id2)
  {
    SetXViewUpVector_33(id0,id1,id2);
  }

  private native void SetXViewUpVector_34(double id0[]);
  public void SetXViewUpVector(double id0[])
  {
    SetXViewUpVector_34(id0);
  }

  private native double[] GetXViewUpVector_35();
  public double[] GetXViewUpVector()
  {
    return GetXViewUpVector_35();
  }

  private native void SetYViewRightVector_36(double id0,double id1,double id2);
  public void SetYViewRightVector(double id0,double id1,double id2)
  {
    SetYViewRightVector_36(id0,id1,id2);
  }

  private native void SetYViewRightVector_37(double id0[]);
  public void SetYViewRightVector(double id0[])
  {
    SetYViewRightVector_37(id0);
  }

  private native double[] GetYViewRightVector_38();
  public double[] GetYViewRightVector()
  {
    return GetYViewRightVector_38();
  }

  private native void SetYViewUpVector_39(double id0,double id1,double id2);
  public void SetYViewUpVector(double id0,double id1,double id2)
  {
    SetYViewUpVector_39(id0,id1,id2);
  }

  private native void SetYViewUpVector_40(double id0[]);
  public void SetYViewUpVector(double id0[])
  {
    SetYViewUpVector_40(id0);
  }

  private native double[] GetYViewUpVector_41();
  public double[] GetYViewUpVector()
  {
    return GetYViewUpVector_41();
  }

  private native void SetZViewRightVector_42(double id0,double id1,double id2);
  public void SetZViewRightVector(double id0,double id1,double id2)
  {
    SetZViewRightVector_42(id0,id1,id2);
  }

  private native void SetZViewRightVector_43(double id0[]);
  public void SetZViewRightVector(double id0[])
  {
    SetZViewRightVector_43(id0);
  }

  private native double[] GetZViewRightVector_44();
  public double[] GetZViewRightVector()
  {
    return GetZViewRightVector_44();
  }

  private native void SetZViewUpVector_45(double id0,double id1,double id2);
  public void SetZViewUpVector(double id0,double id1,double id2)
  {
    SetZViewUpVector_45(id0,id1,id2);
  }

  private native void SetZViewUpVector_46(double id0[]);
  public void SetZViewUpVector(double id0[])
  {
    SetZViewUpVector_46(id0);
  }

  private native double[] GetZViewUpVector_47();
  public double[] GetZViewUpVector()
  {
    return GetZViewUpVector_47();
  }

  private native void SetImageOrientation_48(double id0[],double id1[]);
  public void SetImageOrientation(double id0[],double id1[])
  {
    SetImageOrientation_48(id0,id1);
  }

  private native void SetCurrentImageNumber_49(int id0);
  public void SetCurrentImageNumber(int id0)
  {
    SetCurrentImageNumber_49(id0);
  }

  private native int GetCurrentImageNumber_50();
  public int GetCurrentImageNumber()
  {
    return GetCurrentImageNumber_50();
  }

  private native long GetCurrentImageProperty_51();
  public vtkImageProperty GetCurrentImageProperty()
  {
    long temp = GetCurrentImageProperty_51();

    if (temp == 0) return null;
    return (vtkImageProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkInteractorStyleImage() { super(); }

  public vtkInteractorStyleImage(long id) { super(id); }
  public native long   VTKInit();

}
