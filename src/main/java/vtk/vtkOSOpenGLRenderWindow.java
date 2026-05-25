// java wrapper for vtkOSOpenGLRenderWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOSOpenGLRenderWindow extends vtkOpenGLRenderWindow
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

  private native void Frame_4();
  public void Frame()
  {
    Frame_4();
  }

  private native void WindowInitialize_5();
  public void WindowInitialize()
  {
    WindowInitialize_5();
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native void Finalize_7();
  public void Finalize()
  {
    Finalize_7();
  }

  private native void SetFullScreen_8(int id0);
  public void SetFullScreen(int id0)
  {
    SetFullScreen_8(id0);
  }

  private native void SetSize_9(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_9(id0,id1);
  }

  private native void SetSize_10(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_10(id0);
  }

  private native int[] GetScreenSize_11();
  public int[] GetScreenSize()
  {
    return GetScreenSize_11();
  }

  private native int[] GetPosition_12();
  public int[] GetPosition()
  {
    return GetPosition_12();
  }

  private native void SetPosition_13(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_13(id0,id1);
  }

  private native void SetPosition_14(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_14(id0);
  }

  private native void SetStereoCapableWindow_15(int id0);
  public void SetStereoCapableWindow(int id0)
  {
    SetStereoCapableWindow_15(id0);
  }

  private native void MakeCurrent_16();
  public void MakeCurrent()
  {
    MakeCurrent_16();
  }

  private native boolean IsCurrent_17();
  public boolean IsCurrent()
  {
    return IsCurrent_17();
  }

  private native void SetForceMakeCurrent_18();
  public void SetForceMakeCurrent()
  {
    SetForceMakeCurrent_18();
  }

  private native byte[] ReportCapabilities_19();
  public String ReportCapabilities()
  {
    return new String(ReportCapabilities_19(), StandardCharsets.UTF_8);
  }

  private native int SupportsOpenGL_20();
  public int SupportsOpenGL()
  {
    return SupportsOpenGL_20();
  }

  private native int IsDirect_21();
  public int IsDirect()
  {
    return IsDirect_21();
  }

  private native void WindowRemap_22();
  public void WindowRemap()
  {
    WindowRemap_22();
  }

  private native void SetWindowName_23(byte[] id0, int len0);
  public void SetWindowName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowName_23(bytes0, bytes0.length);
  }

  private native void HideCursor_24();
  public void HideCursor()
  {
    HideCursor_24();
  }

  private native void ShowCursor_25();
  public void ShowCursor()
  {
    ShowCursor_25();
  }

  private native int GetEventPending_26();
  public int GetEventPending()
  {
    return GetEventPending_26();
  }

  private native void SetWindowInfo_27(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_27(bytes0, bytes0.length);
  }

  private native void SetNextWindowInfo_28(byte[] id0, int len0);
  public void SetNextWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNextWindowInfo_28(bytes0, bytes0.length);
  }

  private native void SetParentInfo_29(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_29(bytes0, bytes0.length);
  }

  public vtkOSOpenGLRenderWindow() { super(); }

  public vtkOSOpenGLRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
