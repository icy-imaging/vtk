// java wrapper for vtkInteractorStyle object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyle extends vtkInteractorObserver
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

  private native void SetEnabled_5(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_5(id0);
  }

  private native void SetAutoAdjustCameraClippingRange_6(int id0);
  public void SetAutoAdjustCameraClippingRange(int id0)
  {
    SetAutoAdjustCameraClippingRange_6(id0);
  }

  private native int GetAutoAdjustCameraClippingRangeMinValue_7();
  public int GetAutoAdjustCameraClippingRangeMinValue()
  {
    return GetAutoAdjustCameraClippingRangeMinValue_7();
  }

  private native int GetAutoAdjustCameraClippingRangeMaxValue_8();
  public int GetAutoAdjustCameraClippingRangeMaxValue()
  {
    return GetAutoAdjustCameraClippingRangeMaxValue_8();
  }

  private native int GetAutoAdjustCameraClippingRange_9();
  public int GetAutoAdjustCameraClippingRange()
  {
    return GetAutoAdjustCameraClippingRange_9();
  }

  private native void AutoAdjustCameraClippingRangeOn_10();
  public void AutoAdjustCameraClippingRangeOn()
  {
    AutoAdjustCameraClippingRangeOn_10();
  }

  private native void AutoAdjustCameraClippingRangeOff_11();
  public void AutoAdjustCameraClippingRangeOff()
  {
    AutoAdjustCameraClippingRangeOff_11();
  }

  private native void FindPokedRenderer_12(int id0,int id1);
  public void FindPokedRenderer(int id0,int id1)
  {
    FindPokedRenderer_12(id0,id1);
  }

  private native int GetState_13();
  public int GetState()
  {
    return GetState_13();
  }

  private native int GetUseTimers_14();
  public int GetUseTimers()
  {
    return GetUseTimers_14();
  }

  private native void SetUseTimers_15(int id0);
  public void SetUseTimers(int id0)
  {
    SetUseTimers_15(id0);
  }

  private native void UseTimersOn_16();
  public void UseTimersOn()
  {
    UseTimersOn_16();
  }

  private native void UseTimersOff_17();
  public void UseTimersOff()
  {
    UseTimersOff_17();
  }

  private native void SetTimerDuration_18(long id0);
  public void SetTimerDuration(long id0)
  {
    SetTimerDuration_18(id0);
  }

  private native long GetTimerDurationMinValue_19();
  public long GetTimerDurationMinValue()
  {
    return GetTimerDurationMinValue_19();
  }

  private native long GetTimerDurationMaxValue_20();
  public long GetTimerDurationMaxValue()
  {
    return GetTimerDurationMaxValue_20();
  }

  private native long GetTimerDuration_21();
  public long GetTimerDuration()
  {
    return GetTimerDuration_21();
  }

  private native void SetHandleObservers_22(int id0);
  public void SetHandleObservers(int id0)
  {
    SetHandleObservers_22(id0);
  }

  private native int GetHandleObservers_23();
  public int GetHandleObservers()
  {
    return GetHandleObservers_23();
  }

  private native void HandleObserversOn_24();
  public void HandleObserversOn()
  {
    HandleObserversOn_24();
  }

  private native void HandleObserversOff_25();
  public void HandleObserversOff()
  {
    HandleObserversOff_25();
  }

  private native void OnMouseMove_26();
  public void OnMouseMove()
  {
    OnMouseMove_26();
  }

  private native void OnLeftButtonDown_27();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_27();
  }

  private native void OnLeftButtonUp_28();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_28();
  }

  private native void OnMiddleButtonDown_29();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_29();
  }

  private native void OnMiddleButtonUp_30();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_30();
  }

  private native void OnRightButtonDown_31();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_31();
  }

  private native void OnRightButtonUp_32();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_32();
  }

  private native void OnLeftButtonDoubleClick_33();
  public void OnLeftButtonDoubleClick()
  {
    OnLeftButtonDoubleClick_33();
  }

  private native void OnMiddleButtonDoubleClick_34();
  public void OnMiddleButtonDoubleClick()
  {
    OnMiddleButtonDoubleClick_34();
  }

  private native void OnRightButtonDoubleClick_35();
  public void OnRightButtonDoubleClick()
  {
    OnRightButtonDoubleClick_35();
  }

  private native void OnMouseWheelForward_36();
  public void OnMouseWheelForward()
  {
    OnMouseWheelForward_36();
  }

  private native void OnMouseWheelBackward_37();
  public void OnMouseWheelBackward()
  {
    OnMouseWheelBackward_37();
  }

  private native void OnMouseWheelLeft_38();
  public void OnMouseWheelLeft()
  {
    OnMouseWheelLeft_38();
  }

  private native void OnMouseWheelRight_39();
  public void OnMouseWheelRight()
  {
    OnMouseWheelRight_39();
  }

  private native void OnFourthButtonDown_40();
  public void OnFourthButtonDown()
  {
    OnFourthButtonDown_40();
  }

  private native void OnFourthButtonUp_41();
  public void OnFourthButtonUp()
  {
    OnFourthButtonUp_41();
  }

  private native void OnFifthButtonDown_42();
  public void OnFifthButtonDown()
  {
    OnFifthButtonDown_42();
  }

  private native void OnFifthButtonUp_43();
  public void OnFifthButtonUp()
  {
    OnFifthButtonUp_43();
  }

  private native void OnMove3D_44(vtkEventData id0);
  public void OnMove3D(vtkEventData id0)
  {
    OnMove3D_44(id0);
  }

  private native void OnButton3D_45(vtkEventData id0);
  public void OnButton3D(vtkEventData id0)
  {
    OnButton3D_45(id0);
  }

  private native void OnPick3D_46(vtkEventData id0);
  public void OnPick3D(vtkEventData id0)
  {
    OnPick3D_46(id0);
  }

  private native void OnClip3D_47(vtkEventData id0);
  public void OnClip3D(vtkEventData id0)
  {
    OnClip3D_47(id0);
  }

  private native void OnSelect3D_48(vtkEventData id0);
  public void OnSelect3D(vtkEventData id0)
  {
    OnSelect3D_48(id0);
  }

  private native void OnMenu3D_49(vtkEventData id0);
  public void OnMenu3D(vtkEventData id0)
  {
    OnMenu3D_49(id0);
  }

  private native void OnNextPose3D_50(vtkEventData id0);
  public void OnNextPose3D(vtkEventData id0)
  {
    OnNextPose3D_50(id0);
  }

  private native void OnPositionProp3D_51(vtkEventData id0);
  public void OnPositionProp3D(vtkEventData id0)
  {
    OnPositionProp3D_51(id0);
  }

  private native void OnViewerMovement3D_52(vtkEventData id0);
  public void OnViewerMovement3D(vtkEventData id0)
  {
    OnViewerMovement3D_52(id0);
  }

  private native void OnElevation3D_53(vtkEventData id0);
  public void OnElevation3D(vtkEventData id0)
  {
    OnElevation3D_53(id0);
  }

  private native void OnChar_54();
  public void OnChar()
  {
    OnChar_54();
  }

  private native void OnKeyDown_55();
  public void OnKeyDown()
  {
    OnKeyDown_55();
  }

  private native void OnKeyUp_56();
  public void OnKeyUp()
  {
    OnKeyUp_56();
  }

  private native void OnKeyPress_57();
  public void OnKeyPress()
  {
    OnKeyPress_57();
  }

  private native void OnKeyRelease_58();
  public void OnKeyRelease()
  {
    OnKeyRelease_58();
  }

  private native void OnExpose_59();
  public void OnExpose()
  {
    OnExpose_59();
  }

  private native void OnConfigure_60();
  public void OnConfigure()
  {
    OnConfigure_60();
  }

  private native void OnEnter_61();
  public void OnEnter()
  {
    OnEnter_61();
  }

  private native void OnLeave_62();
  public void OnLeave()
  {
    OnLeave_62();
  }

  private native void OnTimer_63();
  public void OnTimer()
  {
    OnTimer_63();
  }

  private native void Rotate_64();
  public void Rotate()
  {
    Rotate_64();
  }

  private native void Spin_65();
  public void Spin()
  {
    Spin_65();
  }

  private native void Pan_66();
  public void Pan()
  {
    Pan_66();
  }

  private native void Dolly_67();
  public void Dolly()
  {
    Dolly_67();
  }

  private native void Zoom_68();
  public void Zoom()
  {
    Zoom_68();
  }

  private native void UniformScale_69();
  public void UniformScale()
  {
    UniformScale_69();
  }

  private native void EnvironmentRotate_70();
  public void EnvironmentRotate()
  {
    EnvironmentRotate_70();
  }

  private native void OnStartSwipe_71();
  public void OnStartSwipe()
  {
    OnStartSwipe_71();
  }

  private native void OnSwipe_72();
  public void OnSwipe()
  {
    OnSwipe_72();
  }

  private native void OnEndSwipe_73();
  public void OnEndSwipe()
  {
    OnEndSwipe_73();
  }

  private native void OnStartPinch_74();
  public void OnStartPinch()
  {
    OnStartPinch_74();
  }

  private native void OnPinch_75();
  public void OnPinch()
  {
    OnPinch_75();
  }

  private native void OnEndPinch_76();
  public void OnEndPinch()
  {
    OnEndPinch_76();
  }

  private native void OnStartRotate_77();
  public void OnStartRotate()
  {
    OnStartRotate_77();
  }

  private native void OnRotate_78();
  public void OnRotate()
  {
    OnRotate_78();
  }

  private native void OnEndRotate_79();
  public void OnEndRotate()
  {
    OnEndRotate_79();
  }

  private native void OnStartPan_80();
  public void OnStartPan()
  {
    OnStartPan_80();
  }

  private native void OnPan_81();
  public void OnPan()
  {
    OnPan_81();
  }

  private native void OnEndPan_82();
  public void OnEndPan()
  {
    OnEndPan_82();
  }

  private native void OnTap_83();
  public void OnTap()
  {
    OnTap_83();
  }

  private native void OnLongTap_84();
  public void OnLongTap()
  {
    OnLongTap_84();
  }

  private native void StartState_85(int id0);
  public void StartState(int id0)
  {
    StartState_85(id0);
  }

  private native void StopState_86();
  public void StopState()
  {
    StopState_86();
  }

  private native void StartAnimate_87();
  public void StartAnimate()
  {
    StartAnimate_87();
  }

  private native void StopAnimate_88();
  public void StopAnimate()
  {
    StopAnimate_88();
  }

  private native void StartRotate_89();
  public void StartRotate()
  {
    StartRotate_89();
  }

  private native void EndRotate_90();
  public void EndRotate()
  {
    EndRotate_90();
  }

  private native void StartZoom_91();
  public void StartZoom()
  {
    StartZoom_91();
  }

  private native void EndZoom_92();
  public void EndZoom()
  {
    EndZoom_92();
  }

  private native void StartPan_93();
  public void StartPan()
  {
    StartPan_93();
  }

  private native void EndPan_94();
  public void EndPan()
  {
    EndPan_94();
  }

  private native void StartSpin_95();
  public void StartSpin()
  {
    StartSpin_95();
  }

  private native void EndSpin_96();
  public void EndSpin()
  {
    EndSpin_96();
  }

  private native void StartDolly_97();
  public void StartDolly()
  {
    StartDolly_97();
  }

  private native void EndDolly_98();
  public void EndDolly()
  {
    EndDolly_98();
  }

  private native void StartUniformScale_99();
  public void StartUniformScale()
  {
    StartUniformScale_99();
  }

  private native void EndUniformScale_100();
  public void EndUniformScale()
  {
    EndUniformScale_100();
  }

  private native void StartTimer_101();
  public void StartTimer()
  {
    StartTimer_101();
  }

  private native void EndTimer_102();
  public void EndTimer()
  {
    EndTimer_102();
  }

  private native void StartTwoPointer_103();
  public void StartTwoPointer()
  {
    StartTwoPointer_103();
  }

  private native void EndTwoPointer_104();
  public void EndTwoPointer()
  {
    EndTwoPointer_104();
  }

  private native void StartGesture_105();
  public void StartGesture()
  {
    StartGesture_105();
  }

  private native void EndGesture_106();
  public void EndGesture()
  {
    EndGesture_106();
  }

  private native void StartEnvRotate_107();
  public void StartEnvRotate()
  {
    StartEnvRotate_107();
  }

  private native void EndEnvRotate_108();
  public void EndEnvRotate()
  {
    EndEnvRotate_108();
  }

  private native void OnDropFiles_109(vtkStringArray id0);
  public void OnDropFiles(vtkStringArray id0)
  {
    OnDropFiles_109(id0);
  }

  private native void HighlightProp_110(vtkProp id0);
  public void HighlightProp(vtkProp id0)
  {
    HighlightProp_110(id0);
  }

  private native void HighlightActor2D_111(vtkActor2D id0);
  public void HighlightActor2D(vtkActor2D id0)
  {
    HighlightActor2D_111(id0);
  }

  private native void HighlightProp3D_112(vtkProp3D id0);
  public void HighlightProp3D(vtkProp3D id0)
  {
    HighlightProp3D_112(id0);
  }

  private native void SetPickColor_113(double id0,double id1,double id2);
  public void SetPickColor(double id0,double id1,double id2)
  {
    SetPickColor_113(id0,id1,id2);
  }

  private native void SetPickColor_114(double id0[]);
  public void SetPickColor(double id0[])
  {
    SetPickColor_114(id0);
  }

  private native double[] GetPickColor_115();
  public double[] GetPickColor()
  {
    return GetPickColor_115();
  }

  private native void SetMouseWheelMotionFactor_116(double id0);
  public void SetMouseWheelMotionFactor(double id0)
  {
    SetMouseWheelMotionFactor_116(id0);
  }

  private native double GetMouseWheelMotionFactor_117();
  public double GetMouseWheelMotionFactor()
  {
    return GetMouseWheelMotionFactor_117();
  }

  private native long GetTDxStyle_118();
  public vtkTDxInteractorStyle GetTDxStyle()
  {
    long temp = GetTDxStyle_118();

    if (temp == 0) return null;
    return (vtkTDxInteractorStyle)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTDxStyle_119(vtkTDxInteractorStyle id0);
  public void SetTDxStyle(vtkTDxInteractorStyle id0)
  {
    SetTDxStyle_119(id0);
  }

  public vtkInteractorStyle() { super(); }

  public vtkInteractorStyle(long id) { super(id); }
  public native long   VTKInit();

}
