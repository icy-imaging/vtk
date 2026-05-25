// java wrapper for vtkRenderWindowInteractor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderWindowInteractor extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void ReInitialize_5();
  public void ReInitialize()
  {
    ReInitialize_5();
  }

  private native void UnRegister_6(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_6(id0);
  }

  private native void Start_7();
  public void Start()
  {
    Start_7();
  }

  private native void ProcessEvents_8();
  public void ProcessEvents()
  {
    ProcessEvents_8();
  }

  private native boolean GetDone_9();
  public boolean GetDone()
  {
    return GetDone_9();
  }

  private native void SetDone_10(boolean id0);
  public void SetDone(boolean id0)
  {
    SetDone_10(id0);
  }

  private native void Enable_11();
  public void Enable()
  {
    Enable_11();
  }

  private native void Disable_12();
  public void Disable()
  {
    Disable_12();
  }

  private native int GetEnabled_13();
  public int GetEnabled()
  {
    return GetEnabled_13();
  }

  private native void EnableRenderOn_14();
  public void EnableRenderOn()
  {
    EnableRenderOn_14();
  }

  private native void EnableRenderOff_15();
  public void EnableRenderOff()
  {
    EnableRenderOff_15();
  }

  private native void SetEnableRender_16(boolean id0);
  public void SetEnableRender(boolean id0)
  {
    SetEnableRender_16(id0);
  }

  private native boolean GetEnableRender_17();
  public boolean GetEnableRender()
  {
    return GetEnableRender_17();
  }

  private native void SetRenderWindow_18(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_18(id0);
  }

  private native long GetRenderWindow_19();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_19();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHardwareWindow_20(vtkHardwareWindow id0);
  public void SetHardwareWindow(vtkHardwareWindow id0)
  {
    SetHardwareWindow_20(id0);
  }

  private native long GetHardwareWindow_21();
  public vtkHardwareWindow GetHardwareWindow()
  {
    long temp = GetHardwareWindow_21();

    if (temp == 0) return null;
    return (vtkHardwareWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateSize_22(int id0,int id1);
  public void UpdateSize(int id0,int id1)
  {
    UpdateSize_22(id0,id1);
  }

  private native int CreateTimer_23(int id0);
  public int CreateTimer(int id0)
  {
    return CreateTimer_23(id0);
  }

  private native int DestroyTimer_24();
  public int DestroyTimer()
  {
    return DestroyTimer_24();
  }

  private native int CreateRepeatingTimer_25(long id0);
  public int CreateRepeatingTimer(long id0)
  {
    return CreateRepeatingTimer_25(id0);
  }

  private native int CreateOneShotTimer_26(long id0);
  public int CreateOneShotTimer(long id0)
  {
    return CreateOneShotTimer_26(id0);
  }

  private native int IsOneShotTimer_27(int id0);
  public int IsOneShotTimer(int id0)
  {
    return IsOneShotTimer_27(id0);
  }

  private native long GetTimerDuration_28(int id0);
  public long GetTimerDuration(int id0)
  {
    return GetTimerDuration_28(id0);
  }

  private native int ResetTimer_29(int id0);
  public int ResetTimer(int id0)
  {
    return ResetTimer_29(id0);
  }

  private native int DestroyTimer_30(int id0);
  public int DestroyTimer(int id0)
  {
    return DestroyTimer_30(id0);
  }

  private native int GetVTKTimerId_31(int id0);
  public int GetVTKTimerId(int id0)
  {
    return GetVTKTimerId_31(id0);
  }

  private native void SetTimerDuration_32(long id0);
  public void SetTimerDuration(long id0)
  {
    SetTimerDuration_32(id0);
  }

  private native long GetTimerDurationMinValue_33();
  public long GetTimerDurationMinValue()
  {
    return GetTimerDurationMinValue_33();
  }

  private native long GetTimerDurationMaxValue_34();
  public long GetTimerDurationMaxValue()
  {
    return GetTimerDurationMaxValue_34();
  }

  private native long GetTimerDuration_35();
  public long GetTimerDuration()
  {
    return GetTimerDuration_35();
  }

  private native void SetTimerEventId_36(int id0);
  public void SetTimerEventId(int id0)
  {
    SetTimerEventId_36(id0);
  }

  private native int GetTimerEventId_37();
  public int GetTimerEventId()
  {
    return GetTimerEventId_37();
  }

  private native void SetTimerEventType_38(int id0);
  public void SetTimerEventType(int id0)
  {
    SetTimerEventType_38(id0);
  }

  private native int GetTimerEventType_39();
  public int GetTimerEventType()
  {
    return GetTimerEventType_39();
  }

  private native void SetTimerEventDuration_40(int id0);
  public void SetTimerEventDuration(int id0)
  {
    SetTimerEventDuration_40(id0);
  }

  private native int GetTimerEventDuration_41();
  public int GetTimerEventDuration()
  {
    return GetTimerEventDuration_41();
  }

  private native void SetTimerEventPlatformId_42(int id0);
  public void SetTimerEventPlatformId(int id0)
  {
    SetTimerEventPlatformId_42(id0);
  }

  private native int GetTimerEventPlatformId_43();
  public int GetTimerEventPlatformId()
  {
    return GetTimerEventPlatformId_43();
  }

  private native void TerminateApp_44();
  public void TerminateApp()
  {
    TerminateApp_44();
  }

  private native void SetInteractorStyle_45(vtkInteractorObserver id0);
  public void SetInteractorStyle(vtkInteractorObserver id0)
  {
    SetInteractorStyle_45(id0);
  }

  private native long GetInteractorStyle_46();
  public vtkInteractorObserver GetInteractorStyle()
  {
    long temp = GetInteractorStyle_46();

    if (temp == 0) return null;
    return (vtkInteractorObserver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLightFollowCamera_47(int id0);
  public void SetLightFollowCamera(int id0)
  {
    SetLightFollowCamera_47(id0);
  }

  private native int GetLightFollowCamera_48();
  public int GetLightFollowCamera()
  {
    return GetLightFollowCamera_48();
  }

  private native void LightFollowCameraOn_49();
  public void LightFollowCameraOn()
  {
    LightFollowCameraOn_49();
  }

  private native void LightFollowCameraOff_50();
  public void LightFollowCameraOff()
  {
    LightFollowCameraOff_50();
  }

  private native void SetDesiredUpdateRate_51(double id0);
  public void SetDesiredUpdateRate(double id0)
  {
    SetDesiredUpdateRate_51(id0);
  }

  private native double GetDesiredUpdateRateMinValue_52();
  public double GetDesiredUpdateRateMinValue()
  {
    return GetDesiredUpdateRateMinValue_52();
  }

  private native double GetDesiredUpdateRateMaxValue_53();
  public double GetDesiredUpdateRateMaxValue()
  {
    return GetDesiredUpdateRateMaxValue_53();
  }

  private native double GetDesiredUpdateRate_54();
  public double GetDesiredUpdateRate()
  {
    return GetDesiredUpdateRate_54();
  }

  private native void SetStillUpdateRate_55(double id0);
  public void SetStillUpdateRate(double id0)
  {
    SetStillUpdateRate_55(id0);
  }

  private native double GetStillUpdateRateMinValue_56();
  public double GetStillUpdateRateMinValue()
  {
    return GetStillUpdateRateMinValue_56();
  }

  private native double GetStillUpdateRateMaxValue_57();
  public double GetStillUpdateRateMaxValue()
  {
    return GetStillUpdateRateMaxValue_57();
  }

  private native double GetStillUpdateRate_58();
  public double GetStillUpdateRate()
  {
    return GetStillUpdateRate_58();
  }

  private native int GetInitialized_59();
  public int GetInitialized()
  {
    return GetInitialized_59();
  }

  private native void SetPicker_60(vtkAbstractPicker id0);
  public void SetPicker(vtkAbstractPicker id0)
  {
    SetPicker_60(id0);
  }

  private native long GetPicker_61();
  public vtkAbstractPicker GetPicker()
  {
    long temp = GetPicker_61();

    if (temp == 0) return null;
    return (vtkAbstractPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CreateDefaultPicker_62();
  public vtkAbstractPropPicker CreateDefaultPicker()
  {
    long temp = CreateDefaultPicker_62();

    if (temp == 0) return null;
    return (vtkAbstractPropPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPickingManager_63(vtkPickingManager id0);
  public void SetPickingManager(vtkPickingManager id0)
  {
    SetPickingManager_63(id0);
  }

  private native long GetPickingManager_64();
  public vtkPickingManager GetPickingManager()
  {
    long temp = GetPickingManager_64();

    if (temp == 0) return null;
    return (vtkPickingManager)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ExitCallback_65();
  public void ExitCallback()
  {
    ExitCallback_65();
  }

  private native void UserCallback_66();
  public void UserCallback()
  {
    UserCallback_66();
  }

  private native void StartPickCallback_67();
  public void StartPickCallback()
  {
    StartPickCallback_67();
  }

  private native void EndPickCallback_68();
  public void EndPickCallback()
  {
    EndPickCallback_68();
  }

  private native void HideCursor_69();
  public void HideCursor()
  {
    HideCursor_69();
  }

  private native void ShowCursor_70();
  public void ShowCursor()
  {
    ShowCursor_70();
  }

  private native void Render_71();
  public void Render()
  {
    Render_71();
  }

  private native void FlyTo_72(vtkRenderer id0,double id1,double id2,double id3);
  public void FlyTo(vtkRenderer id0,double id1,double id2,double id3)
  {
    FlyTo_72(id0,id1,id2,id3);
  }

  private native void FlyToImage_73(vtkRenderer id0,double id1,double id2);
  public void FlyToImage(vtkRenderer id0,double id1,double id2)
  {
    FlyToImage_73(id0,id1,id2);
  }

  private native void SetNumberOfFlyFrames_74(int id0);
  public void SetNumberOfFlyFrames(int id0)
  {
    SetNumberOfFlyFrames_74(id0);
  }

  private native int GetNumberOfFlyFramesMinValue_75();
  public int GetNumberOfFlyFramesMinValue()
  {
    return GetNumberOfFlyFramesMinValue_75();
  }

  private native int GetNumberOfFlyFramesMaxValue_76();
  public int GetNumberOfFlyFramesMaxValue()
  {
    return GetNumberOfFlyFramesMaxValue_76();
  }

  private native int GetNumberOfFlyFrames_77();
  public int GetNumberOfFlyFrames()
  {
    return GetNumberOfFlyFrames_77();
  }

  private native void SetDolly_78(double id0);
  public void SetDolly(double id0)
  {
    SetDolly_78(id0);
  }

  private native double GetDolly_79();
  public double GetDolly()
  {
    return GetDolly_79();
  }

  private native int[] GetEventPosition_80();
  public int[] GetEventPosition()
  {
    return GetEventPosition_80();
  }

  private native int[] GetLastEventPosition_81();
  public int[] GetLastEventPosition()
  {
    return GetLastEventPosition_81();
  }

  private native void SetLastEventPosition_82(int id0,int id1);
  public void SetLastEventPosition(int id0,int id1)
  {
    SetLastEventPosition_82(id0,id1);
  }

  private native void SetLastEventPosition_83(int id0[]);
  public void SetLastEventPosition(int id0[])
  {
    SetLastEventPosition_83(id0);
  }

  private native void SetEventPosition_84(int id0,int id1);
  public void SetEventPosition(int id0,int id1)
  {
    SetEventPosition_84(id0,id1);
  }

  private native void SetEventPosition_85(int id0[]);
  public void SetEventPosition(int id0[])
  {
    SetEventPosition_85(id0);
  }

  private native void SetEventPositionFlipY_86(int id0,int id1);
  public void SetEventPositionFlipY(int id0,int id1)
  {
    SetEventPositionFlipY_86(id0,id1);
  }

  private native void SetEventPositionFlipY_87(int id0[]);
  public void SetEventPositionFlipY(int id0[])
  {
    SetEventPositionFlipY_87(id0);
  }

  private native void SetEventPosition_88(int id0,int id1,int id2);
  public void SetEventPosition(int id0,int id1,int id2)
  {
    SetEventPosition_88(id0,id1,id2);
  }

  private native void SetEventPosition_89(int id0[],int id1);
  public void SetEventPosition(int id0[],int id1)
  {
    SetEventPosition_89(id0,id1);
  }

  private native void SetEventPositionFlipY_90(int id0,int id1,int id2);
  public void SetEventPositionFlipY(int id0,int id1,int id2)
  {
    SetEventPositionFlipY_90(id0,id1,id2);
  }

  private native void SetEventPositionFlipY_91(int id0[],int id1);
  public void SetEventPositionFlipY(int id0[],int id1)
  {
    SetEventPositionFlipY_91(id0,id1);
  }

  private native void SetAltKey_92(int id0);
  public void SetAltKey(int id0)
  {
    SetAltKey_92(id0);
  }

  private native int GetAltKey_93();
  public int GetAltKey()
  {
    return GetAltKey_93();
  }

  private native void SetControlKey_94(int id0);
  public void SetControlKey(int id0)
  {
    SetControlKey_94(id0);
  }

  private native int GetControlKey_95();
  public int GetControlKey()
  {
    return GetControlKey_95();
  }

  private native void SetShiftKey_96(int id0);
  public void SetShiftKey(int id0)
  {
    SetShiftKey_96(id0);
  }

  private native int GetShiftKey_97();
  public int GetShiftKey()
  {
    return GetShiftKey_97();
  }

  private native void SetKeyCode_98(char id0);
  public void SetKeyCode(char id0)
  {
    SetKeyCode_98(id0);
  }

  private native char GetKeyCode_99();
  public char GetKeyCode()
  {
    return GetKeyCode_99();
  }

  private native void SetRepeatCount_100(int id0);
  public void SetRepeatCount(int id0)
  {
    SetRepeatCount_100(id0);
  }

  private native int GetRepeatCount_101();
  public int GetRepeatCount()
  {
    return GetRepeatCount_101();
  }

  private native void SetKeySym_102(byte[] id0, int len0);
  public void SetKeySym(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetKeySym_102(bytes0, bytes0.length);
  }

  private native byte[] GetKeySym_103();
  public String GetKeySym()
  {
    return new String(GetKeySym_103(), StandardCharsets.UTF_8);
  }

  private native void SetPointerIndex_104(int id0);
  public void SetPointerIndex(int id0)
  {
    SetPointerIndex_104(id0);
  }

  private native int GetPointerIndex_105();
  public int GetPointerIndex()
  {
    return GetPointerIndex_105();
  }

  private native void SetRotation_106(double id0);
  public void SetRotation(double id0)
  {
    SetRotation_106(id0);
  }

  private native double GetRotation_107();
  public double GetRotation()
  {
    return GetRotation_107();
  }

  private native double GetLastRotation_108();
  public double GetLastRotation()
  {
    return GetLastRotation_108();
  }

  private native void SetScale_109(double id0);
  public void SetScale(double id0)
  {
    SetScale_109(id0);
  }

  private native double GetScale_110();
  public double GetScale()
  {
    return GetScale_110();
  }

  private native double GetLastScale_111();
  public double GetLastScale()
  {
    return GetLastScale_111();
  }

  private native void SetTranslation_112(double id0[]);
  public void SetTranslation(double id0[])
  {
    SetTranslation_112(id0);
  }

  private native double[] GetTranslation_113();
  public double[] GetTranslation()
  {
    return GetTranslation_113();
  }

  private native double[] GetLastTranslation_114();
  public double[] GetLastTranslation()
  {
    return GetLastTranslation_114();
  }

  private native void SetEventInformation_115(int id0,int id1,int id2,int id3,char id4,int id5,byte[] id6, int len6,int id7);
  public void SetEventInformation(int id0,int id1,int id2,int id3,char id4,int id5,String id6,int id7)
  {
    byte[] bytes6 = id6.getBytes(StandardCharsets.UTF_8);
    SetEventInformation_115(id0,id1,id2,id3,id4,id5,bytes6, bytes6.length,id7);
  }

  private native void SetEventInformation_116(int id0,int id1,int id2,int id3,char id4,int id5,byte[] id6, int len6);
  public void SetEventInformation(int id0,int id1,int id2,int id3,char id4,int id5,String id6)
  {
    byte[] bytes6 = id6.getBytes(StandardCharsets.UTF_8);
    SetEventInformation_116(id0,id1,id2,id3,id4,id5,bytes6, bytes6.length);
  }

  private native void SetEventInformationFlipY_117(int id0,int id1,int id2,int id3,char id4,int id5,byte[] id6, int len6,int id7);
  public void SetEventInformationFlipY(int id0,int id1,int id2,int id3,char id4,int id5,String id6,int id7)
  {
    byte[] bytes6 = id6.getBytes(StandardCharsets.UTF_8);
    SetEventInformationFlipY_117(id0,id1,id2,id3,id4,id5,bytes6, bytes6.length,id7);
  }

  private native void SetEventInformationFlipY_118(int id0,int id1,int id2,int id3,char id4,int id5,byte[] id6, int len6);
  public void SetEventInformationFlipY(int id0,int id1,int id2,int id3,char id4,int id5,String id6)
  {
    byte[] bytes6 = id6.getBytes(StandardCharsets.UTF_8);
    SetEventInformationFlipY_118(id0,id1,id2,id3,id4,id5,bytes6, bytes6.length);
  }

  private native void SetKeyEventInformation_119(int id0,int id1,char id2,int id3,byte[] id4, int len4);
  public void SetKeyEventInformation(int id0,int id1,char id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetKeyEventInformation_119(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native void SetSize_120(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_120(id0,id1);
  }

  private native void SetSize_121(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_121(id0);
  }

  private native int[] GetSize_122();
  public int[] GetSize()
  {
    return GetSize_122();
  }

  private native void SetEventSize_123(int id0,int id1);
  public void SetEventSize(int id0,int id1)
  {
    SetEventSize_123(id0,id1);
  }

  private native void SetEventSize_124(int id0[]);
  public void SetEventSize(int id0[])
  {
    SetEventSize_124(id0);
  }

  private native int[] GetEventSize_125();
  public int[] GetEventSize()
  {
    return GetEventSize_125();
  }

  private native long FindPokedRenderer_126(int id0,int id1);
  public vtkRenderer FindPokedRenderer(int id0,int id1)
  {
    long temp = FindPokedRenderer_126(id0,id1);

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetObserverMediator_127();
  public vtkObserverMediator GetObserverMediator()
  {
    long temp = GetObserverMediator_127();

    if (temp == 0) return null;
    return (vtkObserverMediator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseTDx_128(boolean id0);
  public void SetUseTDx(boolean id0)
  {
    SetUseTDx_128(id0);
  }

  private native boolean GetUseTDx_129();
  public boolean GetUseTDx()
  {
    return GetUseTDx_129();
  }

  private native void MouseMoveEvent_130();
  public void MouseMoveEvent()
  {
    MouseMoveEvent_130();
  }

  private native void RightButtonPressEvent_131();
  public void RightButtonPressEvent()
  {
    RightButtonPressEvent_131();
  }

  private native void RightButtonReleaseEvent_132();
  public void RightButtonReleaseEvent()
  {
    RightButtonReleaseEvent_132();
  }

  private native void LeftButtonPressEvent_133();
  public void LeftButtonPressEvent()
  {
    LeftButtonPressEvent_133();
  }

  private native void LeftButtonReleaseEvent_134();
  public void LeftButtonReleaseEvent()
  {
    LeftButtonReleaseEvent_134();
  }

  private native void MiddleButtonPressEvent_135();
  public void MiddleButtonPressEvent()
  {
    MiddleButtonPressEvent_135();
  }

  private native void MiddleButtonReleaseEvent_136();
  public void MiddleButtonReleaseEvent()
  {
    MiddleButtonReleaseEvent_136();
  }

  private native void MouseWheelForwardEvent_137();
  public void MouseWheelForwardEvent()
  {
    MouseWheelForwardEvent_137();
  }

  private native void MouseWheelBackwardEvent_138();
  public void MouseWheelBackwardEvent()
  {
    MouseWheelBackwardEvent_138();
  }

  private native void MouseWheelLeftEvent_139();
  public void MouseWheelLeftEvent()
  {
    MouseWheelLeftEvent_139();
  }

  private native void MouseWheelRightEvent_140();
  public void MouseWheelRightEvent()
  {
    MouseWheelRightEvent_140();
  }

  private native void ExposeEvent_141();
  public void ExposeEvent()
  {
    ExposeEvent_141();
  }

  private native void ConfigureEvent_142();
  public void ConfigureEvent()
  {
    ConfigureEvent_142();
  }

  private native void EnterEvent_143();
  public void EnterEvent()
  {
    EnterEvent_143();
  }

  private native void LeaveEvent_144();
  public void LeaveEvent()
  {
    LeaveEvent_144();
  }

  private native void KeyPressEvent_145();
  public void KeyPressEvent()
  {
    KeyPressEvent_145();
  }

  private native void KeyReleaseEvent_146();
  public void KeyReleaseEvent()
  {
    KeyReleaseEvent_146();
  }

  private native void CharEvent_147();
  public void CharEvent()
  {
    CharEvent_147();
  }

  private native void ExitEvent_148();
  public void ExitEvent()
  {
    ExitEvent_148();
  }

  private native void FourthButtonPressEvent_149();
  public void FourthButtonPressEvent()
  {
    FourthButtonPressEvent_149();
  }

  private native void FourthButtonReleaseEvent_150();
  public void FourthButtonReleaseEvent()
  {
    FourthButtonReleaseEvent_150();
  }

  private native void FifthButtonPressEvent_151();
  public void FifthButtonPressEvent()
  {
    FifthButtonPressEvent_151();
  }

  private native void FifthButtonReleaseEvent_152();
  public void FifthButtonReleaseEvent()
  {
    FifthButtonReleaseEvent_152();
  }

  private native void StartPinchEvent_153();
  public void StartPinchEvent()
  {
    StartPinchEvent_153();
  }

  private native void PinchEvent_154();
  public void PinchEvent()
  {
    PinchEvent_154();
  }

  private native void EndPinchEvent_155();
  public void EndPinchEvent()
  {
    EndPinchEvent_155();
  }

  private native void StartRotateEvent_156();
  public void StartRotateEvent()
  {
    StartRotateEvent_156();
  }

  private native void RotateEvent_157();
  public void RotateEvent()
  {
    RotateEvent_157();
  }

  private native void EndRotateEvent_158();
  public void EndRotateEvent()
  {
    EndRotateEvent_158();
  }

  private native void StartPanEvent_159();
  public void StartPanEvent()
  {
    StartPanEvent_159();
  }

  private native void PanEvent_160();
  public void PanEvent()
  {
    PanEvent_160();
  }

  private native void EndPanEvent_161();
  public void EndPanEvent()
  {
    EndPanEvent_161();
  }

  private native void TapEvent_162();
  public void TapEvent()
  {
    TapEvent_162();
  }

  private native void LongTapEvent_163();
  public void LongTapEvent()
  {
    LongTapEvent_163();
  }

  private native void SwipeEvent_164();
  public void SwipeEvent()
  {
    SwipeEvent_164();
  }

  private native void SetRecognizeGestures_165(boolean id0);
  public void SetRecognizeGestures(boolean id0)
  {
    SetRecognizeGestures_165(id0);
  }

  private native boolean GetRecognizeGestures_166();
  public boolean GetRecognizeGestures()
  {
    return GetRecognizeGestures_166();
  }

  private native int GetPointersDownCount_167();
  public int GetPointersDownCount()
  {
    return GetPointersDownCount_167();
  }

  private native boolean IsPointerIndexSet_168(int id0);
  public boolean IsPointerIndexSet(int id0)
  {
    return IsPointerIndexSet_168(id0);
  }

  private native void ClearPointerIndex_169(int id0);
  public void ClearPointerIndex(int id0)
  {
    ClearPointerIndex_169(id0);
  }

  private native int GetCurrentGesture_170();
  public int GetCurrentGesture()
  {
    return GetCurrentGesture_170();
  }

  private native void SetCurrentGesture_171(int id0);
  public void SetCurrentGesture(int id0)
  {
    SetCurrentGesture_171(id0);
  }

  public vtkRenderWindowInteractor() { super(); }

  public vtkRenderWindowInteractor(long id) { super(id); }
  public native long   VTKInit();

}
