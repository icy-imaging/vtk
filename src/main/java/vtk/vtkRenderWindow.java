// java wrapper for vtkRenderWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderWindow extends vtkWindow
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

  private native void AddRenderer_4(vtkRenderer id0);
  public void AddRenderer(vtkRenderer id0)
  {
    AddRenderer_4(id0);
  }

  private native void RemoveRenderer_5(vtkRenderer id0);
  public void RemoveRenderer(vtkRenderer id0)
  {
    RemoveRenderer_5(id0);
  }

  private native int HasRenderer_6(vtkRenderer id0);
  public int HasRenderer(vtkRenderer id0)
  {
    return HasRenderer_6(id0);
  }

  private native byte[] GetRenderLibrary_7();
  public String GetRenderLibrary()
  {
    return new String(GetRenderLibrary_7(), StandardCharsets.UTF_8);
  }

  private native byte[] GetRenderingBackend_8();
  public String GetRenderingBackend()
  {
    return new String(GetRenderingBackend_8(), StandardCharsets.UTF_8);
  }

  private native long GetRenderTimer_9();
  public vtkRenderTimerLog GetRenderTimer()
  {
    long temp = GetRenderTimer_9();

    if (temp == 0) return null;
    return (vtkRenderTimerLog)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRenderers_10();
  public vtkRendererCollection GetRenderers()
  {
    long temp = GetRenderers_10();

    if (temp == 0) return null;
    return (vtkRendererCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CaptureGL2PSSpecialProps_11(vtkCollection id0);
  public void CaptureGL2PSSpecialProps(vtkCollection id0)
  {
    CaptureGL2PSSpecialProps_11(id0);
  }

  private native int GetCapturingGL2PSSpecialProps_12();
  public int GetCapturingGL2PSSpecialProps()
  {
    return GetCapturingGL2PSSpecialProps_12();
  }

  private native void Render_13();
  public void Render()
  {
    Render_13();
  }

  private native void Start_14();
  public void Start()
  {
    Start_14();
  }

  private native void End_15();
  public void End()
  {
    End_15();
  }

  private native void Initialize_16();
  public void Initialize()
  {
    Initialize_16();
  }

  private native boolean GetInitialized_17();
  public boolean GetInitialized()
  {
    return GetInitialized_17();
  }

  private native void Finalize_18();
  public void Finalize()
  {
    Finalize_18();
  }

  private native void Frame_19();
  public void Frame()
  {
    Frame_19();
  }

  private native void WaitForCompletion_20();
  public void WaitForCompletion()
  {
    WaitForCompletion_20();
  }

  private native void CopyResultFrame_21();
  public void CopyResultFrame()
  {
    CopyResultFrame_21();
  }

  private native long MakeRenderWindowInteractor_22();
  public vtkRenderWindowInteractor MakeRenderWindowInteractor()
  {
    long temp = MakeRenderWindowInteractor_22();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void HideCursor_23();
  public void HideCursor()
  {
    HideCursor_23();
  }

  private native void ShowCursor_24();
  public void ShowCursor()
  {
    ShowCursor_24();
  }

  private native void SetCursorPosition_25(int id0,int id1);
  public void SetCursorPosition(int id0,int id1)
  {
    SetCursorPosition_25(id0,id1);
  }

  private native void SetCurrentCursor_26(int id0);
  public void SetCurrentCursor(int id0)
  {
    SetCurrentCursor_26(id0);
  }

  private native int GetCurrentCursor_27();
  public int GetCurrentCursor()
  {
    return GetCurrentCursor_27();
  }

  private native void SetCursorFileName_28(byte[] id0, int len0);
  public void SetCursorFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCursorFileName_28(bytes0, bytes0.length);
  }

  private native byte[] GetCursorFileName_29();
  public String GetCursorFileName()
  {
    return new String(GetCursorFileName_29(), StandardCharsets.UTF_8);
  }

  private native void SetFullScreen_30(int id0);
  public void SetFullScreen(int id0)
  {
    SetFullScreen_30(id0);
  }

  private native int GetFullScreen_31();
  public int GetFullScreen()
  {
    return GetFullScreen_31();
  }

  private native void FullScreenOn_32();
  public void FullScreenOn()
  {
    FullScreenOn_32();
  }

  private native void FullScreenOff_33();
  public void FullScreenOff()
  {
    FullScreenOff_33();
  }

  private native void SetBorders_34(int id0);
  public void SetBorders(int id0)
  {
    SetBorders_34(id0);
  }

  private native int GetBorders_35();
  public int GetBorders()
  {
    return GetBorders_35();
  }

  private native void BordersOn_36();
  public void BordersOn()
  {
    BordersOn_36();
  }

  private native void BordersOff_37();
  public void BordersOff()
  {
    BordersOff_37();
  }

  private native int GetStereoCapableWindow_38();
  public int GetStereoCapableWindow()
  {
    return GetStereoCapableWindow_38();
  }

  private native void StereoCapableWindowOn_39();
  public void StereoCapableWindowOn()
  {
    StereoCapableWindowOn_39();
  }

  private native void StereoCapableWindowOff_40();
  public void StereoCapableWindowOff()
  {
    StereoCapableWindowOff_40();
  }

  private native void SetStereoCapableWindow_41(int id0);
  public void SetStereoCapableWindow(int id0)
  {
    SetStereoCapableWindow_41(id0);
  }

  private native int GetStereoRender_42();
  public int GetStereoRender()
  {
    return GetStereoRender_42();
  }

  private native void SetStereoRender_43(int id0);
  public void SetStereoRender(int id0)
  {
    SetStereoRender_43(id0);
  }

  private native void StereoRenderOn_44();
  public void StereoRenderOn()
  {
    StereoRenderOn_44();
  }

  private native void StereoRenderOff_45();
  public void StereoRenderOff()
  {
    StereoRenderOff_45();
  }

  private native void SetAlphaBitPlanes_46(int id0);
  public void SetAlphaBitPlanes(int id0)
  {
    SetAlphaBitPlanes_46(id0);
  }

  private native int GetAlphaBitPlanes_47();
  public int GetAlphaBitPlanes()
  {
    return GetAlphaBitPlanes_47();
  }

  private native void AlphaBitPlanesOn_48();
  public void AlphaBitPlanesOn()
  {
    AlphaBitPlanesOn_48();
  }

  private native void AlphaBitPlanesOff_49();
  public void AlphaBitPlanesOff()
  {
    AlphaBitPlanesOff_49();
  }

  private native void SetPointSmoothing_50(int id0);
  public void SetPointSmoothing(int id0)
  {
    SetPointSmoothing_50(id0);
  }

  private native int GetPointSmoothing_51();
  public int GetPointSmoothing()
  {
    return GetPointSmoothing_51();
  }

  private native void PointSmoothingOn_52();
  public void PointSmoothingOn()
  {
    PointSmoothingOn_52();
  }

  private native void PointSmoothingOff_53();
  public void PointSmoothingOff()
  {
    PointSmoothingOff_53();
  }

  private native void SetLineSmoothing_54(int id0);
  public void SetLineSmoothing(int id0)
  {
    SetLineSmoothing_54(id0);
  }

  private native int GetLineSmoothing_55();
  public int GetLineSmoothing()
  {
    return GetLineSmoothing_55();
  }

  private native void LineSmoothingOn_56();
  public void LineSmoothingOn()
  {
    LineSmoothingOn_56();
  }

  private native void LineSmoothingOff_57();
  public void LineSmoothingOff()
  {
    LineSmoothingOff_57();
  }

  private native void SetPolygonSmoothing_58(int id0);
  public void SetPolygonSmoothing(int id0)
  {
    SetPolygonSmoothing_58(id0);
  }

  private native int GetPolygonSmoothing_59();
  public int GetPolygonSmoothing()
  {
    return GetPolygonSmoothing_59();
  }

  private native void PolygonSmoothingOn_60();
  public void PolygonSmoothingOn()
  {
    PolygonSmoothingOn_60();
  }

  private native void PolygonSmoothingOff_61();
  public void PolygonSmoothingOff()
  {
    PolygonSmoothingOff_61();
  }

  private native int GetStereoType_62();
  public int GetStereoType()
  {
    return GetStereoType_62();
  }

  private native void SetStereoType_63(int id0);
  public void SetStereoType(int id0)
  {
    SetStereoType_63(id0);
  }

  private native void SetStereoTypeToCrystalEyes_64();
  public void SetStereoTypeToCrystalEyes()
  {
    SetStereoTypeToCrystalEyes_64();
  }

  private native void SetStereoTypeToRedBlue_65();
  public void SetStereoTypeToRedBlue()
  {
    SetStereoTypeToRedBlue_65();
  }

  private native void SetStereoTypeToInterlaced_66();
  public void SetStereoTypeToInterlaced()
  {
    SetStereoTypeToInterlaced_66();
  }

  private native void SetStereoTypeToLeft_67();
  public void SetStereoTypeToLeft()
  {
    SetStereoTypeToLeft_67();
  }

  private native void SetStereoTypeToRight_68();
  public void SetStereoTypeToRight()
  {
    SetStereoTypeToRight_68();
  }

  private native void SetStereoTypeToDresden_69();
  public void SetStereoTypeToDresden()
  {
    SetStereoTypeToDresden_69();
  }

  private native void SetStereoTypeToAnaglyph_70();
  public void SetStereoTypeToAnaglyph()
  {
    SetStereoTypeToAnaglyph_70();
  }

  private native void SetStereoTypeToCheckerboard_71();
  public void SetStereoTypeToCheckerboard()
  {
    SetStereoTypeToCheckerboard_71();
  }

  private native void SetStereoTypeToSplitViewportHorizontal_72();
  public void SetStereoTypeToSplitViewportHorizontal()
  {
    SetStereoTypeToSplitViewportHorizontal_72();
  }

  private native void SetStereoTypeToFake_73();
  public void SetStereoTypeToFake()
  {
    SetStereoTypeToFake_73();
  }

  private native void SetStereoTypeToEmulate_74();
  public void SetStereoTypeToEmulate()
  {
    SetStereoTypeToEmulate_74();
  }

  private native byte[] GetStereoTypeAsString_75();
  public String GetStereoTypeAsString()
  {
    return new String(GetStereoTypeAsString_75(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStereoTypeAsString_76(int id0);
  public String GetStereoTypeAsString(int id0)
  {
    return new String(GetStereoTypeAsString_76(id0), StandardCharsets.UTF_8);
  }

  private native void StereoUpdate_77();
  public void StereoUpdate()
  {
    StereoUpdate_77();
  }

  private native void StereoMidpoint_78();
  public void StereoMidpoint()
  {
    StereoMidpoint_78();
  }

  private native void StereoRenderComplete_79();
  public void StereoRenderComplete()
  {
    StereoRenderComplete_79();
  }

  private native void SetAnaglyphColorSaturation_80(float id0);
  public void SetAnaglyphColorSaturation(float id0)
  {
    SetAnaglyphColorSaturation_80(id0);
  }

  private native float GetAnaglyphColorSaturationMinValue_81();
  public float GetAnaglyphColorSaturationMinValue()
  {
    return GetAnaglyphColorSaturationMinValue_81();
  }

  private native float GetAnaglyphColorSaturationMaxValue_82();
  public float GetAnaglyphColorSaturationMaxValue()
  {
    return GetAnaglyphColorSaturationMaxValue_82();
  }

  private native float GetAnaglyphColorSaturation_83();
  public float GetAnaglyphColorSaturation()
  {
    return GetAnaglyphColorSaturation_83();
  }

  private native void SetAnaglyphColorMask_84(int id0,int id1);
  public void SetAnaglyphColorMask(int id0,int id1)
  {
    SetAnaglyphColorMask_84(id0,id1);
  }

  private native void SetAnaglyphColorMask_85(int id0[]);
  public void SetAnaglyphColorMask(int id0[])
  {
    SetAnaglyphColorMask_85(id0);
  }

  private native int[] GetAnaglyphColorMask_86();
  public int[] GetAnaglyphColorMask()
  {
    return GetAnaglyphColorMask_86();
  }

  private native void WindowRemap_87();
  public void WindowRemap()
  {
    WindowRemap_87();
  }

  private native void SetSwapBuffers_88(int id0);
  public void SetSwapBuffers(int id0)
  {
    SetSwapBuffers_88(id0);
  }

  private native int GetSwapBuffers_89();
  public int GetSwapBuffers()
  {
    return GetSwapBuffers_89();
  }

  private native void SwapBuffersOn_90();
  public void SwapBuffersOn()
  {
    SwapBuffersOn_90();
  }

  private native void SwapBuffersOff_91();
  public void SwapBuffersOff()
  {
    SwapBuffersOff_91();
  }

  private native int SetPixelData_92(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6);
  public int SetPixelData(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6)
  {
    return SetPixelData_92(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int GetRGBAPixelData_93(int id0,int id1,int id2,int id3,int id4,vtkFloatArray id5,int id6);
  public int GetRGBAPixelData(int id0,int id1,int id2,int id3,int id4,vtkFloatArray id5,int id6)
  {
    return GetRGBAPixelData_93(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetRGBAPixelData_94(int id0,int id1,int id2,int id3,vtkFloatArray id4,int id5,int id6,int id7);
  public int SetRGBAPixelData(int id0,int id1,int id2,int id3,vtkFloatArray id4,int id5,int id6,int id7)
  {
    return SetRGBAPixelData_94(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int GetRGBACharPixelData_95(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6);
  public int GetRGBACharPixelData(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6)
  {
    return GetRGBACharPixelData_95(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetRGBACharPixelData_96(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6,int id7);
  public int SetRGBACharPixelData(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6,int id7)
  {
    return SetRGBACharPixelData_96(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int GetZbufferData_97(int id0,int id1,int id2,int id3,vtkFloatArray id4);
  public int GetZbufferData(int id0,int id1,int id2,int id3,vtkFloatArray id4)
  {
    return GetZbufferData_97(id0,id1,id2,id3,id4);
  }

  private native int SetZbufferData_98(int id0,int id1,int id2,int id3,vtkFloatArray id4);
  public int SetZbufferData(int id0,int id1,int id2,int id3,vtkFloatArray id4)
  {
    return SetZbufferData_98(id0,id1,id2,id3,id4);
  }

  private native float GetZbufferDataAtPoint_99(int id0,int id1);
  public float GetZbufferDataAtPoint(int id0,int id1)
  {
    return GetZbufferDataAtPoint_99(id0,id1);
  }

  private native int GetNeverRendered_100();
  public int GetNeverRendered()
  {
    return GetNeverRendered_100();
  }

  private native int GetAbortRender_101();
  public int GetAbortRender()
  {
    return GetAbortRender_101();
  }

  private native void SetAbortRender_102(int id0);
  public void SetAbortRender(int id0)
  {
    SetAbortRender_102(id0);
  }

  private native int GetInAbortCheck_103();
  public int GetInAbortCheck()
  {
    return GetInAbortCheck_103();
  }

  private native void SetInAbortCheck_104(int id0);
  public void SetInAbortCheck(int id0)
  {
    SetInAbortCheck_104(id0);
  }

  private native int CheckAbortStatus_105();
  public int CheckAbortStatus()
  {
    return CheckAbortStatus_105();
  }

  private native int GetEventPending_106();
  public int GetEventPending()
  {
    return GetEventPending_106();
  }

  private native int CheckInRenderStatus_107();
  public int CheckInRenderStatus()
  {
    return CheckInRenderStatus_107();
  }

  private native void ClearInRenderStatus_108();
  public void ClearInRenderStatus()
  {
    ClearInRenderStatus_108();
  }

  private native void SetDesiredUpdateRate_109(double id0);
  public void SetDesiredUpdateRate(double id0)
  {
    SetDesiredUpdateRate_109(id0);
  }

  private native double GetDesiredUpdateRate_110();
  public double GetDesiredUpdateRate()
  {
    return GetDesiredUpdateRate_110();
  }

  private native int GetNumberOfLayers_111();
  public int GetNumberOfLayers()
  {
    return GetNumberOfLayers_111();
  }

  private native void SetNumberOfLayers_112(int id0);
  public void SetNumberOfLayers(int id0)
  {
    SetNumberOfLayers_112(id0);
  }

  private native int GetNumberOfLayersMinValue_113();
  public int GetNumberOfLayersMinValue()
  {
    return GetNumberOfLayersMinValue_113();
  }

  private native int GetNumberOfLayersMaxValue_114();
  public int GetNumberOfLayersMaxValue()
  {
    return GetNumberOfLayersMaxValue_114();
  }

  private native long GetInteractor_115();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_115();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractor_116(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_116(id0);
  }

  private native void UnRegister_117(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_117(id0);
  }

  private native void SetWindowInfo_118(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_118(bytes0, bytes0.length);
  }

  private native void SetNextWindowInfo_119(byte[] id0, int len0);
  public void SetNextWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNextWindowInfo_119(bytes0, bytes0.length);
  }

  private native void SetParentInfo_120(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_120(bytes0, bytes0.length);
  }

  private native boolean InitializeFromCurrentContext_121();
  public boolean InitializeFromCurrentContext()
  {
    return InitializeFromCurrentContext_121();
  }

  private native void SetSharedRenderWindow_122(vtkRenderWindow id0);
  public void SetSharedRenderWindow(vtkRenderWindow id0)
  {
    SetSharedRenderWindow_122(id0);
  }

  private native long GetSharedRenderWindow_123();
  public vtkRenderWindow GetSharedRenderWindow()
  {
    long temp = GetSharedRenderWindow_123();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetPlatformSupportsRenderWindowSharing_124();
  public boolean GetPlatformSupportsRenderWindowSharing()
  {
    return GetPlatformSupportsRenderWindowSharing_124();
  }

  private native boolean IsCurrent_125();
  public boolean IsCurrent()
  {
    return IsCurrent_125();
  }

  private native void SetForceMakeCurrent_126();
  public void SetForceMakeCurrent()
  {
    SetForceMakeCurrent_126();
  }

  private native byte[] ReportCapabilities_127();
  public String ReportCapabilities()
  {
    return new String(ReportCapabilities_127(), StandardCharsets.UTF_8);
  }

  private native int SupportsOpenGL_128();
  public int SupportsOpenGL()
  {
    return SupportsOpenGL_128();
  }

  private native int IsDirect_129();
  public int IsDirect()
  {
    return IsDirect_129();
  }

  private native int GetDepthBufferSize_130();
  public int GetDepthBufferSize()
  {
    return GetDepthBufferSize_130();
  }

  private native void SetMultiSamples_131(int id0);
  public void SetMultiSamples(int id0)
  {
    SetMultiSamples_131(id0);
  }

  private native int GetMultiSamples_132();
  public int GetMultiSamples()
  {
    return GetMultiSamples_132();
  }

  private native void SetStencilCapable_133(int id0);
  public void SetStencilCapable(int id0)
  {
    SetStencilCapable_133(id0);
  }

  private native int GetStencilCapable_134();
  public int GetStencilCapable()
  {
    return GetStencilCapable_134();
  }

  private native void StencilCapableOn_135();
  public void StencilCapableOn()
  {
    StencilCapableOn_135();
  }

  private native void StencilCapableOff_136();
  public void StencilCapableOff()
  {
    StencilCapableOff_136();
  }

  private native void SetDeviceIndex_137(int id0);
  public void SetDeviceIndex(int id0)
  {
    SetDeviceIndex_137(id0);
  }

  private native int GetDeviceIndex_138();
  public int GetDeviceIndex()
  {
    return GetDeviceIndex_138();
  }

  private native int GetNumberOfDevices_139();
  public int GetNumberOfDevices()
  {
    return GetNumberOfDevices_139();
  }

  private native boolean GetUseSRGBColorSpace_140();
  public boolean GetUseSRGBColorSpace()
  {
    return GetUseSRGBColorSpace_140();
  }

  private native void SetUseSRGBColorSpace_141(boolean id0);
  public void SetUseSRGBColorSpace(boolean id0)
  {
    SetUseSRGBColorSpace_141(id0);
  }

  private native void UseSRGBColorSpaceOn_142();
  public void UseSRGBColorSpaceOn()
  {
    UseSRGBColorSpaceOn_142();
  }

  private native void UseSRGBColorSpaceOff_143();
  public void UseSRGBColorSpaceOff()
  {
    UseSRGBColorSpaceOff_143();
  }

  private native void SetPhysicalViewDirection_144(double id0,double id1,double id2);
  public void SetPhysicalViewDirection(double id0,double id1,double id2)
  {
    SetPhysicalViewDirection_144(id0,id1,id2);
  }

  private native void SetPhysicalViewDirection_145(double id0[]);
  public void SetPhysicalViewDirection(double id0[])
  {
    SetPhysicalViewDirection_145(id0);
  }

  private native double[] GetPhysicalViewDirection_146();
  public double[] GetPhysicalViewDirection()
  {
    return GetPhysicalViewDirection_146();
  }

  private native void SetPhysicalViewUp_147(double id0,double id1,double id2);
  public void SetPhysicalViewUp(double id0,double id1,double id2)
  {
    SetPhysicalViewUp_147(id0,id1,id2);
  }

  private native void SetPhysicalViewUp_148(double id0[]);
  public void SetPhysicalViewUp(double id0[])
  {
    SetPhysicalViewUp_148(id0);
  }

  private native double[] GetPhysicalViewUp_149();
  public double[] GetPhysicalViewUp()
  {
    return GetPhysicalViewUp_149();
  }

  private native void SetPhysicalTranslation_150(double id0,double id1,double id2);
  public void SetPhysicalTranslation(double id0,double id1,double id2)
  {
    SetPhysicalTranslation_150(id0,id1,id2);
  }

  private native void SetPhysicalTranslation_151(double id0[]);
  public void SetPhysicalTranslation(double id0[])
  {
    SetPhysicalTranslation_151(id0);
  }

  private native double[] GetPhysicalTranslation_152();
  public double[] GetPhysicalTranslation()
  {
    return GetPhysicalTranslation_152();
  }

  private native void SetPhysicalScale_153(double id0);
  public void SetPhysicalScale(double id0)
  {
    SetPhysicalScale_153(id0);
  }

  private native double GetPhysicalScale_154();
  public double GetPhysicalScale()
  {
    return GetPhysicalScale_154();
  }

  private native void SetPhysicalToWorldMatrix_155(vtkMatrix4x4 id0);
  public void SetPhysicalToWorldMatrix(vtkMatrix4x4 id0)
  {
    SetPhysicalToWorldMatrix_155(id0);
  }

  private native void GetPhysicalToWorldMatrix_156(vtkMatrix4x4 id0);
  public void GetPhysicalToWorldMatrix(vtkMatrix4x4 id0)
  {
    GetPhysicalToWorldMatrix_156(id0);
  }

  private native boolean GetEnableTranslucentSurface_157();
  public boolean GetEnableTranslucentSurface()
  {
    return GetEnableTranslucentSurface_157();
  }

  private native void SetEnableTranslucentSurface_158(boolean id0);
  public void SetEnableTranslucentSurface(boolean id0)
  {
    SetEnableTranslucentSurface_158(id0);
  }

  private native void EnableTranslucentSurfaceOn_159();
  public void EnableTranslucentSurfaceOn()
  {
    EnableTranslucentSurfaceOn_159();
  }

  private native void EnableTranslucentSurfaceOff_160();
  public void EnableTranslucentSurfaceOff()
  {
    EnableTranslucentSurfaceOff_160();
  }

  public vtkRenderWindow() { super(); }

  public vtkRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
