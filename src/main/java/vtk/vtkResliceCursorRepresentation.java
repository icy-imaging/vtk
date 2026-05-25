// java wrapper for vtkResliceCursorRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursorRepresentation extends vtkWidgetRepresentation
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

  private native void SetTolerance_4(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_4(id0);
  }

  private native int GetToleranceMinValue_5();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_5();
  }

  private native int GetToleranceMaxValue_6();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_6();
  }

  private native int GetTolerance_7();
  public int GetTolerance()
  {
    return GetTolerance_7();
  }

  private native void SetShowReslicedImage_8(int id0);
  public void SetShowReslicedImage(int id0)
  {
    SetShowReslicedImage_8(id0);
  }

  private native int GetShowReslicedImage_9();
  public int GetShowReslicedImage()
  {
    return GetShowReslicedImage_9();
  }

  private native void ShowReslicedImageOn_10();
  public void ShowReslicedImageOn()
  {
    ShowReslicedImageOn_10();
  }

  private native void ShowReslicedImageOff_11();
  public void ShowReslicedImageOff()
  {
    ShowReslicedImageOff_11();
  }

  private native void SetRestrictPlaneToVolume_12(int id0);
  public void SetRestrictPlaneToVolume(int id0)
  {
    SetRestrictPlaneToVolume_12(id0);
  }

  private native int GetRestrictPlaneToVolume_13();
  public int GetRestrictPlaneToVolume()
  {
    return GetRestrictPlaneToVolume_13();
  }

  private native void RestrictPlaneToVolumeOn_14();
  public void RestrictPlaneToVolumeOn()
  {
    RestrictPlaneToVolumeOn_14();
  }

  private native void RestrictPlaneToVolumeOff_15();
  public void RestrictPlaneToVolumeOff()
  {
    RestrictPlaneToVolumeOff_15();
  }

  private native void SetThicknessLabelFormat_16(byte[] id0, int len0);
  public void SetThicknessLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetThicknessLabelFormat_16(bytes0, bytes0.length);
  }

  private native byte[] GetThicknessLabelFormat_17();
  public String GetThicknessLabelFormat()
  {
    return new String(GetThicknessLabelFormat_17(), StandardCharsets.UTF_8);
  }

  private native byte[] GetThicknessLabelText_18();
  public String GetThicknessLabelText()
  {
    return new String(GetThicknessLabelText_18(), StandardCharsets.UTF_8);
  }

  private native void GetThicknessLabelPosition_19(double id0[]);
  public void GetThicknessLabelPosition(double id0[])
  {
    GetThicknessLabelPosition_19(id0);
  }

  private native void GetWorldThicknessLabelPosition_20(double id0[]);
  public void GetWorldThicknessLabelPosition(double id0[])
  {
    GetWorldThicknessLabelPosition_20(id0);
  }

  private native void BuildRepresentation_21();
  public void BuildRepresentation()
  {
    BuildRepresentation_21();
  }

  private native long GetResliceAxes_22();
  public vtkMatrix4x4 GetResliceAxes()
  {
    long temp = GetResliceAxes_22();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetReslice_23();
  public vtkImageAlgorithm GetReslice()
  {
    long temp = GetReslice_23();

    if (temp == 0) return null;
    return (vtkImageAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageActor_24();
  public vtkImageActor GetImageActor()
  {
    long temp = GetImageActor_24();

    if (temp == 0) return null;
    return (vtkImageActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLookupTable_25(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_25(id0);
  }

  private native long GetLookupTable_26();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_26();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorMap_27();
  public vtkImageMapToColors GetColorMap()
  {
    long temp = GetColorMap_27();

    if (temp == 0) return null;
    return (vtkImageMapToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColorMap_28(vtkImageMapToColors id0);
  public void SetColorMap(vtkImageMapToColors id0)
  {
    SetColorMap_28(id0);
  }

  private native void SetWindowLevel_29(double id0,double id1,int id2);
  public void SetWindowLevel(double id0,double id1,int id2)
  {
    SetWindowLevel_29(id0,id1,id2);
  }

  private native void GetWindowLevel_30(double id0[]);
  public void GetWindowLevel(double id0[])
  {
    GetWindowLevel_30(id0);
  }

  private native double GetWindow_31();
  public double GetWindow()
  {
    return GetWindow_31();
  }

  private native double GetLevel_32();
  public double GetLevel()
  {
    return GetLevel_32();
  }

  private native long GetResliceCursor_33();
  public vtkResliceCursor GetResliceCursor()
  {
    long temp = GetResliceCursor_33();

    if (temp == 0) return null;
    return (vtkResliceCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisplayText_34(int id0);
  public void SetDisplayText(int id0)
  {
    SetDisplayText_34(id0);
  }

  private native int GetDisplayText_35();
  public int GetDisplayText()
  {
    return GetDisplayText_35();
  }

  private native void DisplayTextOn_36();
  public void DisplayTextOn()
  {
    DisplayTextOn_36();
  }

  private native void DisplayTextOff_37();
  public void DisplayTextOff()
  {
    DisplayTextOff_37();
  }

  private native void SetTextProperty_38(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_38(id0);
  }

  private native long GetTextProperty_39();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_39();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseImageActor_40(int id0);
  public void SetUseImageActor(int id0)
  {
    SetUseImageActor_40(id0);
  }

  private native int GetUseImageActor_41();
  public int GetUseImageActor()
  {
    return GetUseImageActor_41();
  }

  private native void UseImageActorOn_42();
  public void UseImageActorOn()
  {
    UseImageActorOn_42();
  }

  private native void UseImageActorOff_43();
  public void UseImageActorOff()
  {
    UseImageActorOff_43();
  }

  private native void SetManipulationMode_44(int id0);
  public void SetManipulationMode(int id0)
  {
    SetManipulationMode_44(id0);
  }

  private native int GetManipulationMode_45();
  public int GetManipulationMode()
  {
    return GetManipulationMode_45();
  }

  private native void ActivateText_46(int id0);
  public void ActivateText(int id0)
  {
    ActivateText_46(id0);
  }

  private native void ManageTextDisplay_47();
  public void ManageTextDisplay()
  {
    ManageTextDisplay_47();
  }

  private native void InitializeReslicePlane_48();
  public void InitializeReslicePlane()
  {
    InitializeReslicePlane_48();
  }

  private native void ResetCamera_49();
  public void ResetCamera()
  {
    ResetCamera_49();
  }

  private native long GetCursorAlgorithm_50();
  public vtkResliceCursorPolyDataAlgorithm GetCursorAlgorithm()
  {
    long temp = GetCursorAlgorithm_50();

    if (temp == 0) return null;
    return (vtkResliceCursorPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlaneSource_51();
  public vtkPlaneSource GetPlaneSource()
  {
    long temp = GetPlaneSource_51();

    if (temp == 0) return null;
    return (vtkPlaneSource)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int BoundPlane_52(double id0[],double id1[],double id2[],double id3[]);
  public int BoundPlane(double id0[],double id1[],double id2[],double id3[])
  {
    return BoundPlane_52(id0,id1,id2,id3);
  }

  private native void TransformPlane_53(vtkPlaneSource id0,double id1[],double id2[],double id3[]);
  public void TransformPlane(vtkPlaneSource id0,double id1[],double id2[],double id3[])
  {
    TransformPlane_53(id0,id1,id2,id3);
  }

  public vtkResliceCursorRepresentation() { super(); }

  public vtkResliceCursorRepresentation(long id) { super(id); }

}
