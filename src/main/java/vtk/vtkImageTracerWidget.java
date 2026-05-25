// java wrapper for vtkImageTracerWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageTracerWidget extends vtk3DWidget
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

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void PlaceWidget_6();
  public void PlaceWidget()
  {
    PlaceWidget_6();
  }

  private native void PlaceWidget_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetHandleProperty_8(vtkProperty id0);
  public void SetHandleProperty(vtkProperty id0)
  {
    SetHandleProperty_8(id0);
  }

  private native long GetHandleProperty_9();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_9();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectedHandleProperty_10(vtkProperty id0);
  public void SetSelectedHandleProperty(vtkProperty id0)
  {
    SetSelectedHandleProperty_10(id0);
  }

  private native long GetSelectedHandleProperty_11();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_11();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLineProperty_12(vtkProperty id0);
  public void SetLineProperty(vtkProperty id0)
  {
    SetLineProperty_12(id0);
  }

  private native long GetLineProperty_13();
  public vtkProperty GetLineProperty()
  {
    long temp = GetLineProperty_13();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectedLineProperty_14(vtkProperty id0);
  public void SetSelectedLineProperty(vtkProperty id0)
  {
    SetSelectedLineProperty_14(id0);
  }

  private native long GetSelectedLineProperty_15();
  public vtkProperty GetSelectedLineProperty()
  {
    long temp = GetSelectedLineProperty_15();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetViewProp_16(vtkProp id0);
  public void SetViewProp(vtkProp id0)
  {
    SetViewProp_16(id0);
  }

  private native void SetProjectToPlane_17(int id0);
  public void SetProjectToPlane(int id0)
  {
    SetProjectToPlane_17(id0);
  }

  private native int GetProjectToPlane_18();
  public int GetProjectToPlane()
  {
    return GetProjectToPlane_18();
  }

  private native void ProjectToPlaneOn_19();
  public void ProjectToPlaneOn()
  {
    ProjectToPlaneOn_19();
  }

  private native void ProjectToPlaneOff_20();
  public void ProjectToPlaneOff()
  {
    ProjectToPlaneOff_20();
  }

  private native void SetProjectionNormal_21(int id0);
  public void SetProjectionNormal(int id0)
  {
    SetProjectionNormal_21(id0);
  }

  private native int GetProjectionNormalMinValue_22();
  public int GetProjectionNormalMinValue()
  {
    return GetProjectionNormalMinValue_22();
  }

  private native int GetProjectionNormalMaxValue_23();
  public int GetProjectionNormalMaxValue()
  {
    return GetProjectionNormalMaxValue_23();
  }

  private native int GetProjectionNormal_24();
  public int GetProjectionNormal()
  {
    return GetProjectionNormal_24();
  }

  private native void SetProjectionNormalToXAxes_25();
  public void SetProjectionNormalToXAxes()
  {
    SetProjectionNormalToXAxes_25();
  }

  private native void SetProjectionNormalToYAxes_26();
  public void SetProjectionNormalToYAxes()
  {
    SetProjectionNormalToYAxes_26();
  }

  private native void SetProjectionNormalToZAxes_27();
  public void SetProjectionNormalToZAxes()
  {
    SetProjectionNormalToZAxes_27();
  }

  private native void SetProjectionPosition_28(double id0);
  public void SetProjectionPosition(double id0)
  {
    SetProjectionPosition_28(id0);
  }

  private native double GetProjectionPosition_29();
  public double GetProjectionPosition()
  {
    return GetProjectionPosition_29();
  }

  private native void SetSnapToImage_30(int id0);
  public void SetSnapToImage(int id0)
  {
    SetSnapToImage_30(id0);
  }

  private native int GetSnapToImage_31();
  public int GetSnapToImage()
  {
    return GetSnapToImage_31();
  }

  private native void SnapToImageOn_32();
  public void SnapToImageOn()
  {
    SnapToImageOn_32();
  }

  private native void SnapToImageOff_33();
  public void SnapToImageOff()
  {
    SnapToImageOff_33();
  }

  private native void SetAutoClose_34(int id0);
  public void SetAutoClose(int id0)
  {
    SetAutoClose_34(id0);
  }

  private native int GetAutoClose_35();
  public int GetAutoClose()
  {
    return GetAutoClose_35();
  }

  private native void AutoCloseOn_36();
  public void AutoCloseOn()
  {
    AutoCloseOn_36();
  }

  private native void AutoCloseOff_37();
  public void AutoCloseOff()
  {
    AutoCloseOff_37();
  }

  private native void SetCaptureRadius_38(double id0);
  public void SetCaptureRadius(double id0)
  {
    SetCaptureRadius_38(id0);
  }

  private native double GetCaptureRadius_39();
  public double GetCaptureRadius()
  {
    return GetCaptureRadius_39();
  }

  private native void GetPath_40(vtkPolyData id0);
  public void GetPath(vtkPolyData id0)
  {
    GetPath_40(id0);
  }

  private native long GetGlyphSource_41();
  public vtkGlyphSource2D GetGlyphSource()
  {
    long temp = GetGlyphSource_41();

    if (temp == 0) return null;
    return (vtkGlyphSource2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageSnapType_42(int id0);
  public void SetImageSnapType(int id0)
  {
    SetImageSnapType_42(id0);
  }

  private native int GetImageSnapTypeMinValue_43();
  public int GetImageSnapTypeMinValue()
  {
    return GetImageSnapTypeMinValue_43();
  }

  private native int GetImageSnapTypeMaxValue_44();
  public int GetImageSnapTypeMaxValue()
  {
    return GetImageSnapTypeMaxValue_44();
  }

  private native int GetImageSnapType_45();
  public int GetImageSnapType()
  {
    return GetImageSnapType_45();
  }

  private native void SetHandlePosition_46(int id0,double id1[]);
  public void SetHandlePosition(int id0,double id1[])
  {
    SetHandlePosition_46(id0,id1);
  }

  private native void SetHandlePosition_47(int id0,double id1,double id2,double id3);
  public void SetHandlePosition(int id0,double id1,double id2,double id3)
  {
    SetHandlePosition_47(id0,id1,id2,id3);
  }

  private native void GetHandlePosition_48(int id0,double id1[]);
  public void GetHandlePosition(int id0,double id1[])
  {
    GetHandlePosition_48(id0,id1);
  }

  private native double[] GetHandlePosition_49(int id0);
  public double[] GetHandlePosition(int id0)
  {
    return GetHandlePosition_49(id0);
  }

  private native int GetNumberOfHandles_50();
  public int GetNumberOfHandles()
  {
    return GetNumberOfHandles_50();
  }

  private native void SetInteraction_51(int id0);
  public void SetInteraction(int id0)
  {
    SetInteraction_51(id0);
  }

  private native int GetInteraction_52();
  public int GetInteraction()
  {
    return GetInteraction_52();
  }

  private native void InteractionOn_53();
  public void InteractionOn()
  {
    InteractionOn_53();
  }

  private native void InteractionOff_54();
  public void InteractionOff()
  {
    InteractionOff_54();
  }

  private native void InitializeHandles_55(vtkPoints id0);
  public void InitializeHandles(vtkPoints id0)
  {
    InitializeHandles_55(id0);
  }

  private native int IsClosed_56();
  public int IsClosed()
  {
    return IsClosed_56();
  }

  private native void SetHandleLeftMouseButton_57(int id0);
  public void SetHandleLeftMouseButton(int id0)
  {
    SetHandleLeftMouseButton_57(id0);
  }

  private native int GetHandleLeftMouseButton_58();
  public int GetHandleLeftMouseButton()
  {
    return GetHandleLeftMouseButton_58();
  }

  private native void HandleLeftMouseButtonOn_59();
  public void HandleLeftMouseButtonOn()
  {
    HandleLeftMouseButtonOn_59();
  }

  private native void HandleLeftMouseButtonOff_60();
  public void HandleLeftMouseButtonOff()
  {
    HandleLeftMouseButtonOff_60();
  }

  private native void SetHandleMiddleMouseButton_61(int id0);
  public void SetHandleMiddleMouseButton(int id0)
  {
    SetHandleMiddleMouseButton_61(id0);
  }

  private native int GetHandleMiddleMouseButton_62();
  public int GetHandleMiddleMouseButton()
  {
    return GetHandleMiddleMouseButton_62();
  }

  private native void HandleMiddleMouseButtonOn_63();
  public void HandleMiddleMouseButtonOn()
  {
    HandleMiddleMouseButtonOn_63();
  }

  private native void HandleMiddleMouseButtonOff_64();
  public void HandleMiddleMouseButtonOff()
  {
    HandleMiddleMouseButtonOff_64();
  }

  private native void SetHandleRightMouseButton_65(int id0);
  public void SetHandleRightMouseButton(int id0)
  {
    SetHandleRightMouseButton_65(id0);
  }

  private native int GetHandleRightMouseButton_66();
  public int GetHandleRightMouseButton()
  {
    return GetHandleRightMouseButton_66();
  }

  private native void HandleRightMouseButtonOn_67();
  public void HandleRightMouseButtonOn()
  {
    HandleRightMouseButtonOn_67();
  }

  private native void HandleRightMouseButtonOff_68();
  public void HandleRightMouseButtonOff()
  {
    HandleRightMouseButtonOff_68();
  }

  public vtkImageTracerWidget() { super(); }

  public vtkImageTracerWidget(long id) { super(id); }
  public native long   VTKInit();

}
