// java wrapper for vtkImageCroppingRegionsWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageCroppingRegionsWidget extends vtk3DWidget
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

  private native void SetEnabled_5(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_5(id0);
  }

  private native double[] GetPlanePositions_6();
  public double[] GetPlanePositions()
  {
    return GetPlanePositions_6();
  }

  private native void SetPlanePositions_7(double id0[]);
  public void SetPlanePositions(double id0[])
  {
    SetPlanePositions_7(id0);
  }

  private native void SetPlanePositions_8(float id0[]);
  public void SetPlanePositions(float id0[])
  {
    SetPlanePositions_8(id0);
  }

  private native void SetPlanePositions_9(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetPlanePositions(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetPlanePositions_9(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCroppingRegionFlags_10(int id0);
  public void SetCroppingRegionFlags(int id0)
  {
    SetCroppingRegionFlags_10(id0);
  }

  private native int GetCroppingRegionFlags_11();
  public int GetCroppingRegionFlags()
  {
    return GetCroppingRegionFlags_11();
  }

  private native int GetSliceOrientation_12();
  public int GetSliceOrientation()
  {
    return GetSliceOrientation_12();
  }

  private native void SetSliceOrientation_13(int id0);
  public void SetSliceOrientation(int id0)
  {
    SetSliceOrientation_13(id0);
  }

  private native void SetSliceOrientationToXY_14();
  public void SetSliceOrientationToXY()
  {
    SetSliceOrientationToXY_14();
  }

  private native void SetSliceOrientationToYZ_15();
  public void SetSliceOrientationToYZ()
  {
    SetSliceOrientationToYZ_15();
  }

  private native void SetSliceOrientationToXZ_16();
  public void SetSliceOrientationToXZ()
  {
    SetSliceOrientationToXZ_16();
  }

  private native void SetSlice_17(int id0);
  public void SetSlice(int id0)
  {
    SetSlice_17(id0);
  }

  private native int GetSlice_18();
  public int GetSlice()
  {
    return GetSlice_18();
  }

  private native void SetLine1Color_19(double id0,double id1,double id2);
  public void SetLine1Color(double id0,double id1,double id2)
  {
    SetLine1Color_19(id0,id1,id2);
  }

  private native void SetLine1Color_20(double id0[]);
  public void SetLine1Color(double id0[])
  {
    SetLine1Color_20(id0);
  }

  private native void GetLine1Color_21(double id0[]);
  public void GetLine1Color(double id0[])
  {
    GetLine1Color_21(id0);
  }

  private native void SetLine2Color_22(double id0,double id1,double id2);
  public void SetLine2Color(double id0,double id1,double id2)
  {
    SetLine2Color_22(id0,id1,id2);
  }

  private native void SetLine2Color_23(double id0[]);
  public void SetLine2Color(double id0[])
  {
    SetLine2Color_23(id0);
  }

  private native void GetLine2Color_24(double id0[]);
  public void GetLine2Color(double id0[])
  {
    GetLine2Color_24(id0);
  }

  private native void SetLine3Color_25(double id0,double id1,double id2);
  public void SetLine3Color(double id0,double id1,double id2)
  {
    SetLine3Color_25(id0,id1,id2);
  }

  private native void SetLine3Color_26(double id0[]);
  public void SetLine3Color(double id0[])
  {
    SetLine3Color_26(id0);
  }

  private native void GetLine3Color_27(double id0[]);
  public void GetLine3Color(double id0[])
  {
    GetLine3Color_27(id0);
  }

  private native void SetLine4Color_28(double id0,double id1,double id2);
  public void SetLine4Color(double id0,double id1,double id2)
  {
    SetLine4Color_28(id0,id1,id2);
  }

  private native void SetLine4Color_29(double id0[]);
  public void SetLine4Color(double id0[])
  {
    SetLine4Color_29(id0);
  }

  private native void GetLine4Color_30(double id0[]);
  public void GetLine4Color(double id0[])
  {
    GetLine4Color_30(id0);
  }

  private native void SetVolumeMapper_31(vtkVolumeMapper id0);
  public void SetVolumeMapper(vtkVolumeMapper id0)
  {
    SetVolumeMapper_31(id0);
  }

  private native long GetVolumeMapper_32();
  public vtkVolumeMapper GetVolumeMapper()
  {
    long temp = GetVolumeMapper_32();

    if (temp == 0) return null;
    return (vtkVolumeMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateAccordingToInput_33();
  public void UpdateAccordingToInput()
  {
    UpdateAccordingToInput_33();
  }

  private native void MoveHorizontalLine_34();
  public void MoveHorizontalLine()
  {
    MoveHorizontalLine_34();
  }

  private native void MoveVerticalLine_35();
  public void MoveVerticalLine()
  {
    MoveVerticalLine_35();
  }

  private native void MoveIntersectingLines_36();
  public void MoveIntersectingLines()
  {
    MoveIntersectingLines_36();
  }

  private native void UpdateCursorIcon_37();
  public void UpdateCursorIcon()
  {
    UpdateCursorIcon_37();
  }

  private native void OnButtonPress_38();
  public void OnButtonPress()
  {
    OnButtonPress_38();
  }

  private native void OnButtonRelease_39();
  public void OnButtonRelease()
  {
    OnButtonRelease_39();
  }

  private native void OnMouseMove_40();
  public void OnMouseMove()
  {
    OnMouseMove_40();
  }

  private native void PlaceWidget_41();
  public void PlaceWidget()
  {
    PlaceWidget_41();
  }

  private native void PlaceWidget_42(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_42(id0,id1,id2,id3,id4,id5);
  }

  public vtkImageCroppingRegionsWidget() { super(); }

  public vtkImageCroppingRegionsWidget(long id) { super(id); }
  public native long   VTKInit();

}
