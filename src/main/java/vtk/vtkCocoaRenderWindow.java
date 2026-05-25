// java wrapper for vtkCocoaRenderWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCocoaRenderWindow extends vtkOpenGLRenderWindow
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

  private native void Start_4();
  public void Start()
  {
    Start_4();
  }

  private native void Frame_5();
  public void Frame()
  {
    Frame_5();
  }

  private native void WindowConfigure_6();
  public void WindowConfigure()
  {
    WindowConfigure_6();
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native void SetFullScreen_8(int id0);
  public void SetFullScreen(int id0)
  {
    SetFullScreen_8(id0);
  }

  private native void WindowRemap_9();
  public void WindowRemap()
  {
    WindowRemap_9();
  }

  private native void PrefFullScreen_10();
  public void PrefFullScreen()
  {
    PrefFullScreen_10();
  }

  private native void SetSize_11(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_11(id0,id1);
  }

  private native void SetSize_12(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_12(id0);
  }

  private native int[] GetSize_13();
  public int[] GetSize()
  {
    return GetSize_13();
  }

  private native void SetPosition_14(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_14(id0,id1);
  }

  private native void SetPosition_15(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_15(id0);
  }

  private native int[] GetScreenSize_16();
  public int[] GetScreenSize()
  {
    return GetScreenSize_16();
  }

  private native int[] GetPosition_17();
  public int[] GetPosition()
  {
    return GetPosition_17();
  }

  private native void SetWindowName_18(byte[] id0, int len0);
  public void SetWindowName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowName_18(bytes0, bytes0.length);
  }

  private native void SetNextWindowInfo_19(byte[] id0, int len0);
  public void SetNextWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNextWindowInfo_19(bytes0, bytes0.length);
  }

  private native void SetWindowInfo_20(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_20(bytes0, bytes0.length);
  }

  private native void SetParentInfo_21(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_21(bytes0, bytes0.length);
  }

  private native boolean InitializeFromCurrentContext_22();
  public boolean InitializeFromCurrentContext()
  {
    return InitializeFromCurrentContext_22();
  }

  private native boolean GetPlatformSupportsRenderWindowSharing_23();
  public boolean GetPlatformSupportsRenderWindowSharing()
  {
    return GetPlatformSupportsRenderWindowSharing_23();
  }

  private native void SetStereoCapableWindow_24(int id0);
  public void SetStereoCapableWindow(int id0)
  {
    SetStereoCapableWindow_24(id0);
  }

  private native void MakeCurrent_25();
  public void MakeCurrent()
  {
    MakeCurrent_25();
  }

  private native void ReleaseCurrent_26();
  public void ReleaseCurrent()
  {
    ReleaseCurrent_26();
  }

  private native boolean IsCurrent_27();
  public boolean IsCurrent()
  {
    return IsCurrent_27();
  }

  private native void UpdateContext_28();
  public void UpdateContext()
  {
    UpdateContext_28();
  }

  private native byte[] ReportCapabilities_29();
  public String ReportCapabilities()
  {
    return new String(ReportCapabilities_29(), StandardCharsets.UTF_8);
  }

  private native int IsDirect_30();
  public int IsDirect()
  {
    return IsDirect_30();
  }

  private native void SetForceMakeCurrent_31();
  public void SetForceMakeCurrent()
  {
    SetForceMakeCurrent_31();
  }

  private native int GetEventPending_32();
  public int GetEventPending()
  {
    return GetEventPending_32();
  }

  private native void Finalize_33();
  public void Finalize()
  {
    Finalize_33();
  }

  private native void HideCursor_34();
  public void HideCursor()
  {
    HideCursor_34();
  }

  private native void ShowCursor_35();
  public void ShowCursor()
  {
    ShowCursor_35();
  }

  private native void SetCursorPosition_36(int id0,int id1);
  public void SetCursorPosition(int id0,int id1)
  {
    SetCursorPosition_36(id0,id1);
  }

  private native void SetCurrentCursor_37(int id0);
  public void SetCurrentCursor(int id0)
  {
    SetCurrentCursor_37(id0);
  }

  private native int GetViewCreated_38();
  public int GetViewCreated()
  {
    return GetViewCreated_38();
  }

  private native int GetWindowCreated_39();
  public int GetWindowCreated()
  {
    return GetWindowCreated_39();
  }

  private native void SetWantsBestResolution_40(boolean id0);
  public void SetWantsBestResolution(boolean id0)
  {
    SetWantsBestResolution_40(id0);
  }

  private native boolean GetWantsBestResolution_41();
  public boolean GetWantsBestResolution()
  {
    return GetWantsBestResolution_41();
  }

  private native void SetConnectContextToNSView_42(boolean id0);
  public void SetConnectContextToNSView(boolean id0)
  {
    SetConnectContextToNSView_42(id0);
  }

  private native boolean GetConnectContextToNSView_43();
  public boolean GetConnectContextToNSView()
  {
    return GetConnectContextToNSView_43();
  }

  private native void PushContext_44();
  public void PushContext()
  {
    PushContext_44();
  }

  private native void PopContext_45();
  public void PopContext()
  {
    PopContext_45();
  }

  private native void Render_46();
  public void Render()
  {
    Render_46();
  }

  public vtkCocoaRenderWindow() { super(); }

  public vtkCocoaRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
